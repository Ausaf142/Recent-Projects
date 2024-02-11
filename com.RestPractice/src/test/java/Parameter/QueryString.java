package Parameter;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class QueryString {
	@Test
	public void path() {
		baseURI="https://reqres.in";
	//	port=8084;
		
	given().queryParam("Page", 3)
	.when().get("/api/users").then().assertThat().statusCode(200).log().all();
}
}