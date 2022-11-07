package com.lighthouse.bdd.steps;

import Pages.Pages;
import Utils.SelenideTools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NewResearchPageStepDefinitions {
    @Then("The [Surveillance Setup] page is opened")
    public void theSurveillanceSetupPageIsOpened() {
        Assert.assertTrue(Pages.newResearchPage().isSurveillanceSetupPageOpened());
    }

    @When("Validate fields on the [Surveillance Setup] page")
    public void validateFieldsOnTheSurveillanceSetupPage() {
        Assert.assertTrue(Pages.newResearchPage().isCompanyLabelAsteriskPresent());
        Assert.assertTrue(Pages.newResearchPage().isFacilityLabelAsteriskPresent());
        Assert.assertEquals(Pages.newResearchPage().getCompanyNameInputPlaceholder(),"Company Name");
        Assert.assertEquals(Pages.newResearchPage().getFacilityInputPlaceholder(),"Facility");
        Pages.newResearchPage().enterCompanyName("Test");
        SelenideTools.sleep(1);
        Assert.assertEquals(Pages.newResearchPage().getEnteredCompanyName(),"Test");
        Pages.newResearchPage().clearEnteredCompanyName();
        Pages.newResearchPage().enterFacility("Test");
        SelenideTools.sleep(1);
        Assert.assertEquals(Pages.newResearchPage().getEnteredFacility(),"Test");
        Pages.newResearchPage().clearEnteredFacility();
        Assert.assertEquals(Pages.newResearchPage().getHelpTipText()
                ,"Suggestion: Use the City and State the facilty resides in for the facility name.");

    }

    @Then("Click [Submit new job] button")
    public void iClickSubmitNewJobButtonWithoutEnteringCompanyAndFacilityNames() {
        Pages.newResearchPage().clickSubmitNewJobButton();

    }

    @Then("Enter {string} company name")
    public void enterCompanyName(String companyName) {
        Pages.newResearchPage().enterCompanyName(companyName);
    }

    @And("Enter {string} facility name")
    public void enterFacilityName(String facilityName) {
        Pages.newResearchPage().enterFacility(facilityName);
    }

    @And("Window with {string} message is displayed")
    public void windowWithMessageIsDisplayed(String message) {
        SelenideTools.sleep(2);
        Assert.assertTrue(Pages.newResearchPage().isAlertMessageVisible());
        Assert.assertEquals(Pages.newResearchPage().getAlertMessage(),message);
        Pages.newResearchPage().clickAlertOkButton();
    }

    @And("The {string} message is displayed")
    public void theMessageIsDisplayed(String message) {
        SelenideTools.sleep(2);
        Assert.assertTrue(Pages.newResearchPage().isErrorMessageVisible());
        Assert.assertEquals(Pages.newResearchPage().getErrorMessage(),message);
        Pages.newResearchPage().clickAlertOkButton();
    }

    @Then("Log out from Lighthouse")
    public void logOutFromLighthouse() {
        Pages.newResearchPage().logOut();
    }


    @And("Newly created job with status {string} is displayed in the table on the [New Research] page")
    public void newlyCreatedJobWithStatusIsDisplayedInTheTableOnTheNewResearchPage(String status) {
        Assert.assertTrue(Pages.newResearchPage().isNewlyCreatedJobDisplayed(status));
    }

    @When("Select already created job by index {int} in the table on the [New Research] page")
    public void selectAlreadyCreatedJobInTheTableOnTheNewResearchPage(int index) {
        Pages.newResearchPage().selectTheJobFromTheTable(index);
    }

    @Then("Click the [Copy From Research Job] button")
    public void clickTheCopyFromResearchJobButton() {
        Pages.newResearchPage().clickCopyFromResearchButton();
    }

    @When("Select already created job in the table on the [New Research] page")
    public void selectAlreadyCreatedJobWithCompanyAndFacilityNameInTheTableOnTheNewResearchPage() {
        Pages.newResearchPage().selectTheJobFromTheTable();
    }

    @When("Select {string} client from the client dropdown")
    public void selectClientFromTheClientDropdown(String client) {
        Pages.newResearchPage().selectClient(client);
    }

    @When("The client dropdown is visible and clickable")
    public void theClientDropdownIsVisibleAndClickable() {
        Assert.assertTrue(Pages.newResearchPage().isSelectClientVisibleAndClickable());
    }

    @When("Create a new surveillance")
    public void createANewSurveillance() {

    }

    @Then("Newly created job with status {string} is not displayed in the table on the [New Research] page")
    public void newlyCreatedJobIsNotDisplayedInTheTableOnTheNewResearchPage(String status) {
        Assert.assertFalse(Pages.newResearchPage().isNewlyCreatedJobDisplayed(status));
    }

    @When("The client dropdown is not visible and clickable")
    public void theClientDropdownIsNotVisibleAndClickable() {
        Assert.assertFalse(Pages.newResearchPage().isSelectClientVisibleAndClickable());
    }

    @When("Click on the [Results] sidebar button")
    public void clickOnTheResultsSidebarButton() {
        Pages.newResearchPage().clickResultsSidebarButton();
    }

    @When("Click on the [Configuration] sidebar button")
    public void clickOnTheConfigurationSidebarButton() {
        Pages.newResearchPage().clickConfigurationSidebarButton();
    }

    @Then("Enter random company name")
    public void enterRandomCompanyName() {
        Pages.newResearchPage().enterRandomCompanyName();
    }

    @And("Enter random facility name")
    public void enterRandomFacilityName() {
        Pages.newResearchPage().enterRandomFacilityName();
    }
}
