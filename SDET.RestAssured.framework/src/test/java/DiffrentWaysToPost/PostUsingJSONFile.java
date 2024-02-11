package DiffrentWaysToPost;
import static io.restassured.RestAssured.*;

import java.io.File;

import org.junit.Test;

import io.restassured.http.ContentType;
public class PostUsingJSONFile {
	@Test
	public void postFile() {
		baseURI="http://localhost";
		port=8084;
		File file = new File(".\\ObjectFile.json");
		given()
		.body(file)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.log().all();
	}

}
