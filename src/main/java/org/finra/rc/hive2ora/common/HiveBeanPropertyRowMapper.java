package org.finra.rc.hive2ora.common;

import java.beans.PropertyDescriptor;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.NotWritablePropertyException;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.dao.DataRetrievalFailureException;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.JdbcUtils;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import org.finra.rc.hive2ora.annotation.HiveColumnName;


/**
 * custom row mapper which could handle our custom HiveColumnName which is used to specify hive column name when hive ddl is different from our RDBMS ddl
 *
 * User: Han Li
 * Date: 3/23/16
 */
public class HiveBeanPropertyRowMapper<T> implements RowMapper<T>
{
    private static final Logger LOGGER = Logger.getLogger(HiveBeanPropertyRowMapper.class);

    /**
     * Map of the fields we provide mapping for
     * Make this a multimap since one Hive column could map to several fields in our java pojo(i.e. we could use same @HiveColumnName value on multiple fields.
     */
    protected Multimap<String, PropertyDescriptor> mappedFields;
    /**
     * The class we are mapping to
     * we set to private so that it could only be modified thru our custom setter.
     */
    private Class<T> mappedClass;

    /**
     * Set the class that each row should be mapped to.
     */
    public void setMappedClass(Class<T> mappedClass) {
        if (this.mappedClass == null) {
            initialize(mappedClass);
        }
        else {
            if (!this.mappedClass.equals(mappedClass)) {
                throw new InvalidDataAccessApiUsageException("The mapped class can not be reassigned to map to " +
                    mappedClass + " since it is already providing mapping for " + this.mappedClass);
            }
        }
    }

    /**
     * Initialize the mapping metadata for the given class.
     *
     * @param mappedClass the mapped class.
     */
    private void initialize(Class<T> mappedClass)
    {
        this.mappedClass = mappedClass;
        //super.setMappedClass(mappedClass);
        this.mappedFields = HashMultimap.create();
        PropertyDescriptor[] pds = BeanUtils.getPropertyDescriptors(mappedClass);
        Arrays.stream(pds)
              .filter(pd -> pd.getWriteMethod() != null)
              .forEach(pd -> {
                  //this.mappedFields.put(pd.getName().toLowerCase(), pd);
                  String underscoredName = underscoreName(pd.getName());
                  this.mappedFields.put(underscoredName, pd);
                  //add possible hive specific column name for this field
                  addHiveColumn(pd);
              });
    }

    //our custom hive logic to get the column-name annotated on the field.
    private void addHiveColumn(PropertyDescriptor pd)
    {
        try
        {
            if (this.mappedClass.getDeclaredField(pd.getName()).isAnnotationPresent(HiveColumnName.class))
            {
                String hiveColName = this.mappedClass.getDeclaredField(pd.getName()).getAnnotation(HiveColumnName.class).value();
                this.mappedFields.put(hiveColName.toLowerCase(), pd);
            }
        } catch (NoSuchFieldException e)
        {
            LOGGER.error("No such field. " + e);
        }
    }

    /**
     * Create a new BeanPropertyRowMapper for bean-style configuration.
     * @see #setMappedClass
     */
    public HiveBeanPropertyRowMapper() {
    }
    /**
     * Create a new BeanPropertyRowMapper, accepting unpopulated properties
     * in the target bean.
     *
     * @param mappedClass the class that each row should be mapped to
     */
    public HiveBeanPropertyRowMapper(Class<T> mappedClass)
    {
        initialize(mappedClass);
    }


    /**
     * Convert a name in camelCase to an underscored name in lower case.
     * Any upper case letters are converted to lower case with a preceding underscore.
     *
     * @param name the string containing original name
     *
     * @return the converted name
     */
    private String underscoreName(String name)
    {
        if (!StringUtils.hasLength(name))
        {
            return "";
        }
        StringBuilder result = new StringBuilder();
        result.append(name.substring(0, 1).toLowerCase());
        for (int i = 1; i < name.length(); i++)
        {
            String s = name.substring(i, i + 1);
            String slc = s.toLowerCase();
            if (!s.equals(slc))
            {
                result.append("_").append(slc);
            }
            else
            {
                result.append(s);
            }
        }
        return result.toString();
    }

    /**
     * Extract the values for all columns in the current row.
     * <p>Utilizes public setters and result set metadata.
     *
     * @see ResultSetMetaData
     */
    @Override
    public T mapRow(ResultSet rs, int rowNumber) throws SQLException
    {
        Assert.state(this.mappedClass != null, "Mapped class was not specified");
        T mappedObject = BeanUtils.instantiate(this.mappedClass);
        BeanWrapper bw = PropertyAccessorFactory.forBeanPropertyAccess(mappedObject);

        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        for (int index = 1; index <= columnCount; index++)
        {
            String column = JdbcUtils.lookupColumnName(rsmd, index);
            Collection<PropertyDescriptor> pds = this.mappedFields.get(column.replaceAll(" ", "").toLowerCase());
            for(PropertyDescriptor pd : pds)
            {
                try
                {
                    Object value = getColumnValue(rs, index, pd);
                    bw.setPropertyValue(pd.getName(), value);
                } catch (NotWritablePropertyException ex)
                {
                    throw new DataRetrievalFailureException("Unable to map column " + column + " to property " + pd.getName(), ex);
                }
            }
        }

        return mappedObject;
    }

    /**
     * Retrieve a JDBC object value for the specified column.
     * <p>The default implementation calls
     * {@link JdbcUtils#getResultSetValue(ResultSet, int, Class)}.
     * Subclasses may override this to check specific value types upfront,
     * or to post-process values return from {@code getResultSetValue}.
     *
     * @param rs is the ResultSet holding the data
     * @param index is the column index
     * @param pd the bean property that each result object is expected to match
     * (or {@code null} if none specified)
     *
     * @return the Object value
     * @throws SQLException in case of extraction failure
     * @see org.springframework.jdbc.support.JdbcUtils#getResultSetValue(ResultSet, int, Class)
     */
    protected Object getColumnValue(ResultSet rs, int index, PropertyDescriptor pd) throws SQLException
    {
        try
        {
            return JdbcUtils.getResultSetValue(rs, index, pd.getPropertyType());
        }
        catch (SQLException e)
        {
            LOGGER.error("Sql Exception for field: " + pd.getName());
            throw e;
        }
    }


}

