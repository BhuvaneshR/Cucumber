package com.test.pages.implimentations;

import com.test.pages.IFastPage;
import com.test.utilities.BasePageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FastPageImpl extends BasePageObject implements IFastPage {
	private final WebDriver driver;
	private static final Logger logger= LoggerFactory.getLogger(FastPageImpl.class);
	@FindBy(id = "your-speed-message")
	public WebElement speedMessageLabel;
	@FindBy(id = "speed-value")
	public WebElement speedValueLabel;

	public FastPageImpl(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@Override
	public void waitForSpeedAnalysisCompletion() {
		waitForElementToBeVisible(driver,speedMessageLabel,30);
		Assert.assertEquals("Your Internet speed is", speedMessageLabel.getText().trim());
	}

	@Override
	public void logSpeed() {
		logger.info("The internet speed captured is"+speedValueLabel.getText().trim());
	}




}