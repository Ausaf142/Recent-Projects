package Practice;


import org.testng.annotations.*;

public class TestNg {
	
	
@BeforeSuite
public void BS() {
	System.out.println("Before Suit");
}
@BeforeTest
public void BT() {
	System.out.println("Before Test");
}
@BeforeClass
public void BC() {
	System.out.println("Before class");
}
@BeforeMethod
public void BM() {
	System.out.println("Before method");
}
@Test
public void Test() {
	System.out.println("Test");
}
@AfterMethod
public void AM() {
	System.out.println("After Method");
}

@Test
public void Test2() {
	System.out.println("Test2");
}

@AfterClass
public void AC() {
	System.out.println("After class");
}
@AfterTest
public void AT() {
	System.out.println("After Test");
}
@AfterSuite
public void AS() {
	System.out.println("After Suit");
}
}