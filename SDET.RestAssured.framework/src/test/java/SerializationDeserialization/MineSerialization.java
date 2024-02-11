package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Practice_POJO_SerDes.MineLibrary;

public class MineSerialization {
@Test
public void serial() throws Throwable, JsonMappingException, IOException {
	
	//constructor of class(pojo)
	MineLibrary mlib=new MineLibrary("AUSAF","MD.HAFIZ","NAAZ","ZEESHAN","NOMAN", 97086);
	
	//create object of ObjectMapper class
	ObjectMapper obj=new ObjectMapper();
	
	//With objMapper obj refrance give command of write
	obj.writeValue(new File(".\\Mine.json"), mlib);
}
}
