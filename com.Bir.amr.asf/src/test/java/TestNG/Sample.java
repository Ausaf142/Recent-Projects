package TestNG;

import org.testng.annotations.Test;

public class Sample {
		@Test(groups ="regression")
		public void reg() {
			System.out.println("--regration--");
		}
		@Test(groups ="retest")
		public void rtest() {
			System.out.println("--retest-");
		}
	
}