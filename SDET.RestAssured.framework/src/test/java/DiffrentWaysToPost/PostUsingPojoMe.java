package DiffrentWaysToPost;

import org.testng.annotations.Test;

import POJO_Libraries.ProjectLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostUsingPojoMe {
	@Test
	public void post() {
		baseURI="http://localhost";
		port=8084;
		ProjectLibrary mlib=new ProjectLibrary("adeeb","hafiz","chandpali",789);
		given()
		.body(mlib)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.log().all();
		
	}

}
