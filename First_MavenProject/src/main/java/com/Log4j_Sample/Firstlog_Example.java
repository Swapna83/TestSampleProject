package com.Log4j_Sample;

import org.apache.log4j.Logger;

public class Firstlog_Example
{
    static Logger logger = Logger.getLogger(Firstlog_Example.class);

    public static void main(String[] args) {

        Firstlog_Example obj = new Firstlog_Example();
        obj.runMe("welcome");

    }

    private void runMe(String parameter){

        if(logger.isDebugEnabled()){
            logger.debug("This is debug : " + parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is info : " + parameter);
        }

        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);

    }

}


