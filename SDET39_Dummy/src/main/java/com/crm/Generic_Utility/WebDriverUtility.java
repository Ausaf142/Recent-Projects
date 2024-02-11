package com.crm.Generic_Utility;

import java.sql.Time;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WebDriverUtility {
	/**
	 * wait for page to load before identifying the synchronised element in dom
	 * @author Ausaf
	 * 
	 */
	public void WaitForPageToLaod(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	/**
	 * After every action it will for next action to perform.
	 * @author ausaf
	 * 
	 */
	public void scriptTimeOut(WebDriver driver) {
		driver.manage().timeouts().setScriptTimeout(20,TimeUnit.SECONDS);
	}
/**
 * 
 * @used to wait element to be clickablein GUI,and check for element at every 500milisecond.
 * @param driver
 * @param element
 * @author Ausaf
 * 
 */
	public void waitForElementToBeClickable(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		}
	
	
	/**
	 * @used for element to be clickable
	 * 
	 */
	public void  waitForElementWithCustomTimeOut(WebDriver driver,WebElement Element,int pollingTime)
	{
		FluentWait<T> wait=new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(20));
		//*wait.until(ExpectedConditions.elementToBeClickable(Element));
	}
	
	/**
	 * @used to switch any window using window title
	 * @param driver
	 * @param partialWindowTitle
	 * @author Ausaf
	 * 
	 * 
	 */
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
