package Ankit;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File pic = ts.getScreenshotAs(OutputType.FILE);
		File file=new File("./ss/amar.png");
		Files.copy(pic, file);
		driver.navigate().to("https://omayo.blogspot.com/");
		WebElement ele = driver.findElement(By.xpath("(//div[@class=\"widget-content\"])[33]"));
		File pic2 = ele.getScreenshotAs(OutputType.FILE);
		File file2=new File("./ss/ausaf.png");
		Files.copy(pic2, file2);
		
}
}