package Ankit;

import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebElements {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://omayo.blogspot.com/");
	
	Actions act =new Actions(driver);
	
	WebElement ele = driver.findElement(By.xpath("//button[text()='Try it']"));
	act.moveToElement(ele).perform();
//	act.sendKeys(Keys.ARROW_DOWN).perform()
	ele.click();
	Thread.sleep(3000);
	 WebElement rxn = driver.findElement(By.id("myBtn"));
	System.out.println(rxn.isEnabled());
	System.out.println(rxn.isDisplayed());
	System.out.println(rxn.isSelected());
	System.out.println(rxn.getText());
	System.out.println(rxn.getLocation());
	
	System.out.println(rxn.getSize());
	System.out.println(rxn.getRect());
	System.out.println(rxn.getTagName());
	System.out.println(rxn.getAttribute("class"));
	System.out.println(rxn.getCssValue("color"));
	

//	System.out.println("aya");
	}

}
