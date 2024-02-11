package DiffrentWaysToPost;
import static io.restassured.RestAssured.*;

import java.util.Random;

import org.junit.Test;

import POJO_Libraries.ProjectLibrary;
import io.restassured.http.ContentType;
public class PostUsingPOJO {
	@Test
	public void postPOJO() {
		baseURI="http://localhost";
		port=8084;
		Random random=new Random();
		int ran = random.nextInt(500);
		ProjectLibrary plib=new ProjectLibrary("Raja", "Dolbics"+ran+"", "selected", 11);
		given()
		.body(plib)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.log().all();
		
		
	}
	

}
