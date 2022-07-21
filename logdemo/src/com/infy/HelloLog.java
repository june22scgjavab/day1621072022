package com.infy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class HelloLog {

	static Log logger=LogFactory.getLog(HelloLog.class);
	
	public static void main(String[] args) {
		logger.info("I am in main");
		logger.error("I am the error");
	    logger.debug("I am the debug");
	}

}
