package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//driver.manage().window().fullscreen();
//	Dimension size = driver.manage().window().getSize();
//	Point pos = driver.manage().window().getPosition();
//	Point p=new Point(311,47);
//	driver.manage().window().setSize(new Dimension(400,500));
//	driver.manage().window().setPosition(p);
	driver.get("https://www.instagram.com/");
	System.out.println(driver.getCurrentUrl());
//	System.out.println(driver.getPageSource());
	System.out.println(driver.getTitle());
	System.out.println(driver.getWindowHandle());
	System.out.println(driver.getWindowHandles());
	driver.navigate().refresh();
	driver.navigate().to("https://www.facebook.com/");
	driver.navigate().back();
	driver.navigate().forward();

}
}