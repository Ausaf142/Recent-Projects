package Basic_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionMethods {
public static void main(String[] args) {
	//Action Method : used to perform mouse and keyboard actions.
	//1 MoveByOffset(Xoffset,Yoffset)
	//2.MoveByOffset(Webelement (Xoffset,Yoffset)).
	//3 MoveToElement(Xoffset,Yoffset)
	//4.MoveToElements(Webelement,(Xoffset,Yoffset)).
	//5.perform();
	//6.click();
	//7.build();
	//8.doubleClick();
	//9.doubleClick(WebElement);
	//10.Contextclick();
	//11.Contextclick(WebElement);
	//12.DragandDrop();
	//13.DragandDrop(Webelement);
	//14.SendKeys();
	//15.SendKeys(WebElement);
	//16.Realease();
	//17.Realease(WebElement);
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Actions act = new Actions(driver);
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
   WebElement anothermodule = driver.findElement(By.id("menu-item-6898"));
      //act.moveToElement(anothermodule).click().perform();
      System.out.println(anothermodule.getLocation());
      act.moveByOffset(655, 41).click().perform();
      WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
      driver.switchTo().frame(frame);
      WebElement img = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
      WebElement target = driver.findElement(By.id("trash"));
     // act.dragAndDrop(img,target).perform();
  //  driver.switchTo().defaultContent();
      act.clickAndHold(img).moveByOffset(0, 20).perform();
      act.release().perform();
    
	}
}
