package GenericLibraries;

import io.restassured.response.Response;

/**
 * This class contain generic method of restassured
 * @author ZEESHAN AHMED
 *
 */
public class RestAssuredLibrary {

	public String getJsonData(Response response,String path) {
		String JsonData = response.jsonPath().get(path);
		
		return JsonData;
		
	}

}
