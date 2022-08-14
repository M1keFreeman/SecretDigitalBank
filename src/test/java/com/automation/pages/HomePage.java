package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(id = "home-menu-item")
    WebElement homeMenuItem;

    @FindBy(xpath ="//a[@id='checking-menu']")
    WebElement checkingDropdown;

    @FindBy(id ="view-checking-menu-item")
    WebElement viewChecking;

    @FindBy(id ="new-checking-menu-item")
    WebElement newChecking;


    public void verifyUserIsSignedInSuccessfully(){
        Assert.assertTrue("User is not on the Home Page",homeMenuItem.isDisplayed());
    }

    public void clickOnCheckingItem(){

        checkingDropdown.click();
    }

    public void verifyCheckingOptionsAreDisplayed(){

        Assert.assertTrue(viewChecking.isDisplayed()&&newChecking.isDisplayed() );

    }



}
