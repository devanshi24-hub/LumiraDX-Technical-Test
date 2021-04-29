package LumiraAPIAutomation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class GetCall {

	//To get the list of blog categories-GET call

	@Test(priority=1)
	public void test_blogCategories () {
		given().
		when().
		get("http://localhost:8888/api/blog/categories/").
		then().log().all().
		assertThat().statusCode(200);

	}

	//To get the list of posts under a blog categories-GET call

	@Test(priority=2)
	public void test_postsInBlogCategory()
	{
		given().
		when().
		get("http://localhost:8888/api/blog/categories/1").
		then().log().all().
		assertThat().statusCode(200);

	}

}
