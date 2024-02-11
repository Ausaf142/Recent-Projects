package com.automation.SeleniumFasttrack.WebDriverTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheWindowID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		String windowID1 = driver1.getWindowHandle();
		System.out.println(windowID1);
		
	}

}
