package MyPractice;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.*;
import java.util.HashMap;

import org.junit.Test;

import io.restassured.http.ContentType;

public class BDDUpdate {
	@Test
	public void postHashmap() {
		baseURI="http://localhost";
		port=8084;
	HashMap map=new HashMap();
	map.put("createdBy", "Tarikh");
	map.put("projectName", "SAP");
	map.put("status", "on going");
	map.put("teamSize",01);
		
	given()
	.body(map)
	.contentType(ContentType.JSON)
	.when()
	.put("/projects/TY_PROJ_3207")
	.then()
	.log().all();
	
	
	
	
	
}
}