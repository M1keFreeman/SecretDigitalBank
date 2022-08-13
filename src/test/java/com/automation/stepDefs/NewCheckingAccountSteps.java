package com.automation.stepDefs;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.NewCheckingAccountPage;
import com.automation.utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NewCheckingAccountSteps {
    HomePage homePage =new HomePage();
    LoginPage loginPage =new LoginPage();
    NewCheckingAccountPage newCheckingAccountPage = new NewCheckingAccountPage();


    @Given("user is on login page")
    public void user_is_on_login_page() {
        loginPage.verifyUserIsOnLoginPage();
    }

    @When("user enters valid credentials")
    public void userEntersValidCredentials() {
        loginPage.doLogin();
        loginPage.clickOnSignInButton();
    }

    @Then("verify user is on Home page")
    public void verifyUserIsOnHomePage() {
        homePage.verifyUserIsSignedInSuccessfully();
    }

    @Given("user clicks on Checking field")
    public void user_clicks_on_checking_field() {
   homePage.clickOnCheckingItem();
    }
    @Then("verify View Checking and New Checking options are displayed")
    public void verify_view_checking_and_new_checking_options_are_displayed() {
    homePage.verifyCheckingOptionsAreDisplayed();
    }


    @Then("user clicks on New Checking Account")
    public void userClicksOnNewCheckingAccount() {
        newCheckingAccountPage.clickOnNewChecking();
    }

    @Then("verify New Checking Account header is displayed")
    public void verifyNewCheckingAccountHeaderIsDisplayed() {
    newCheckingAccountPage.verifyNewCheckingAccountHeaderIsDisplayed();
    }


    @And("verify Individual and Joint radio buttons unchecked by default")
    public void verifyIndividualAndJointRadioButtonOptionsAreUncheckedByDefault() {
        newCheckingAccountPage.verifyOwnershipRadioButtonsAreUnchecked();
    }

    @Then("verify Select Account Ownership header is displayed")
    public void verifySelectAccountOwnershipHeaderIsDisplayed() {
        newCheckingAccountPage.verifySelectAccountOwnershipHeaderIsDisplayed();

    }

    @And("verify Standard and Interest Checking radio buttons unchecked by default")
    public void verifyStandardAndInterestCheckingRadioButtonsUncheckedByDefault() {
    newCheckingAccountPage.verifyCheckingRadioButtonsAreUnchecked();
    }

    @Then("verify Select Checking Account header is displayed")
    public void verifySelectCheckingAccountHeaderIsDisplayed() {
        newCheckingAccountPage.verifySelectCheckingAccountTypeHeaderIsDisplayed();
    }
    @Given("user is in the account name Field")
    public void user_is_in_the_account_name_field() {

    }
    @When("user field user enters account name with alphanumeric and special characters")
    public void user_field_user_enters_with_alphanumeric_and_special_characters() {

      newCheckingAccountPage.enterAccountName();
    }
    @Then("verify that the entered account name corresponds to the name displayed in the field")
    public void verify_that_the_entered_corresponds_to_the_name_displayed_in_the_field() {
    newCheckingAccountPage.verifyIfAccountFieldHasText();
    }

}
