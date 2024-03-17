package com.test.stepdef.API;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class GetUserList {

	@Given("user creates the request")
	public void user_creates_the_request() {

		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		String response=
		given().headers("Content-type","application/json").
		when().get().
		then().extract().response().asString();
		//System.out.println(res);

		JsonPath js=new JsonPath(response);

		System.out.println(js.getString("data.id"));


	}

	@When("user hits the endpoint with request")
	public void user_hits_the_endpoint_with_request() {


	}

	@Then("user must be able see status code <{int}>")
	public void user_must_be_able_see_status_code(Integer int1) {


	}

}
