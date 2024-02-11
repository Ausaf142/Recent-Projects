package RequestChaining;
import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.annotations.Test;

import POJO_Libraries.JavaLibrary;
import POJO_Libraries.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateUpdatGetDelete {
	@Test
	public void cugetdel() {
		baseURI="http://localhost";
		port=8084;
		
		JavaLibrary jlib=new JavaLibrary();
		int key = jlib.getRandomNumber();
		ProjectLibrary plib=new ProjectLibrary("Job", "Dream"+key, "Loading", 1);
		 
		 Response resp = given()
		.body(plib)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject");
		 
		String  ProjId=resp.jsonPath().get("projectId");
		System.out.println(ProjId);
		
		
		
		ProjectLibrary plib2=new ProjectLibrary("Job", "OMG", "Loading", 1);
		given().pathParam("PID", ProjId)
		.body(plib2)
		.contentType(ContentType.JSON)
		.when()
		.put("/projects/{PID}");
		
		given()
		.pathParam("pid", ProjId)
		.when().get("/projects/{pid}").then().log().all();
		
		given()
		.pathParam("pid", ProjId)
		.when()
		.delete("/projects/{pid}")
		.then()
		.assertThat().statusCode(204).log().all();
		
		
		
		
		
	}
	
	

}
