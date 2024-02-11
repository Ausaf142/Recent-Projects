package TestNgProgramms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class First {
@Test
public void Cashora() {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://cashora.com/");
	
}

@Test   
public void google() {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com/");
}
}
