package BasicCRUD;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Delete {
	@Test
	public void del() {
		Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_403");
		int expstatus=204;
		int actStatus = resp.getStatusCode();
		assertEquals(expstatus, actStatus);
		System.out.println(resp.contentType());
		System.out.println(resp.asPrettyString());
	}

}
