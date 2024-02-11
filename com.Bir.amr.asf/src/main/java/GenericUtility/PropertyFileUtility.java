package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.fasterxml.jackson.databind.exc.PropertyBindingException;

public class PropertyFileUtility {

 public String PropertyFile(String value) throws IOException{
		FileInputStream fis = new FileInputStream("./V.properties");
		Properties pb =new Properties();
		pb.load(fis);
		String data = pb.getProperty(value);
		return data;
		
	}

}
