package org.finra.rc.hive2ora;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.finra.rc.hive2ora.model.SrcErdFixedIncmMuniEntity;

/**
 * User: Han Li Date: 1/10/17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
public class OracleTest
{
    @Autowired
    private EntityManager em;

    @Test
    public void testQuery()
    {
        Query q = em.createQuery("FROM SrcErdFixedIncmMuniEntity", SrcErdFixedIncmMuniEntity.class);
        q.setMaxResults(5);
        q.getResultList().stream().forEach(System.out::println);
    }

}
