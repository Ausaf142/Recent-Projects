package MyPractice;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class BDDcreate {
	@Test
	public void create() {
		baseURI="http://localhost";
		port=8084;
		HashMap map=new HashMap();
		map.put("createdBy", "Sobha");
		map.put("projectName", "ObaidkiPari");
		map.put("status", "breakUp");
		map.put("teamSize",02);
		
		given()
		.body(map)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.log().all();
	}

}
