package com.automation.SeleniumFasttrack.WebDriverTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetTextTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		String expectedErrorMsg = "Username or Password is invalid.";
		String actualErrorMsg = driver.findElement(By.className("errormsg")).getText();

		if (actualErrorMsg.contains(expectedErrorMsg)) {
			System.out.println("Pass: Error msg is verified");
		} else
			System.out.println("Fail: Error msg is not verified");
		driver.quit();
		

	}

}
