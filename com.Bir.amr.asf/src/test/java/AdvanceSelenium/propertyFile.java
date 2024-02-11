package AdvanceSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class propertyFile {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream fis=new FileInputStream("./V.properties");
		Properties p=new Properties();
		p.load(fis);
		String link = p.getProperty("url");
		String username = p.getProperty("un");
		String password = p.getProperty("pw");
		System.out.println(link);
		System.out.println(username);
		System.out.println(password);
	
		
		
	}

}
