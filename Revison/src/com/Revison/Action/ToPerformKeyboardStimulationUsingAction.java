package com.Revison.Action;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformKeyboardStimulationUsingAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).perform();
		List<WebElement> allElements = driver.findElements(By.xpath("//a[@class=\"nav-link\"]"));
		for(WebElement ele:allElements) {
			ele.click();
		}
		action.keyUp(Keys.CONTROL);
	}

}
