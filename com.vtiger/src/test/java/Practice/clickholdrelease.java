package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickholdrelease {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.get("https://www.kirupa.com/html5/press_and_hold.htm");
	        Actions A =new Actions(driver);
	        A.clickAndHold(driver.findElement(By.id("item"))).perform();
	        A.release().perform();
	        
	       
	}

}
