package MyPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BasicGet {
	@Test
	public void get() {
		Response req = RestAssured.get("http://localhost:8084/projects");
		int expStatus=200;
		int actStatus=req.getStatusCode();
		Assert.assertEquals(expStatus, actStatus);
		System.out.println(req.asPrettyString());
	}

}
