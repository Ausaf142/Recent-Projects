package com.vtiger.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
public String propertyfile(String data) throws IOException {
	FileInputStream fis=new FileInputStream("./Data/Vtiger.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String value = prop.getProperty(data);
	
	return value;
			
	
}
}
