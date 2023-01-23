package com.lighthouse.bdd.steps.admin;

import Pages.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class RequirementsAdminPageStepDefinitions {

    @Then("Click on the [Requirements View] page is opened")
    public void clickOnTheRequirementsViewPageIsOpened() {
        Pages.requirementsAdminPage().isRequirementsAdminPageOpened();
    }

    @And("Validate the [Requirements Viewer Filters] elements on the [Requirements View] page")
    public void validateTheRequirementsViewPageElements() {
        Assert.assertTrue(Pages.requirementsAdminPage().isProductionDataSelectable());
        Assert.assertTrue(Pages.requirementsAdminPage().isPreliminaryDataSelectable());
        Assert.assertTrue(Pages.requirementsAdminPage().isJurisdictionSelectSelectable());
        Assert.assertTrue(Pages.requirementsAdminPage().isRequirementCategorySelectSelectable());
        Assert.assertTrue(Pages.requirementsAdminPage().isRequirementTypeSelectSelectable());
        Assert.assertTrue(Pages.requirementsAdminPage().isRequirementNameSelectSelectable());
        Assert.assertTrue(Pages.requirementsAdminPage().isStatusSelectSelectable());
    }
    @And("Validate the [General Information] elements on the [Requirements View] page")
    public void validateTheGeneralInformationViewPageElements() {
        Assert.assertTrue(Pages.requirementsAdminPage().isRequirementNameInputWorking());
        Assert.assertTrue(Pages.requirementsAdminPage().isApplicationNameInputWorking());
        Assert.assertTrue(Pages.requirementsAdminPage().isGeneralInformationJurisdictionSelectDisplayed());
        Assert.assertTrue(Pages.requirementsAdminPage().isProcessingTimeInputWorking());
        Assert.assertTrue(Pages.requirementsAdminPage().isGeneralInformationDefinitionInputWorking());
        Assert.assertTrue(Pages.requirementsAdminPage().isRenewalTermInputWorking());
        Assert.assertTrue(Pages.requirementsAdminPage().isApplicationTypeSelectSelectable());
        Assert.assertTrue(Pages.requirementsAdminPage().isGeneralInformationNotesInputWorking());
        Assert.assertTrue(Pages.requirementsAdminPage().isGeneralInformationFormsInputWorking());
    }

    @And("Validate the [Required] elements on the [Requirements View] page")
    public void validateTheRequiredElementsOnTheRequirementsViewPage() {
        Assert.assertTrue(Pages.requirementsAdminPage().isRequiredBondYRadioButtonSelectable());
        Assert.assertTrue(Pages.requirementsAdminPage().isRequiredBondNRadioButtonSelectable());
        Assert.assertTrue(Pages.requirementsAdminPage().isStateRegisteredAgentYRadioButtonSelectable());
        Assert.assertTrue(Pages.requirementsAdminPage().isStateRegisteredAgentNRadioButtonSelectable());
        Assert.assertTrue(Pages.requirementsAdminPage().isStateForeignQualificationYRadioButtonSelectable());
        Assert.assertTrue(Pages.requirementsAdminPage().isStateForeignQualificationNRadioButtonSelectable());
        Assert.assertTrue(Pages.requirementsAdminPage().isApplicationFeeInputWorking());
        Assert.assertTrue(Pages.requirementsAdminPage().isAdditionalFeeInputWorking());
        Assert.assertTrue(Pages.requirementsAdminPage().isBondFeeInputWorking());
        Assert.assertTrue(Pages.requirementsAdminPage().isControlledSubstancesInputWorking());
        Assert.assertTrue(Pages.requirementsAdminPage().isRenewalInputWorking());
    }

    @Then("Select the [Production Data] radio button on [Requirement View] page")
    public void selectTheProductionDataRadioButtonOnRequirementViewPage() {
        Pages.requirementsAdminPage().selectProductionDataRadioButton();
    }


    @Then("The following labels are displayed in the [Requirements Viewer] table")
    public void theFollowingLabelsAreDisplayed(List<String> listOfLabels) {
        Assert.assertTrue(Pages.requirementsAdminPage().isTableLabelsPresent(listOfLabels));
    }

    @Then("The [Requirement Viewer] table is displayed")
    public void theRequirementViewerTableIsDisplayed() {
        Pages.requirementsAdminPage().isTableDisplayed();
    }

    @Then("Select the [Preliminary Data] radio button on [Requirement View] page")
    public void selectThePreliminaryDataRadioButtonOnRequirementViewPage() {
        Pages.requirementsAdminPage().selectPreliminaryDataRadioButton();
    }

    @When("Right click on {int} record in the [Requirement Viewer] table")
    public void rightClickOnRecordInTheRequirementViewerTable(int index) {
        Pages.requirementsAdminPage().rightClickOnTableRecord(index);
    }

    @Then("Click on the [View Requirement] button on the [Requirement View] page")
    public void clickOnTheViewRequirementButtonOnTheRequirementViewPage() {
        Pages.requirementsAdminPage().clickOnViewButtonOfTheContextMenu();
    }

    @When("Right click on a record with status {string} in the [Requirement Viewer] table")
    public void rightClickOnARecordWithStatusInTheRequirementViewerTable(String status) {
        Pages.requirementsAdminPage().rightClickOnTableRecordWithStatus(status);
    }

    @Then("The [Edit Requirement] button is not visible")
    public void theViewRequirementButtonIsNotVisible() {
        Assert.assertFalse(Pages.requirementsAdminPage().isEditButtonFromContextMenuVisible());
    }

    @Then("Click on the [Edit Requirement] button on the [Requirement View] page")
    public void clickOnTheEditRequirementButtonOnTheRequirementViewPage() {
        Pages.requirementsAdminPage().clickOnEditButtonOfTheContextMenu();
    }

    @When("Click on the [Attachments] collapse on the [Requirements View] page")
    public void clickOnTheAttachmentsCollapseOnTheRequirementsViewPage() {
        Pages.requirementsAdminPage().clickOnAttachmentCollapseButton();
    }

    @When("Click on the [Prerequisites] collapse on the [Requirements View] page")
    public void clickOnThePrerequisitesCollapseOnTheRequirementsViewPage() {
        Pages.requirementsAdminPage().clickOnPrerequisitesCollapseButton();
    }

    @When("Click on the [Product Line] collapse on the [Requirements View] page")
    public void clickOnTheProductLineCollapseOnTheRequirementsViewPage() {
        Pages.requirementsAdminPage().clickOnProductLineCollapseButton();
    }

    @When("Click on the [Business Model] collapse on the [Requirements View] page")
    public void clickOnTheBusinessModelCollapseOnTheRequirementsViewPage() {
        Pages.requirementsAdminPage().clickOnBusinessModelCollapseButton();
    }

    @When("Click on the [Question Selection] collapse on the [Requirements View] page")
    public void clickOnTheQuestionSelectionCollapseOnTheRequirementsViewPage() {
        Pages.requirementsAdminPage().clickOnQuestionSelectionCollapseButton();
    }

    @When("Click on the [Required] collapse on the [Requirements View] page")
    public void clickOnTheRequiredCollapseOnTheRequirementsViewPage() {
        Pages.requirementsAdminPage().clickOnRequirementCollapseButton();
    }

    @Then("Validate the [Attachments] checkboxes on the [Requirements View] page")
    public void validateTheAttachmentsCheckboxesOnTheRequirementsViewPage() {
        Assert.assertTrue(Pages.requirementsAdminPage().areAttachmentsCheckboxesClickable());
    }

    @Then("Validate the [Prerequisites] checkboxes on the [Requirements View] page")
    public void validateThePrerequisitesCheckboxesOnTheRequirementsViewPage() {
        Assert.assertTrue(Pages.requirementsAdminPage().arePrerequisitesCheckboxesClickable());
    }


    @Then("Validate the [Product Line] checkboxes on the [Requirements View] page")
    public void validateTheProductLineCheckboxesOnTheRequirementsViewPage() {
        Assert.assertTrue(Pages.requirementsAdminPage().areProductLinesCheckboxesClickable());
    }

    @Then("Validate the [Business Model] checkboxes on the [Requirements View] page")
    public void validateTheBusinessModelCheckboxesOnTheRequirementsViewPage() {
        Assert.assertTrue(Pages.requirementsAdminPage().areBusinessModelCheckboxesClickable());
    }

    @Then("Validate the [Question Selection] checkboxes on the [Requirements View] page")
    public void validateTheQuestionSelectionCheckboxesOnTheRequirementsViewPage() {
        Assert.assertTrue(Pages.requirementsAdminPage().areQuestionSelectionCheckboxesClickable());
    }

    @And("Validate the [Selector Criteria] selects on the [Requirements View] page")
    public void validateTheSelectorCriteriaSelectsOnTheRequirementsViewPage() {
        Assert.assertTrue(Pages.requirementsAdminPage().areSelectorCriteriaSelectsClickable());
    }

    @And("Validate the Change Note for Customer] input on the [Requirements View] page")
    public void validateTheChangeNoteForCustomerInputOnTheRequirementsViewPage() {
        Assert.assertTrue(Pages.requirementsAdminPage().isChangeNoteForCustomerWorking());
    }
}
