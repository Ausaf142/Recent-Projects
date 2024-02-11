package com.automation.SeleniumFasttrack.WebDriverTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformLoginActionTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameTxt = driver.findElement(By.id("username"));
		WebElement passwordTxt=driver.findElement(By.name("pwd"));
		
		Actions action=new Actions(driver);
		action.sendKeys(usernameTxt, "admin").perform();
		action.sendKeys(passwordTxt, "manager").sendKeys(passwordTxt, Keys.ENTER).perform();
		
	}

}
