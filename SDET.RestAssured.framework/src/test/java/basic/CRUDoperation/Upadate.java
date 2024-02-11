package basic.CRUDoperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Upadate {
@Test
public void update() {
	JSONObject obj = new JSONObject();
	obj.put("createdBy", "Sidd");
	obj.put("projectName", "Ahmad");
	obj.put("status", "completed");
	obj.put("teamSize",12);
	
	RequestSpecification req = RestAssured.given();
	req.body(obj);
	req.contentType(ContentType.JSON);
	Response resp = req.put("http://localhost:8084/projects/TY_PROJ_2202");
	 System.out.println(resp.prettyPrint());
	
	
	
	
	
}
}
