package com.vtiger.GenericUtility;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WebDriverUtility {
	
 public void WindowMax(WebDriver driver) {
	 driver.manage().window().maximize();
 }
 public void  Wait(WebDriver driver) {
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	 
 }
 /*public void ExplicitWait(WebDriver driver, WebElement element) {
	 WebDriverWait wb = new WebDriverWait(driver, 20);
	 wb.until(ExpectedConditions.elementToBeClickable(element)); 	 
 }*/
 public void WindowHandle(WebDriver driver) {
	 driver.getWindowHandle();
	 driver.getWindowHandles();
 }
 public void frame(WebDriver driver , int index ) {
	 driver.switchTo().frame(index)	 ;
 }
 public void frame(WebDriver driver , String name ) {
	 driver.switchTo().frame(name) ;
 }
 public void frame(WebDriver driver , WebElement ele ) {
	 driver.switchTo().frame(ele)	 ;
 }
 public void selectclass (WebElement element,int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}	
 public void selectclass (WebElement element,String text) {
		Select sel=new Select(element);
		sel.selectByValue(text);	
}

	public void switchToWindow(WebDriver driver,String partialWindowTitle) {
		Set<String> id = driver.getWindowHandles();
		Iterator<String> ID = id.iterator();
		while(ID.hasNext()) {
			String mainId = ID.next();
			driver.switchTo().window(mainId);
			System.out.println(mainId);
			if(driver.getTitle().contains(partialWindowTitle)) {
				break;
			}	
		
		}
	}
	
	
	/**
	 * @used for switching to alert and accept.
	 * @param driver
	 * @author Ausaf
	 * 
	 */
	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	/**
	 * @used for switching to alert window and reject that.
	 * @param driver
	 * @author Ausaf
	 * 
	 */
	public void switchToAlertAndReject(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * @used for switching to parent frame to new frame
	 * @param driver
	 * @param index
	 * @author Ausaf
	 * 
	 * 
	 */
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * @used for switching to frame by attribute
	 * @param driver
	 * @param id_name_Attribute
	 * @author Ausaf
	 */
	public void switchToFrame(WebDriver driver,String id_name_Attribute) {
		driver.switchTo().frame(id_name_Attribute);
	}
	
	/**
	 * @used for selecting the drop down element
	 * @param element
	 * @param element
	 * @author Ausaf
	 * 
	 */
	public void select(WebElement element,int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}			
		/**
		 * @used for selecting the value from drop down
		 * @param element
		 * @param text
		 * @author Ausaf
		 * 		
		 */
	public void select(WebElement element,String text) {
		Select sel=new Select(element);
		sel.selectByValue(text);
		
	}
	/**
	 * @used to take cursor on particular point
	 * @param driver
	 * @param element
	 * @author Ausaf
	 * 
	 * 			
	 */
	public void mouseOverElement(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		
	}
	/**
	 * @used to click on any specified element
	 * @param driver
	 * @param element
	 * @author Ausaf
	 */
	public void rightClick(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.contextClick(element).perform();
	}
	/**
	 * @move
	 * 
	 */
	public void move(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}
	/**
	 * 
	 * @param driver
	 */
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
 
}
