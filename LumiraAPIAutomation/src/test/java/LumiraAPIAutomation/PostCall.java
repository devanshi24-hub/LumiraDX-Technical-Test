package LumiraAPIAutomation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import Files.Payload;

public class PostCall {

	//To create a new blog category- POST call

		@Test(priority=1)
		public void test_createBlogCategory()
		{
			given().log().all().header("Content-Type","application/json").
			body(Payload.AddBlogCategory()).

			when().post("http://localhost:8888/api/blog/categories/").

			then().log().all().assertThat().statusCode(201);

		}
	
}
