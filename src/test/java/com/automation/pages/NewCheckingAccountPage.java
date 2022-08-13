package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCheckingAccountPage extends BasePage{

    @FindBy(id ="new-checking-menu-item")
    WebElement newChecking;

    @FindBy(xpath ="//strong[text()='New Checking Account']")
    WebElement newCheckingAccountHeader;


    @FindBy(xpath ="//strong[text()='Select Account Ownership']")
    WebElement selectAccountOwnership;

    @FindBy(id ="Individual")
    WebElement individualRadioButton;


    @FindBy(id ="Joint")
    WebElement jointRadioButton;

    @FindBy(xpath ="//input[@id='Standard Checking']")
    WebElement standardRadioButton;


    @FindBy(xpath ="//input[@id='Interest Checking']")
    WebElement interestRadioButton;

    @FindBy(xpath ="//strong[text()='Select Checking Account Type']")
    WebElement selectCheckingAccountTypeHeader;


    public void clickOnNewChecking(){
        newChecking.click();
    }

   public void verifyNewCheckingAccountHeaderIsDisplayed(){
       Assert.assertTrue(newCheckingAccountHeader.isDisplayed());
    }

    public void verifySelectAccountOwnershipHeaderIsDisplayed(){
        Assert.assertTrue(selectAccountOwnership.isDisplayed());
    }

  public void verifyOwnershipRadioButtonsAreUnchecked(){

Assert.assertFalse(individualRadioButton.isSelected() && jointRadioButton.isSelected());

    }

public void verifyCheckingRadioButtonsAreUnchecked(){
        Assert.assertFalse(standardRadioButton.isSelected() && interestRadioButton.isSelected());

}
    public void verifySelectCheckingAccountTypeHeaderIsDisplayed(){
        Assert.assertTrue(selectCheckingAccountTypeHeader.isDisplayed());
    }


}
