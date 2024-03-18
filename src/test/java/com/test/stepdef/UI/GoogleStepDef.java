package com.test.stepdef.UI;

import com.test.utilities.WebDriverManager;
import org.openqa.selenium.WebDriver;

import com.test.pages.GooglePage;
import com.test.utilities.BasePageObject;

import io.cucumber.java.en.*;

public class GoogleStepDef extends BasePageObject {

	GooglePage gpage;
	WebDriver driver;

	@Given("user launches {string}")
	public void user_launches(String URL) {
		driver= WebDriverManager.getDriver();
		if(driver==null)
		{
			throw new NullPointerException("WebDriver instance is not initialized in Hooks Class");
		}
		driver.get(URL);
		driver.manage().window().maximize();
		gpage=new GooglePage(driver);
	}

	@When("user enters his name {string}")
	public void user_enters_his_name(String Name) {
		gpage.sendKeystoSearchBar(Name);
	}

	@When("clicks on search button")
	public void clicks_on_search_button() {
		gpage.clickSearchBtn();
	}

	@Then("this linked profile is visible")
	public void this_linked_profile_is_visible() {
		System.out.println("This is the last step");
	}

}