package com.lighthouse.bdd.steps.admin;

import Pages.Pages;
import Utils.SelenideTools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;

import java.util.List;

public class RequirementsAdminPageStepDefinitions {

    @Then("The [Requirements View] page is opened")
    public void isRequirementsAdminPageOpened() {
        Assert.assertTrue(Pages.requirementsAdminPage().isRequirementsAdminPageOpened());
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
        Pages.requirementsAdminPage().getTableRecordDataWithStatus(status);
    }

    @Then("The [Edit Requirement] button is not visible")
    public void theViewRequirementButtonIsNotVisible() {
        Assert.assertFalse(Pages.requirementsAdminPage().isEditButtonFromContextMenuVisible());
    }

    @Then("The [Delete Requirement] button is not visible")
    public void theDeleteRequirementButtonIsNotVisible() {
        Assert.assertFalse(Pages.requirementsAdminPage().isDeleteButtonFromContextMenuVisible());
    }

    @Then("Click on the [Edit Requirement] button on the [Requirement View] page")
    public void clickOnTheEditRequirementButtonOnTheRequirementViewPage() {
        Pages.requirementsAdminPage().clickOnEditButtonOfTheContextMenu();
    }

    @Then("Click on the [Delete Requirement] button on the [Requirement View] page")
    public void clickOnTheDeleteRequirementButtonOnTheRequirementViewPage() {
        Pages.requirementsAdminPage().clickOnDeleteButtonOfTheContextMenu();
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

    @And("Validate the [Change Note for Customer] input on the [Requirements View] page")
    public void validateTheChangeNoteForCustomerInputOnTheRequirementsViewPage() {
        Assert.assertTrue(Pages.requirementsAdminPage().isChangeNoteForCustomerWorking());
    }

    @When("Select {string} Requirement Category in the [Add New Requirement] section")
    public void selectRequirementCategoryInTheAddNewRequirementSection(String rCategory) {
        Pages.requirementsAdminPage().selectNewRequirementCategory(rCategory);
    }

    @And("Select {string} Requirement Type in the [Add New Requirement] section")
    public void selectRequirementTypeInTheAddNewRequirementSection(String rType) {
        Pages.requirementsAdminPage().selectNewRequirementType(rType);
    }

    @And("Click the [Create New] button in the [Add New Requirement] section")
    public void clickTheCreateNewButtonInTheAddNewRequirementSection() {
        Pages.requirementsAdminPage().clickCreateNewRequirementButton();
    }

    @When("Enter random requirement name on the [Requirements View] page")
    public void enterRandomRequirementNameOnTheRequirementsViewPage() {
        Pages.requirementsAdminPage().enterRequirementName(RandomStringUtils.random(10, true, false));
    }
    @When("Enter {string} requirement name on the [Requirements View] page")
    public void enterRequirementNameOnTheRequirementsViewPage(String name) {
        Pages.requirementsAdminPage().enterRequirementName(name);
    }

    @And("Enter random application name on the [Requirements View] page")
    public void enterRandomApplicationNameOnTheRequirementsViewPage() {
        Pages.requirementsAdminPage().enterApplicationName(RandomStringUtils.random(10, true, false));
    }

    @And("Enter {string} application name on the [Requirements View] page")
    public void enterApplicationNameOnTheRequirementsViewPage(String name) {
        Pages.requirementsAdminPage().enterApplicationName(name);
    }

    @And("Select In-State radio button for the state {string} of the RES1 question on the [Requirement View] page")
    public void selectInStateRadioButtonForTheStateOfTheRESQuestionOnTheRequirementViewPage(String state) {
        Pages.requirementsAdminPage().checkRES1Question();
        Pages.requirementsAdminPage().selectRES1State(state);
        Pages.requirementsAdminPage().checkRESInStateCheckbox();
    }

    @And("Select Out-Of-State radio button for the state {string} of the RES1 question on the [Requirement View] page")
    public void selectOutOfStateRadioButtonForTheStateOfTheRESQuestionOnTheRequirementViewPage(String state) {
        Pages.requirementsAdminPage().checkRES1Question();
        Pages.requirementsAdminPage().selectRES1State(state);
        Pages.requirementsAdminPage().checkRESOutOfStateCheckbox();
    }

    @And("Check {int} question in the [Question Selection] section on the [Requirements View] page")
    public void checkQuestionInTheQuestionSelectionSectionOnTheRequirementsViewPage(int index) {
        Pages.requirementsAdminPage().checkQuestion(index);
    }

    @And("Select {string} jurisdiction in the [General Information] section on the [Requirements View] page")
    public void selectStateInTheGeneralInformationSectionOnTheRequirementsViewPage(String state) {
        Pages.requirementsAdminPage().selectJurisdiction(state);
    }

    @And("Delete last question from the [Selector Criteria]")
    public void deleteLastQuestionFromTheSelectorCriteria() {
        Pages.requirementsAdminPage().deleteLastQuestion();
    }

    @Then("Click on the [Submit for Approval] button on the [Requirements View] page")
    public void clickOnTheSubmitForApprovalButtonOnTheRequirementsViewPage() {
        SelenideTools.sleep(2);
        Pages.requirementsAdminPage().clickSubmitForApprovalButton();
        SelenideTools.sleep(8);
    }

    @Then("Click on the [Save] button on the [Requirements View] page")
    public void clickOnTheSaveButtonOnTheRequirementsViewPage() {
        Pages.requirementsAdminPage().clickSaveButton();
        SelenideTools.sleep(8);
    }

    @And("Click on the [Yes Approve] button on the [Requirements View] page")
    public void clickOnTheYesApproveButtonOnTheRequirementsViewPage() {
        Pages.requirementsAdminPage().clickYesApproveButton();
        SelenideTools.sleep(10);
    }

    @When("Click on the [Intelligence Admin] sidebar collapse button on Lighthouse")
    public void clickOnTheIntelligenceAdminSidebarCollapseButtonOnLighthouse() {
        Pages.requirementsAdminPage().clickOnIntelligenceAdminSidebarCollapseButton();
    }

    @And("Select the last select option of the {int} select in the [Selector Criteria] section")
    public void selectTheLastSelectOptionOfTheSelectInTheSelectorCriteriaSection(int index) {
        Pages.requirementsAdminPage().selectTheLastSelectorCriteria(index);
    }

    @Then("Get requirement name from the [Edit Requirement] name")
    public void getRequirementNameFromTheEditRequirementName() {
        SelenideTools.sleep(6);
        Pages.requirementsAdminPage().getRequirementNameFromEditRequirement();
    }


    @And("Create a complex selector criteria")
    public void createAComplexSelectorCriteria() {
        SelenideTools.sleep(1);

        Pages.requirementsAdminPage().checkQuestion(3);
        Pages.requirementsAdminPage().checkQuestion(4);
        Pages.requirementsAdminPage().checkQuestion(5);
        Pages.requirementsAdminPage().checkQuestion(6);
        Pages.requirementsAdminPage().checkQuestion(7);
        Pages.requirementsAdminPage().checkQuestion(8);
        Pages.requirementsAdminPage().checkQuestion(9);
        Pages.requirementsAdminPage().checkQuestion(10);
        Pages.requirementsAdminPage().checkQuestion(44);
        Pages.requirementsAdminPage().checkQuestion(49);
        Pages.requirementsAdminPage().checkQuestion(62);

        Pages.requirementsAdminPage().deleteQuestion(0);
        Pages.requirementsAdminPage().deleteQuestion(0);

        Pages.requirementsAdminPage().addGroup(0);
        Pages.requirementsAdminPage().addGroup(0);
        Pages.requirementsAdminPage().addGroup(0);
        Pages.requirementsAdminPage().addGroup(0);
        Pages.requirementsAdminPage().selectOrRule(0);
        Pages.requirementsAdminPage().selectAndRule(1);
        Pages.requirementsAdminPage().selectAndRule(2);
        Pages.requirementsAdminPage().selectAndRule(3);
        Pages.requirementsAdminPage().selectAndRule(4);

        Pages.requirementsAdminPage().addRule(1);
        Pages.requirementsAdminPage().addRule(1);
        Pages.requirementsAdminPage().addRule(1);
        Pages.requirementsAdminPage().addRule(1);

        Pages.requirementsAdminPage().addRule(2);
        Pages.requirementsAdminPage().addRule(2);
        Pages.requirementsAdminPage().addRule(2);
        Pages.requirementsAdminPage().addRule(2);
        Pages.requirementsAdminPage().addRule(2);

        Pages.requirementsAdminPage().addRule(3);
        Pages.requirementsAdminPage().addRule(3);
        Pages.requirementsAdminPage().addRule(3);
        Pages.requirementsAdminPage().addRule(3);
        Pages.requirementsAdminPage().addRule(3);

        Pages.requirementsAdminPage().addRule(4);
        Pages.requirementsAdminPage().addRule(4);
        Pages.requirementsAdminPage().addRule(4);
        Pages.requirementsAdminPage().addRule(4);
        Pages.requirementsAdminPage().addRule(4);

        Pages.requirementsAdminPage().selectQuestionAndAnswer(1, 0, "Yes");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(2, 1, "Yes");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(3, 3, "Yes");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(4, 10, "No");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(5, 8, "No");

        Pages.requirementsAdminPage().selectQuestionAndAnswer(6, 0, "No");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(7, 3, "Yes");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(8, 4, "Yes");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(9, 8, "No");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(10, 10, "No");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(11, 7, "Yes");

        Pages.requirementsAdminPage().selectQuestionAndAnswer(12, 0, "Yes");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(13, 4, "Yes");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(14, 5, "No");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(15, 6, "No");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(16, 10, "No");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(17, 8, "No");

        Pages.requirementsAdminPage().selectQuestionAndAnswer(18, 0, "Yes");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(19, 3, "Yes");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(20, 2, "Yes");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(22, 10, "No");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(23, 1, "No");
    }

    @When("Check the [RES1: Apply Resident State Selector Criteria] checkbox")
    public void checkTheRESApplyResidentStateSelectorCriteriaCheckbox() {
        if(!Pages.requirementsAdminPage().isRES1Checked())
            Pages.requirementsAdminPage().checkRES1Checkbox();
    }

    @Then("The resident state select and resident type radio buttons are displayed")
    public void theResidentStateSelectAndResidentTypeRadioButtonsAreDisplayed() {
        Assert.assertTrue(Pages.requirementsAdminPage().isRES1StateSelectVisible());
        Assert.assertTrue(Pages.requirementsAdminPage().areRES1ResidentTypeRadioButtonsVisible());
    }

    @When("Uncheck the [RES1: Apply Resident State Selector Criteria] checkbox")
    public void uncheckTheRESApplyResidentStateSelectorCriteriaCheckbox() {
        if(Pages.requirementsAdminPage().isRES1Checked())
            Pages.requirementsAdminPage().checkRES1Checkbox();
    }

    @Then("The resident state select and resident type radio buttons are not displayed")
    public void theResidentStateSelectAndResidentTypeRadioButtonsAreNotDisplayed() {
        Assert.assertFalse(Pages.requirementsAdminPage().isRES1StateSelectVisible());
        Assert.assertFalse(Pages.requirementsAdminPage().areRES1ResidentTypeRadioButtonsVisible());
    }

    @When("Select saved requirement's jurisdiction in the [Requirement Viewer Filters] section on the [Requirements Admin] page")
    public void selectSavedRequirementSJurisdictionInTheRequirementViewerFiltersSectionOnTheRequirementsAdminPage() {
        Pages.requirementsAdminPage().selectRequirementFilterJurisdiction(Pages.requirementsAdminPage().getState());
        SelenideTools.sleep(4);
    }

    @When("Select {string} jurisdiction in the [Requirement Viewer Filters] section on the [Requirements Admin] page")
    public void selectJurisdictionInTheRequirementViewerFiltersSectionOnTheRequirementsAdminPage(String jurisdiction) {
        Pages.requirementsAdminPage().selectRequirementFilterJurisdiction(jurisdiction);
        SelenideTools.sleep(4);
    }

    @And("Verify that deleted requirement is not displayed in the [Requirement Viewer] table")
    public void verifyThatDeletedRequirementIsNotDisplayedInTheRequirementViewerTable() {
        Assert.assertFalse(Pages.requirementsAdminPage().isRecordDisplayed(Pages.requirementsAdminPage().getState(), Pages.requirementsAdminPage().getRequirementName(), Pages.requirementsAdminPage().getApplicationName()));
    }

    @And("Verify that newly created requirement is displayed in the [Requirement Viewer] table")
    public void verifyThatNewlyCreatedRequirementIsDisplayedInTheRequirementViewerTable() {
        Assert.assertTrue(Pages.requirementsAdminPage().isRecordDisplayed(Pages.requirementsAdminPage().getState(), Pages.requirementsAdminPage().getApplicationName(), Pages.requirementsAdminPage().getRequirementName()));

    }

    @When("Select {string} status in the [Requirement Viewer Filters] section on the [Requirements Admin] page")
    public void selectStatusInTheRequirementViewerFiltersSectionOnTheRequirementsAdminPage(String status) {
        Pages.requirementsAdminPage().selectRequirementsViewerFiltersStatus(status);
    }

    @And("Verify that all 53 states are selectable in the Requirements Viewer Filters Jurisdiction select on the [Requirements View] page")
    public void verifyThatAllStatesAreSelectableInTheRequirementsViewerFiltersJurisdictionSelectOnTheRequirementsViewPage() {
        Assert.assertTrue(Pages.requirementsAdminPage().areAllStatesSelectableInTheRequirementsViewerFiltersJurisdictionSelect());
    }

    @Then("Verify that all 53 states are selectable in the General Information Jurisdiction select on the [Requirements View] page")
    public void verifyThatAllStatesAreSelectableInTheGeneralInformationJurisdictionSelectOnTheRequirementsViewPage() {
        Assert.assertTrue(Pages.requirementsAdminPage().areAllStatesSelectableInTheGeneralInformationJurisdictionSelect());

    }

    @And("Select {string} requirement name in the Requirements Viewer Filters on the [Requirement View] page")
    public void selectRequirementNameInTheRequirementsViewerFiltersOnTheRequirementViewPage(String text) {
        Pages.requirementsAdminPage().selectRequirementName(text);
        SelenideTools.sleep(6);
    }

    @Then("The records with {string} requirement name is displayed in the table on the [Requirement View] page")
    public void theRecordWithRequirementNameIsDisplayedInTheTableOnTheRequirementViewPage(String requirementName) {
        Assert.assertTrue(Pages.requirementsAdminPage().isTableRecordWithRequirementNameDisplayed(requirementName));
    }

    @Then("The records with {string} jurisdiction is displayed in the table on the [Requirement View] page")
    public void theRecordsWithJurisdictionIsDisplayedInTheTableOnTheRequirementViewPage(String jurisdiction) {
        Assert.assertTrue(Pages.requirementsAdminPage().isTableRecordWithJurisdictionDisplayed(jurisdiction));
    }

    @When("Save old requirement name on the [Requirements View] page")
    public void saveOldRequirementNameOnTheRequirementsViewPage() {
        Pages.requirementsAdminPage().saveOldRequirementsName();
    }

    @When("Validate the [Add New Requirement] elements on the [Requirements View] page")
    public void validateTheAddNewRequirementElementsOnTheRequirementsViewPage() {
        Assert.assertTrue(Pages.requirementsAdminPage().isRequirementCategorySelectable());
        Assert.assertTrue(Pages.requirementsAdminPage().isRequirementTypeSelectable());
        Assert.assertTrue(Pages.requirementsAdminPage().isCreateNewRequirementButtonClickable());
    }

    @Then("Newly created job with status {string} is displayed in the table on the [Requirements View] page")
    public void newlyCreatedJobWithStatusIsDisplayedInTheTableOnTheRequirementsViewPage(String status) {
        Assert.assertTrue(Pages.requirementsAdminPage().isRecordWithStatusDisplayed(Pages.requirementsAdminPage().getState(),
                Pages.requirementsAdminPage().getApplicationName(),
                Pages.requirementsAdminPage().getRequirementName(),
                status));
    }

    @Then("Verify the [View Edit Existing Requirement] elements on the [Requirements View] page")
    public void verifyTheViewEditExistingRequirementElementsOnTheRequirementsViewPage() {
        Assert.assertTrue(Pages.requirementsAdminPage().isEditJurisdictionSelectVisible());
        Assert.assertTrue(Pages.requirementsAdminPage().isEditRequirementTypeSelectVisible());
        Assert.assertTrue(Pages.requirementsAdminPage().isEditRequirementCategoryVisible());
        Assert.assertTrue(Pages.requirementsAdminPage().isEditRequirementNameSelectVisible());
    }

    @Then("Verify that {int} selector choice is {string} on the [Requirements View] page")
    public void verifyThatSelectorChoiceIs(int index, String orAnd) {
        System.out.println(Pages.requirementsAdminPage().getSelectorValue(index-1));
        Assert.assertEquals(Pages.requirementsAdminPage().getSelectorValue(index-1), orAnd);
    }

    @And("Verify that the Submit for Approval button is visible")
    public void verifyThatTheSubmitForApprovalButtonIsVisible() {
        Pages.requirementsAdminPage().isSubmitForApprovalButtonVisible();
    }

    @And("Create a complex selector criteria 2.0")
    public void createAComplexSelectorCriteria2() {
        SelenideTools.sleep(1);

        Pages.requirementsAdminPage().checkQuestion(3);
        Pages.requirementsAdminPage().checkQuestion(5);
        Pages.requirementsAdminPage().checkQuestion(44);
        Pages.requirementsAdminPage().checkQuestion(48);
        Pages.requirementsAdminPage().checkQuestion(79);
        Pages.requirementsAdminPage().checkQuestion(80);
        Pages.requirementsAdminPage().checkQuestion(83);
        Pages.requirementsAdminPage().checkQuestion(85);

        Pages.requirementsAdminPage().selectAndRule(0);

        Pages.requirementsAdminPage().addRule(0);
        Pages.requirementsAdminPage().addRule(0);
        Pages.requirementsAdminPage().addRule(0);
        Pages.requirementsAdminPage().addRule(0);
        Pages.requirementsAdminPage().addRule(0);
        Pages.requirementsAdminPage().addRule(0);
        Pages.requirementsAdminPage().selectQuestionAndAnswer(1, 0, "Yes");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(2, 1, "Yes");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(3, 2, "Yes");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(4, 3, "Yes");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(5, 4, "Yes");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(6, 5, "Yes");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(7, 6, "Yes");
        Pages.requirementsAdminPage().selectQuestionAndAnswer(8, 7, "Yes");

    }

    @And("Click Jurisdiction dropdown and verify that {string} jurisdiction is displayed")
    public void clickJurisdictionDropdownAndVerifyThatJurisdictionIsDisplayed(String state) {
        Assert.assertTrue(Pages.requirementsAdminPage().isJurisdictionDisplayed(state));
    }
}