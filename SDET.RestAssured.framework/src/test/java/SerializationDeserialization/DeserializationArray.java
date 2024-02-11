package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Practice_POJO_SerDes.EmpDetailsArray;



public class DeserializationArray {
@Test
		public void Deserial() throws JsonParseException, JsonMappingException, IOException {
	ObjectMapper obj=new ObjectMapper();
	EmpDetailsArray e1 = obj.readValue(new File(".\\SampleArray.json"), EmpDetailsArray.class);
	System.out.println(e1.getName());
			
		}

	}


