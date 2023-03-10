package com.lighthouse.bdd.steps;

import Pages.Pages;
import Utils.SelenideTools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Assert;

public class ViewResultsPageStepDefinitions {

    @Then("The [View Results] page is opened")
    public void theViewResultsPageIsOpened() {
        Assert.assertTrue(Pages.viewResultsPage().isViewResultsPageOpened());
    }

    @And("Verify that newly created job with status {string} is displayed in the table on the [View Results] page")
    public void verifyThatNewlyCreatedJobWithStatusIsDisplayedInTheTableOnTheViewResultsPage(String status) {
        Assert.assertTrue(Pages.viewResultsPage().isNewlySubmittedJobDisplayed(status));
    }

    @Then("The following labels are displayed")
    public void theFollowingLabelsAreDisplayed(List<String> listOfLabels) {
        Assert.assertTrue(Pages.viewResultsPage().isTableLabelsPresent(listOfLabels));
    }

    @And("Select {string} entries to be displayed in the [Show Entries] select")
    public void selectEntriesToBeDisplayedInTheShowEntriesSelect(String numberOfEntries) {
        Pages.viewResultsPage().selectEntries(numberOfEntries);
    }

    @And("{string} entries are displayed on the [View Results] page")
    public void entriesAreDisplayedOnTheViewResultsPage(String numberOfEntries) {
        Assert.assertEquals(numberOfEntries, Pages.viewResultsPage().verifyDisplayedNumberOfEntries());
    }

    @When("Click on the {string} label")
    public void clickOnTheLabel(String label) {
        Pages.viewResultsPage().clickOnTheLabel(label);
    }

    @Then("Verify that records on the [View Results] page are sorted alphabetically by {string} label")
    public void verifyThatRecordsOnTheViewResultsPageAreSortedAlphabeticallyByLabel(String label) {
        Assert.assertTrue(Pages.viewResultsPage().verifyThatRecordsSortedByTheLabel(label));
    }

    @When("Click on the [View] button of the newly created job on the [View Results] page")
    public void clickOnTheViewButtonOfTheNewlyCreatedJobOnTheViewResultsPage() {
        Pages.viewResultsPage().clickOnTheViewButtonOfTheNewlyCreatedJob();
    }


    @Then("The [Research Results] page is opened")
    public void theResearchResultsPageIsOpened() {
        Assert.assertTrue(Pages.viewResultsPage().isResearchResultsPageOpened());
    }

    @And("Verify that requirement with {string} jurisdiction, {string} application name and {string} requirement name is in the list")
    public void verifyThatRequirementWithJurisdictionApplicationNameAndRequirementNameIsInTheList(String jurisdiction, String aName, String rName) {
        Assert.assertTrue(Pages.viewResultsPage().isRequirementPresentInTheList(jurisdiction,aName,rName));
    }

    @When("Close [Research Results] window")
    public void closeResearchResultsWindow() {
        Pages.viewResultsPage().closeViewResultWindow();
    }

    @Then("Verify that early created requirement name is in the list")
    public void verifyThatEarlyCreatedRequirementNameIsInTheList() {
        SelenideTools.sleep(5);
        Assert.assertTrue(Pages.viewResultsPage().isRequirementPresentInTheList(Pages.requirementsAdminPage().getState()
                , Pages.requirementsAdminPage().getApplicationName(),
                Pages.requirementsAdminPage().getRequirementName()));
    }

    @When("Click on the [Activity Logs] button of the newly created job on the [View Results] page")
    public void clickOnTheActivityLogsButtonOfTheNewlyCreatedJobOnTheViewResultsPage() {
        Pages.viewResultsPage().clickOnTheActivityLogsButtonOfTheNewlyCreatedJob();
    }

    @And("Get requirement name of {int} records on [Research Results] page")
    public void getRequirementNameOfRecordsOnResearchResultsPage(int index) {
        Pages.viewResultsPage().saveRequirementNameOfTheTableRecord(index-1);
    }

    @And("Get requirement data of {int} records on [Research Results] page")
    public void getRequirementDataOfRecordsOnResearchResultsPage(int index) {
        Pages.viewResultsPage().saveRequirementNameOfTheTableRecord(index-1);
        Pages.viewResultsPage().saveCompanyNameOfTheTableRecord(index-1);
    }

