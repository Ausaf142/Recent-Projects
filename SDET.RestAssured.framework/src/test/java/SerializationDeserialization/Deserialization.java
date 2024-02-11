package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Practice_POJO_SerDes.EmployeeDetails;

public class Deserialization {
	@Test
	public void deserialization() throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper obj = new ObjectMapper();
		
		//read the value
		EmployeeDetails emp = obj.readValue(new File(".\\Data.json"), EmployeeDetails.class);
		//access the value using refrance
		System.out.println(emp.getName());
		emp.setName("Amar");
		System.out.println(emp.getName());
		
		
		
		
		
		
		
		
		
	}

}
