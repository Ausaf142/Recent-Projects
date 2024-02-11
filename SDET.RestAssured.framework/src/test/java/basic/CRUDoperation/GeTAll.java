package basic.CRUDoperation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GeTAll {
	@Test
	public void get() {
	Response resp = RestAssured.get("http://localhost:8084/projects");
	
	int expstatus = 200;
	int actstatus = resp.getStatusCode();
	Assert.assertEquals(expstatus, actstatus);
	System.out.println(resp.prettyPrint());
	
	
	}

}
