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
	public void clickAddClientButton() {
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

}
