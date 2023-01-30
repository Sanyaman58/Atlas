package com.lighthouse.bdd.steps.admin;

import Pages.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;

import java.util.List;

public class VersionRequirementsAdminPageStepDefinitions {

    @Then("Select {string} entries to be displayed in the [Show Entries] select on the [Versioned Requirements] page")
    public void selectEntriesToBeDisplayed(String entries) {
        Pages.versionRequirementsAdminPage().selectNumberOfEntriesToBeDisplayed(entries);

    }

    @And("{int} entries are displayed on the [View Results] page on the [Versioned Requirements] page")
    public void entriesAreDisplayedOnTheViewResultsPageOnTheVersionedRequirementsPage(int entries) {
        Assert.assertEquals(entries, Pages.versionRequirementsAdminPage().getNumberOfRecords());
    }

    @Then("The following labels are displayed in the [Versioned Requirements] table")
    public void theFollowingLabelsAreDisplayedInTheVersionedRequirementsTable(List<String> listOfLabels) {
        Assert.assertTrue(Pages.versionRequirementsAdminPage().isTableLabelsPresent(listOfLabels));
    }

    @When("Click on the {string} label on the [Versioned Requirements] page")
    public void clickOnTheLabelOnTheVersionedRequirementsPage(String label) {
        Pages.versionRequirementsAdminPage().clickOnTheLabel(label);
    }

    @Then("Verify that records on the [Versioned Requirements] page are sorted alphabetically by {string} label")
    public void verifyThatRecordsOnTheVersionedRequirementsPageAreSortedAlphabeticallyByLabel(String label) {
        Assert.assertTrue(Pages.versionRequirementsAdminPage().verifyThatRecordsSortedByTheLabel(label));
    }

    @When("Enter {string} in the search field on the [Versioned Requirements] page")
    public void enterInTheSearchFieldOnTheVersionedRequirementsPage(String searchLine) {
        Pages.versionRequirementsAdminPage().enterTextInTheSearchField(searchLine);
    }

    @Then("No records are displayed on the [Versioned Requirements] page")
    public void noRecordsAreDisplayedOnTheVersionedRequirementsPage() {
        Assert.assertTrue(Pages.versionRequirementsAdminPage().isNoRecordsFoundMessageDisplayed());
    }

    @When("Click on the [View Requirement] button of record with status {string} on the [Versioned Requirements] page")
    public void clickOnTheViewRequirementButtonOfRecordWithStatusOnTheVersionedRequirementsPage(String status) {
        Pages.versionRequirementsAdminPage().clickOnViewRequirementButton(status);
    }

    @Then("Click on the [Edit Requirement] button of the same record on the [Versioned Requirements] page")
    public void clickOnTheEditRequirementButtonOfTheSameRecordOnTheVersionedRequirementsPage() {
        Pages.versionRequirementsAdminPage().clickOnEditButtonOfTheEarlyOpenedRequirement();
    }
}
