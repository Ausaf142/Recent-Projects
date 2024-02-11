package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Prog3 {
	@Test (groups = "smoke")
	public void school() {
		System.out.println("IPS");
		Reporter.log("====connected to DataBase======",true);
	}
	
	@Test
	public void college() {
		System.out.println("BHU");
	
	}

}
