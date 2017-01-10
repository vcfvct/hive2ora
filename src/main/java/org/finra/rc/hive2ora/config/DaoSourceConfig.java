package org.finra.rc.hive2ora.config;

import java.text.MessageFormat;
import java.util.Base64;

import javax.sql.DataSource;

import org.apache.hive.jdbc.HiveDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

/**
 * User: Han Li Date: 1/10/17
 */
@Configuration
public class DaoSourceConfig
{
    @Autowired
    private Environment env;

    @Bean(name = "hiveDataSource")
    public DataSource hiveDataSource()
    {
        String server = env.getProperty("hive.url");
        String user = env.getProperty("hive.user");
        String pw = new String(Base64.getDecoder()
                                     .decode(env.getProperty("hive.password")));

        java.sql.Driver driver = new HiveDriver();
        return new SimpleDriverDataSource(driver, MessageFormat.format("jdbc:hive2://{0}:{1}/{2};ssl=true", server, 443, "erd"), user, pw);
    }

    @Bean(name = "hiveJdbcTemplate")
    public JdbcTemplate hiveJdbcTemplate()
    {
        return new JdbcTemplate(hiveDataSource());
    }

}
