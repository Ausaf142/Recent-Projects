package GenericUtility;

import java.util.Random;

import org.testng.annotations.Test;

public class JavaUtility {

	public  int Randomnum() {
		Random Rand = new Random();
		int key = Rand.nextInt(100);
		return key;
	}

}
