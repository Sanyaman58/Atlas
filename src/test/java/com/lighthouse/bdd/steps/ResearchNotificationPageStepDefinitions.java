package com.lighthouse.bdd.steps;

import Pages.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class ResearchNotificationPageStepDefinitions {

    @Then("The [Research Notification] page is opened")
    public void theResearchNotificationPageIsOpened() {
        Assert.assertTrue(Pages.researchNotificationPage().isResearchNotificationPageVisible());
    }


    @When("Click on the [Research Notification] sidebar button on Lighthouse")
    public void clickOnTheResearchNotificationSidebarButtonOnLighthouse() {
        Pages.researchNotificationPage().clickOnResearchNotificationSidebarButton();
    }

    @Then("The following labels are displayed in the [Research Notification] table")
    public void theFollowingLabelsAreDisplayed(List<String> listOfLabels) {
        Assert.assertTrue(Pages.researchNotificationPage().isTableLabelsPresent(listOfLabels));
    }


    @When("Click on the {string} label on the [Research Notification] page")
    public void clickOnTheLabelOnTheResearchNotificationPage(String label) {
        Pages.researchNotificationPage().clickOnTheLabel(label);
    }

    @Then("Verify that records on the [Research Notification] page are sorted alphabetically by {string} label")
    public void verifyThatRecordsOnTheViewResultsPageAreSortedAlphabeticallyByLabel(String label) {
        Assert.assertTrue(Pages.researchNotificationPage().verifyThatRecordsSortedByTheLabel(label));
    }

    @Then("Verify that records on the [Research Notification] page are sorted alphabetically backwards by {string} label")
    public void verifyThatRecordsOnTheViewResultsPageAreSortedAlphabeticallyBackwardsByLabel(String label) {
        Assert.assertTrue(Pages.researchNotificationPage().verifyThatRecordsSortedDescendingByTheLabel(label));
    }

    @Then("Enter {string} in the activity search on the [Research Notification] page")
    public void enterInTheActivitySearchOnTheResearchNotificationPage(String text) {
        Pages.researchNotificationPage().enterTextInTheSearchField(text);
    }

    @And("Get requirement name of the {int} record on the [Research Notification] page")
    public void getRequirementNameOfTheRecordOnTheResearchNotificationPage(int index) {
        Pages.researchNotificationPage().saveRequirementNameOfTheRecord(index-1);
    }

    @And("Get SKU of the {int} record on the [Research Notification] page")
    public void getSKUOfTheRecordOnTheResearchNotificationPage(int index) {
        Pages.researchNotificationPage().saveSKUOfTheRecord(index-1);
    }

    @Then("Enter saved requirement's name in the activity search on the [Research Notification] page")
    public void enterSavedRequirementSNameInTheActivitySearchOnTheResearchNotificationPage() {
        Pages.researchNotificationPage().enterTextInTheSearchField(Pages.researchNotificationPage().getRequirementName());
    }

//    @Then("Enter saved SKU in the activity search on the [Research Notification] page")
//    public void enterSaveSKUInTheActivitySearchOnTheResearchNotificationPage() {
//        Pages.researchNotificationPage().enterTextInTheSearchField(Pages.researchNotificationPage().getSKU());
//    }

    @Then("Enter saved SKU in the activity search on the [Research Notification] page")
    public void enterSavedSKUInTheActivitySearchOnTheResearchNotificationPage() {
        Pages.researchNotificationPage().enterTextInTheSearchField(Pages.researchNotificationPage().getSKU());
    }

    @Then("Only records with entered requirement name are displayed on the [Research Notification] page")
    public void onlyRecordsWithEnteredRequirementNameAreDisplayedOnTheResearchNotificationPage() {
        Assert.assertTrue(Pages.researchNotificationPage().isRecordsOnlyWithRequirementName());
    }

    @Then("Only records with entered SKU are displayed on the [Research Notification] page")
    public void onlyRecordsWithEnteredSKUAreDisplayedOnTheResearchNotificationPage() {
        Assert.assertTrue(Pages.researchNotificationPage().isRecordsOnlyWithSKU());
    }

    @Then("A record with type {string} and {string} scope displayed in the table")
    public void aRecordWithTypeAndScopeDisplayedInTheTable(String type, String scope) {
        Assert.assertTrue(Pages.researchNotificationPage().isRecordWithTypeAndScopeAndNoteDisplayed(type, scope, Pages.versionRequirementsAdminPage().getChangeNoteText()));
    }
    
    @Then("Click on [Notifications] sidebar option")
    public void clickNotifications() {
    	Pages.researchNotificationPage().clickNotificationsButton();
    }
    
    @Then("Click on [Intelligence] option")
    public void clickIntelligenceOption() {
    	Pages.researchNotificationPage().selectIntelligence();
    }
    
    @Then("Verify [Research Notfications] page is opened")
    public void verifyResearchNotificationsPage() {
    	Pages.researchNotificationPage().verifyResearchNotificationsPageOpened();
    }
    
    @Then("Verify the test wrapping in the Research Notifications page")
    public void verifyTextWrapping() {
    	Pages.researchNotificationPage().verifyTextWrappingOnNotificationsPage();
    }
}
