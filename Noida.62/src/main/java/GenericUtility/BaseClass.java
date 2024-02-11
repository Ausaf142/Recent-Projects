package GenericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	public  WebDriver driver;
	public static WebDriver sdriver;
		
	 @BeforeSuite
	 public void BS() {
		 System.out.println("connecting to database");
	 }
	 @BeforeTest
	 public void BT() {
		 System.out.println("execute script in paralle mode");
	 }
//	@Parameters("BROWSER") 
		@BeforeClass 
//		  public void BC(String BROWSER) throws Throwable {  //cross browser
			public void BC() {  //cross browser

//			if(BROWSER.equalsIgnoreCase("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			 driver=new ChromeDriver();
//			}
//			else if(BROWSER.equalsIgnoreCase("edge")) {
//				WebDriverManager.edgedriver().setup();
//				 driver=new EdgeDriver();
//			}
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 sdriver=driver;
				 }
	 @BeforeMethod
	 public void BM() throws Throwable {
		 System.out.println("Login");
			driver.get("http://localhost:8888/");
			driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("root");
			driver.findElement(By.name("user_password")).sendKeys(Keys.ENTER);
	 }

	 @AfterMethod
	 public void AM() {
	
		 }
	 @AfterClass
	 public void AC() {
		 System.out.println("Close the Browser");
		
		
	 }
	 @AfterTest
	 public void AT() {
		 System.out.println(" Execution Stopped of script in paralle mode");
	 }
	 @AfterSuite
	 public void RemoveDatabase() {
		 System.out.println("Disconnected to database");
	 }
	 
	
}
