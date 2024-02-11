package RequestChaining;
import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.annotations.Test;

import POJO_Libraries.JavaLibrary;
import POJO_Libraries.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateProjectAndDelete {
	@Test
	public void createAndDelete() {
		//Step1-pre requisite
				baseURI="http://localhost";
				port=8084;
				
				Random ran=new Random();
				int key = ran.nextInt(100);
				ProjectLibrary plib=new ProjectLibrary("God", "Heaven"+key, "Loading", 2);
			
				//step2-send the post req
				Response resp = given()
				.body(plib)
				.contentType(ContentType.JSON)
				.when()
				.post("/addProject");
				
				
				String ProjectId = resp.jsonPath().get("projectId");
				System.out.println(ProjectId);
				resp.then().log().all();
				
//Other way Direct with hard code end point				
//	when()
//	.delete("/projects/"+ProjectId)
//	.then()
//	.assertThat().statusCode(204).log().all();

				//path parameter end point avoiding of hardcoding
				given()
				.pathParam("pid", ProjectId)
				.when()
				.delete("/projects/{pid}")
				.then()
				.assertThat().statusCode(204).log().all();
				
				
		
		
		
		
		
	}

}
