package MyPractice;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Practice_POJO_SerDes.MineLibrary;

public class Serialization {
	@Test
	public void serial() throws JsonGenerationException, JsonMappingException, IOException {
		MineLibrary mlib=new MineLibrary("Obaid","Ibrahim","Nadeema","khursed","juned",786);
		ObjectMapper omp=new ObjectMapper();
		omp.writeValue(new File("./Obaid.json"), mlib);
		
	}

}
