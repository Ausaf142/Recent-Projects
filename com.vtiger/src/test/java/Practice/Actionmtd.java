package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionmtd {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//driver.get("https://amp.dev/documentation/examples/interactivity-dynamic-content/star_rating/?format=websites");
//	WebElement ele = driver.findElement(By.id("rating1"));
//	Actions action=new Actions(driver);
//	//action.moveToElement(ele, 220, 0).perform();
//	action.scrollToElement(ele).perform();
//	action.sendKeys(Keys.PAGE_DOWN).perform();
//	action.contextClick().perform();
//	WebElement elw2 = driver.findElement(By.linkText("View demo"));
//	action.moveToElement(elw2).doubleClick().perform();
//	driver.navigate().to("https://jqueryui.com/draggable/");
//	driver.switchTo().frame(0);
//	WebElement ele = driver.findElement(By.id("draggable"));
//	Actions action=new Actions(driver);
//	action.dragAndDropBy(ele, 100, 10).perform();
	  driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
      driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
      WebElement sourceElement =driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
      WebElement sourceElement1 =driver.findElement(By.xpath("//img[@src='images/high_tatras2_min.jpg']"));
      WebElement sourceElement2 =driver.findElement(By.xpath("//img[@src='images/high_tatras3_min.jpg']"));
      WebElement dest = driver.findElement(By.id("trash"));
      Actions action = new Actions(driver);
      action.dragAndDrop(sourceElement, dest).perform();
      action.dragAndDrop(sourceElement1, dest).perform();
      //action.dragAndDrop(dest,sourceElement1).perform();
      //action.dragAndDrop(dest,sourceElement).perform();
      /// gallery frome dest to gallery
      WebElement D = driver.findElement(By.id("gallery"));
      action.dragAndDrop(sourceElement1,D).perform();
      action.dragAndDrop(sourceElement,D).perform();
      System.out.println("All Elements outside of Trash "); 
	
}
}