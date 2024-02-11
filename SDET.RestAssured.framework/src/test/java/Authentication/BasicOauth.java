package Authentication;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class BasicOauth {
	@Test
//	public void Auth() {
//		baseURI="http://localhost";
//		port=8084;
//		
//		given()
//		.auth()
//		.basic("rmgyantra", "rmgy@9999")
//		.when()
//		.get("/login")
//		.then()
//		.log().all();
//	}
	
	
//	public void digestive() {
//		baseURI="http://localhost";
//		port=8084;
//		
//		given()
//		.auth()
//		.digest("rmgyantra", "rmgy@9999")
//		.when()
//		.get("/login")
//		.then().log().all();
//		
//	}
	public void preemptiveAuth() {
		baseURI="http://localhost";
		port=8084;
		
		given()
		.auth()
		.preemptive()
		.basic("rmgyantra", "rmgy@9999")
		.when()
		.get("/login")
		.then()
		.log().all();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
