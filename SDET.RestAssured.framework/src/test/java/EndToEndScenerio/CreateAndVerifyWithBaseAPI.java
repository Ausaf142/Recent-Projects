package EndToEndScenerio;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericLibraries.BaseAPIclass;
import GenericLibraries.EndPointLibrary;
import GenericLibraries.JavaLibrary;
import POJO_Libraries.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

public class CreateAndVerifyWithBaseAPI extends BaseAPIclass  {
	@Test
	public void createProject() throws SQLException {
		//Create Pre Requisite
		ProjectLibrary plib=new ProjectLibrary("APIframework", "API"+jlib.getRandom(), "created", 1);
		
//send the request
		Response resp = given()
		.body(plib)
		.contentType(ContentType.JSON)
		.when()
		.post(EndPointLibrary.createProject);
		
		resp.then().log().all();
		
	//capture the projectId
		String expData = rlib.getJsonData(resp, "projectId");
		System.out.println(expData);
		//validation
		String query = "select * from project;";
		String actData = dlib.executeQueryandReturnData(query, 1, expData);
		Assert.assertEquals(actData,expData);
		
	
	}

}
