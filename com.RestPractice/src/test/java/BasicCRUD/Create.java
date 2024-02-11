package BasicCRUD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Create {
@Test
	public void create() {
	//BODY CREATING
	
	JSONObject obj=new JSONObject();
	obj.put("createdBy", "Mercedes");
	obj.put("projectName", "Heart");
	obj.put("status", "on going");
	obj.put("teamSize", 2);
	
	//CALLING RESTASSURED
	RequestSpecification req = RestAssured.given();
			req.body(obj);
			req.contentType(ContentType.JSON);
			Response resp = req.post("http://localhost:8084/addProject");
			System.out.println(resp.asPrettyString());
			System.out.println(resp.asString());
	
	
	
	
		
	}
	
	
	
	
}
