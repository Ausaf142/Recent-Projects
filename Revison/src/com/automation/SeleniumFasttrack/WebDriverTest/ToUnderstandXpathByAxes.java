package com.automation.SeleniumFasttrack.WebDriverTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandXpathByAxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String mobileName = "APPLE iPhone 13 (Midnight, 128 GB)";
		String mobilePrice = "₹69,999";
		driver.get("https://www.flipkart.com/search?q=iphone&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_2_3_na_na_ps&otracker1=AS_QueryStore_OrganicAutoSuggest_2_3_na_na_ps&as-pos=2&as-type=RECENT&suggestionId=iphone%7CMobiles&requestId=dbe6f89b-5493-4d79-9d79-4ede0e8bea79&as-backfill=on");
		WebElement element = driver.findElement(By.xpath("//div[text()='"+mobileName+"']/ancestor::div[@class=\"_3pLy-c row\"]/descendant::div[text()='"+mobilePrice+"']"));
		String price = element.getText();
		System.out.println(price);
	}

}
