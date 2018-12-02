package com.panda521.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by jack on 2018/12/2.
 */
public class Hello {
    public static void main(String[] args) {
        h1();
    }

    public static void h1() {
        Logger logger = LogManager.getLogger(Hello.class);
        logger.fatal("fatal 信息");
        logger.error("error 信息");
        logger.warn("warn 信息");
        logger.info("info 信息");
        logger.debug("debug 信息");
        logger.trace("堆栈 信息");
    }
}