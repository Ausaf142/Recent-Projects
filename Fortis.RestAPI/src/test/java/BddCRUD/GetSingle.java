package BddCRUD;
import static io.restassured.RestAssured.*;
public class GetSingle {
	public static void main(String[] args) {
		baseURI="http://localhost";
		port=8084;
		
		given().
		when()
		.get("/projects/TY_PROJ_825")
		.then().log().all();
	}
}
