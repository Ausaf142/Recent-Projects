package Authentication;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BearerAuth {
public static void main(String[] args) {
	baseURI="https://api.github.com";
	
	JSONObject jobj=new JSONObject();
	jobj.put("name", "NoidaRest");
	 
	
	
	given()
	.auth()
	.oauth2("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")
	.body(jobj)
	.contentType(ContentType.JSON)
	.when()
	.post("user/repos")
	.then().log().all();
}
}
//import org.json.simple.JSONObject;
//import org.testng.annotations.Test;
//
//import io.restassured.http.ContentType;
//
//import static io.restassured.RestAssured.*;
//public class BearerAuth {
//@Test
//public void bearerToken() {
//	
//	JSONObject jobj=new JSONObject();
//	jobj.put("name", "loda");
//	jobj.put("description", "Hybrid");
//	
//	
//	
//	RequestSpecification req = RestAssured.given();
//	req
//	.auth().oauth2("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");
//	 req.body(jobj);
//	 req.contentType(ContentType.JSON);
//	
//	Response res=req.post("https://api.github.com/user/repos");
//	System.out.println(res.asPrettyString());
//		
//		
//	
//}
//}