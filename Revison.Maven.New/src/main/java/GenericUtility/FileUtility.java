package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String getValueFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./DDT.properties");
		Properties property=new Properties();
		property.load(fis);
		String value=property.getProperty(key);
		return value;
	
		
	}
	

}
