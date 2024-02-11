package AdvanceSelenium;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 * driver.get("https://www.google.co.in/"); TakesScreenshot
		 * ts=(TakesScreenshot)driver; // File pic =
		 * ts.getScreenshotAs(OutputType.FILE); Thread.sleep(2022); WebElement
		 * ele=driver.findElement(By.name("btnK")); File pic2 =
		 * ele.getScreenshotAs(OutputType.FILE); File fil=new File("./SS/pic45.png");
		 * Files.copy(pic2, fil);
		 */
		
		driver.get("https:/demo.actitime.com/login.do");
		File sourceFile = driver.findElement(By.xpath(" //div[text()='Login ']")).getScreenshotAs(OutputType.FILE);
		File destFile =new File("./SS/amar.png");
		Files.copy(sourceFile, destFile);
		driver.quit();
	}

}
