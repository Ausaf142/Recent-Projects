package GenericUtility;

import java.util.Random;

public class JavaUtility {
	
	public int random() {
		Random ran=new Random();
		int Rkey = ran.nextInt(600);
		
		return Rkey;
	}

}
