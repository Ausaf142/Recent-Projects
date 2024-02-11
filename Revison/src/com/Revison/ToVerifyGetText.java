package com.Revison;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyGetText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("trainee");
	driver.findElement(By.name("pwd")).sendKeys(Keys.ENTER);
	 String Expmsg = "Username or Password is invalid. Please try again";
	 String Actmsg = driver.findElement(By.xpath("//span[@class='errormsg']")).getText();
	 Thread.sleep(1000);
	if(Expmsg.contains(Actmsg)) {
		System.out.println("verified");
	}
	else {
		System.out.println("invalid");
	}
	driver.close();
	
	
	}

}
