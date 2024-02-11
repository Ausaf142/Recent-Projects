package GenericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import GenericUtility.BaseClass;

public class Listener implements ITestListener {
	public void onTestFailure(ITestResult result) {
		String testname = result.getMethod().getMethodName();
		System.out.println(testname+"execute and i am test listening");
	
	EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClass.sdriver);
	File src = edriver.getScreenshotAs(OutputType.FILE);
	File dest=new File("./Proof/Me"+testname+".png");
	try {
		FileUtils.copyFile(src, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}