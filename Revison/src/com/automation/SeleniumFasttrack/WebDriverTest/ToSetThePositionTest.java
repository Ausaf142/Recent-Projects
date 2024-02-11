package com.automation.SeleniumFasttrack.WebDriverTest;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetThePositionTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(100, 100));
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(-100, -100));

	}

}
