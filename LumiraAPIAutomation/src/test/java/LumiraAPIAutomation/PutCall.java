package LumiraAPIAutomation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import Files.Payload;

public class PutCall {

	//To update a  blog category name- PUT call

	@Test(priority=1)
	public void test_UpdateBlogCategory()
	{
		given().log().all().header("Content-Type","application/json").
		body(Payload.UpdateBlogCategory()).

		when().put("http://localhost:8888/api/blog/categories/23").

		then().log().all().assertThat().statusCode(204);

	}
}
