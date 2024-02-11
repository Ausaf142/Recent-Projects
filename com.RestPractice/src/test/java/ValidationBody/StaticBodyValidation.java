package ValidationBody;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class StaticBodyValidation {
	@Test
	public void bodyValidation() {
	
	baseURI="http://localhost";
	port=8084;
	String expData = "TY_PROJ_002";
	Response resp = when()
		.get("/projects");
	
	String actData = resp.jsonPath().get("[0].projectId");
	System.out.println(actData);
	Assert.assertEquals(expData, actData);
	System.out.println("data verfied ");
//		if(expData.equalsIgnoreCase(actData)) {
//			System.out.println("pass");
//		}
//		else {
//			System.out.println("fail");
//		}
//		resp.then().log().all();

}

}
