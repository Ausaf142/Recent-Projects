package com.Revison;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToViewTextSize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Dimension s = driver.manage().window().getSize();
		 WebElement d = driver.findElement(By.id("username"));
		 d.getSize();
		System.out.println(s);
		System.out.println(s.height);
		System.out.println(s.width);
		System.out.println(d.getSize());
		System.out.println( d.getSize().height);
		System.out.println( d.getSize().width);
	}

}
