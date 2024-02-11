package GenericLibrary;

import java.util.Random;

public class JavaLibrary {
public int RandomNum() {
	Random ran =new Random();
	int key=ran.nextInt(500);
	return key;
}
}
