package WaysOfPost;
import static  io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.http.ContentType;




public class PostByFile {
public static void main(String[] args) {
	baseURI="http://localhost";
	port = 8084;
    File f =new File("./Priyaa.json");
    
    given()
    .body(f)
    .contentType(ContentType.JSON)
    .when()
    .post("/addProject")
    .then().log().all();
	
	
}
}
