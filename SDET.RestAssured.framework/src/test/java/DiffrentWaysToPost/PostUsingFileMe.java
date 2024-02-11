package DiffrentWaysToPost;
import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostUsingFileMe {
	@Test
	public void postFile() {
		baseURI="http://localhost";
		port=8084;
		File file=new File(".\\Me");
		given()
		.body(file)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.log().all();
		
		
		
		
		
		
		
	}

}
