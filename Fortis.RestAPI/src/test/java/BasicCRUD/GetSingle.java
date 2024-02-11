package BasicCRUD;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSingle {
public static void main(String[] args) {
	
	Response req = RestAssured.get("http://localhost:8084/projects/TY_PROJ_602");
	req.then().log().all();
}
}
