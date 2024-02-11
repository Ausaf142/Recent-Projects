package com.Revison;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocators {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
//	driver.findElement(By.id("email")).sendKeys("ausaf142@gmail.com");
//	driver.findElement(By.name("pass")).sendKeys("naaz bano");
//	driver.findElement(By.name("login")).click();
	
	
//	driver.findElement(By.linkText("Forgotten password?")).click();
//	driver.findElement(By.partialLinkText("Forgotten")).click();
	
	
    driver.close();
	
	
	
	
	
}
}
