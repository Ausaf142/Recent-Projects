package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//  It is used to write JavaScript in Selenium
		//  Synchronised Javascript --> driver  
// Method 
		//1. WindowScrollBy(X,Y); //  js.executeScript("window.scrollTo(0,5000)");
		//2.WindowScrollTO(X cord, Ycord);
		//3.Element ScrollIntoVeiw; //  js.executeScript("arguments[0].scrollIntoView()", ele);
		//4.Element Click();
		//5.Element Value(); //js.executeScript("arguments[0].value = 'ausaf' ", disele);
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.actitime.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("window.scrollBy(0,5000)");//scrollBy
       //  js.executeScript("window.scrollTo(0,5000)");//scrollTo ----same with window
       //   WebElement ele = driver.findElement(By.linkText("Start tracking time for free"));
       //  js.executeScript("arguments[0].scrollIntoView()", ele);
        
       
           driver.get("https://demoapp.Skillrary.com/");
           WebElement disele = driver.findElement(By.xpath("//input[@class='form-control']"));
           js.executeScript("arguments[0].value = 'ausaf' ", disele);
	}

}
