package Parameter;
import static io.restassured.RestAssured.*;
public class PathPara {
public static void main(String[] args) {
	baseURI="http://localhost";
	port = 8084;
	
	given()
	.pathParam("end", "TY_PROJ_603")
	.when()
	.get("projects/{end}")
	.then().log().all();
	
}
}
