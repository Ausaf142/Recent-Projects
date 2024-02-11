package com.automation.SeleniumFasttrack.WebDriverTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTitleTest {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriverr.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	String expectedTitle="Google";
	String actaulTitle = driver.getTitle();
	System.out.println(actaulTitle);
	if(actaulTitle.equals(expectedTitle)) {
		System.out.println("Pass: Title is verified");
	}
	else
		System.out.println("Fail: Title is not verified");	
	}

}
