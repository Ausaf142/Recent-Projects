package com.Revison.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardStimulationUsingSendKeys {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("trainee");
	driver.findElement(By.id("username")).sendKeys(Keys.CONTROL,"a");
	driver.findElement(By.id("username")).sendKeys(Keys.CONTROL,"c");
	driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL,"v");
	driver.findElement(By.name("pwd")).sendKeys(Keys.ENTER);
	
	
}
}
