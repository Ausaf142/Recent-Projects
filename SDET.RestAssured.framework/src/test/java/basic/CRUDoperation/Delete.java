package basic.CRUDoperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Delete {
	@Test
	public void delete() {
		 RestAssured.delete("http://localhost:8084/projects/TY_PROJ_810");
	Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_3203");	
	Response resp1 = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_811");
	
	System.out.println(resp.asString());
	System.out.println(resp.asPrettyString());
	System.out.println(resp1.asString());
	
	
	
	
	
	}

}
