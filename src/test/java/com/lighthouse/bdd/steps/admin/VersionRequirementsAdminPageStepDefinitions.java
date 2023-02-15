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

    @Then("Enter requirement name in the requirement search on the [Versioned Requirements] page")
    public void enterRequirementNameInTheRequirementSearchOnTheRequirementsViewPage() {
        Pages.versionRequirementsAdminPage().enterRequirementNameInTheSearchField(Pages.requirementsAdminPage().getRequirementName());
    }

    @Then("Click on the [Approve Requirement] button of the record by {int} index on the [Versioned Requirements] page")
    public void clickOnTheApproveRequirementButtonOfTheNewlyCreatedRecordOnTheVersionedRequirementsPage(int index) {
        Pages.versionRequirementsAdminPage().clickOnApproveRequirementButton(index-1);
    }

    @Then("Click on the [Activate Requirement] button of the record by {int} index on the [Versioned Requirements] page")
    public void clickOnTheActivateRequirementButtonOfTheRecordByIndexOnTheVersionedRequirementsPage(int index) {
        Pages.versionRequirementsAdminPage().clickOnActivateRequirementButton(index-1);
    }

    @When("Click on the [Versioned Requirements] sidebar button from admin")
    public void clickOnTheVersionedRequirementsSidebarButtonFromAdmin() {
        Pages.versionRequirementsAdminPage().clickOnVersionedRequirementSidebarButton();
    }

    @Then("Versioned Requirement page is opened")
    public void versionedRequirementPageIsOpened() {
        Pages.versionRequirementsAdminPage().isVersionedRequirementsAdminPageOpened();
    }

    @Then("Enter {string} requirement name in the requirement search on the [Versioned Requirements] page")
    public void enterRequirementNameInTheRequirementSearchOnTheVersionedRequirementsPage(String requirement) {
        Pages.versionRequirementsAdminPage().enterRequirementNameInTheSearchField(requirement);
    }

    @Then("No matching records message is displayed on the [Versioned Requirements] page")
    public void noMatchingRecordsMessageIsDisplayedOnTheVersionedRequirementsPage() {
        Pages.versionRequirementsAdminPage().isNoRecordsFoundMessageDisplayed();
    }

    @When("Enter {string} requirement JJ-CATEGORY-REQTYPE in the requirement search on the [Versioned Requirements] page")
    public void enterRequirementJJCATEGORYREQTYPEInTheRequirementSearchOnTheVersionedRequirementsPage(String reqtype) {
        Pages.versionRequirementsAdminPage().enterRequirementJJReqtypeInTheSearchField(reqtype);
    }

    @When("Enter {string} requirement SKU in the requirement search on the [Versioned Requirements] page")
    public void enterRequirementSKUInTheRequirementSearchOnTheVersionedRequirementsPage(String SKU) {
        Pages.versionRequirementsAdminPage().enterRequirementSkuInTheSearchField(SKU);
    }

    @When("Enter {string} requirement version in the requirement search on the [Versioned Requirements] page")
    public void enterRequirementVersionInTheRequirementSearchOnTheVersionedRequirementsPage(String version) {
        Pages.versionRequirementsAdminPage().enterRequirementVersionInTheSearchField(version);
    }

    @When("Enter {string} requirement query criteria in the requirement search on the [Versioned Requirements] page")
    public void enterRequirementQueryInTheRequirementSearchOnTheVersionedRequirementsPage(String query) {
        Pages.versionRequirementsAdminPage().enterRequirementQueryCriteriaInTheSearchField(query);
    }

    @When("Enter {string} requirement created in the requirement search on the [Versioned Requirements] page")
    public void enterRequirementCreatedInTheRequirementSearchOnTheVersionedRequirementsPage(String created) {
        Pages.versionRequirementsAdminPage().enterRequirementCreatedInTheSearchField(created);
    }

    @When("Enter {string} requirement approved in the requirement search on the [Versioned Requirements] page")
    public void enterRequirementApprovedInTheRequirementSearchOnTheVersionedRequirementsPage(String approved) {
        Pages.versionRequirementsAdminPage().enterRequirementApprovedInTheSearchField(approved);
    }

    @When("Enter {string} requirement activated in the requirement search on the [Versioned Requirements] page")
    public void enterRequirementActivatedInTheRequirementSearchOnTheVersionedRequirementsPage(String activated) {
        Pages.versionRequirementsAdminPage().enterRequirementActivatedInTheSearchField(activated);
    }

    @When("Enter {string} requirement status in the requirement search on the [Versioned Requirements] page")
    public void enterRequirementStatusInTheRequirementSearchOnTheVersionedRequirementsPage(String status) {
        Pages.versionRequirementsAdminPage().enterRequirementStatusInTheSearchField(status);
    }

    @When("Click on the [Edit Requirement] button of the {int} record on the [Versioned Requirements] page")
    public void clickOnTheEditRequirementButtonOfTheRecordOnTheVersionedRequirementsPage(int record) {
        Pages.versionRequirementsAdminPage().clickOnEditRequirementButton(record);
    }

    @And("Verify that newly created requirement contains {string} selector criteria")
    public void verifyThatNewlyCreatedRequirementContainsSelectorCriteria(String selectorCriteria) {
        Pages.versionRequirementsAdminPage().isSelectorCriteriaMatch(selectorCriteria);
    }
}
