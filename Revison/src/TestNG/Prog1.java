package TestNG;

import org.testng.annotations.Test;

public class Prog1 {
	@Test (priority=1)
	public void amar() {
		System.out.println("Banaras");
	}
	@Test (priority=-1)
	public void ausaf() {
		System.out.println("Siwan");
	}
	@Test (priority=2)
	public void birvijay() {
		System.out.println("patna");
	}
	@Test (enabled=true)//skip
	public void skip() {
		System.out.println("skip");
	}
	@Test (invocationCount=3)
	public void dosa() {
		System.out.println("mai hu");
	}
	@Test (dependsOnMethods = "skip")
	public void amarkirani() {
		System.out.println(" hai");
	}

}
