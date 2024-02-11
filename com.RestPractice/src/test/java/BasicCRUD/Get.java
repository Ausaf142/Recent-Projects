package BasicCRUD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get {
	@Test
	public void get() {
	Response resp = RestAssured.get("http://localhost:8084/projects/TY_PROJ_403");
		
		System.out.println(resp.asString());
		
	
	}

}
