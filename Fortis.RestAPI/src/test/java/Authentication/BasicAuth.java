package Authentication;

import groovy.grape.GrapeIvy;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class BasicAuth {
public static void main(String[] args) {
//	baseURI="http://localhost";
//	port=8084;
//	
//	given()
//	.auth()
//	.basic("rmgyantra", "rmgy@9999")
//	.when()
//	.get("/login")
//	.then().log().all();
	
	//Same both bDD and without BDD
	
	RequestSpecification req = RestAssured.given();
	req.auth().basic("rmgyantra", "rmgy@9999");
	Response res = req.get("http://localhost:8084/login");
	System.out.println(res.asPrettyString());

	
	
	
}
}
