package BasicCRUD;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getAll {
public static void main(String[] args) {
	String exp="TY_PROJ_603";
	Response req = RestAssured.get("http://localhost:8084/projects");
	String pid = req.jsonPath().get("[1].projectId");
	Assert.assertEquals(pid, exp);
	req.then().log().all();
}
}
