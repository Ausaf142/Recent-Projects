package Ankit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		WebElement ele=driver.findElement(By.id("myBtn"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0,100)");
//		js.executeScript("window.scrollBy(0,100)");
		
		js.executeScript("arguments[0].scrollIntoView()", ele);
		
}
}