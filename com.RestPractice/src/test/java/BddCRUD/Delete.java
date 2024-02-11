package BddCRUD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Delete {
	@Test
public void delete() {
	baseURI= "http://localhost";
	port = 8084;
	
	when().delete("/projects/TY_PROJ_217").then().assertThat().statusCode(204).log().all();
}
}
