package com.automation.SeleniumFasttrack.WebDriverTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		
		WebElement element = driver.findElement(By.id("oldSelectMenu"));
		Select select = new Select(element);
		boolean multiSelect = select.isMultiple();
		if(multiSelect) {
			System.out.println("Pass: Drop down is multi-select");
		}
		else
			System.out.println("Fail: Drop down is Single-select");
		
		
		List<WebElement> allOptions = select.getOptions();
		for(WebElement option:allOptions) {
			System.out.println(option.getText());
		}
				
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByVisibleText("Purple");
		Thread.sleep(2000);
		select.selectByValue("5");
		
		select.deselectAll();
		
	}

}
