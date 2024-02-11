package WaysOfPost;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST {
	public static void main(String[] args) {
		
  HashMap map =new HashMap();
   map.put("createdBy", "Ravi");
   map.put("projectName", "ceo1");
   map.put("status", "active");
   map.put("teamSize", 1);

   RequestSpecification req = RestAssured.given();
   req.body(map);
   req.contentType(ContentType.JSON);
   
   Response resp = req.post("http://localhost:8084/addProject");
   
   resp.then().log().all();
   System.out.println("add");
   
   
   
   
   
   
   
   
}
}