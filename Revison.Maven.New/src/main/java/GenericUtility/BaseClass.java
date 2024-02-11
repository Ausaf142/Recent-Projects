package GenericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


import ObjectRepository.LogIn;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public WebDriver driver=null;
public static WebDriver sdriver;		//listner
FileUtility flib=new FileUtility();

@BeforeSuite
public void BS() {
	System.out.println("====connected to Database====");
	
}
@BeforeTest
public void BT() {
	System.out.println("execute script in parallel mode");
}
@BeforeClass
public void BC() throws Throwable{
	System.out.println("Launching the browser");
		String BROWSER = flib.getValueFile("browser");
		if(BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			 
		}
		else if(BROWSER.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("Operamini")) {
			WebDriverManager.operadriver().setup();
			driver=new FirefoxDriver();
		}
		sdriver=driver;		//for trylistner
		WebDriverUtility wlib=new WebDriverUtility();
		wlib.waitForPageToLoad(driver);
		wlib.maximize(driver);
		
}

		
@BeforeMethod
public void BM() throws Throwable {
	System.out.println("=====LogIn to the Application====");
   String URL = flib.getValueFile("url");	
   String username = flib.getValueFile("un");	
   String pass = flib.getValueFile("pw");	
	driver.get(URL);
   	LogIn log=new LogIn(driver);
  
   	log.getLogin(username, pass);
  
   
}
@AfterMethod
public void AM() {
System.out.println("LogOut to Application");
}

@AfterClass 
public void AC() {
	System.out.println("closing the browser");
}

@AfterTest 
public void AT() {
	System.out.println(" Execution Stopped of script in paralle mode");
}
@AfterSuite 
public void AS() {
	System.out.println("Disconnected to database");

}
			
	





}
