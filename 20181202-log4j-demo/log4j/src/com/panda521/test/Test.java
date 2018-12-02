package com.panda521.test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by jack on 2018/12/2.
 */
public class Test {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(Test.class);
        logger.info("使用单独的logger输出");

        Hello.h1();
    }

}