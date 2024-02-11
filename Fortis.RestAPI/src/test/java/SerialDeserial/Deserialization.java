package SerialDeserial;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;

import POJOLibrary.Emp_Library_React;


public class Deserialization {
	public static void main(String[] args) throws  IOException {

		
		ObjectMapper obj =new ObjectMapper();
		Emp_Library_React detail = obj.readValue(new File("./d.json"),Emp_Library_React.class );
	
//		System.out.println(detail.getClass());
		System.out.println(detail.getCreatedBy());
		System.out.println(detail.getProjectName());
	
}
}