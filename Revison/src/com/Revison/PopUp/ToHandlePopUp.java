package com.Revison.PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandlePopUp {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demoqa.com/alerts");
	
//	Actions action=new Actions(driver);
//	action.sendKeys(Keys.PAGE_DOWN).perform();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.id("promtButton")));
	Thread.sleep(3000);
	driver.findElement(By.id("promtButton")).click();
	driver.switchTo().alert().sendKeys("LOL HAHA");//given in text of popup
	
	Thread.sleep(3000);
	
	driver.switchTo().alert().accept();
	Thread.sleep(3000);

	
	
}
}
