package restcountries;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

@Test
public class AllTest extends AbstractTestBase {

	public void requestAll_checkSize() {
		when()
				.get("/all")
		.then()
				.body("size()", equalTo(250));
	}

}
