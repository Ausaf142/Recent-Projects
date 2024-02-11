
package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Practice_POJO_SerDes.EmpDetailsObject;


	public class DeserializationObj {
@Test
		public void deserial() throws JsonParseException, JsonMappingException, IOException {

			ObjectMapper obj = new ObjectMapper();

			EmpDetailsObject e1 = obj.readValue(new File(".\\SampleObject.json"), EmpDetailsObject.class);

			System.out.println(e1.getName());
			System.out.println(e1.getPhno());
		}

	}

