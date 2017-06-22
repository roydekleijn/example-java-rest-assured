package restcountries;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public abstract class AbstractTestBase {

	@BeforeSuite
	public void setup() {
		RestAssured.baseURI = "http://restcountries.eu";
		RestAssured.basePath = "/rest/v2";
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	}
}
