package com.crm.Generic_Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class File_utility {
	public String getKeyValue(String key) throws Throwable {
		FileInputStream fis = new FileInputStream("./Data/Vtiger.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		
		return value;
		
	}

}
