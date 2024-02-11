package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Testing {
	//@Parameters("BROWSER") 
	@Test
	public void browser1() {
	WebDriver driver= new ChromeDriver();
	
	}
@Test  
	public void zabc() {
		System.out.println("hello");
		Reporter.log("its our reports",true);
	}
@Test  (dependsOnMethods = "zabc")
public void bcd() {
	System.out.println("hi");
}
@Test (groups = "regression")
public void cde() {
	System.out.println("bye");
}
}
