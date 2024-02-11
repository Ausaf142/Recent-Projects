package bdd.CRUDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BddCreateMe {
	@Test
	public void bddcreat() {
		baseURI="http://localhost";
		port=8084;
		
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "khan");
		obj.put("projectName", "hathua");
		obj.put("status", "living");
		obj.put("teamSize",12);
		
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
	}
	

}
