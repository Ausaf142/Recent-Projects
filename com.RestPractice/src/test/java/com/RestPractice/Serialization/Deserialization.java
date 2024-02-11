package com.RestPractice.Serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOLibrary.Library;

public class Deserialization {
	@Test
public void deserial() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper obj=new ObjectMapper();
		Library detail = obj.readValue(new File("./Data.json"),Library.class );
		System.out.println(detail.getName());
		System.out.println(detail.getJob());
	
}
}
