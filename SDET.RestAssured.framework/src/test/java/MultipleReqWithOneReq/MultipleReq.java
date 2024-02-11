package MultipleReqWithOneReq;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POJO_Libraries.JavaLibrary;
import POJO_Libraries.ProjectLibrary;

import static io.restassured.RestAssured.*;


import io.restassured.http.ContentType;

public class MultipleReq {
	public class CreateMultipleProjectWithDiffData {
		
		@Test(dataProvider = "getData")
		public void createProject(String createdBy, String projectName, String status, int teamSize)
		{
			
			//Prerequisties
			JavaLibrary jLib = new JavaLibrary();
			ProjectLibrary pLib = new ProjectLibrary(createdBy, projectName+jLib.getRandomNumber(), status, teamSize);
			baseURI = "http://localhost";
			port = 8084;
			
			
			given()
			 .body(pLib)
			 .contentType(ContentType.JSON)
		   
			//Actions
			.when()
			 .post("/addProject")
			 
			//Validation
			.then().log().all();
			
			
		}
		
		
		@DataProvider(name = "getData")
		public Object[][] data()
		{
			Object[][] data = new Object[10][4];
			
			data[0][0] = "Ausaf";
			data[0][1] = "Dell";
			data[0][2] = "Completed";
			data[0][3] = 12;
			
			data[1][0] = "Ahmad";
			data[1][1] = "HP";
			data[1][2] = "Created";
			data[1][3] = 15;
			
			data[2][0] = "Adeeb";
			data[2][1] = "Tesla";
			data[2][2] = "On Going";
			data[2][3] = 20;
			
			data[3][0] = "Hareem";
			data[3][1] = "TYSS";
			data[3][2] = "On Going";
			data[3][3] = 2;
			
			data[4][0] = "Mehwish";
			data[4][1] = "Audi";
			data[4][2] = "On Going";
			data[4][3] = 1;
			
			data[5][0] = "Afiya";
			data[5][1] = "Mercedes";
			data[5][2] = "On Going";
			data[5][3] = 4;
			
			data[6][0] = "Naaz";
			data[6][1] = "Samsung";
			data[6][2] = "On Going";
			data[6][3] = 20;
			
			data[7][0] = "Noman";
			data[7][1] = "Apple";
			data[7][2] = "On Going";
			data[7][3] = 20;
			
			data[8][0] = "Zeeshan";
			data[8][1] = "Hawai";
			data[8][2] = "On Going";
			data[8][3] = 20;
			
			data[9][0] = "Hafiz";
			data[9][1] = "Law";
			data[9][2] = "On Going";
			data[9][3] = 20;
			
			
			return data;
		}
	}
	}
