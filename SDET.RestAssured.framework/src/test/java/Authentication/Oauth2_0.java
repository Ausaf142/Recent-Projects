package Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
public class Oauth2_0 {
@Test
public void oauth2() {
	//create object via formpara and post
	//but we will break it for catching process further
	baseURI="http://coop.apps.symfonycasts.com";
		Response resp = given()
			.formParam("client_id", "AusafSDET39")
			.formParam("client_secret", "60f7c37f6034057cf3769d81626aa24d")
			.formParam("grant_type", "client_credentials")
			.formParam("redirect_uri", "http://ausaf.com")
			.formParam("code","authorization_code" )
			.when()
			.post("/token");
	//catch
		 String token = resp.jsonPath().get("access_token");
		 System.out.println(token);
	//use it for other endpoint
		 given()
		 .pathParam("USER_ID", 3843)
		 .auth()
		 .oauth2(token)
		 .when()
		 .post("/api/{USER_ID}/chickens-feed")
		 .then()
		 .log().all();
	
}
}
