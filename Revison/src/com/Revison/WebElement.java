package com.Revison;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		String acturl = driver.getCurrentUrl();
		String expurl="facebook";
		//url
		if(acturl.contains(expurl)) {
			System.out.println("verified");
		}
		else {
			System.out.println("failed");
		}
		//getposition
		  Point p=new Point(500,100);
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		driver.manage().window().setPosition(p);
		//getsize
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		driver.manage().window().setSize(new Dimension(50,60));
		driver.close();
	}

}
