package com.Revison.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformLoginByAction {
	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	Actions action =new Actions(driver);
	action.sendKeys(driver.findElement(By.id("username")), "trainee").perform();
	action.sendKeys(driver.findElement(By.name("pwd")),"trainee").perform();
	action.sendKeys(Keys.ENTER).perform();
	
	
}
}