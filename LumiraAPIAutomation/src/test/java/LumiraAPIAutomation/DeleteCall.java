package LumiraAPIAutomation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class DeleteCall {

	//To delete a  blog category- DELETE call

	@Test(priority=1)
	public void test_deleteBlogCategory()
	{
		given().log().all().header("Content-Type","application/json").

		when().delete("http://localhost:8888/api/blog/categories/22").

		then().log().all().assertThat().statusCode(204);

	}

}
