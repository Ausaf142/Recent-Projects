package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Practice_POJO_SerDes.Introduction;

public class IntroDeserilaization {
	@Test
	public void deserialization() throws JsonParseException, JsonMappingException, IOException {
//Step1:create obj of objectMapper
		ObjectMapper obj=new ObjectMapper();
		
//Step2:with obj refrance read the value of existed json file and store in refrance
		 Introduction data = obj.readValue(new File(".\\Adeeb.json"),Introduction.class);
		 
 //Step3:on the base of that refrance call element which u want to print
		 System.out.println(data.getFname());
		 System.out.println(data.getLname());
		 
//step4:we can overwrite the data here 
		data.setFname("khan");
		 System.out.println(data.getFname());
		
	}

}
