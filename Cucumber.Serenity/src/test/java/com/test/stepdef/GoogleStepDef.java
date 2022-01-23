package com.test.stepdef;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.pages.GooglePage;
import com.test.utilities.BasePageObject;
import com.test.utilities.CreateDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class GoogleStepDef extends BasePageObject {

	
	private BasePageObject base;
	GooglePage gpage;
	
	public GoogleStepDef(BasePageObject base)
	{
		this.base=base;
	}
	
	@Given("user launches {string}")
	public void user_launches(String URL) {

		base.driver.get(URL);
		base.driver.manage().window().maximize();
		System.out.println("Google.com launched");

	}

	@When("user enters his name {string}")
	public void user_enters_his_name(String URL) {
		gpage = new GooglePage(base.driver);
		gpage.sendKeystoSearchBar(URL);

	}

	@When("clicks on search button")
	public void clicks_on_search_button() {
		gpage = new GooglePage(base.driver);
		JavascriptExecutor js = (JavascriptExecutor) base.driver;

		List<WebElement> ls = base.driver.findElements(By.xpath(""));

	}

	@Then("this linked profile is visible")
	public void this_linked_profile_is_visible() {

		System.out.println("Last step");
	}

}
