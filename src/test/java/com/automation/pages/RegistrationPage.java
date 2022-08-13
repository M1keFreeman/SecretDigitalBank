package com.automation.pages;

import com.automation.utilities.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Objects;

public class RegistrationPage extends BasePage {

    @FindBy(id = "title")
    public WebElement titleRegistrationField;

    @FindBy(xpath = "//select/option[contains(text(),'Please select')]")
    public WebElement pleaseSelectMessage;

    @FindBy(id = "firstName")
    public WebElement firstNameRegistrationField;

    @FindBy(id = "lastName")
    public WebElement lastNameRegistrationField;

    @FindBy(xpath = "//input[@value= 'M']")
    public WebElement genderMRegistrationField;

    @FindBy(xpath = "//input[@value= 'F']")
    public WebElement genderFRegistrationField;

    @FindBy(id = "dob")
    public WebElement dateOfBirthRegistrationField;

    @FindBy(id = "ssn")
    public WebElement ssnRegistrationField;

    @FindBy(id = "emailAddress")
    public WebElement emailRegistrationField;

    @FindBy(id = "password")
    public WebElement passwordRegistrationField;

    @FindBy(id = "//confirmPassword")
    public WebElement confirmPasswordRegistrationField;

    @FindBy(xpath = "//button[contains(text(), 'Next')]")
    public WebElement nextButton;

    @FindBy(xpath = "//a[contains(text(), 'Sign in')]")
    public WebElement singInLink;

    public void verifyUserIsOnRegistrationPage() {

        Assert.assertTrue("User is not on the RegistrationPage Page", firstNameRegistrationField.isDisplayed());
    }

    public void verifyUserClickOnTitleField() {

        titleRegistrationField.click();
    }

    public void verifyUserSeeDropDown() {

        WebElement categoryDropdown = driver.findElement(By.id("title"));
        Select catDropdownSelect = new Select(categoryDropdown);
        Assert.assertTrue("User is not in the Title Field", pleaseSelectMessage.isDisplayed());
    }
    public void verifyUserCanEnterFirstName() {
        firstNameRegistrationField.sendKeys(ConfigReader.getProperty("enter.first.name") + Keys.ENTER);
    }
    public void verifyFirstNameIsDisplayed(){
        String firstName = firstNameRegistrationField.getAttribute("value");
        Assert.assertEquals(ConfigReader.getProperty("enter.first.name"), firstName);

    }
    public void verifyUserCanEnterLastName() {
        lastNameRegistrationField.sendKeys(ConfigReader.getProperty("enter.last.name")+ Keys.ENTER);
    }

    public void verifyLastNameIsDisplayed()  {

        String lastName = lastNameRegistrationField.getAttribute("value");

        Assert.assertEquals(ConfigReader.getProperty("enter.last.name"), lastName);


    }

        public void verifyUserCanSelectTitle(String selection, String title) {

        Select titleDropdownSelect = new Select(titleRegistrationField);
        titleDropdownSelect.selectByVisibleText(selection);
        WebElement selectedOption = titleDropdownSelect.getFirstSelectedOption();
        Assert.assertEquals(title, selectedOption.getText());

    }
    public void clickOnDOBField(){
        dateOfBirthRegistrationField.click();
    }
    public void verifyUserCanEnterDOB(String month, String day, String year) throws InterruptedException {

        dateOfBirthRegistrationField.sendKeys(month + day + year + Keys.ENTER);
        Thread.sleep(2000);

    }

    public void verifyDOBFieldIsDisplayed(String month, String day, String year) throws InterruptedException {
        String dobValue = dateOfBirthRegistrationField.getAttribute("value");
        Thread.sleep(2000);
        Assert.assertEquals(month+ day + year, dobValue);
    }

}





