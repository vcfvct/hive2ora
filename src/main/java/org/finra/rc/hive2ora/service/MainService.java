package org.finra.rc.hive2ora.service;

import java.time.Duration;
import java.time.Instant;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import org.finra.rc.hive2ora.common.HiveBeanPropertyRowMapper;
import org.finra.rc.hive2ora.model.SrcErdFixedIncmMuniEntity;

/**
 * User: Han Li Date: 1/10/17
 */
@Component
public class MainService
{
    @Autowired
    @Qualifier("hiveJdbcTemplate")
    private JdbcTemplate hiveJdbcTemplate;

    @Autowired
    private EntityManager em;

    public int doImport()
    {
        String sql = "SELECT * FROM erd.ERD_PRDCT_FIXED_INCM_MNCPL_HS_prc_txt LIMIT 300000";
        HiveBeanPropertyRowMapper<SrcErdFixedIncmMuniEntity> mapper = new HiveBeanPropertyRowMapper<>(SrcErdFixedIncmMuniEntity.class);
        int batchSize = 10000;
        int[] inc = {0};
        Instant start = Instant.now();
        hiveJdbcTemplate.query(sql, (rs) -> {
            rs.setFetchSize(batchSize);
            while (rs.next())
            {
                SrcErdFixedIncmMuniEntity entity = mapper.mapRow(rs, -1);
                em.persist(entity);
                inc[0]++;
                if(inc[0]%batchSize==0){
                    System.out.println(Instant.now() + ". saving record: " + inc[0]);
                    em.flush();
                    em.clear();
                }
            }
            return null;
        });
        Instant end = Instant.now();
        System.out.println("Data Intake took: " + Duration.between(start, end));
        return inc[0];
    }

}
