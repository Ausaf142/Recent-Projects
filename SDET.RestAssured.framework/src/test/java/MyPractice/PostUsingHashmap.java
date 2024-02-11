package MyPractice;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostUsingHashmap {
	@Test
	public void posthashmap() {
		baseURI="http://localhost";
		port=8084;
		HashMap map=new HashMap();
		map.put("createdBy", "Anwar");
		map.put("projectName", "Jamia");
		map.put("status", "on going");
		map.put("teamSize",01);
		given()
		.body(map)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201).log().all();
		
		
	
	}

}
