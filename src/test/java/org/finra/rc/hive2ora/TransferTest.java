package org.finra.rc.hive2ora;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import org.finra.rc.hive2ora.service.MainService;

/**
 * User: Han Li Date: 1/11/17
 */
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class TransferTest
{
    @Autowired
    private MainService mainService;

//    @Rollback(false)
    @Test
    public void testImport()
    {
        int limit = 30;
        int rs = mainService.doImport(limit);
        assertThat("should match limit", rs, is(limit));
    }
}
