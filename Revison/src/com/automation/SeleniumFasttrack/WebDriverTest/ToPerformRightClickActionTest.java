package com.automation.SeleniumFasttrack.WebDriverTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformRightClickActionTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.kirupa.com/html5/press_and_hold.htm");
		
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.id("item"))).perform();
		action.release(driver.findElement(By.id("item"))).perform();
		
	}

}
