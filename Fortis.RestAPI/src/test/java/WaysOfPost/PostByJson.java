package WaysOfPost;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostByJson {
	public static void main(String[] args) {
		JSONObject jObj = new JSONObject();
		jObj.put("createdBy", "umat");
		jObj.put("projectName", "pakistan");
		jObj.put("status", "tesrrosirt");
		jObj.put("teamSize", 1);
			

		//initialize
		RequestSpecification req = RestAssured.given();
		req.body(jObj);
		req.contentType(ContentType.JSON);
		 
		//declare
		Response res = req.post("http://localhost:8084/addProject");
		
//		PRint
		System.out.println(res.prettyPrint());
//		res.then().log().all();
		
		
		
		}
}
