package MyPractice;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class BDDGetAll {
	@Test
	public void getAll() {
		baseURI="http://localhost";
		port=8084;
		when()
		.get("/projects")
		.then()
		.log().all();
	
	
	}

}
