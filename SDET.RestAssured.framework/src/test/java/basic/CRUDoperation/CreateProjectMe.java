package basic.CRUDoperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectMe {
	@Test
	public void createproject() {
		//creation of json object and call create from collection
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Ansari");
		jobj.put("projectName", "Siwan");
		jobj.put("status", "homeTown");
		jobj.put("teamSize", 50);
		
		//call restassured
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		Response resp = req.post("http://localhost:8084/addProject");
		System.out.println(resp.asPrettyString());
	
		System.out.println(resp.prettyPeek());
		
	}
	

}
