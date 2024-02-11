package TestNG;

import org.testng.annotations.Test;

public class GroupEx {
	@Test(groups ="smoke")
	public void smoke() {
		System.out.println("--smoke--");
	}
	@Test(groups ="sanity")
	public void sanity1() {
		System.out.println("--sanity-");
	}
}
