package BddCRUD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

public class Post {
public static void main(String[] args) {
	baseURI="http://localhost";
	port=8084;
	
	
	JSONObject jObj = new JSONObject();
	jObj.put("createdBy", "obaid");
	jObj.put("projectName", "e");
	jObj.put("status", "tesrrosirt");
	jObj.put("teamSize", 1);
	
	Response req = given()
	.body(jObj)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject");
	
	
	String name = req.jsonPath().get("createdBy");
	Assert.assertEquals("obaid", name);
	req.then().log().all();

//	req.then().assertThat().statusCode(201).log().all();
//	req.then().assertThat().contentType("application/json").log().all();
	
}
}
