package bdd.CRUDOperation;

import org.junit.Test;

import static io.restassured.RestAssured.*;



public class Delete {
	@Test
	public void delete() {
		
		baseURI="http://localhost";
		port=8084;
		when()
		.delete("/projects/TY_PROJ_2030")
		.then()
		.assertThat()
		.statusCode(200)
		.log().all();
		
	}

}
