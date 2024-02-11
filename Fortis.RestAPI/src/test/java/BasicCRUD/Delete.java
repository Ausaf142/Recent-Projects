package BasicCRUD;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Delete {
public static void main(String[] args) {
	Response req = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_602");
	req.then().log().all();
}
}
