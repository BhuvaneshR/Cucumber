package com.test.pages.implimentations;

import com.test.pages.ISalesForce;
import com.test.pages.IWikiPage;
import com.test.utilities.BasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SalesForceLoginPageImpl extends BasePageObject implements ISalesForce {

	priavte final WebDriver driver;
	public SalesForceLoginPageImpl(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id = "username")
	public WebElement userNameInput;

	@FindBy(id="password")
	public WebElement passwordInput;

	@FindBy(id="Login")
	public WebElement signInBtn;

	@FindBy(id="userNavLabel")
	public WebElement userNavDrpDwn;

	@FindBy(css="a.debugLogLink")
	public WebElement devConsoleLink;


	public void logIntoSalesForce(String Username, String password)
	{
		userNameInput.sendKeys(Username);
		passwordInput.sendKeys(password);
		signInBtn.click();
		waitForPageToLoad(driver);
	}

	public void openDeveloperConsole()
	{
		waitForElementToBeVisible(driver,userNavDrpDwn,10);
		userNavDrpDwn.click();
		devConsoleLink.click();
	}






}