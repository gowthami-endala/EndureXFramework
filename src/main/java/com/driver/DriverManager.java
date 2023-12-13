package com.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

	private DriverManager(){}
	private static ThreadLocal<WebDriver> dr = new ThreadLocal<>() ;
	
	public static WebDriver getDriver() {
		//System.out.println("Testing123");
		return dr.get();
	}
	
	public static void setDriver(WebDriver driverref) {
		if(Objects.nonNull(driverref)) {
			dr.set(driverref);
		}
	}
	public static void unload() {
		dr.remove();
	}
}
