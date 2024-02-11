package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing2 {
	
	
	public void browser() {
	WebDriver driver= new ChromeDriver();
	
	}
	
@ Test  (groups = "smoke")
public void Apple() {
	System.out.println("iphone14");
}
@ Test 
	public void viivo() {
		System.out.println("v11pro");
}
@ Test 
		public void xiomi() {
			System.out.println("red");
}
@ Test 
			public void Techno() {
				System.out.println("v11");
}
}
