package com.driver;

import java.io.IOException;
import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import com.FrameworkConstants.FrameworkConstants;
//import com.utils.ReadPropertyFile;
import com.utils.ReadPropertyFile;

public final class Driver {
	public static WebDriver driver;

	private Driver(){
	}

//	public static WebDriver driver= new ChromeDriver();
	
	public static void initDriver() throws Exception {
		if(Objects.isNull(DriverManager.getDriver())) {
			System.setProperty("webdriver.chrome.driver", FrameworkConstants.CHROMEDRIVERPATH);
          driver = new ChromeDriver();
          driver.manage().window().maximize();
          DriverManager.setDriver(driver);
          //Hardcoded url below
        // DriverManager.getDriver().get("https://demoqa.com/"); 
          DriverManager.getDriver().get(ReadPropertyFile.getValue("url"));

	}
	}
	public static void quitDriver(){  
		if(Objects.nonNull(DriverManager.getDriver()))
			DriverManager.getDriver().close();
		DriverManager.getDriver().quit();
		DriverManager.unload();
	}
	
    
	}

