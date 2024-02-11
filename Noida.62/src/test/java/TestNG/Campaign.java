package TestNG;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.JavaUtility;

public class Campaign extends BaseClass {
	@Test
	public void create_campaign() {
		JavaUtility jlib = new JavaUtility();
		int key = jlib.Randomnum();
		
//		WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	driver.get("http://localhost:8888/");
//	driver.findElement(By.name("user_name")).sendKeys("admin");
//	driver.findElement(By.name("user_password")).sendKeys("root");
//	driver.findElement(By.name("user_password")).sendKeys(Keys.ENTER);
		
	WebElement ele1 = driver.findElement(By.xpath("//a[text()='More']"));
	Actions act = new Actions(driver);
	act.moveToElement(ele1).perform();
	
	driver.findElement(By.name("Campaigns")).click();
	driver.findElement(By.xpath("//img[@alt=\"Create Campaign...\"]")).click();
	driver.findElement(By.name("campaignname")).sendKeys("Praveen"+key+"");
	String Pid = driver.getWindowHandle();
	driver.findElement(By.xpath("//img[@title=\"Select\"]")).click();
	Set<String> ids = driver.getWindowHandles();
	for(String allIds:ids) {
		if(!(Pid.equalsIgnoreCase(allIds))) { 
			driver.switchTo().window(allIds);
			driver.findElement(By.id("search_txt")).sendKeys("Maal"+key+"");
			driver.findElement(By.name("search")).click();
			driver.findElement(By.xpath("//a[text()='Maal']")).click();
			
		}
	}
	driver.switchTo().window(Pid);
	driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
}
}
