package GenericLibraries;
/**
 * This class will contain generic method of java
 * @author Ausaf Ahmad
 *
 */

import java.util.Random;
/**
 * This will give random number for every call.
 * @return
 *
 */
public class JavaLibrary {
	public int getRandom() {
	Random ran=new Random();
	return ran.nextInt(500);
	
	

}
}