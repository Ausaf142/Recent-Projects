package com.crm.Generic_Utility;

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
import org.testng.annotations.Parameters;

import com.crm.objectRepsitory.LogInPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver=null;
	public static WebDriver sdriver;
	File_utility flib=new File_utility();
	
	@BeforeSuite (groups={"smokeTest","regressionTest"})
	public void BS() {
		System.out.println("connecting to database");
	}
	@BeforeTest (groups={"smokeTest","regressionTest"})
	public void BT() {
		System.out.println("execute script in paralle mode");
	}
	//@Parameters("BROWSER") 
	@BeforeClass (groups={"smokeTest","regressionTest"})
	             // public void BC(String BROWSER) throws Throwable {  //cross browser
	public void BC() throws Throwable {
		System.out.println("Launching Browser");
		String BROWSER = flib.getKeyValue("browser");         //put in comment during cross
		if(BROWSER.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			 }
			 else if(BROWSER.equalsIgnoreCase("Operamini")) {
					WebDriverManager.operadriver().setup();
					 driver=new FirefoxDriver();
		}
		sdriver=driver;
		WebDriverUtility wlib=new WebDriverUtility();
		wlib.WaitForPageToLaod(driver);
		wlib.maximize(driver);
		
	}

	@BeforeMethod (groups={"smokeTest","regressionTest"})
	public void BM() throws Throwable {
		System.out.println("LogIn to Application");
		
	
		String URL = flib.getKeyValue("url");
		String userName = flib.getKeyValue("UN");
		String Password = flib.getKeyValue("PW");
		
		
		driver.get(URL);
		LogInPage login=new LogInPage(driver);
		login.LogIn(userName, Password);
		
		
		
	}

	@AfterMethod (groups={"smokeTest","regressionTest"})
	public void AM() {
	System.out.println("LogOut to Application");
	}
 
	@AfterClass (groups={"smokeTest","regressionTest"})
	public void AC() {
		System.out.println("closing the browser");
	}
 
	@AfterTest (groups={"smokeTest","regressionTest"})
	public void AT() {
		System.out.println(" Execution Stopped of script in paralle mode");
	}
	@AfterSuite (groups={"smokeTest","regressionTest"})
	public void AS() {
		System.out.println("Disconnected to database");
	}

	
} 
