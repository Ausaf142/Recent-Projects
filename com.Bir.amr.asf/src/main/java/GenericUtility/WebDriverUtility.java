package GenericUtility;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void implicitlyWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	public void alertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void alertDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
		
	}
	
	public void screenshot(WebDriver driver,String picName) {
		TakesScreenshot ts= (TakesScreenshot)driver;
		ts.getScreenshotAs(OutputType.FILE);
		File fs=new File("./SS"+picName+".png");	
	}
	
	public void contextclickmtd(WebDriver driver) {
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}
	public void mouseOver(WebDriver driver,WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	public void movebyoffset(WebDriver driver,int x,int y) {
		Actions act = new Actions(driver);
		act.moveByOffset(x,y).perform();
	}
	 public void dropdownbyindex(WebDriver driver,WebElement element,int index) {
		 Select s=new Select(element); 
		 s.selectByIndex(index);
	 }
	 
	 public void dropdownbyvalue(WebDriver driver,WebElement element,String value) {
		 Select s=new Select(element); 
		 s.selectByValue(value);
	 }
	 public void quit(WebDriver driver) {
		 driver.quit();
	 }
	 
	 public void switchingWindows(WebDriver driver,String partialUrl) {
		 
		 Set<String> windows = driver.getWindowHandles();
		 Iterator<String> win = windows.iterator();
		
		 while(win.hasNext()) {
			 String parentWindow = win.next();
			 driver.switchTo().window(parentWindow);
			 if(driver.getCurrentUrl().contains(partialUrl)) {
				 
			 }
		 }
	 }
	

}
