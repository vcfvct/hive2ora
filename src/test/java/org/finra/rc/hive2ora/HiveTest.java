package org.finra.rc.hive2ora;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.finra.rc.hive2ora.common.HiveBeanPropertyRowMapper;
import org.finra.rc.hive2ora.model.SrcErdFixedIncmMuniEntity;

/**
 * User: Han Li Date: 1/10/17
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
public class HiveTest
{
    @Autowired
    @Qualifier("hiveJdbcTemplate")
    private JdbcTemplate hiveJdbcTemplate;

    @Test
    public void testSelect()
    {
        String sql = "SELECT * FROM erd.ERD_PRDCT_FIXED_INCM_MNCPL_HS_prc_txt LIMIT 5";
        List<SrcErdFixedIncmMuniEntity> fiMunis = hiveJdbcTemplate.query(sql, new HiveBeanPropertyRowMapper<>(SrcErdFixedIncmMuniEntity.class));
        fiMunis.stream()
               .forEach(System.out::println);
    }
}
