package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Practice_POJO_SerDes.EmployeeDetails;

public class Serialization {
	@Test
	public void serialization() throws JsonGenerationException, JsonMappingException, IOException {
		
		EmployeeDetails emp=new EmployeeDetails("ausaf", 455, "a@.com", "ty001", true);
		
		ObjectMapper obj = new ObjectMapper();
		
		obj.writeValue(new File(".\\Data.json"), emp);
	}
		
	

}
