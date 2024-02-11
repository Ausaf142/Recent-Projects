package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirteenMethods {
	public static void main(String[] args) throws InterruptedException {
		//   13 methods presents in webdriver
		//1. get(url) 
		//2. getCurrentUr()
		//3. get Tittle()
		//4.  getPageSource()
		//5. get windowhandle()
		//6. get windowhandles()
		//7. Navigate()
		//8. Manage().
		//9. Switchto()
	    //10. close()
		//11 quit()
		//12. search context 1). findelement 2). findelements
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		//driver.manage().window().minimize();
	
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		driver.navigate().to("https://www.google.co.in/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.quit();	
		
	}

}
