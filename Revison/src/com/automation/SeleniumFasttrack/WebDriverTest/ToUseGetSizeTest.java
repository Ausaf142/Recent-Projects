package com.automation.SeleniumFasttrack.WebDriverTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetSizeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Dimension dim = driver.manage().window().getSize();
		System.out.println(dim);
		System.out.println("The Height of the webpage is " + dim.getHeight());
		System.out.println("The Width of the webpage is " + dim.getWidth());
		driver.quit();
	}

}
