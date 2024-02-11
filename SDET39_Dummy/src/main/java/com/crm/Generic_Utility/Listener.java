package com.crm.Generic_Utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements  ITestListener{

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	String testname =result.getMethod().getMethodName();
	System.out.println(testname+"========Execute and I am Listening=====");
	
	EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.sdriver);
	File srcFile = edriver.getScreenshotAs(OutputType.FILE);
	try {
		File destFile = new File("./sdet/photo"+testname+".png");
		FileUtils.copyFile(srcFile, destFile);
	}
	catch(Throwable e) {
		e.printStackTrace();
		
	}
	}
	
}