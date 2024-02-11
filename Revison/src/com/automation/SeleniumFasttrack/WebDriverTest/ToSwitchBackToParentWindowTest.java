package com.automation.SeleniumFasttrack.WebDriverTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchBackToParentWindowTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String parentID = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> windowIDS = driver.getWindowHandles();
		Thread.sleep(3000);
		for(String window:windowIDS) {
			driver.switchTo().window(window);
			if(!window.equals(parentID)) {
				driver.findElement(By.linkText("Try Free")).click();
				break;
			}
		}
		driver.switchTo().window(parentID);
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
			

	}

}
