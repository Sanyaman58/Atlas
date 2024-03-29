package com.lighthouse.bdd.steps;

import Pages.Pages;
import Utils.SelenideTools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class ManagementAdminPageStepDefinitions {

	@When("Click on the [Client Master] sidebar button")
	public void clickOnTheClientMasterSidebarButton() {
		Pages.atlasDashboardManagementPage().clickManagementAdminSidebarCollapseButton();
		SelenideTools.sleep(2);
		Pages.clientMasterPage().clickClientMasterSidebarButton();
		SelenideTools.sleep(10);
		SelenideTools.switchToLastTab();
	}

	@Then("The [Client Master] page is opened")
	public void clientMasterPageIsOpened() {
		Assert.assertTrue(Pages.clientMasterPage().isClientMasterPageOpened());
	}

	@Then("Click [Add Client] button")
	public void clickAddClinetButton() {
		Pages.clientMasterPage().clickSubmitNewJobButton();
	}

	@Then("add client popup wondow is opened")
	public void addClientPopIsOpened() {
		Assert.assertTrue(Pages.clientMasterPage().isClientMasterPageOpened());
	}

	@Then("verify the following fileds are displayed on the client master page")
	public void theFollowingAddClientLabelsAreDisplayed(List<String> listOfLabels) {
		Pages.clientMasterPage().isAddClientTableLabelsPresent(listOfLabels);
	}

	@And("Check or uncheck the jurisdiction checkbox on [End Up in States]")
	public void checkOrUncheckJurisdictionCheckbox() {
		Pages.clientMasterPage().chekcUncheckEuiCheckbox();
	}

	@Then("Click on EUI save button")
	public void clickEuiSaveButton() {
		Pages.clientMasterPage().jurisdictionEuiSaveButton();
	}

	@And("Approve and Activate the newly created EUI version")
	public void approveAndActivateEuiVersion() {
		Pages.clientMasterPage().approveActivateEUIVersion();
	}

	@And("Verify all the Jurisdictions are displayed in [Jurisidction] dropdown")
	public void verifyAllJurisdictionOnRequirementAdminPage() {
		Pages.clientMasterPage().jurisdictionsInJurisdictionDropdown();
	}

	@And("Select {int} value from [Requirement Category] dropdown")
	public void selectValueFronRequirementCategory(int index) {
		Pages.clientMasterPage().selectFromRequirementCategoryDropdown(index);
	}

	@And("Select {int} value from [Requirement Type] dropdown")
	public void selectValueFronRequirementType(int index) {
		Pages.clientMasterPage().selectFromRequirementCategoryType(index);
	}

	@And("Click on [Create New] button")
	public void clickCreateNewButton() {
		Pages.clientMasterPage().createNewButton();
	}

	@And("Click on [General information] Jurisdiction dropdown and verify the count")
	public void verifyAllJurisdictionOnGeneralInfoPage() {
		Pages.clientMasterPage().jurisdictionsInGeneralInfoPage();
	}

	@Then("Verify the Jurisdiction checkbox values and count")
	public void jurisdictionCheckboxVlaueAndCount() {
		Pages.clientMasterPage().getStateCheckboxesValuesAndCount();
	}

	@And("Click on [Surveillance Intelligence] dropdown button and verify options")
	public void clickSurveillanceIntelligenceDrodown() {
		Pages.clientMasterPage().clickSurveillanceDropdown();
	}

	@And("Click on [Results] dropdown button")
	public void clickResultsOption() {
		Pages.clientMasterPage().clickResulsDropdownButton();
		SelenideTools.sleep(10);
		SelenideTools.switchToLastTab();
	}

	@And("Click on [Activity Logs] option of the line item")
	public void clickActivityLogsOption() {
		Pages.clientMasterPage().clickActivityLogOfLineItem();
	}

	@And("Verify [Activity Logs] screen and default filter is set to [All]")
	public void verifyActivityLogScreenAndFilter() {
		Pages.clientMasterPage().verifyActivityLogScreen();
	}

	@When("Click on the [User Master] sidebar button")
	public void clickOnTheUserMasterSidebarButton() {
		Pages.atlasDashboardManagementPage().clickManagementAdminSidebarCollapseButton();
		SelenideTools.sleep(2);
		Pages.clientMasterPage().clickUserMasterSidebarButton();
		SelenideTools.sleep(10);
		SelenideTools.switchToLastTab();
	}

	@Then("The [User Master] page is opened")
	public void userMasterPageIsOpened() {
		Assert.assertTrue(Pages.clientMasterPage().isClientMasterPageOpened());
	}

	@Then("Click [Add User] button")
	public void clickAddUserButton() {
		Pages.clientMasterPage().clickAddUserButton();
		SelenideTools.sleep(5);
	}

	@Then("Add User popup window opened")
	public void addUserPopupWindowIsOpened() {
		Selenide.sleep(5);
		Assert.assertTrue(Pages.clientMasterPage().isAddUserPopupWindowOpened());
	}

	@Then("Verify [Category] roles in the [Category] dropdown")
	public void verifyCategoryRolesInDropdown(List<String> listOfLabels) {
		Pages.clientMasterPage().clickCategoryDropdown();
		Pages.clientMasterPage().isCategoryRolesPresentInDropdown(listOfLabels);
	}

	@Then("Select {string} from the category dropdown menu")
	public void selectCategoryFromDropdown(String category) {
		Pages.clientMasterPage().selectUserCategory(category);
		SelenideTools.sleep(4);
	}

	@Then("Verify [Roles-Compliance Intelligence] roles in dropdown")
	public void verifyRolesComplianceElementsInDropdown(List<String> listOfLabels) {
		Pages.clientMasterPage().clickRolesComplianceIntelligenceDropdown();
		Pages.clientMasterPage().isuserRoleCompliancePresentInDropdown(listOfLabels);
	}

	@Then("Verify [Roles-Compliance Intelligence] roles in dropdown are none")
	public void verifyNoRolesComplianceElementsInDropdown() {
		Pages.clientMasterPage().clickRolesComplianceIntelligenceDropdown();
		Pages.clientMasterPage().nouserRoleCompliancePresentInDropdown();
	}

	@And("Verify the [Surveillance Setup] section")
	public void verifySurveillanceSetupSection() {
		Pages.clientMasterPage().clientLabel();
		Pages.clientMasterPage().companyLabel();
		Pages.clientMasterPage().facilityLabel();
		Pages.clientMasterPage().helpToolTip();
	}

	@And("Validate the [Modify Existing Surveillance Configuration] table elements")
	public void verifyModifyExistingSurveillanceTableData(List<String> listOfLabels) {
		Pages.clientMasterPage().surveillancePageTableHeaders(listOfLabels);
	}

	@And("Verify radio button is enabled")
	public void verifyRadioButton() {
		Pages.clientMasterPage().radioButtonEnabled();
	}

	@And("Verify [Delete] button is clickable")
	public void verifyDeleteButton() {
		Pages.clientMasterPage().deleteButtonClickable();
	}

	@Then("Click surveillance setup [Next] button")
	public void clickSurveillanceSetupNextButton() {
		SelenideTools.sleep(10);
		Pages.clientMasterPage().clickNextButton();
	}

	@And("Verify the Validation popup")
	public void verifyNextButtonPopup() {
		Pages.clientMasterPage().nextButtonValidationPopup();
	}

	@And("Reload the browser")
	public void browserReload() {
		Pages.clientMasterPage().reloadBrowser();
		SelenideTools.sleep(5);
	}

	@And("Navigate back to surveillance page")
	public void selectJob() {
		Pages.clientMasterPage().selectJobOnSurveillancePage();
	}

	@And("Select radio button of existing job and click Next")
	public void selectRadioButton() {
		Pages.clientMasterPage().existingJobRadioButton();
	}

	@And("Validate that the checkbox is to the left of the Jurisdiction text")
	public void validateCheckboxPositions() {
		Pages.clientMasterPage().verifyJurisdictionCheckboxLeftPosition();
	}

	@And("Verify the left position of Jurisdiction checkbox on save and submit configuration page")
	public void leftPositionOnSaveSubmitPage() {
		Pages.clientMasterPage().verifyJurisdictionCheckboxLeftPositionOnSaveSubmitPage();
	}

	@Then("Verify labels on [Jurisdiction] page")
	public void verifyLabelsOnJurisdictionPage() {
		Pages.clientMasterPage().labelsOnJurisdictionPage();
	}

	@Then("Click on [Clear All] button")
	public void verifyClickOnClearAllButton() {
		Pages.clientMasterPage().clickClearAllButton();
	}

	@And("Verify all checkboxes are not selected")
	public void verifyUnSelectedCheckbox() {
		Pages.clientMasterPage().unselectedCheckbox();
	}

	@And("Verify child questions are unclickable as parent questions are not clicked")
	public void verifyChildQuestionUnclickable() {
		Pages.clientMasterPage().clickChildQuestion();
	}

	@And("The labels are displayed on the [Research Notification] table")
	public void verifyLabelsOnNotifictionPage(List<String> listOfLabels) {
		Pages.clientMasterPage().isresearchNotifictionsLabelsPresent(listOfLabels);
	}

	@And("Click on Label and Verify Data is sorted alphabetically")
	public void verifyAlphabeticalSortedData(List<SelenideElement> tableDataList) {
		Assert.assertTrue(Pages.clientMasterPage().isDataSortedAlphabetically(tableDataList));
	}

	@And("Again click on Label and Verify that Data is sorted backward")
	public void verifyAlphabeticalSortedBackward(List<SelenideElement> tableDataList) {
		Pages.clientMasterPage().isDataSortedAlphabeticallyBackward(tableDataList);
	}

	@And("Enter invalid data in Serach field and verify validation")
	public void enterInvalidDataInSearchField() {
		Pages.clientMasterPage().searchFieldValidation();
	}

	@And("Enter valid data in Search field and verify the data")
	public void entervalidDataInSearchField() {
		Pages.clientMasterPage().searchFieldDataValidation();
	}

	@When("Select {int} option Requirement category dropdown")
	public void selectRequirementCategoryFromDropdown(int index) {
		Pages.clientMasterPage().selectRequirementCataegory(index);
		SelenideTools.sleep(4);
	}

	@When("Select {int} option Requirement type from doropdown")
	public void selectRequirementTypeFromDropdown(int index) {
		Pages.clientMasterPage().selectRequirementType(index);
		SelenideTools.sleep(4);
	}

	@And("Click on Create New button")
	public void clickCreateNewRrequirement() {
		Pages.clientMasterPage().clickCreateNewButton();
	}

	@And("Fill the required details on Requirement view page")
	public void fillRequiredInfo() {
		Pages.clientMasterPage().fillInfoOnRequirementViewPage();
	}

	@And("Open Notification page")
	public void openNotifictions() {
		Pages.clientMasterPage().clickNotificationTab();
	}

	@And("Verify the newly created requirement on Notifications page")
	public void verifyRequirementViewData() {
		Pages.clientMasterPage().verifyNewlyCreatedRequirement();
	}

	@And("Search the newly created requirement on [Requirement View] page")
	public void verifyRequirementViewDataOnRequirementAdminPage() {
		Pages.clientMasterPage().verifyDataOnRequirementAdminPage();
	}

	@And("Click on [Intelligence Admin] dropdown button")
	public void verifyClickOnIntelligenceDropdown() {
		Pages.clientMasterPage().clickOnIntelligenceDropdown();
	}

	@And("Verify [Requirement View] option is displayed")
	public void verifyRequirementViewOption() {
		Pages.clientMasterPage().requirementViewDisplayed();
	}

	@And("Click on [Version Requirement] side bar button and verify page")
	public void verifyClickOnVersionedRequirement() {
		Pages.clientMasterPage().clickVersionedRequirementButtonAndVerifyPage();
	}

	@And("Verify that the [Activate Requirement] view option is enabled")
	public void verifyActivateButtonIsEnabled() {
		Pages.clientMasterPage().verifyActivateButton();
	}

	@And("Verify that the [Activate Requirement] view option is disabled")
	public void verifyActivateButtonIsDisabled() {
		Pages.clientMasterPage().verifyActivateButtonDisabled();
	}

	@And("Verify [Delete Requirement] option is enabled")
	public void verifyDeleteButtonIsEnabled() {
		Pages.clientMasterPage().verifyDeleteButton();
	}

	@And("Verify that the [View Requirement] option is enabled")
	public void verifyViewRequirementIsEnabled() {
		Pages.clientMasterPage().verifyViewRequirementButton();
	}

	@And("Click on [Version Requirements] dropdown option")
	public void clickVersionRequirement() {
		Pages.clientMasterPage().openVersionRequirementsPage();
	}

	@And("Verify that the [Edit Requirement] option is enabled")
	public void verifyEditRequirementOptionEnabled() {
		Pages.clientMasterPage().isEditRequirementOptionEnabled();
	}

	@And("Verify that [View Requirement] option is enabled")
	public void verifyViewRequirementOptionEnabled() {
		Pages.clientMasterPage().isViewRequirementOptionEnabled();
	}

	@And("Verify that the [Approve Requirement] option is enabled")
	public void verifyApproveRequirementOptionEnabled() {
		Pages.clientMasterPage().isApproveRequirementOptionEnabled();
	}

	@And("Verify that the [Approve Requirement] option is disabled")
	public void verifyApproveRequirementOptionDisabled() {
		Pages.clientMasterPage().isApproveRequirementOptionDisabled();
	}

	@And("Verify that the [Intelligence Permissions] from the side menu is enabled")
	public void verifyIntelligencePermissionsAreEnabled() {
		Pages.clientMasterPage().isIntelligencePermissionsEnabled();
	}

	@And("Verify [Delete Facility] button is enabled on [Configuration] page")
	public void verifyDeleteFacilityButtonIsEnabled() {
		Pages.clientMasterPage().isDeleteFacilityButtonEnabled();
	}

	@And("Verify [View Result] and [Delete Result] button is enabled")
	public void verifyViewAndDeleteResultButtonIsEnabled() {
		Pages.clientMasterPage().isViewAndDeleteButtonEnabled();
	}

	@And("Verify the names of the questions on questionnaire page")
	public void verifyNamesOnQuestion() {
		Pages.clientMasterPage().verifyQuestionName();
	}

	@And("Select any category and click on [Add new category] button")
	public void clickAddCategory() {
		Pages.clientMasterPage().addCategoryButton();
	}

	@And("Click on [Save] category button with empty category name field and verify the validation")
	public void clickSaveButtonWithoutEnteringName() {
		Pages.clientMasterPage().clickSaveWithEmptyCategory();
	}

	@And("Add a new category and verify new category is added")
	public void addCategoryAndVerify() {
		Pages.clientMasterPage().addNewCategory();
	}

	@And("Select any category header and click on [Reorder category] button")
	public void clickReorderCategory() {
		Pages.clientMasterPage().reorderCategoryButton();
	}

	@And("Reorder the category headers")
	public void reorderTheCategory() {
		Pages.clientMasterPage().reorderCategoryHeaders();
	}

	@And("Right click on question and click on [Add New Question] buttton")
	public void clickAddNewQuestion() {
		Pages.clientMasterPage().addNewQuestion();
	}

	@And("Click on [Plus] icon besides the question")
	public void clickPlusIconBesidesQuestion() {
		Pages.clientMasterPage().clickQuestionsPlusIcon();
	}

	@And("Enter the name of question and Click [Add] button")
	public void enterQuestionNameAndAdd() {
		Pages.clientMasterPage().enterQuestionClickAdd();
	}

	@And("Right click on displayed question and select [Edit Question] option")
	public void editQuestion() {
		SelenideTools.sleep(5);
		Pages.clientMasterPage().clickAndEditQuestion();
	}

	@And("Edit the particular question and verify the edit fields")
	public void editQuestionsAndVerifyFields() {
		SelenideTools.sleep(2);
		Pages.clientMasterPage().editTheQuestionAndVerifyEditFields();
	}

	@And("Right click on question and verify the activate and deactivate functionality")
	public void verifyActivateAndDeactivateButton() {
		Pages.clientMasterPage().activateDeactivateButtonFunctionality();
	}

	@And("Click on the [Questionnaire Versions] sidebar button")
	public void clickQuestionnaireVersionsButton() {
		Pages.clientMasterPage().selectQuestionnarieVersions();
		SelenideTools.sleep(4);
	}

	@And("Activate the newly created questionnaire")
	public void activateQuestionnaire() {
		Pages.clientMasterPage().activateNewlyCreatedQuestionnaire();
	}

	@And("Validate the lables on the [SaveSubmit Job] page")
	public void verifySaveSubmitPageLabels() {
		Pages.clientMasterPage().saveSubmitPageLabels();
	}

	@And("Verify [ Washington DC Jurisdiction] Jurisdiction is renamed with [District of Columbia]")
	public void verifyDistrictOfColumbia() {
		Pages.clientMasterPage().verifyJurisdictionName();
	}

	@And("Verify the [District of Columbia] in list of Jurisdiction")
	public void verifyJurisdictionDistrictOfColumbia() {
		Pages.clientMasterPage().verifyDistrictOfColumbia();
	}

	@And("Click on [Requirement View] sidebar button")
	public void selectRequirementView() {
		Pages.clientMasterPage().clickRequirementViewButton();
	}

	@And("Click Jurisdiction dropdown and verify the [District of Columbia] jurisdiction")
	public void verifyDistrictOfColumbiaInDropndow() {
		Pages.clientMasterPage().clickJurisdictionDropdownAndVerifyJurisdiction();
	}

	@And("Verify no [Intelligence Entitlement] message is shown without selecting any Client")
	public void verifyNoEntitlementMessage() {
		Pages.clientMasterPage().noEntitlementMessage();
	}

	@And("Verify the EUI states on Jurisdictions page")
	public void verifyEuiStatesVisible() {
		Pages.clientMasterPage().euiStates();
	}

	@Then("Type {string} in the email search on the [User Master] page")
	public void typeInTheEmailSearchOnTheUserMasterPage(String email) {
		Pages.clientMasterPage().enterEmailInTheEmailSearchField(email);
	}

	@And("Double click on the {int} record on the [User Master] page")
	public void doubleClickOnTheRecordOnTheUserMasterPage(int index) {
		Pages.clientMasterPage().clickOnTheClientName(index - 1);
	}

	@When("Verify that {string} role is not available in the Roles-Management select on the [User Master] page")
	public void verifyThatRoleIsNotAvailableInTheRolesManagementSelectOnTheUserMasterPage(String role) {
		Assert.assertFalse(Pages.clientMasterPage().isRoleVisibleInTheRoleManagementDropdown(role));
	}

	@And("Verify that {string} role is not available in the Roles-Compliance Intelligence select on the [User Master] page")
	public void verifyThatRoleIsNotAvailableInTheRolesComplianceIntelligenceSelectOnTheUserMasterPage(String role) {
		Assert.assertFalse(Pages.clientMasterPage().isRoleVisibleInTheRoleComplianceDropdown(role));
	}

	@And("Click on [Add Requirement] button")
	public void clickAddRequirement() {
		Pages.clientMasterPage().clickAddRequirementButton();
	}

	@When("Select {string} company from company dropdown list")
	public void selectCompanyFromTheCompanyDropdown(String company) {
		SelenideTools.sleep(3);
		Pages.clientMasterPage().selectCompany(company);
		SelenideTools.sleep(2);
	}

	@When("Select {string} from facility dropdown list")
	public void selectFacilityFromFacilityDropdown(String facility) {
		SelenideTools.sleep(3);
		Pages.clientMasterPage().selectFacility(facility);
		SelenideTools.sleep(2);
	}

	@When("Select {string} jurisdiction from jurisdiction dropdown list")
	public void selectJurisdictionFromJurisdictionDropdown(String jurisdiction) {
		SelenideTools.sleep(3);
		Pages.clientMasterPage().selectJurisdiction(jurisdiction);
		SelenideTools.sleep(2);
	}

	@When("Select {string} requirement type from requirement type dropdown list")
	public void selectRequirementFromRequirementTypeDropdown(String requirement) {
		SelenideTools.sleep(3);
		Pages.clientMasterPage().selectRequirementType(requirement);
		SelenideTools.sleep(2);
	}

	@When("Select {string} requirement category from requirement category dropdown list")
	public void selectRequirementCategory(String requirementCategory) {
		SelenideTools.sleep(3);
		Pages.clientMasterPage().selectRequirementCategory(requirementCategory);
		SelenideTools.sleep(2);
	}
	
	@When("Select {string} requirement status from requirement status dropdown list")
	public void selectRequirementStatus(String requirementStatus) {
		SelenideTools.sleep(3);
		Pages.clientMasterPage().selectRequirementStatus(requirementStatus);
		SelenideTools.sleep(2);
	}

	@When("Enter random requirement name on Add Requirement popup")
	public void enterRandomRequirementName() {
		Pages.clientMasterPage().enterRandomRequirementName(RandomStringUtils.random(10, true, false));
	}

	@When("Click on [Add Requirement] popup save button")
	public void clickAddRequirementSaveButton() {
		Pages.clientMasterPage().clickRequirementSavebutton();
		SelenideTools.sleep(5);
	}
	
	@When("Click on requirement successful popup okay button")
	public void clickrequirementSuccessfulSaveButton() {
		Pages.clientMasterPage().clickRequirementsSuccesspopupSavebutton();
		SelenideTools.sleep(5);
	}
	
	@When("Open any existing requirement")
	public void clickExistingRequirement() {
		SelenideTools.sleep(5);
		Pages.clientMasterPage().openExistingRequirement();
		SelenideTools.sleep(5);
	}
	
	@When("Select any column and click on [Add Activity] button")
	public void clickAddActivityButton() {
		Pages.clientMasterPage().selectActivityColumn();
		Pages.clientMasterPage().clickAddActivityButton();
		SelenideTools.sleep(5);
	}
	
	@When("Select {string} requirement from requirement activity dropdown list")
	public void selectRequirementActivity(String requirementActivity) {
		SelenideTools.sleep(3);
		Pages.clientMasterPage().selectRequirementActivity(requirementActivity);
		SelenideTools.sleep(2);
	}
	
	@When("Enter Activity start date")
	public void enterActivityDate() {
		Pages.clientMasterPage().enterActivityStartDate();
		SelenideTools.sleep(5);
	}
	
	@When("Click Add Activity popup [Next] button")
	public void clickActivityNextButton() {
		Pages.clientMasterPage().clickPopupNextButton();
		SelenideTools.sleep(5);
	}
	
	@When("Select {string} type from add type dropdown list")
	public void selectTypeFromDropdown(String type) {
		SelenideTools.sleep(3);
		Pages.clientMasterPage().selectType(type);
		SelenideTools.sleep(2);
	}
	
	@When("Select {string} task status from task status dropdown list")
	public void selectTaskStatusFromDropdow(String taskStatus) {
		SelenideTools.sleep(3);
		Pages.clientMasterPage().selectTaskStatus(taskStatus);
		SelenideTools.sleep(2);
	}
	
	@When("Select {string} from assignee dropdown list")
	public void selectAssigneeFromDropdow(String assignee) {
		SelenideTools.sleep(3);
		Pages.clientMasterPage().selectAssignee(assignee);
		SelenideTools.sleep(2);
	}
	
	@When("Click on Add Activity popup save button")
	public void addActivitySaveButton() {
		Pages.clientMasterPage().clickActivityPopupSaveButton();
		SelenideTools.sleep(5);
	}
	
	@When("Select a already created activity")
	public void openExistingActivity() {
		Pages.clientMasterPage().openExistingActivity();
		SelenideTools.sleep(5);
	}
	
	@When("Click on Edit Activity popup save button")
	public void editActivitySaveButton() {
		Pages.clientMasterPage().clickEditActivityPopupSaveButton();
		SelenideTools.sleep(5);
	}
	
	@When("Select any column and click on [Go to Task] button")
	public void clickGoToTaskButton() {
		Pages.clientMasterPage().selectGoToTaskBUtton();
		SelenideTools.sleep(5);
	}
	
	@When("Click on [Add Task] button")
	public void clickAddTaskButton() {
		Pages.clientMasterPage().clickPopupAddTaskButton();
		SelenideTools.sleep(5);
	}
	
	@When("Select {string} type from type dropdown list of Add Task popup")
	public void selectTypeOnTaskPopup(String type) {
		SelenideTools.sleep(3);
		Pages.clientMasterPage().selectTypeFromDropdown(type);
		SelenideTools.sleep(2);
	}
	
	@When("Select {string} Task status from task status dropdown list of Add Task popup")
	public void selectTaskStatusOnTaskPopup(String taskStatus) {
		SelenideTools.sleep(3);
		Pages.clientMasterPage().selectTaskStatusFromDropdown(taskStatus);
		SelenideTools.sleep(2);
	}
	
	@When("Click on Add task popup save button")
	public void addTaskPopupSaveButton() {
		Pages.clientMasterPage().clickAddTaskPopupSaveButton();
		SelenideTools.sleep(5);
	}
	
	@When("Assign the task to the same user from which task is created")
	public void assignTaskToSameUser() {
		Pages.clientMasterPage().assignTaskToExistingUser();
		SelenideTools.sleep(5);
	}
}
