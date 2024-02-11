package Parameter;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class Path {
	@Test
	public void path() {
		baseURI="http://localhost";
		port=8084;
		
	given()
	.pathParam("ID", "TY_PROJ_002")
	.when()
	.get("/projects/{ID}")
	.then()
	.assertThat().statusCode(200)
	.log().all();
		
		
	}
	

}
