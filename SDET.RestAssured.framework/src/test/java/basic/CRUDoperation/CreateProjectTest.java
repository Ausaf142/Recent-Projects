package basic.CRUDoperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {
	//giving object and providing body (JSON obj bcz body is json type)
	@Test
	public void createProjectTest() {
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "Sidd");
		obj.put("projectName", "Ahmad");
		obj.put("status", "on going");
		obj.put("teamSize",12);
	
		//request of obj of json type 
		RequestSpecification req = RestAssured.given();
		req.body(obj);
		req.contentType(ContentType.JSON);
		Response resp = req.post("http://localhost:8084/addProject");
		//print of result
		
		System.out.println(resp.contentType());
		System.out.println(resp.prettyPeek());
		System.out.println(resp.prettyPrint());
		
		
		
		
		
	}

}
