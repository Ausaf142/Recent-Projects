package com.Revison;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchBackParentWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String id = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		Set<String> Ids = driver.getWindowHandles();
		for(String Win:Ids) {
			
			if(Win.equals(id)) {
				driver.switchTo().window(id);
				driver.findElement(By.id("keepLoggedInCheckBox")).click();
				break;
			}
			
		}
	
		
	}

}
