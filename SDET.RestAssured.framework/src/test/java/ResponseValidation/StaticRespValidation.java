package ResponseValidation;



import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class StaticRespValidation {
@Test
public void validation() {
	baseURI="http://localhost";
	port=8084;
	String expData = "TY_PROJ_603";
	Response resp = when()
		.get("/projects");
	
	String actData = resp.jsonPath().get("[1].projectId");
	System.out.println(actData);
//	Assert.assertEquals(actData, expData);
//	System.out.println("data verfied ");
		if(expData.equalsIgnoreCase(actData)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		//resp.then().log().all();
}
}
