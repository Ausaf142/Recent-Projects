package Ankit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://omayo.blogspot.com/");
	 WebElement loc = driver.findElement(By.xpath("//a[text()='Page One']"));
	System.out.println(loc.getLocation());
	Actions act =new Actions(driver);
	Thread.sleep(1000);
	act.moveByOffset(371, 319).perform();
	WebElement ele=driver.findElement(By.xpath("//button[text()=' Double click Here   ']"));
	act.moveToElement(ele).perform();
	act.doubleClick(ele).perform();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	//act.contextClick(ele).perform();
	
	Thread.sleep(2000);
//CLICK AND HOLD
	driver.navigate().to("https://www.kirupa.com/html5/press_and_hold.htm");
	WebElement ClickandHold = driver.findElement(By.id("item"));
	act.moveToElement(ClickandHold).perform();
	
	act.clickAndHold(ClickandHold).perform();
	Thread.sleep(5000);   // Use to hold for some time we use thread
	act.release().perform();
//DRAG AND DROP
	driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
	WebElement fra = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	
	driver.switchTo().frame(fra);
 	 WebElement ELE1 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
 	 Thread.sleep(2000);
 	WebElement ELE2 = driver.findElement(By.id("trash"));
 	act.dragAndDrop(ELE1, ELE2).perform();
 	 
 	
}
}