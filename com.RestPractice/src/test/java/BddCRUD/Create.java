package BddCRUD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Create {
	@Test
	public void create(){
		
		baseURI="http://localhost";
		port=8084;
		
		
		JSONObject obj=new JSONObject();
		obj.put("createdBy", "CR7");
		obj.put("projectName", "FIFA");
		obj.put("status", "on going");
		obj.put("teamSize", 1);
		
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.log().all();
		
		
		
		
	}

}
