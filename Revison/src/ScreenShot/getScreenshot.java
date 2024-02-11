package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getScreenshot {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://learnenglishkids.britishcouncil.org/short-stories");
	driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	TakesScreenshot ts=(TakesScreenshot)driver;
	//File pic2 = driver.findElement(By.xpath("//a[text()='A']")).getScreenshotAs(OutputType.FILE);
	File pic = ts.getScreenshotAs(OutputType.FILE);
	File des=new File("./File/pic.png");
	FileUtils.copyFile(pic, des);
	
	
	
}
}
