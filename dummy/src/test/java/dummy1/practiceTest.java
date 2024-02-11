package dummy1;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiceTest {
	@Test
	public void demoTest() throws Throwable {
		 WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  		  
		
	  FileInputStream fis=new FileInputStream("./Data/Vtiger.properties"); 
		Properties  p=new Properties();
		 p.load(fis);
		 System.out.println("LOGIN TO Application");
		 String Url=p.getProperty("url");
		 String username=p.getProperty("UN");
		 String password=p.getProperty("PW");
		 
		 driver.get(Url);
		 System.out.println(Url);
		//String URL = System.getProperty("url");
		//System.out.println(URL);
		/*driver.get(URL);
		System.out.println("welcome to jenkins");
		System.out.println("Good Evening");
		System.out.println("Welcome");*/
		
		

		
	
	
	}
}
