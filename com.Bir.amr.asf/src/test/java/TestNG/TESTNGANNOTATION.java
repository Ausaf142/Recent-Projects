package TestNG;

import org.testng.annotations.*;

public class TESTNGANNOTATION {
	
@BeforeSuite
	public void bs() {
		System.out.println("beforesuit: -- Connect To DB---");
	}
@BeforeTest
public void bt() {
	System.out.println("beforetest:---Installation Reportor server");
}
@BeforeClass
public void bc() {
	System.out.println("beforeclass: ---OpenBrowser------");
}
@BeforeMethod
public void bm() {
	System.out.println("beforemethos:--- Login------");
}

@Test
public void t() {
	System.out.println("Test:-----Alll Test Script----");
}
@AfterMethod
public void am() {
	System.out.println("AfterMethod:------ Logout-----------");
}
@AfterClass
public void ac() {
	System.out.println("Afterclass:------Close Browser----");
}
@AfterTest
public void at() {
	System.out.println("AfterTest:-----Dissconnect server----");
}
@AfterSuite
public void as() {
	System.out.println("Aftersuit:----Diconnect Database-----");
}
}
