package BasicCRUD;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put {
	public static void main(String[] args) {
		
	String base = "http://localhost:8084";
	 HashMap map =new HashMap();
	   map.put("createdBy", "dr");
	   map.put("projectName", "medical");
	   map.put("status", "active");
	   map.put("teamSize", 1);

	   RequestSpecification req = RestAssured.given();
	   req.body(map);
	   req.contentType(ContentType.JSON);
	   
	   Response resp = req.put("http://localhost:8084/projects/TY_PROJ_605");
	   
	   resp.then().log().all();
	   
}
}