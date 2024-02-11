package POJO_Libraries;

import java.util.Random;

public class JavaLibrary {
	public int getRandomNumber() {
	Random random=new Random();
	int ran=random.nextInt(500);
	return ran;
	

}
}