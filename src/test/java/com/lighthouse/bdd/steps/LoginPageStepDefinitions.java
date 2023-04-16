package com.lighthouse.bdd.steps;

import Constants.Constants;
import Pages.Pages;
import Utils.SelenideTools;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageStepDefinitions {

    @When("Open Lighthouse")
    public void openLighthouse(){
        Pages.loginPage().openLighthouse();
    }

    @When("Open Atlas")
    public void openAtlas(){
        Pages.loginPage().openAtlas();
    }

    @Then("Enter login {string} on login page")
    public void enterLoginOnLoginPage(String login) {
        Pages.loginPage().enterUserName(login);
    }

    @Then("Enter password {string} on login page")
    public void enterPasswordOnLoginPage(String password) {
        Pages.loginPage().enterPassword(password);
    }

    @When("Click the [Login] button")
    public void clickOnTheButton() {
        Pages.loginPage().clickOnLoginButton();

        if(Pages.emailVerificationPage().verifyNotRecognizedPopOkButton()) {
            Pages.emailVerificationPage().clickOnNotRecognizedPopOkButton();
            Pages.emailVerificationPage().openUrlInNewTab(Constants.outlookUrl);
            Pages.emailVerificationPage().clickOnSigninButton();
            Pages.emailVerificationPage().enterUserNameAndPassword(Constants.outlookUsername,Constants.outlookPassword);
            Pages.emailVerificationPage().clickOnInboxFirstEmail();
            SelenideTools.switchToFirstTab();
            //SelenideTools.closeCurrentTab();
            Pages.emailVerificationPage().enterValidationCode();
            Pages.emailVerificationPage().clickOnValidationSubmitButton();
        }

        SelenideTools.getDriver().switchTo().alert().accept();
        SelenideTools.sleep(2);
    }

    @Then("Validate the [Login] page elements")
    public void validateTheLoginPageElements() {
        Assert.assertEquals(Pages.loginPage().getTabName(),"Login");
        Assert.assertEquals(Pages.loginPage().getLoginInputPlaceholder(),"Email");
        Assert.assertEquals(Pages.loginPage().getPasswordInputPlaceholder(),"Password");
        Assert.assertEquals(Pages.loginPage().getPasswordFieldType(),"password");
        Assert.assertTrue(Pages.loginPage().isLoginButtonClickable());
        Assert.assertTrue(Pages.loginPage().isLoginAssistanceButtonClickable());
        Assert.assertTrue(Pages.loginPage().isCancelButtonClickable());
    }

    @Then("Validate that the \"Please fill out the field\" message appears")
    public void validateThatTheMessageAppears() {
        Assert.assertTrue(Pages.loginPage().isFillOutMessageDisplayed());
    }

    @And("CLick the [Cancel] button")
    public void clickTheCancelButton() {
        Pages.loginPage().clickCancelButton();
    }

    @Then("Validate that the {string} error message displayed")
    public void validateThatTheErrorMessageDisplayed(String message) {
        Assert.assertEquals(Pages.loginPage().getErrorMessageText().trim(),message);
    }

    @And("Click the [Login Assistance] button")
    public void clickTheLoginAssistanceButton() {
        Pages.loginPage().clickLoginAssistanceBtn();
        SelenideTools.sleep(5);
        Selenide.back();
    }

    @Then("The [Login] page is opened")
    public void theLoginPageIsOpened() {
        Assert.assertEquals(Pages.loginPage().getTabName(),"Login");
    }

    @Then("Select the {string} role on login page")
    public void selectTheRoleOnLoginPage(String role) {
        Pages.loginPage().selectRole(role);
    }

    @When("Log out from Atlas")
    public void logOutFromAtlas() {
        Pages.loginPage().logOutFromAtlas();
    }
    
    @When("Clear Password filed")
    public void clearPasswordField() {
        Pages.loginPage().clearPassword();
    }
    
    @When("Clear Email field")
    public void clearEmailField() {
        Pages.loginPage().clearEmail();
    }
    
    @When("Verify empty Email and Password field")
    public void verifyEmptyFields() {
        Pages.loginPage().verifyEmptyEmailPasswordField();
    }
}
