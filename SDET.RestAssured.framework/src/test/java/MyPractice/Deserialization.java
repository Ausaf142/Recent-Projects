package MyPractice;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Practice_POJO_SerDes.MineLibrary;

public class Deserialization {
	@Test
	public void deserial() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper omp = new ObjectMapper();
		MineLibrary data = omp.readValue(new File("./Obaid.json"), MineLibrary.class);
		System.out.println(data.getName());
		System.out.println(data.getFatherName());
		System.out.println(data.getMotherName());
	}

}
