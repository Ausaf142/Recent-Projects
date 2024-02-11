package com.automation.SeleniumFasttrack.WebDriverTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultiSelectDropdownTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		
		WebElement element = driver.findElement(By.id("cars"));
		Select select = new Select(element);
		boolean multiSelect = select.isMultiple();
		if(multiSelect) {
			System.out.println("Pass: Drop down is multi-select");
		}
		else
			System.out.println("Fail: Drop down is Single-select");	

		select.selectByIndex(3);
		select.selectByVisibleText("Saab");
		select.selectByValue("volvo");
		WebElement firstOption = select.getFirstSelectedOption();
		System.out.println(firstOption.getText());
		select.deselectByIndex(3);
		select.deselectByVisibleText("Saab");
		select.deselectByValue("volvo");
		
		
	
}}