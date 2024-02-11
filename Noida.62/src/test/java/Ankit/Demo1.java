package Ankit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
public static void main(String[] args) throws InterruptedException {
//	System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	//WEBDRIVER
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://omayo.blogspot.com/");
//	String pgsrc = driver.getPageSource();
//	System.out.println(pgsrc);
	System.out.println(driver.getPageSource());
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getWindowHandle());
	System.out.println(driver.getWindowHandles());
	driver.navigate().refresh();
//	driver.close();
	Thread.sleep(1000);
	driver.quit();
	
}
}
