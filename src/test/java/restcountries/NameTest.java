package restcountries;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class NameTest extends AbstractTestBase {
	
	public void retrieveByName() {
		given()
			.pathParam("country", "Finland").
		when().
        	get("/name/{country}")
        .then()
            .body("capital", hasItem("Helsinki"));
	}
	
	@DataProvider
	public Object[][] testData() {
		return new Object[][]{ { "Netherlands", "Amsterdam" }, { "Belgium", "Brussels" } };
	}
	
	@Test(dataProvider = "testData")
	public void retrieveByName_checkCapital(final String country, final String capital) {
		given()
			.pathParam("country", country).
		when().
	    	get("/name/{country}")
	    .then()
	        .body("capital", hasItem(capital));
	}
	
	

}
