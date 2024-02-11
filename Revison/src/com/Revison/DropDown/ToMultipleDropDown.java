package com.Revison.DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToMultipleDropDown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		WebElement ele = driver.findElement(By.id("cars"));
		Select select=new Select(ele);
		if (select.isMultiple()) {
			System.out.println("yes it is multiple");
		}
		else {
			System.out.println("no:it is not multiple");
		}
		select.selectByIndex(2);
		Thread.sleep(2000);
select.selectByValue("saab");
Thread.sleep(2000);
		select.selectByVisibleText("Volvo");
		driver.quit();
		
	}

}
