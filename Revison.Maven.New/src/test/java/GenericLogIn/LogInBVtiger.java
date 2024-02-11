package GenericLogIn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtility.BaseClass;
import GenericUtility.ExcelUtility;

public class LogInBVtiger extends BaseClass {
	public static void main(String[] args) throws IOException, Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ExcelUtility elib=new ExcelUtility();
		String URL = elib.getFromExcel("Sheet1", 1, 0);
		String un = elib.getFromExcel("Sheet1", 1, 1);
		String pw = elib.getFromExcel("Sheet1", 1, 2);
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(un);
		driver.findElement(By.name("user_password")).sendKeys(pw);
		driver.findElement(By.name("user_password")).sendKeys(Keys.ENTER);
		
		
			
	}

}
