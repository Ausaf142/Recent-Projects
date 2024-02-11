package Parameter;
import static  io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class FormPara {
	
public static void main(String[] args) {

//baseURI="https://reqres.in/";

	given()
	  .formParam("createdBy", "Chaitra")
	  .formParam("projectName", "tyss")
	  .formParam("status", "Completed")
	  .formParam("teamSize", 12)
	  .contentType(ContentType.JSON)
	
	//Step 2: send the request and validate response
	.when()
	  .post("http://localhost:8084/addProject")
	.then().log().all();
}
}
