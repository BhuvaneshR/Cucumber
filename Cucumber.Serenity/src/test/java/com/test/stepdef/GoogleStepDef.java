package com.test.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class GoogleStepDef {

	@Given("user launches {string}")
	public void user_launches(String string) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Fiserv_User_333330/git/Cucumber.Serenity/drivers/chromedriver_96.0.4664.45/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
		System.out.println("Google.com launched successfully");

	}

}
