package com.test.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleStepDef {

	@Given("user launches {string}")
	public void user_launches(String URL) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Fiserv_User_333330/git/Cucumber.Serenity/drivers/chromedriver_96.0.4664.45/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.quit();
		System.out.println("Google.com launched");

	}
	@When("user enters his name {string}")
	public void user_enters_his_name(String URL) {
	    
	    
	}

	@When("clicks on search button")
	public void clicks_on_search_button() {
	    
	    
	}

	@Then("this linked profile is visible")
	public void this_linked_profile_is_visible() {
	    
	    
	}

}
