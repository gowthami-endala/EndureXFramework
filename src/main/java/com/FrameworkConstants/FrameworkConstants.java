package com.FrameworkConstants;

public final class FrameworkConstants {

	public static final String CHROMEDRIVERPATH= System.getProperty("user.dir")+ "/src/test/resources/Executables/chromedriver";
	public static final String CONFIGPATH = System.getProperty("user.dir")+ "/src/test/resources/config/config.properties";
	public static String getChromedriverpath() {
		return CHROMEDRIVERPATH;
	}
	public static String getConfigpath() {
		return CONFIGPATH;
	}
	

}
