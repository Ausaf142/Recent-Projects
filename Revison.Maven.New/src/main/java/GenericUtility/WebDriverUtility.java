package GenericUtility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	/**
	 * for waiting page to laod
	 * @author Ausaf
	 */
	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	public void scriptTimeOut(WebDriver driver) {
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		
	}
	public void elementToBeClickable(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,20) ;
		wait.until(ExpectedConditions.elementToBeClickable(element));		
	}
	public void  waitForElementWithCustomTimeOut(WebDriver driver,WebElement Element,int pollingTime)
	{
		FluentWait<T> wait=new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(20));
	}
	public void switchToAnyWindow(WebDriver driver) {
		String mainID = driver.getWindowHandle();
		Set<String> IDs = driver.getWindowHandles();
		Iterator<String> diffId = IDs.iterator();
		while(diffId.hasNext()) {
			String tempId = diffId.next();
			driver.switchTo().window(tempId);
			if(driver.getTitle().contains("partialWindowTitle")) {
				break;	
			}
		}
	}
	
	public void switchbacktoMainWindow(WebDriver driver) {
		String main = driver.getWindowHandle();
		driver.switchTo().window(main);
	}
	
	public void switchToAlertandAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void switchToAlertandDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public void maximizeDisplay(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrame(WebDriver driver,String id_name_Attribute) {
		driver.switchTo().frame(id_name_Attribute);
	}
	
	public void selectbyIdex(WebDriver driver,WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public void selectbyValue(WebDriver driver,WebElement element,String text) {
		Select select=new Select(element);
		select.selectByValue(text);
		
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
