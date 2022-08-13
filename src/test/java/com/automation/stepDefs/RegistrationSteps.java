package com.automation.stepDefs;

import com.automation.pages.LoginPage;
import com.automation.pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RegistrationSteps {
    LoginPage loginPage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();


    @Given("user is on Login page")
    public void user_is_on_Login_page() {

    }

    @When("user clicks on sign Up Here link")
    public void user_clicks_on_sign_up_here_link() {
        loginPage.clickSignUpLink();

    }
    @Then("verify user is on the registration page")
    public void verify_user_is_on_the_registration_page() {
        registrationPage.verifyUserIsOnRegistrationPage();

    }

    @Given("user is on the Registration page")
    public void user_is_on_the_Registration_page() {
      loginPage.clickSignUpLink();

    }

    @When("user click on Title field")
    public void user_click_on_Title_field() {
        registrationPage.verifyUserClickOnTitleField();
    }

    @Then("verify user can see the drop-down window with title options")
    public void verify_user_can_see_the_drop_down_window_with_title_options() {
        registrationPage.verifyUserSeeDropDown();
    }

    @And("verify chosen {string} appears in the {string} field")
    public void verify_chosen_appears_in_the_field(String selection, String title) {
        registrationPage.verifyUserCanSelectTitle(selection, title);
    }

    @When("user enters {string} in first name field")
    public void user_enters_in_first_name_field(String string) {
        loginPage.clickSignUpLink();
        registrationPage.verifyUserCanEnterFirstName();
    }

    @Then("verify first name is displayed in the first name field")
    public void verify_first_name_is_displayed_in_the_first_name_field() {
        registrationPage.verifyFirstNameIsDisplayed();
    }

    @When("user enters {string} in last name")
    public void user_enters_in_last_name(String string) {
        loginPage.clickSignUpLink();
        registrationPage.verifyUserCanEnterLastName();
    }

    @Then("verify Last Name is displayed in the last name field")
    public void verify_last_name_is_displayed_in_the_last_name_field()  {
        registrationPage.verifyLastNameIsDisplayed();
    }

    @Then("active radio button displays {string}")
    public void active_radio_button_displays(String string) {
    }

    @Given("user clicks on DOB field")
    public void user_clicks_on_dob_field() {
        loginPage.clickSignUpLink();
        registrationPage.clickOnDOBField();
    }

    @When("user types correct {string}, {string}, {string} format")
    public void user_types_correct_format(String month, String day, String year) throws InterruptedException {
        registrationPage.verifyUserCanEnterDOB(month, day, year);
        Thread.sleep(2000);

    }

    @Then("verify {string}, {string}, {string} is displayed  in the corresponding field")
    public void verify_dob_is_displayed_in_the_corresponding_field(String month, String day, String year) throws InterruptedException {
        registrationPage.verifyDOBFieldIsDisplayed(month, day, year);
    }


    @When("user types incorrect {string}, {string}, {string} format")
    public void user_types_incorrect_format(String string, String string2, String string3) {

    }

    @Then("verify user gets an error message {string}")
    public void verify_user_gets_an_error_message(String string) {

    }

    @Given("user clicks on SSN field")
    public void user_clicks_on_ssn_field() {


    }

    @When("user types in correct {string} format")
    public void user_types_in_correct_format(String string) {
    }

    @Then("SSN is displayed in the SSN field")
    public void ssn_is_displayed_in_the_ssn_field() {

    }

    @When("user enters  valid {string} in the Email field")
    public void user_enters_valid_in_the_email_field(String string) {

    }

    @Then("verify email is displayed in the email field")
    public void verify_email_is_displayed_in_the_email_field() {

    }

    @Then("verify password is hidden")
    public void verify_password_is_hidden(io.cucumber.datatable.DataTable dataTable) {

    }

    @When("user types incorrect {string} format")
    public void user_types_incorrect_format(String string) {

    }

    @Then("error message is displayed prompting to enter correct format SSN")
    public void error_message_is_displayed_prompting_to_enter_correct_format_ssn() {

    }

    @When("user enters   {string} in the Email field")
    public void user_enters_in_the_email_field(String string) {

    }

    @Then("verify user gets {string} error")
    public void verify_user_gets_error(String string) {

    }


    @When("user enters {string} to the password field")
    public void user_enters_to_the_password_field(String string) {

    }


    @When("user clicks on proper {string}")
    public void userClicksOnProper(String arg0) {

    }
}