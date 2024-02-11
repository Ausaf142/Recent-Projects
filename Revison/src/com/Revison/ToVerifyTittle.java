package com.Revison;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTittle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriverr.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("Google")){
			System.out.println("yes pass");
		}
		else {
			System.out.println("fail");
		}
		
		driver.close();
	}

}
