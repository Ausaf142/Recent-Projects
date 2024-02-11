package bdd.CRUDOperation;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.http.ContentType;

public class UpdateBDD {
	@Test
	public void update() {
		baseURI="http://localhost";
		port= 8084;
		JSONObject obj=new JSONObject();
		obj.put("createdBy", "lion");
		obj.put("projectName", "IPL");
		obj.put("status", "Won from CSK");
		obj.put("teamSize",11);
		
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.put("/projects/TY_PROJ_2405")
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
	}

}
