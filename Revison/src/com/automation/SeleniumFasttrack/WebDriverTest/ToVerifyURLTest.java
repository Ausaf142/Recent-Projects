package com.automation.SeleniumFasttrack.WebDriverTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyURLTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String expectedURL = "facebook";
		String actualULR = driver.getCurrentUrl();
		System.out.println(actualULR);
		System.out.println(expectedURL);
		if(actualULR.contains(expectedURL)) {
			System.out.println("Pass: URL is verified");
		}
		else
			System.out.println("Fail: URL is not verified");

	}

}
