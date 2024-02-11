package GenericUtility;

import java.io.File;
import java.io.IOException;

import org.checkerframework.common.util.report.qual.ReportCall;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.ITest;

import com.google.common.io.Files;

public class Listner implements ITestListener {
	public void onTestSuccess(ITestResult result) {
		String methods = result.getMethod().getMethodName();
		System.out.println(methods);
		
		EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.sdriver);
		File img = edriver.getScreenshotAs(OutputType.FILE);
		File file =new File("./ss/dil.png");
		try {
			Files.copy(img, file);
		}
		catch(IOException e){
			e.printStackTrace();	
		}
	}

}
