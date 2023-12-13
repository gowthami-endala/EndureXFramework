package com.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.driver.Driver;

public class BasePage {
	
	
	   protected BasePage() {
	   }
	   
		@BeforeMethod
		public void browserLaunch() throws Exception {
	    Driver.initDriver();
		}
	   
	    
	    
	    @AfterMethod
		public void browserTearDown() {
	    	//Driver.close();
	    Driver.quitDriver();
	    
	    
}
}
