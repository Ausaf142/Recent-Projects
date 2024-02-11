package TestNgProgramms;

import javax.swing.GroupLayout.Group;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Second {
	@Test    (groups="smoke")
	public void Cashora() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freekaamaal.com/");
		
	}
	@Test  (groups="smoke")
	public void myntra() {
		System.out.println("helloworld");
	}
}
