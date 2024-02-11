package AamarAdvance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_Notepad {
public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		FileInputStream fis =new FileInputStream("./notepad.txt");
		Properties pro =new Properties();
		pro.load(fis);
		String LINK = pro.getProperty("url");
		String UN = pro.getProperty("username");
		String PWD = pro.getProperty("pass");
		
		driver.get(LINK);
		driver.findElement(By.name("user_name")).sendKeys(UN);
		driver.findElement(By.name("user_password")).sendKeys(PWD);
		driver.findElement(By.name("user_password")).sendKeys(Keys.ENTER);
	
}
}
