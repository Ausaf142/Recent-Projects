package com.automation.SeleniumFasttrack.WebDriverTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveringActionTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("BEAUTY"))).click().perform();
		action.click(driver.findElement(By.xpath("//span[@class=\"product-discountedPrice\"]"))).perform();
	}

}
