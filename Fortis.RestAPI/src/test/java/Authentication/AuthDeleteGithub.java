package Authentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class AuthDeleteGithub {

		public static void main(String[] args) {
			baseURI="https://api.github.com";
			
			given()
			.auth()
			.oauth2("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")
			.when()
			.delete("repos/Ausaf142/loda")
			.then().log().all();
		
		}
}
