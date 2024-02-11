package Basic_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class DropDown {
	//only apllying in <select> </select > tag
//for drop down we use select class
	//we can check whether that is multiple or single
//	some of them are
	//1.selectByIndex
	//2.selectByValue
	//3.selectByVisibleText
	//diselectbyAll
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		WebElement sinle = driver.findElement(By.xpath("//div[@class=' css-1hwfws3']"));
		WebElement ele = driver.findElement(By.xpath("//b[text()='Standard multi select']"));
		sinle.click();
		Select sel=new Select(sinle);
		sel.selectByVisibleText("Group 1, option 1");
		Thread.sleep(2022);
		
		
		
		Actions act=new Actions(driver);
		act.scrollToElement(ele).perform();
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.id("oldSelectMenu"));
		Select sel2 =new Select(ele1);
		System.out.println(sel.isMultiple());
		sel.selectByValue("2");
		Thread.sleep(2022);
		sel.deselectByVisibleText("Green");
		
	

	}
}
