package BddCRUD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class Get {
	@Test
	public void Fetch() {
		baseURI="http://localhost";
		port=8084;
		
		when()
		.get("/projects")
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
		
	}

}
