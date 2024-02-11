package ScollBarByJS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownUpScrollBar {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://learnenglishkids.britishcouncil.org/short-stories");
	JavascriptExecutor js= (JavascriptExecutor)driver;
	WebElement text = driver.findElement(By.xpath("//span[text()='ABC Zoo']"));
	//WebElement ele = driver.findElement(By.xpath("//html[@class=' fonts-loaded']"));
	driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	Thread.sleep(3000);
//	js.executeScript("window.scrollBy(0,1000)");
//	Thread.sleep(2000);
//	js.executeScript("window.scrollTo(0,1000)");
//	Thread.sleep(2000);
	js.executeScript("arguments[0].scrollIntoView()", text);
}
	
	
	
	
	
}
