package ResponseValidation;


import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import java.util.List;

public class DynamicValidation {
	
		@Test
		public void dvalidation() {
			baseURI="http://localhost";
			port=8084;
			String expData = "TY_PROJ_603";
			
			Response resp = when()
				.get("projects");
		List<String> Ids= resp.jsonPath().get("projectId");
		boolean flag=false;
		for(String data:Ids) {
			if(data.equalsIgnoreCase(expData)) {
				flag=true;
			}
		}
		Assert.assertTrue(flag);
		System.out.println("yes validation is pass");
			
			
}
}