package com.automation.stepDefs;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();


    @Given("user entered correct URL")
    public void user_entered_correct_url() {

    }

    @Then("verify the title of the webpage is Digital Bank")
    public void verify_the_title_of_the_webpage_is_digital_bank() {
        loginPage.verifyPageTitle();

    }

    @Then("verify all sign-in text boxes and buttons are present")
    public void verify_all_sign_in_text_boxes_and_buttons_are_present() {
        loginPage.verifySignInButtonIsDisplayed();

    }

    @Given("user enters valid username {string} and password {string}")
    public void user_enters_valid_username_and_password(String string, String string2) {
        loginPage.doLogin();
    }

    @When("user clicks on Sign In button")
    public void user_clicks_on_sign_in_button() {
        loginPage.clickOnSignInButton();
    }

    @Then("verify user is successfully logged in to the account")
    public void verify_user_is_successfully_logged_in_to_the_account() {
        homePage.verifyUserIsSignedInSuccessfully();
    }

    @Given("user enters invalid username {string} and password {string}")
    public void user_enters_invalid_username_and_password(String invalidUsername, String invalidPassword) {
        loginPage.doLogin(invalidUsername, invalidPassword);
    }

    @Then("verify user login failed with an error message")
    public void verify_user_login_failed_with_an_error_message() {

loginPage.verifyLoginErrorMessageIsDisplayed();
    }

    @Given("user enters valid username {string} and invalid password {string}")
    public void user_enters_valid_username_and_invalid_password(String string, String string2) {

    }

    @Given("user enters invalid username {string} and valid password {string}")
    public void user_enters_invalid_username_and_valid_password(String string, String string2) {

    }


    @Given("user leaves username and password fields blank")
    public void user_leaves_username_and_password_fields_blank() {

    }


    @Given("user had more than {int} unsuccessful login attempts")
    public void user_had_more_than_unsuccessful_login_attempts(Integer int1) {

    }


}

