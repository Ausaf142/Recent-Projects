package Practice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 driver.get("https://www.selenium.dev/");
//	        JavascriptExecutor js = (JavascriptExecutor) driver;
//	        js.executeScript("window.scrollBy(0,5000)");
//	        Thread.sleep(2000);
//	        js.executeScript("window.scrollBy(0,-1000)");
//	        js.executeScript("history.go(0)");
//	        String tittle = js.executeScript("return document.title").toString();
//	        System.out.println(tittle);

	       WebElement scroll = driver.findElement(By.xpath("//h2[text()='Selenium Level Sponsors']"));
	        
	     
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(false)", scroll);
	        Thread.sleep(2000);
	        js.executeScript("argument[0].click()", scroll);
	        Thread.sleep(2000);
	        js.executeScript("argument[0].value='qsp'",scroll);
//	        js.executeScript("arguments[0].value='Amar'", disabledElement);/Wrong from amar prog
}
}