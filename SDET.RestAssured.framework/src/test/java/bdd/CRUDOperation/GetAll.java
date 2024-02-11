package bdd.CRUDOperation;

import static io.restassured.RestAssured.*;

import org.junit.Test;
public class GetAll {
	@Test
	public void getall() {
		baseURI="http://localhost";
		port=8084;
		when()
		.get("projects")
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}

}
