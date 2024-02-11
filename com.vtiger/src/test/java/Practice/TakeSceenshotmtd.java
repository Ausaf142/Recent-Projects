package Practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeSceenshotmtd {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		TakesScreenshot ts=(TakesScreenshot)driver;
//		File pic1 = ts.getScreenshotAs(OutputType.FILE);
//		File file=new File("./Data/pic.png");
//		Files.copy(pic1, file);
		 WebElement ele = driver.findElement(By.xpath("//div[text()='Select Menu']"));
		 File pic2 = ele.getScreenshotAs(OutputType.FILE);
		 File file2=new File("./Data/pic2.png");
		 Files.copy(pic2, file2);
		 
		

}
}