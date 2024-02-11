package BddCRUD;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class Put {
public static void main(String[] args) {
	baseURI="http://localhost";
	port=8084;
	
	JSONObject obj=new JSONObject();
	obj.put("createdBy", "obaid");
	obj.put("projectName", "FIFA");
	obj.put("status", "shaheenbagh");
	obj.put("teamSize", 1);
	
	
	given()
	.body(obj)
	.contentType(ContentType.JSON)
	.when()
	.put("/projects/TY_PROJ_606")
	.then().log().all();
}
}
