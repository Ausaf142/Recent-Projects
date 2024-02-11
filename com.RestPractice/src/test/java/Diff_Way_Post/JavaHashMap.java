package Diff_Way_Post;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

import java.util.HashMap;

public class JavaHashMap {
@Test
public void javahashMap() {
	baseURI="http://localhost";
	port = 8084;

	
	HashMap hmap = new HashMap();
	hmap.put("createdBy", "jda");
	hmap.put("projectName", "fortuner");
	hmap.put("status", "Taking ");
	hmap.put("teamSize", 1);
	
	given().body(hmap).contentType(ContentType.JSON).when().post("/addProject").
	then().log().all();
	
}
}
