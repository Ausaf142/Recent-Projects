package Ankit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
	@Test
	public void droop() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://demoqa.com/select-menu");
	driver.findElement(By.id("oldSelectMenu")).click();
	driver.findElement(By.xpath("//option[text()='Green']")).click();
//driver.findElement(By.xpath("(//div[@class=\" css-1hwfws3\"])[1]")).click();
//	Select sel = new Select(drop);
//	sel.selectByIndex(0);
//	sel.selectByValue("saab");
//	sel.selectByVisibleText("Opel");
//	sel.deselectAll();
}
}