    @Then("Verify that records on the [View Results] page are sorted alphabetically backwards by {string} label")
    public void verifyThatRecordsOnTheViewResultsPageAreSortedAlphabeticallyBackwardsByLabel(String label) {
        Assert.assertTrue(Pages.viewResultsPage().verifyThatRecordsSortedDescendingByTheLabel(label));
    }

    @When("Enter {string} in the search field on the [View Results] page")
    public void enterInTheSearchFieldOnTheViewResultsPage(String text) {
        Pages.viewResultsPage().enterTextInTheSearchField(text);
    }

    @Then("No records are displayed on the [View Results] page")
    public void noRecordsAreDisplayedOnTheViewResultsPage() {
        Pages.viewResultsPage().isNoRecordsFoundMessageDisplayed();
    }

    @Then("Click on the [View] button of the {int} job on the [View Results] page")
    public void clickOnTheViewButtonOfTheJobOnTheViewResultsPage(int index) {
        Pages.viewResultsPage().clickOnTheViewButtonOfTheRecord(index);
    }

    @Then("The following labels are displayed on the [Research Results] page")
    public void theFollowingLabelsAreDisplayedOnTheResearchResultsPage(List<String> listOfLabels) {
        Assert.assertTrue(Pages.viewResultsPage().isTableLabelsPresentOnResearchResultsPage(listOfLabels));
    }

    @When("Get fixed labels coordinates on the [Research Results] page")
    public void getFixedLabelsCoordinatesOnTheResearchResultsPage() {
        Pages.viewResultsPage().saveFixedLabelsCoordinates();
    }

    @And("Scroll to {string} label on the [Research Results] page")
    public void scrollToLabelOnTheResearchResultsPage(String label) {
        Pages.viewResultsPage().scrollToLabel(label);
    }

    @Then("Verify that fixed labels coordinates didn't changed")
    public void verifyThatFixedLabelsCoordinatesDidntChanged() {
        Assert.assertTrue(Pages.viewResultsPage().isFixedLabelsCoordinatesNotChanged());
    }

    @Then("Click on the [Delete] button of the {int} job on the [View Results] page")
    public void clickOnTheDeleteButtonOfTheJobOnTheViewResultsPage(int index) {
        Pages.viewResultsPage().clickOnTheDeleteButtonOfTheRecord(index);
    }

    @Then("Verify that deleted result is not displayed in the [View Results] table")
    public void verifyThatDeletedResultIsNotDisplayedInTheViewResultsTable() {
        Assert.assertFalse(Pages.viewResultsPage().isResultPresentInTheList(Pages.viewResultsPage().getCompanyNameOfTheTableRecord(), Pages.viewResultsPage().getFacilityNameOfTheTableRecord()));
    }

    @And("Get the number of records of the result on [Research Results] page")
    public void getTheNumberOfRecordsOfTheResultOnResearchResultsPage() {
        Pages.viewResultsPage().getResearchResultsRecordsCount();
    }

    @When("Click on the [Activity Logs] button of the {int} job on the [View Results] page")
    public void clickOnTheActivityLogsButtonOfTheJobOnTheViewResultsPage(int index) {
        Pages.viewResultsPage().clickOnTheActivityLogsButtonOfTheRecord(index);
    }

    @And("Verify that the number of activity logs and the number of the records on the [Research Results] page is the same")
    public void verifyThatTheNumberOfActivityLogsAndTheNumberOfTheRecordsOnTheResearchResultsPageIsTheSame() {
        Assert.assertEquals(Pages.viewResultsPage().getRequirementsCount(), Pages.activityLogsPage().getActivityLogsRecordsCount());
    }

    @When("Click on the [Results] sidebar button on Lighthouse")
    public void clickOnTheResultsSidebarButtonOnLighthouse() {
        Pages.viewResultsPage().clickOnResultsSidebarButton();
    }

    @When("Select {string} client from the client dropdown on the [View Results] page")
    public void selectStringClientFromTheClientDropdownOnTheViewResultsPage(String client) {
        Pages.viewResultsPage().selectClient(client);
    }

    @Then("{int} record is displayed in the table on the [View Results] page")
    public void recordIsDisplayedInTheTableOnTheViewResultsPage(int numberOfRecords) {
        Assert.assertTrue(Pages.viewResultsPage().getNumberOfResults()==numberOfRecords);
    }
}
