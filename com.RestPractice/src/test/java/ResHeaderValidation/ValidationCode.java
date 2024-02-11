package ResHeaderValidation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.RestPractice.GenericLibaray.JavaLibrary;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class ValidationCode {
	JavaLibrary jlib=new JavaLibrary();
	@Test
	public void code() {
		//VALIDATION OF STATUS CODE AND CONTENT TYPE
		int key = jlib.random();
		baseURI="http://localhost";
		port=8084;
		JSONObject obj=new JSONObject();
		obj.put("createdBy", "MARCH");
		obj.put("projectName", "Year"+key);
		obj.put("status", "going");
		obj.put("teamSize", 12);
		
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201)// FOR STATUS CODE 
		.assertThat().contentType("application/json").log().all();//CONTENT TYPE
		System.out.println("validated");
		
		
	}
	
	

}
