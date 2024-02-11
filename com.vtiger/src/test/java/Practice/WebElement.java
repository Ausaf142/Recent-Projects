package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {
public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
//		driver.findElement(By.name("user_name")).sendKeys("admin");
//		driver.findElement(By.name("user_password")).sendKeys("admin");//2
//		//driver.findElement(By.name("user_password")).clear();
//		
//		driver.findElement(By.id("submitButton")).click();//1
//		Dimension text1 = driver.findElement(By.linkText("Calendar")).getSize();
//		 Point loc = driver.findElement(By.linkText("Calendar")).getLocation();
//		System.out.println(loc);
//		System.out.println(text1);
//		String Text = driver.findElement(By.linkText("Calendar")).getText();//3
//		String Cssvalu = driver.findElement(By.linkText("Calendar")).getCssValue(Text);
//		String Attributes = driver.findElement(By.linkText("Calendar")).getAttribute(Cssvalu);
//		Rectangle sizeloc = driver.findElement(By.linkText("Calendar")).getRect();
//		System.out.println(Text);
//		System.out.println(Cssvalu);
//		System.out.println(Attributes);
//		System.out.println(sizeloc);
		//driver.navigate().to("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		
		
		
		
		Thread.sleep(3000);
		boolean enable = driver.findElement(By.linkText("Continue")).isEnabled();
		if(enable) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		   driver.findElement(By.id("email")).sendKeys("akashdeb87@gmail.com");
		    Thread.sleep(2000);
		    boolean  displayed= driver.findElement(By.xpath("//p[text()='Email is invalid or already taken']")).isDisplayed();
		   // boolean displayed = element.isDisplayed();
		    if (displayed ) {
		    	System.out.print("pass that is displayed");
		    } else 
		    	System.out.print("fail that is displayed");
		    driver.quit();
		    	
		    }
		
		
		
		
}

