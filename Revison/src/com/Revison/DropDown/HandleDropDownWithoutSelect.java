package com.Revison.DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleDropDownWithoutSelect {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demoqa.com/select-menu");
	
	WebElement ele = driver.findElement(By.xpath("//div[@class=' css-tlfecz-indicatorContainer']"));
	Actions action=new Actions(driver);
	action.click(ele).sendKeys("Red",Keys.ENTER).perform();
	
}
}
