package com.Revison.PopUp;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleNotificationPopUp {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.yatra.com/");
	Actions action =new Actions(driver);
	Thread.sleep(5000);
	//why action keybord stimulation not wrking
//	action.sendKeys(Keys.TAB);
//	Thread.sleep(2000);
//	action.sendKeys(Keys.ENTER).perform();
	
	
	
	Robot robot=new Robot();
	Thread.sleep(5000);
	robot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_ENTER);

	
}
}
