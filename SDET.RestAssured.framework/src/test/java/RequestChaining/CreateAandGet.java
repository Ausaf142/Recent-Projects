package RequestChaining;


import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.annotations.Test;

import POJO_Libraries.JavaLibrary;
import POJO_Libraries.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateAandGet {
	@Test
	public void get() {
		//Step1-pre requisite
		baseURI="http://localhost";
		port=8084;
		
		Random ran=new Random();
		int key = ran.nextInt(100);
		ProjectLibrary plib=new ProjectLibrary("shraddha", "ABCD2"+key, "Completed", 2);
	//step2-send the post req
		Response resp = given()
		.body(plib)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject");
		//step3-capture the project(two way directly by endpoint or path parameter)
		
		String ProjectId = resp.jsonPath().get("projectId");
		System.out.println(ProjectId);
		
		//step4-Send the req with proj id(2 ways)
		
		//by directly parameter(end point)
//				when()       					
//				.get("/projects/"+ProjectId)
//				.then()
//				.assertThat().statusCode(200).log().all();
		
		//by path parameter - a type of parameter
		given()
		.pathParam("Pid", ProjectId)
		.when()
		.get("/projects/{Pid}")
		.then().assertThat().statusCode(200).log().all();
		
		
	
	
	}

}
