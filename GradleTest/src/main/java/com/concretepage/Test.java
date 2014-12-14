package com.concretepage;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

public class Test {
  public static void main(String[] args) {
	 Logger logger = Logger.getLogger(Test.class);
	 logger.debug("Starting demo");
	 String s = "Some Value"; 
	 if(!StringUtils.isEmpty(s)){
		 System.out.println("Welcome ");
	 }
	 logger.debug("End of demo");
  }
} 