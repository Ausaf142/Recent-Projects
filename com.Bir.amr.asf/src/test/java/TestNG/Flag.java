package TestNG;

import org.testng.annotations.Test;
public class Flag {
@Test(invocationCount =2)
public void flag1(){
	System.out.println("--flag1--");
}
@Test(priority = 0)
public void flag2() {
	System.out.println("--flag2--");
}
@Test(groups ="smoke")
public void flag3() {
	System.out.println("--flag3--");
}
@Test(dependsOnMethods = "flag5" )
public void flag4() {
	System.out.println("--flag4-");
}
@Test(priority = -1)
public void flag5() {
	System.out.println("--flag5-");
}
}