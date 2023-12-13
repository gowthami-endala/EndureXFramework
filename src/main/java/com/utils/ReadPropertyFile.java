package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

import com.FrameworkConstants.FrameworkConstants;

public final class ReadPropertyFile {

	
	private ReadPropertyFile() {
		
	}	
	private static Properties property= new Properties();
	
	static {
		try {
			FileInputStream file = new FileInputStream(FrameworkConstants.getConfigpath());
			property.load(file);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getValue(String Key) throws Exception
	{
		
		String value ="";
	
		//Properties property= new Properties();
		//FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources/config/config.properties");
		//property.load(file);
		//value = property.getProperty(Key);
		
		if(Objects.isNull(property.getProperty(Key)) || Objects.isNull(Key)){
			
			throw  new Exception("Property Name" + Key + "is not found. Please check config.proprties");
		}
		return property.getProperty(Key);
		
		
		
	}
}
