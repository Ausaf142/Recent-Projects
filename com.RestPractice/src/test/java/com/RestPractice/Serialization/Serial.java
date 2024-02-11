package com.RestPractice.Serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOLibrary.Library;

public class Serial {
	@Test
	public void Serialization() throws JsonGenerationException, JsonMappingException, IOException {
		Library lib=new Library("Ausaf","Nalla");
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./Data.json"), lib);
		
	}
	
	
	
	

}
