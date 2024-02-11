package MyPractice;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BDDDelete {
@Test
public void delete() {
	
	baseURI="http://localhost";
	port=8084;
	when()
	.delete("/projects/TY_PROJ_806")
	.then()
	.log().all();
	
	
}
}
