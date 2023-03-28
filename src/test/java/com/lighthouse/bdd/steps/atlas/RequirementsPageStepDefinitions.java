package com.lighthouse.bdd.steps.atlas;

import Pages.Pages;
import Utils.SelenideTools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RequirementsPageStepDefinitions {


    @Then("The [Requirements] page is opened")
    public void theRequirementsPageIsOpened() {
        Assert.assertTrue(Pages.requirementsPage().isRequirementsPageOpened());
    }

    @When("Click on the +PDF button of the {int} requirement on the [Requirements] page")
    public void clickOnThePDFButtonOfTheRequirementOnTheRequirementsPage(int index) {
        Pages.requirementsPage().clickOnThePlusPDFButton(index-1);
    }

    @Then("The [Requirement PDF Upload] window is opened")
    public void theRequirementPDFUploadWindowIsOpened() {
        Assert.assertTrue(Pages.requirementsPage().isRequirementsPDFUploadPageOpened());
    }

    @And("Close the [Requirement PDF Upload] window")
    public void closeTheRequirementPDFUploadWindow() {
        Pages.requirementsPage().closeRequirementsPDFUploadWindow();
    }

    @Then("The error window with {string} text is displayed on the [Requirements] page")
    public void theErrorWindowWithTextIsDisplayedOnTheRequirementsPage(String text) {
        Pages.requirementsPage().isErrorTextDisplayed(text);
    }

    @And("Close the error window on the [Requirements] page")
    public void closeTheErrorWindowOnTheRequirementsPage() {
        Pages.requirementsPage().clickErrorWindowOkButton();
    }

    @When("Click on the +PDF button of any requirement on the [Requirements] page")
    public void clickOnThePDFButtonOfAnyRequirementOnTheRequirementsPage() {
        Pages.requirementsPage().clickOnThePlusPDFButton();
    }
}
