package com.ychs.log4j;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

/**
 * @author Mingyu Xiong
 * @description:
 * @date 2019/07/19 15:47
 */
public class Log4jTest {
    private static Logger logger = Logger.getLogger(Log4jTest.class);
    /**
     * @param args
     */
    public static void main(String[] args) {


        // System.out.println("This is println message.");

        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");
    }

}
