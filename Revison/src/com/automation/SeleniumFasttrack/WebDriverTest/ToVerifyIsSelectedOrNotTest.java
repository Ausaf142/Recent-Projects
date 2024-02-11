package com.automation.SeleniumFasttrack.WebDriverTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyIsSelectedOrNotTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement element = driver.findElement(By.id("keepLoggedInCheckBox"));
		element.click();
		Thread.sleep(2000);
		if(element.isSelected()) {
			System.out.println("Pass: Checkbox is selected");
		}
		else
			System.out.println("Fail: Checkbox is not selected");

	}

}
