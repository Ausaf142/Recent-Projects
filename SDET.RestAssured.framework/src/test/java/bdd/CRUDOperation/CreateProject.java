package bdd.CRUDOperation;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class CreateProject {
@Test
public void create() {
	baseURI="http://localhost";
	port=8084;
	JSONObject obj=new JSONObject();
	obj.put("createdBy", "Ami");
	obj.put("projectName", "IPL2022");
	obj.put("status", "on going");
	obj.put("teamSize",11);
	
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
