package DiffrentWaysToPost;

import java.util.HashMap;

import org.junit.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostUsingHashmap {
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
	.post("/addProject")
	.then()
	.assertThat().statusCode(201)
	.log().all();
	
}

}
