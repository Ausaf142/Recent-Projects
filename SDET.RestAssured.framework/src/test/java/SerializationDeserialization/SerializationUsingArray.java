
package SerializationDeserialization;
import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Practice_POJO_SerDes.EmpDetailsArray;

public class SerializationUsingArray {
@Test
	public void serial() throws JsonGenerationException, JsonMappingException, IOException{

		int[] arr = {123,12345};
		EmpDetailsArray e2 = new EmpDetailsArray(01, "Ausaf", arr, "Bihar");

		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File(".\\SampleArray.json"), e2);
	}


}