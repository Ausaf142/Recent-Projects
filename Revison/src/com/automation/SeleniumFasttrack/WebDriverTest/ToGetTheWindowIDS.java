package com.automation.SeleniumFasttrack.WebDriverTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheWindowIDS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String firstID = driver.getWindowHandle();
		System.out.println(firstID);
		driver.navigate().to("https://www.facebook.com/");
		String secondID = driver.getWindowHandle();
		System.out.println(secondID);

	}

}
