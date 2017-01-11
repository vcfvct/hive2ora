package org.finra.rc.hive2ora;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import org.finra.rc.hive2ora.service.MainService;

/**
 * User: Han Li Date: 1/10/17
 */
@SpringBootApplication
public class Application
{
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args)
    {
        ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
        System.out.println("Hello Hive2Ora");

        int limit = -1;
        try
        {
            limit = Integer.parseInt(args[0]);
        }catch (Exception e)
        {
           LOGGER.info("1st arg is not number, import all");
        }

        MainService mainService = ctx.getBean(MainService.class);
        mainService.doImport(limit);
//        mainService.testService();
    }
}
