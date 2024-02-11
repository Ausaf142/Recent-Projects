package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Practice_POJO_SerDes.ProjectDetails;

public class ProjectSerialization {

	@Test
	public void ProjSerial() throws Throwable, JsonMappingException, IOException {
		ProjectDetails plib=new ProjectDetails("Amar",39,450);
		ObjectMapper omp= new ObjectMapper();
		omp.writeValue(new File("./Project.json"), plib);
		
		
		
		
	}
	
	
	
}
