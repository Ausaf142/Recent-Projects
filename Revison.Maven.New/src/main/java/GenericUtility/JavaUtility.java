package GenericUtility;

import java.util.Random;

public class JavaUtility {
	public int randomNo() {
		Random random=new Random();
		int number = random.nextInt(500);
		return number;
		
	}

}
