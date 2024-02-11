package com.automation.SeleniumFasttrack.WebDriverTest;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetThePositionTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		System.out.println("This is the X Coordinate "+pos.getX());
		System.out.println("This is the Y Coordinate "+pos.getY());

	}

}
