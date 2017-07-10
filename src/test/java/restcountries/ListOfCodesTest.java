package restcountries;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

import org.testng.annotations.Test;

@Test
public class ListOfCodesTest extends AbstractTestBase {

	public void retrieveList() {
		given()
			.queryParam("codes", "col;no;ee").
		when().
    		get("/alpha")
    	.then()
        	.body("population", hasItems(48759958, 5223256, 1315944));
	}
	
}
