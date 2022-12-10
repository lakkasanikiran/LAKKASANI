package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

	public static String getProperty(String PropertyName) {
		
		Properties properties=new Properties();
		String path= System.getProperty("user.dir")+"/src/test/resources/Config.properties";
		try {
			FileInputStream inputstream=new  FileInputStream(path);
			properties.load(inputstream);
		
		}catch (FileNotFoundException e) {
			System.out.println("FileNotFound"+e);
		}catch (IOException e) {
			e.printStackTrace();
			
		}
			return  properties .getProperty(PropertyName);
		
		
		
	}
	
	}
	
