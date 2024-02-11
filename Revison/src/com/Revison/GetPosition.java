package com.Revison;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPosition {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Dimension d=new Dimension(20,60);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		driver.close();

}
}