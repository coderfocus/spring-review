package com.coderfocus.service.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4jTest {

    public static final Logger logger= LoggerFactory.getLogger(Log4jTest.class);

    @Test
    public void test(){
        logger.debug("debug message");
        logger.info("info message");
        logger.warn("warn message");
        logger.error("error message");

        String message = "hello log4j";
        logger.info("message: {} {}",message,message);
    }
}
