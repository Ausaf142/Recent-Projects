package ResponseValidation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.regex.Matcher;
public class ResHeaderValidation {
@Test
public void validation() {
	baseURI="http://localhost";
	port=8084;
	
	when()
	.get("/projects")
	.then()
	.assertThat().statusCode(200)
	.log().all();
	
	
	
	
}
}
