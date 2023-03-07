package com.lighthouse.bdd.steps;

import Pages.Pages;
import Utils.SelenideTools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import org.junit.Assert;

import com.codeborne.selenide.Selenide;

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

	@When("Click on the [User Master] sidebar button")
	public void clickOnTheUserMasterSidebarButton() {
		Pages.atlasDashboardManagementPage().clickManagementAdminSidebarCollapseButton();
		SelenideTools.sleep(2);
		Pages.clientMasterPage().clickUserMasterSidebarButton();
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

	@Then("Reload the browser")
	public void browserReload() {
		Pages.clientMasterPage().reloadBrowser();
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

	@Then("The [User Master] page is opened")
	public void userMasterPageIsOpened() {
		Assert.assertTrue(Pages.clientMasterPage().isClientMasterPageOpened());
	}

	@Then("Click [Add User] button")
	public void clickAddUserButton() {
		Pages.clientMasterPage().clickAddUserButton();
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

	@And("Click on [Activity Logs] option of the line item")
	public void clickActivityLogsOption() {
		Pages.clientMasterPage().clickActivityLogOfLineItem();
	}

	@And("Verify [Activity Logs] screen and default filter is set to [All]")
	public void verifyActivityLogScreenAndFilter() {
		Pages.clientMasterPage().verifyActivityLogScreen();
	}

	@And("Select {string} client from [Client dropdown] and verify next button is enabled")
	public void selectClientAndVerifyNextButton(String client) {
		Pages.newResearchPage().selectClient(client);
		SelenideTools.sleep(4);
		Pages.clientMasterPage().verifyNextButtonEnabled();
	}

	@And("Verify no [EUI] states are visible")
	public void verifyEuiStatesNotVisible() {
		Pages.clientMasterPage().euiStatesNotVisible();
	}

	@And("Verify the [Progress Bar] against the newly created job on the screen")
	public void verifyProgressBar() {
		Pages.clientMasterPage().progressBarOfNewJob();
		SelenideTools.sleep(70);
	}

	@When("Click the [Permissions] button on the left sidebar")
	public void clickPermissionsButton() {
		Pages.clientMasterPage().clickIntelligenceAdminDropdownButton();
		Pages.clientMasterPage().clickPermissionsSidebarButton();
		SelenideTools.switchToLastTab();
	}

	@Then("Verify [Permissions] page is opened")
	public void verifyPermissionsPageOpened() {
		Assert.assertTrue(Pages.clientMasterPage().isPermissionsPageOpened());
	}

	@And("Disable the [Delete Facility] checkbox for [System Admin]")
	public void disableDeleteFacilityCheckboxOfSystemAdmin() {
		Pages.clientMasterPage().disableDeleteFacilityCheckbox();
	}

	@And("Click on [Update Permission] button")
	public void clickUpdatePermissionsButton() {
		Pages.clientMasterPage().clickUpdatePermission();
		SelenideTools.sleep(5);
	}

	@And("Logout from the application")
	public void logout() {
		Pages.clientMasterPage().userLogout();
	}

	@And("Verify that the [Delete] action button is diabled")
	public void verifyDeleteActionButton() {
		Pages.clientMasterPage().deleteActionButton();
	}

	@And("Enable the [Delete Facility] checkbox for [System Admin]")
	public void enableDeleteFacilityCheckboxOfSystemAdmin() {
		Pages.clientMasterPage().enableDeleteFacilityCheckbox();
	}

	@And("Verify Delete button is enabled and click on it")
	public void verifyDeleteActionButtonEnabledAndClick() {
		Pages.clientMasterPage().deleteActionButtonEnabledAndClick();
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
		Pages.clientMasterPage().clickAndEditQuestion();
	}
	
	@And("Edit the particular question and verify the edit fields")
	public void editQuestionsAndVerifyFields() {
		Pages.clientMasterPage().editTheQuestionAndVerifyEditFields();
	}
	
	@And("Right click on question and verify the activate and deactivate functionality")
	public void verifyActivateAndDeactivateButton() {
		Pages.clientMasterPage().activateDeactivateButtonFunctionality();
	}
	
	@And("Click on the [Questionnaire Versions] sidebar button")
	public void clickQuestionnaireVersionsButton() {
		Pages.clientMasterPage().selectQuestionnarieVersions();
	}
	
	@And("Activate the newly created questionnaire")
	public void activateQuestionnaire() {
		Pages.clientMasterPage().activateNewlyCreatedQuestionnaire();
	}

}
