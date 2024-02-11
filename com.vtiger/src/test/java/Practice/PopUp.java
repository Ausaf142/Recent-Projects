package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class PopUp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demoqa.com/alerts");
	driver.findElement(By.id("alertButton")).click();
	driver.switchTo().alert().accept();
	driver.findElement(By.id("confirmButton")).click();
	Thread.sleep(5000);
	driver.switchTo().alert().dismiss();
	Actions a=new Actions(driver);
	a.scrollToElement(driver.findElement(By.id("promtButton"))).perform();
	a.sendKeys(Keys.PAGE_DOWN).perform();
	driver.findElement(By.id("promtButton")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().sendKeys("ausaf");
	driver.switchTo().alert().accept();
	
}
}
