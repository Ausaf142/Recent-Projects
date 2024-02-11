package com.vtiger.modules;

import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CampaignToProduct {

	public static void main(String[] args) throws InterruptedException {
		Random ran=new Random();
		int key = ran.nextInt(1000);
		String pname="surf"+key;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[2]/input")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys(Keys.ENTER);
		
		//product
		driver .findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img [@title='Create Product...']")).click();
		driver.findElement(By.name("productname")).sendKeys(pname);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	
		driver.findElement( By.linkText("More")).click();
		
		driver.findElement(By.name("Campaigns")).click();
		driver.findElement(By.xpath("//img[@alt=\'Create Campaign...\']")).click();
		String window = driver.getWindowHandle();
		  driver.findElement(By.xpath("//img[@alt='Select']")).click();
	
        Set<String> windowIds  = driver .getWindowHandles();
	 
	    for(String win : windowIds) {
	    	if(!win.equalsIgnoreCase(window)) {
	    		driver.switchTo().window(win);
	    		driver.findElement(By.id("search_txt")).sendKeys(pname);
				driver.findElement(By.xpath("//input[@name='search']")).click();
				driver.findElement(By.xpath("//a[text()='"+pname+"']")).click();
				break;
			}
	    }
	    	Thread.sleep(2000);
	        driver.switchTo().window(window);
	        driver.findElement(By.name("campaignname")).sendKeys("CampProd"+key);
			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	    }
	    
	}


