package com.lighthouse.bdd.steps.admin;

import Pages.Pages;
import Utils.SelenideTools;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginAdminPageStepDefinitions {

    @When("Open Lighthouse Admin")
    public void openLighthouseAdmin() {
        Pages.loginAdminPage().openLighthouseAdmin();
        Pages.loginAdminPage().isLoginAdminPageOpened();
    }

    @Then("Enter login {string} on login admin page")
    public void enterLoginOnLoginAdminPage(String login) {
        Pages.loginAdminPage().enterUserName(login);
    }

    @Then("Enter password {string} on login admin page")
    public void enterPasswordOnLoginAdminPage(String password) {
        Pages.loginAdminPage().enterPassword(password);
    }

    @When("Click the [Login] button on login admin page")
    public void clickTheLoginButtonOnLoginAdminPage() {
        Pages.loginAdminPage().clickOnLoginButton();
    }
}
