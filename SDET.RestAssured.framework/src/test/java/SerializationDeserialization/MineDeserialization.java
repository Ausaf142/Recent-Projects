package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Practice_POJO_SerDes.MineLibrary;

public class MineDeserialization {
@Test
public void deserial() throws JsonParseException, JsonMappingException, IOException {
	ObjectMapper obj=new ObjectMapper();
	MineLibrary data = obj.readValue(new File(".\\Mine.json"), MineLibrary.class);
	System.out.println(data.getMotherName());
}
}
