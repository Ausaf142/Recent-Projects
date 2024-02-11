package TestNG;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.LOGIN_PAGE;

	public class LogIn {
		@Test(groups = "smoke")
		public void abc() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("http://localhost:8888/");
//			driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[2]/input")).sendKeys("admin");
//			driver.findElement(By.name("user_password")).sendKeys("root");
//			driver.findElement(By.name("user_password")).sendKeys(Keys.ENTER);
			LOGIN_PAGE log = new LOGIN_PAGE(driver);
			log.Login();
		System.out.println("login smoke");
		}
	}

