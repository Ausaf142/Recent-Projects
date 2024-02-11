package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//WebElemts
//1.isDisplayed
//2.isEnabled
//3.isSelected
//4.getText
//5.Click
//6.clear
//7.submit
//8.getSize
//9.GetLocation
//10.sendKeys
//11.getTagName
//12.getReact
//13.getCssValue
//14.getAttributes
public class WebEleme {
	@Test
	public void gone() { 
		WebDriver driver=new ChromeDriver();
		driver.get("https://freekaamaal.com/");
		WebElement element = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		 System.out.println(element.getText());
		System.out.println(element.getLocation());//(377,253)
		System.out.println(element.getSize());
		System.out.println(element.getTagName());//input
		
		System.out.println(element.getRect().getHeight()); //36
		System.out.println(element.getRect().getWidth()); //127
		System.out.println(element.getRect().getX()); //377
		System.out.println(element.getRect().getY()); //253
		
		System.out.println(element.getCssValue("margin")); //rgba(60, 64, 67, 1)
		System.out.println(element.getAttribute("name")); //Google Search
		System.out.println(element.isDisplayed());
		System.out.println(element.isEnabled());
		System.out.println(element.isSelected());
	
	}
	

}
