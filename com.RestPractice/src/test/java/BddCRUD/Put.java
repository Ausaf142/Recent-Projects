package BddCRUD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import javax.sound.sampled.Port;



public class Put {
	//TY_PROJ_002
	@Test
	public void put(){
		baseURI="http://localhost";
		port = 8084;
	

		JSONObject obj=new JSONObject();
		obj.put("createdBy", "HoneySmoke");
		obj.put("projectName", "gold");
		obj.put("status", "Taking");
		obj.put("teamSize", 1);
		
		given().body(obj).contentType(ContentType.JSON).when().put("/projects/TY_PROJ_202").
		then().assertThat().contentType(ContentType.JSON).log().all();
		
		
		 
	}
	
	
	

}
