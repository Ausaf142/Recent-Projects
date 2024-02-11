package BddCRUD;
import static io.restassured.RestAssured.*;


public class Delete {
public static void main(String[] args) {
	baseURI="http://localhost";
	port=8084;
	
	
	when().delete("/projects/TY_PROJ_606")
	.then().log().all();
	
}
}
