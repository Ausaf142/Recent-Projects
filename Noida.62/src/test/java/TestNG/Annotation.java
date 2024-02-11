package TestNG;

import org.testng.annotations.Test;

public class Annotation {

@Test (priority = 1)
public void Singh() {
	System.out.println("Amar mc");
}

@Test (dependsOnMethods = "khan",priority = 2)
public void ankit() {
	System.out.println("ankit gandu");
}
@Test (enabled = true)
public void khan() {   
	System.out.println("ausaf acha");
}


}
