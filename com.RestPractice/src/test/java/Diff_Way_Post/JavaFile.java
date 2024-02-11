package Diff_Way_Post;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

public class JavaFile {
@Test
public void javaFile() {
	baseURI= "http://localhost";
	port =8084;
	
	File f = new File("./Data.json");
	given().body(f).contentType(ContentType.JSON) .when().post("/addProject").then().log().all();
}
}
