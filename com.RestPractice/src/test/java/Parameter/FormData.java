package Parameter;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class FormData {//it is also not supporting to swager
	@Test
	public void form() {
		baseURI="https://reqres.in";
		
		given()
		.formParam("name", "amar1")
		.formParam("job", "ausaf")
		.contentType(ContentType.JSON)
		.when()
		.post("/api/users").then().log().all();
		
	}
	

}
