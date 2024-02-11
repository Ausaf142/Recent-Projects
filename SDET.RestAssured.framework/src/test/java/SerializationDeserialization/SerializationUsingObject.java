package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Practice_POJO_SerDes.EmpDetailsObject;
import POJO_Libraries.JavaLibrary;
import POJO_Libraries.ProjectLibrary;
import POJO_Libraries.Spouse;

public class SerializationUsingObject {
@Test
		public void serializationObject() throws JsonGenerationException, JsonMappingException, IOException {

			int[] arr = {1234,12345};
			Spouse spouse = new Spouse("Afiya", "TestYantra", 123);

			EmpDetailsObject e3 = new EmpDetailsObject(3, "Ausaf", arr, spouse, "Bihar");

			ObjectMapper obj = new ObjectMapper();
			obj.writeValue(new File(".\\SampleObject.json"), e3);
		}

	}

