package MyPractice;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class PostUsingJson {
	@Test
	public void postJson() {
		baseURI="http://localhost";
		port=8084;
		File file=new File("./Adeeb.json");
		given()
		.body(file)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.log().all();
		
		

}
}
