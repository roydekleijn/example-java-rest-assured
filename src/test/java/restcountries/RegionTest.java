package restcountries;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

import org.testng.annotations.Test;

@Test
public class RegionTest extends AbstractTestBase {

	public void retrieveAlpha2Codes() {
		given().
		when()
			.get("/region/europe")
    	.then()
        	.body("alpha2Code", hasItems("AX", "AL", "AD", "AT", "BY", "BE", "BA", "BG", "HR", "CY", "CZ", "DK", "EE", "FO", "FI", "FR", "DE", "GI", "GR", "GG", "VA", "HU", "IS", "IE", "IM", "IT", "JE", "LV", "LI", "LT", "LU", "MK", "MT", "MD", "MC", "ME", "NL", "NO", "PL", "PT", "XK", "RO", "RU", "SM", "RS", "SK", "SI", "ES", "SJ", "SE", "CH", "UA", "GB"));
	}
}
