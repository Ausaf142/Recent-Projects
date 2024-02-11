package TestNG;

import org.testng.annotations.Test;

public class Prog2 {
@Test (groups = "smoke")
public void qspider() {
	System.out.println("Selenium");
}
@Test (groups = "ausaf")
public void pyspider() {
	System.out.println("Python");
}
@Test
public void jspider() {
	System.out.println("Java");
}
}