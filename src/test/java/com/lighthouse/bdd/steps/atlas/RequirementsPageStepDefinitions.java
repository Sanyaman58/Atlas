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
    
    @And("Verify that the search filed is present with the Requirement Viewer section")
    public void verifyRequirementHeaderSearchFields() {
        Pages.requirementsPage().verifyRequirementPageSearchFields();
    }


    @When("Click on the {string} label on the [Requirements] page")
    public void clickOnTheLabelOnTheRequirementsPage(String labelName) {
        Pages.requirementsPage().clickOnTheTableLabel(labelName);
    }

    @Then("Right click on {int} record in the [Requirements] table")
    public void rightClickOnRecordInTheRequirementsTable(int index) {
        Pages.requirementsPage().rightClickOnTableRecord(index - 1);
    }

    @And("Click on Show Requirement Details context menu button on the [Requirements] page")
    public void clickOnShowRequirementDetailsContextMenuButtonOnTheRequirementsPage() {
        Pages.requirementsPage().clickShowRequirementsDetailsButton();
    }

    @Then("Verify that Product Line, Business Model and Change Note options are not visible")
    public void verifyThatProductLineBusinessModelAndChangeNoteOptionsAreNotVisible() {
        Assert.assertFalse(Pages.requirementsPage().isProductLineLabelVisible());
        Assert.assertFalse(Pages.requirementsPage().isBusinessModelLabelVisible());
        Assert.assertFalse(Pages.requirementsPage().isChangeNoteLabelVisible());
    }
    
    @Then("The [Documents] page is opened")
    public void theDocumentsPageIsOpened() {
        Pages.requirementsPage().isDocumentsPageOpened();
    }
    
    @Then("The [Company Profile] page is opened")
    public void theCompanyProfilePageIsOpened() {
        Pages.requirementsPage().isCompanyProfilePageOpened();
    }
    
    @Then("Click on Profile [View Details] button")
    public void clickViewDetails() {
        Pages.requirementsPage().clickCompanyViewDetailsButton();
    }
    
    @Then("Verify the navigation between the company profile pages")
    public void verifyCopanyProfileNavigations() {
        Pages.requirementsPage().verifyNavigationBetweenCompanyProfilePages();
    }

}
