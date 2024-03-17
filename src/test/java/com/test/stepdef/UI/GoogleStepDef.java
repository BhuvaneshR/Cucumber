package com.test.stepdef.UI;

import org.openqa.selenium.WebDriver;

import com.test.pages.GooglePage;
import com.test.utilities.BasePageObject;

import io.cucumber.java.en.*;

public class GoogleStepDef extends BasePageObject {

	GooglePage gpage;
	WebDriver driver=Hooks.getDriver();

	@Given("user launches {string}")
	public void user_launches(String URL) {
		driver.get(URL);
		driver.manage().window().maximize();
		System.out.println("Google.com launched");

	}

	@When("user enters his name {string}")
	public void user_enters_his_name(String Name) {
		gpage=new GooglePage(driver);
		gpage.sendKeystoSearchBar(Name);
	}

	@When("clicks on search button")
	public void clicks_on_search_button() {
		gpage=new GooglePage(driver);
		gpage.clickSearchBtn();
	}

	@Then("this linked profile is visible")
	public void this_linked_profile_is_visible() {
		System.out.println("This is the last step");
	}

}