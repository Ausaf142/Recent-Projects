package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/mobiles/apple~brand/pr?sid=tyy,4io");
	driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 64 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='₹37,999']")).click();
	
}
}
