package MyPractice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class basic_Update {
@Test
public void update() {
	JSONObject obj=new JSONObject();
	obj.put("createdBy", "Tarikh");
	obj.put("projectName", "Father");
	obj.put("status", "pending");
	obj.put("teamSize", 2);
	  RequestSpecification req = RestAssured.given();
	  req.body(obj);
	  req.contentType(ContentType.JSON);
	  Response resp = req.put("http://localhost:8084/projects/TY_PROJ_3205");
	  System.out.println(resp.prettyPrint());
	
	
}
}
