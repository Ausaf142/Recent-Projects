package ReqChaining;

import static io.restassured.RestAssured.*;

import GenericLibrary.JavaLibrary;
import POJOLibrary.Emp_Library_React;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostANDGet {
public static void main(String[] args) {
	baseURI="http://localhost";
	port=8084;
	
	JavaLibrary jlib = new JavaLibrary();
	
	int key =jlib.RandomNum();
	
	Emp_Library_React elib=new Emp_Library_React("vinod","gandu"+key+"","bc",1);
	
	Response req = given()
	.body(elib)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject");
	
	String id = req.jsonPath().get("projectId");
	
	req.then().log().all();

	
	given()
	.pathParam("Pid", id)
	.when()
	 .get("/projects/{Pid}")
	.then()
	 .log().all();
	
	given()
	.pathParam("Pid", id)
	.when()
	 .delete("/projects/{Pid}")
	 .then().log().all();
	
	
	

	
	
	
}
}
