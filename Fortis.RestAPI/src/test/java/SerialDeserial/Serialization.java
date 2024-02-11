package SerialDeserial;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;

import POJOLibrary.Emp_Library_React;

public class Serialization {
public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
	Emp_Library_React emp = new Emp_Library_React("kareena","tolly","hit",4);

	
	
	ObjectMapper obj=new ObjectMapper();
	File src =new File("./lodu.json");
	obj.writeValue(src, emp);
}
}
