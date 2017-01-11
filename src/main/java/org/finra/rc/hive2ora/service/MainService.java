package org.finra.rc.hive2ora.service;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import org.finra.rc.hive2ora.common.HiveBeanPropertyRowMapper;
import org.finra.rc.hive2ora.model.SrcErdFixedIncmMuniEntity;

/**
 * User: Han Li Date: 1/10/17
 */
@Component
@Transactional
public class MainService
{
    private static final Logger LOGGER = LoggerFactory.getLogger(MainService.class);

    @Autowired
    @Qualifier("hiveJdbcTemplate")
    private JdbcTemplate hiveJdbcTemplate;

    @Autowired
    private EntityManager em;

    public int doImport(int limit)
    {
        String sql = "SELECT * FROM erd.ERD_PRDCT_FIXED_INCM_MNCPL_HS_prc_txt";
        if (limit >= 0)
        {
            sql = sql + " LIMIT " + limit;
        }
        HiveBeanPropertyRowMapper<SrcErdFixedIncmMuniEntity> mapper = new HiveBeanPropertyRowMapper<>(SrcErdFixedIncmMuniEntity.class);
        int batchSize = 5000;
        int[] inc = {0};
        Instant start = Instant.now();
        List<SrcErdFixedIncmMuniEntity> listToPersist = new ArrayList<>(batchSize);
        hiveJdbcTemplate.query(sql, (rs) -> {
            rs.setFetchSize(batchSize);
            while (rs.next())
            {
                listToPersist.add(mapper.mapRow(rs, -1));
                inc[0]++;
                if (inc[0] % batchSize == 0)
                {
                    persistAndClear(inc, listToPersist);
                }
            }
            //left overs(last n items)
            if(!listToPersist.isEmpty())
            {
                persistAndClear(inc, listToPersist);
            }
            return null;
        });
        Instant end = Instant.now();
        System.out.println("Data Intake took: " + Duration.between(start, end));
        return inc[0];
    }

    private void persistAndClear(int[] inc, List<SrcErdFixedIncmMuniEntity> listToPersist)
    {
        listToPersist.stream().forEach(em::persist);
        em.flush();
        em.clear();
        LOGGER.info("Saved record milestone: " + inc[0]);
        listToPersist.clear();
    }

    public void testService()
    {
        System.out.println("This is a test for Bean");
    }

}
