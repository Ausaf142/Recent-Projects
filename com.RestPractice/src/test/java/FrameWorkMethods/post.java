package FrameWorkMethods;


import java.sql.SQLException;

import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import com.RestPractice.GenericLibaray.BaseAPI;
import com.RestPractice.GenericLibaray.EndPoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class post extends BaseAPI {
	
	@Test
	public void post() throws SQLException {


	JSONObject obj=new JSONObject();
	obj.put("createdBy", "CR7");
	obj.put("projectName", "FiFA"+jlib.random());
	obj.put("status", "on going");
	obj.put("teamSize", 1);
	
	Response resp = given()
	.body(obj)
	.contentType(ContentType.JSON)
	.when()
	.post(EndPoints.createProject);
	 resp.then().log().all();
	
	String expData = rlib.getJsonData(resp,"projectId");
	System.out.println(expData);
	String query = "select * from project;";
	System.out.println(query);
	String actData = dlib.executeQueryReturnData(query, 1, expData);
		
	
}
}