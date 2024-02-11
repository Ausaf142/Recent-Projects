package Ankit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class PopUp {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,500)");
		driver.findElement(By.id("alert1")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(4000);
		driver.navigate().to("https://demoqa.com/alerts");
		driver.findElement(By.id("promtButton")).click();
		driver.switchTo().alert().sendKeys("ausaf");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

}
}