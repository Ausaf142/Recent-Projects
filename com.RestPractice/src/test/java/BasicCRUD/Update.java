package BasicCRUD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Update {
	@Test
	public void put() {
		JSONObject obj=new JSONObject();
		obj.put("createdBy", "A");
		obj.put("projectName", "sss");
		obj.put("status", "on going");
		obj.put("teamSize", 1);
		 RequestSpecification req = RestAssured.given();
		 req.body(obj);
		 req.contentType(ContentType.JSON);
		 Response resp = req.put("http://localhost:8084/projects/TY_PROJ_802");
		System.out.println(resp.asPrettyString());
		
		
	}

}
