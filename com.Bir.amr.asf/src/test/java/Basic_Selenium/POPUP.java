package Basic_Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class POPUP {

	public static void main(String[] args) throws InterruptedException, AWTException {
		//browser WEB based --> child popup , hidden , javascript(confirmation), notification, authentication (detail)
		//window based ---> download ,upload,print .
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//JAVASCRIPT POP UP
		/*
		 * Actions act = new Actions(driver); driver.get("https://demoqa.com/alerts");
		 * act.sendKeys(Keys.ARROW_DOWN).perform();
		 * act.sendKeys(Keys.ARROW_DOWN).perform();
		 * act.sendKeys(Keys.ARROW_DOWN).perform();
		 * driver.findElement(By.id("alertButton")).click();
		 * driver.switchTo().alert().accept(); Thread.sleep(2022);
		 * driver.findElement(By.id("timerAlertButton")).click(); Thread.sleep(5000);
		 * 
		 * driver.switchTo().alert().accept(); Thread.sleep(2022);
		 * driver.findElement(By.id("confirmButton")).click();
		 * driver.switchTo().alert().accept();
		 * 
		 * Thread.sleep(2022); driver.findElement(By.id("promtButton")).click();
		 * driver.switchTo().alert().sendKeys("fasua");
		 * driver.switchTo().alert().accept();
		 */
		
		//NOTIFICATION popup
		/*
		 * driver.get("https://www.yatra.com/"); Robot r = new Robot();
		 * r.keyPress(KeyEvent.VK_TAB); r.keyPress(KeyEvent.VK_ENTER);
		 */
		
		//HIDDEN DIVISION POP-UP
		/*
		 * driver.get("https://www.flipkart.com/"); Actions a = new Actions (driver);
		 * a.moveByOffset(1010, 40).click().perform();
		 */
		  
		
		
		
		
		 
	}

}
