package com.Revison.DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		WebElement element = driver.findElement(By.id("oldSelectMenu"));
		Select select=new Select(element);
		if(select.isMultiple()) {
			System.out.println("Pass-dropdown is multipla");
		}
		else {
			System.out.println("fail-not multiple dropdown");
		}
		List<WebElement> options = select.getOptions();
		for(WebElement opt:options) {
			System.out.println(opt.getText());
		}
		System.out.println(options);
		select.selectByIndex(0);
		select.deselectByValue("3");
		select.deselectByVisibleText("red");
		
		
		
		
		
	}

}
