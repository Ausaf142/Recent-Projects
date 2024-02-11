package ValidationBody;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.RestPractice.GenericLibaray.JavaLibrary;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Body_Validation {
	JavaLibrary jlib=new JavaLibrary();
	@Test
public void Dynamic_Response() {
		String expID = "TY_PROJ_810";
	int key = jlib.random();
	baseURI="http://localhost";
	port =8084;
	
	Response resp = when().get("/projects");
	
	List<String> ids= resp.jsonPath().get("projectId");
	boolean flag = false;
	for(String ID:ids) {
		if(ID.equalsIgnoreCase(expID)) {
		flag=true;
	}
	}
	resp.then().log().all();
	Assert.assertTrue(flag);
	
	System.out.println("pass");

}
}    