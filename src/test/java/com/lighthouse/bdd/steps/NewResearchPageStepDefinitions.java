package com.lighthouse.bdd.steps;

import Pages.Pages;
import Utils.SelenideTools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NewResearchPageStepDefinitions {
    @Then("The [Configuration] page is opened")
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
        SelenideTools.refresh();
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
        Pages.newResearchPage().sortByCreatedLabel();
        SelenideTools.sleep(2);
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
        Pages.newResearchPage().selectNewlyCreatedJob();
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
        Pages.atlasDashboardManagementPage().clickSurveillanceIntelligenceSidebarCollapseButton();
        SelenideTools.sleep(2);
        Pages.newResearchPage().clickConfigurationSidebarButton();
        SelenideTools.sleep(10);
        SelenideTools.switchToLastTab();
    }

    @Then("Enter random company name")
    public void enterRandomCompanyName() {
        Pages.newResearchPage().enterRandomCompanyName();
    }

    @And("Enter random facility name")
    public void enterRandomFacilityName() {
        Pages.newResearchPage().enterRandomFacilityName();
    }

    @When("Click on the delete button of {int} displayed configuration on the [Configuration] page")
    public void clickOnTheDeleteButtonOfAnyDisplayedConfigurationOnTheConfigurationPage(int number) {
        Pages.newResearchPage().clickOnTheDeleteButton(number);
    }

    @When("Click on the delete button of any displayed configuration with status {string} on the [Configuration] page")
    public void clickOnTheDeleteButtonOfAnyDisplayedConfigurationOnTheConfigurationPage(String status) {
        Pages.newResearchPage().clickOnTheDeleteButton(status);
    }

    @Then("Verify that alert message with {string} message is displayed")
    public void verifyThatAlertMessageWithMessageIsDisplayed(String message) {
        SelenideTools.sleep(1);
        Assert.assertEquals(message, Pages.newResearchPage().getAlertMessage());
    }

    @And("Click on Yes Delete button on the alert window")
    public void clickOnYesDeleteButtonOnTheAlertWindow() {
        Pages.newResearchPage().clickYesDeleteButton();
    }

    @And("Verify that the configuration is deleted on the [Configuration] page")
    public void verifyThatTheConfigurationIsDeletedOnTheConfigurationPage() {
        SelenideTools.sleep(10);
        Assert.assertTrue(Pages.newResearchPage().verifyThatTheJobIsDeleted());
    }

    @When("Select newly created job on the [New Research] page")
    public void selectNewlyCreatedJobOnTheNewResearchPage() {
        Pages.newResearchPage().selectNewlyCreatedJob();
        Pages.newResearchPage().clickCopyFromResearchButton();
    }

    @And("Click on the [Surveillance Setup] breadcrumb")
    public void clickOnTheSurveillanceSetupBreadcrumb() {
        Pages.newResearchPage().clickOnSurveillanceSetupBreadcrumb();
    }

    @And("Click on Yes Delete button on the alert window if visible")
    public void clickOnYesDeleteButtonOnTheAlertWindowIfVisible() {
        Pages.newResearchPage().clickYesDeleteButtonIfVisible();
    }

    @Then("Verify that alert message about submitted job deletion is displayed")
    public void verifyThatAlertMessageAboutSubmittedJobDeletionIsDisplayed() {
        Assert.assertTrue(Pages.newResearchPage().getAlertSubmittedJobMessage().contains("Note that all versions of the Results for"));
    }

    @And("Click on Yes Delete button on the alert window for the second time")
    public void clickOnYesDeleteButtonOnTheAlertWindowForTheSecondTime() {
        Pages.newResearchPage().clickYesDeleteButtonForTheSecondTime();
    }

    @And("Click on Yes Delete button on the alert window for the third time")
    public void clickOnYesDeleteButtonOnTheAlertWindowForTheThirdTime() {
        Pages.newResearchPage().clickYesDeleteButtonForTheThirdTime();
    }

    @Then("Verify that second alert message with {string} message is displayed")
    public void verifyThatSecondAlertMessageWithMessageIsDisplayed(String message) {
        Assert.assertEquals(Pages.newResearchPage().getSecondAlertMessage(),message);
    }
}
