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

    @And("The entries are displayed on the [Versioned Requirements] page")
    public void entriesAreDisplayedOnTheVersionedRequirementsPage() {
        Assert.assertTrue(Pages.versionRequirementsAdminPage().getNumberOfRecords()>0);
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

    @Then("Verify that records on the [Versioned Requirements] page are sorted alphabetically backwards by {string} label")
    public void verifyThatRecordsOnTheVersionedRequirementsPageAreSortedAlphabeticallyBackwardsByLabel(String label) {
        Assert.assertTrue(Pages.versionRequirementsAdminPage().verifyThatRecordsSortedBackwardsByTheLabel(label));
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

    @Then("Enter requirement name in the search field on the [Versioned Requirements] page")
    public void enterRequirementNameInTheSearchFieldOnTheRequirementsViewPage() {
        Pages.versionRequirementsAdminPage().enterTextInTheSearchField(Pages.requirementsAdminPage().getRequirementName());
    }

    @Then("Enter requirement name from the [Research Notifications] page in the requirement search on the [Versioned Requirements] page")
    public void enterRequirementNameFromResearchNotificationsInTheRequirementSearchOnTheRequirementsViewPage() {
        Pages.versionRequirementsAdminPage().enterRequirementNameInTheSearchField(Pages.researchNotificationPage().getRequirementName());
    }

    @Then("Enter requirement SKU from the [Research Notifications] page in the SKU search on the [Versioned Requirements] page")
    public void enterRequirementSKUFromResearchNotificationsInTheRequirementSearchOnTheRequirementsViewPage() {
        Pages.versionRequirementsAdminPage().enterRequirementSkuInTheSearchField(Pages.researchNotificationPage().getSKU());
    }

    @Then("Click on the [Approve Requirement] button of the record by {int} index on the [Versioned Requirements] page")
    public void clickOnTheApproveRequirementButtonOfTheNewlyCreatedRecordOnTheVersionedRequirementsPage(int index) {
        Pages.versionRequirementsAdminPage().clickOnApproveRequirementButton(index-1);
    }

    @Then("Click on the [Delete Requirement] button of the record by {int} index on the [Versioned Requirements] page")
    public void clickOnTheDeleteRequirementButtonOfTheNewlyCreatedRecordOnTheVersionedRequirementsPage(int index) {
        Pages.versionRequirementsAdminPage().clickOnDeleteRequirementButton(index-1);
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
        Assert.assertTrue(Pages.versionRequirementsAdminPage().isSelectorCriteriaMatch(selectorCriteria));
    }

    @When("Click on the [Delete Requirement] button of record with status {string} on the [Versioned Requirements] page")
    public void clickOnTheDeleteRequirementButtonOfRecordWithStatusOnTheVersionedRequirementsPage(String status) {
        Pages.versionRequirementsAdminPage().clickOnDeleteRequirementButton(status);
    }

    @When("Enter SKU of the requirement in the search field on the [Versioned Requirements] page")
    public void enterSKUOfTheRequirementInTheSearchFieldOnTheVersionedRequirementsPage() {
        Pages.versionRequirementsAdminPage().enterTextInTheSearchField(Pages.versionRequirementsAdminPage().getRequirementSku());
    }

    @When("Click on the [Edit Requirement] button of record with status {string} on the [Versioned Requirements] page")
    public void clickOnTheEditRequirementButtonOfRecordWithStatusOnTheVersionedRequirementsPage(String status) {
        Pages.versionRequirementsAdminPage().clickOnEditRequirementButton(status);
    }

    @And("Verify the status and button of the {int} requirement with status [Approved]")
    public void verifyTheStatusAndButtonOfTheRequirementWithStatusApproved(int index) {
        Assert.assertTrue(Pages.versionRequirementsAdminPage().getRequirementStatus(index-1).equals("Approved"));
        Assert.assertTrue(Pages.versionRequirementsAdminPage().isRequirementViewButtonClickable(index-1));
        Assert.assertTrue(Pages.versionRequirementsAdminPage().isRequirementDeleteButtonClickable(index-1));
        Assert.assertTrue(Pages.versionRequirementsAdminPage().isRequirementActivateButtonClickable(index-1));

    }

    @And("Verify the status and button of the {int} requirement with status [Activated]")
    public void verifyTheStatusAndButtonOfTheRequirementWithStatusActivated(int index) {
        Assert.assertTrue(Pages.versionRequirementsAdminPage().getRequirementStatus(index-1).equals("Activated"));
        Assert.assertTrue(Pages.versionRequirementsAdminPage().isRequirementViewButtonClickable(index-1));
        Assert.assertTrue(Pages.versionRequirementsAdminPage().isRequirementEditButtonClickable(index-1));

    }

    @And("Verify the status and button of the {int} requirement with status [Approval Pending]")
    public void verifyTheStatusAndButtonOfTheRequirementWithStatusApprovalPending(int index) {
        Assert.assertTrue(Pages.versionRequirementsAdminPage().getRequirementStatus(index-1).equals("Approval Pending"));
        Assert.assertTrue(Pages.versionRequirementsAdminPage().isRequirementViewButtonClickable(index-1));
        Assert.assertTrue(Pages.versionRequirementsAdminPage().isRequirementDeleteButtonClickable(index-1));
        Assert.assertTrue(Pages.versionRequirementsAdminPage().isRequirementApproveButtonClickable(index-1));

    }

    @When("Enter {string} note in the Change Note For Customer section on the [Versioned Requirements] page")
    public void enterNoteInTheChangeNoteForCustomerSectionOnTheVersionedRequirementsPage(String text) {
        Pages.versionRequirementsAdminPage().enterChangeNoteForCustomer(text);
    }

    @When("Enter random note in the Change Note For Customer section on the [Versioned Requirements] page")
    public void enterRandomNoteInTheChangeNoteForCustomerSectionOnTheVersionedRequirementsPage() {
        Pages.versionRequirementsAdminPage().enterChangeNoteForCustomer(RandomStringUtils.random(10, true, false));
    }

    @When("Get text from the search field on the [Versioned Requirements] page")
    public void getTextFromTheSearchFieldOnTheVersionedRequirementsPage() {
        Pages.versionRequirementsAdminPage().saveTextFromSearchField();
    }

    @Then("Verify that text in the search field is the same on the [Versioned Requirements] page")
    public void verifyThatTextInTheSearchFieldIsTheSameOnTheVersionedRequirementsPage() {
        Assert.assertEquals(Pages.versionRequirementsAdminPage().getTextFromSearchField(),(Pages.versionRequirementsAdminPage().getSearchFieldText()));
    }

    @And("Verify that record with the new requirement name is displayed on the [Versioned Requirements] page")
    public void verifyThatRecordWithTheNewRequirementNameIsDisplayedOnTheVersionedRequirementsPage() {
        Assert.assertTrue(Pages.versionRequirementsAdminPage().isRecordWithRequirementNameDisplayed(Pages.requirementsAdminPage().getRequirementName()));
    }

    @And("Verify that record with the old requirement name is not displayed on the [Versioned Requirements] page")
    public void verifyThatRecordWithTheOldRequirementNameIsNotDisplayedOnTheVersionedRequirementsPage() {
        Assert.assertFalse(Pages.versionRequirementsAdminPage().isRecordWithRequirementNameDisplayed(Pages.requirementsAdminPage().getOldRequirementName()));
    }

    @Then("Enter old requirement name in the requirement search on the [Versioned Requirements] page")
    public void enterOldRequirementNameInTheRequirementSearchOnTheVersionedRequirementsPage() {
        Pages.versionRequirementsAdminPage().enterRequirementNameInTheSearchField(Pages.requirementsAdminPage().getOldRequirementName());
    }

    @And("Verify that [Yes] requirements checks include radio button is not checked on the [View Requirement] button")
    public void verifyThatYesRequirementsChecksIncludeRadioButtonIsNotCheckedOnTheViewRequirementButton() {
        Assert.assertFalse(Pages.versionRequirementsAdminPage().isIncludeRadioButtonChecked());
    }

    @And("Verify that [Yes] requirements checks include radio button is checked on the [View Requirement] button")
    public void verifyThatYesRequirementsChecksIncludeRadioButtonIsCheckedOnTheViewRequirementButton() {
        Assert.assertTrue(Pages.versionRequirementsAdminPage().isIncludeRadioButtonChecked());
    }

    @When("Click on the [View Requirement] button of the {int} record on the [Versioned Requirements] page")
    public void clickOnTheViewRequirementButtonOfTheRecordOnTheVersionedRequirementsPage(int index) {
        Pages.versionRequirementsAdminPage().clickOnViewRequirementButton(index-1);
    }

    @And("Enter requirement name saved from the [Edit Requirement] page on the [Versioned Requirements] page")
    public void enterRequirementNameSavedFromTheEditRequirementPageOnTheVersionedRequirementsPage() {
        Pages.versionRequirementsAdminPage().enterTextInTheSearchField(Pages.requirementsAdminPage().getRequirementName());
    }

    @And("Get SKU of the {int} record on the [Versioned Requirements] page")
    public void getSKUOfTheRecordOnTheVersionedRequirementsPage(int index) {
        Pages.versionRequirementsAdminPage().saveRequirementSku(index-1);
    }

//    @And("Verify that the [Activate Requirement] view option is enabled")
//    public void verifyThatTheActivateRequirementViewOptionIsEnabled() {
//        Assert.assertTrue(Pages.versionRequirementsAdminPage().isRequirementActivateButtonVisible());
//    }

//    @And("Verify [Delete Requirement] option is enabled")
//    public void verifyDeleteRequirementOptionIsEnabled() {
//        Assert.assertTrue(Pages.versionRequirementsAdminPage().isRequirementDeleteButtonVisible());
//
//    }

//    @And("Verify that the [Edit Requirement] option is enabled")
//    public void verifyThatTheEditRequirementOptionIsEnabled() {
//        Assert.assertTrue(Pages.versionRequirementsAdminPage().isRequirementEditButtonVisible());
//
//    }

//    @And("Verify that the [View Requirement] option is enabled")
//    public void verifyThatTheViewRequirementOptionIsEnabled() {
//        Assert.assertTrue(Pages.versionRequirementsAdminPage().isRequirementViewButtonVisible());
//
//    }

//    @And("Verify that the [Approve Requirement] option is enabled")
//    public void verifyThatTheApproveRequirementOptionIsEnabled() {
//        Assert.assertTrue(Pages.versionRequirementsAdminPage().isRequirementApproveButtonVisible());
//    }
}
