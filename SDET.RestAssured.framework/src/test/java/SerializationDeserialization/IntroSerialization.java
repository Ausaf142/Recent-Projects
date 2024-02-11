package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Practice_POJO_SerDes.Introduction;

public class IntroSerialization {
@Test
public void serial() throws JsonGenerationException, JsonMappingException, IOException {
//Step-1:constructor call of class
	Introduction intro=new Introduction("Ausaf","Ahmad",91235,"Bihar");
	
//Step-2:create obj of ObjectMapper class
	ObjectMapper obj=new ObjectMapper();
	
//step-3:With obj refrance we can write or read
	 obj.writeValue(new File(".\\Adeeb.json"), intro);
	
	
	
	
}
}
