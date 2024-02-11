package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Practice_POJO_SerDes.ProjectDetails;

public class ProjectDeserialisation {
@Test	
	public void projDes() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper omp=new ObjectMapper();
		ProjectDetails data = omp.readValue(new File("./Project.json"), ProjectDetails.class);
		System.out.println(data.getId());
		
		
	}

}
