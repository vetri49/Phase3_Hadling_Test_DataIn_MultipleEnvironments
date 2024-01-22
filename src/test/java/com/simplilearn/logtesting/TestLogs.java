package com.simplilearn.logtesting;

import org.testng.annotations.Test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TestLogs {
	static final Logger logger = Logger.getLogger(TestLogs.class);
    @Test
	public void testInfoLogs() {
		     logger.info("This is info logs");
	}
    
    @Test
	public void testWarnLogs() {
		     logger.info("This is Warning logs");
	}
    
    @Test
	public void testDebugLogs() {
		     logger.info("This is debug logs");
	}
    
    @Test
	public void testErrorLogs() {
		     logger.info("This is error logs");
	}
}
