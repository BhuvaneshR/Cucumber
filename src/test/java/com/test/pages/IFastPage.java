package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public interface IFastPage {


    WebElement searchBar = null;
    WebElement searchButton = null;


    public void sendKeystoSearchBar(String input);
    public void clickSearchBtn();

}
