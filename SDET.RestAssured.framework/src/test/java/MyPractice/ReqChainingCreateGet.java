package MyPractice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class ReqChainingCreateGet {
	@Test
	public void createGet() {
		baseURI="http://localhost";
		port=8084;
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Tarikh-Ansari");
		jobj.put("projectName", "Father7");
		jobj.put("status", "pending");
		jobj.put("teamSize", 2);
		
		Response req = given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject");
		String id = req.jsonPath().get("projectId");
		System.out.println(id);
	//by two ways
		//one by directly projectId
//		when().get("/projects/TY_PROJ_3215")
//		.then()
//		.assertThat().statusCode(200).log().all();
	//possible after creating and taking projid but to avoid this
		given()
		.pathParam("IDS", id)
		.when().get("/projects/{IDS}")
		.then()
		.assertThat().statusCode(200).log().all();
	
	
	}

}
