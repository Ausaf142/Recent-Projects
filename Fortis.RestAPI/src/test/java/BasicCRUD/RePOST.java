package BasicCRUD;

import java.util.HashMap;

import org.testng.asserts.Assertion;

import GenericLibrary.JavaLibrary;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class RePOST {
	public static void main(String[] args) {
		JavaLibrary jlib =new JavaLibrary();
		int key = jlib.RandomNum();
  HashMap map =new HashMap();
   map.put("createdBy", "riya");
   map.put("projectName", "ceo"+key+"");
   map.put("status", "active");
   map.put("teamSize", 1);

   RequestSpecification req = RestAssured.given();
   req.body(map);
   req.contentType(ContentType.JSON);
   
   Response resp = req.post("http://localhost:8084/addProject");
//   int actualStatus = resp.statusCode();
   String actualName = resp.jsonPath().get("createdBy");
   
   
   System.out.println(actualName);
   Assert.assertEquals("riya", actualName);
   System.out.println("pass validation");
   
   resp.then().log().all();
   
   
   
  
   
   
   
   
}
}