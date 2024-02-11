package Parameters;


	import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

	public class FormParameter {//swagger have bug it should support but not supporting formparameter
	@Test
	public void form() {
		baseURI="http://localhost";
		port=8084;
		given()
		.formParam("createdBy", "Avenger")
		.formParam("projectName", "Thor")
		.formParam("status", "Avenger5")
		.formParam("teamSize", 10)
		
		.when().post("/addProject")
		
		.then().log().all();
}
}