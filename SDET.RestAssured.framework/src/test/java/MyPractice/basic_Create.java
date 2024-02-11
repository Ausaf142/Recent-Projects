package MyPractice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class basic_Create {
	@Test
	public void create() {
		JSONObject obj=new JSONObject();
		obj.put("createdBy", "Tarikh-Ansari");
		obj.put("projectName", "Fatherone");
		obj.put("status", "pending");
		obj.put("teamSize", 2);
		
		RequestSpecification req = RestAssured.given();
		req.body(obj);
		req.contentType(ContentType.JSON);
		
		Response resp = req.post("http://localhost:8084/addProject");
		System.out.println(resp.contentType());
		System.out.println(resp.asPrettyString());
		
	}

}
