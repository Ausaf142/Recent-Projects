package com.vtiger.GenericUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	public WebDriver driver=null;
	FileUtility flib = new FileUtility();
	
 @BeforeSuite
 public void BS() {
	 System.out.println("connecting to database");
 }
 @BeforeTest
 public void BT() {
	 System.out.println("execute script in paralle mode");
 }
 @BeforeClass
 public void BC() {
	 System.out.println("Open the Browser");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 }
 @BeforeMethod
 public void BM() throws Throwable {
	 String url = flib.propertyfile("url");
	 String username = flib.propertyfile("UN");
	 String password = flib.propertyfile("PW");
	 driver.get(url);
	 driver.findElement(By.name("user_name")).sendKeys(username);
	 driver.findElement(By.name("user_password")).sendKeys(password);
	 driver.findElement(By.name("user_password")).sendKeys(Keys.ENTER); 
	 System.out.println("LogIn to Application");	 
 }

 @AfterMethod
 public void AM() {
	 System.out.println("Logout to Application");
	 driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']")).click();
	 driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	 }
 @AfterClass
 public void AC() {
	 System.out.println("Close the Browser");
	driver.quit();
	
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
