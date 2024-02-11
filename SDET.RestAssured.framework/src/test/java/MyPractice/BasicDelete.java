package MyPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BasicDelete {
@Test
public void delete() {
	Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_808");
		int expStatus=204;
		int actStatus = resp.getStatusCode();
		Assert.assertEquals(expStatus, actStatus);
		System.out.println(resp.asPrettyString());
	
	
}
}
