package Parameter;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

public class QueryPara {
public static void main(String[] args) {
	baseURI="https://reqres.in/";
	
	
	given()
	.queryParam("page", 2)
	.when()
	.get("api/users")
	.then().log().all();
}
}
