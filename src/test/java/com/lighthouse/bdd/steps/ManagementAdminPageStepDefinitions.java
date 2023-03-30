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
	
	@And("Verify [Delete Requirement] option is enabled")
    public void verifyDeleteButtonIsEnabled() {
        Pages.clientMasterPage().verifyDeleteButton();
    }
	
//	@And("Verify that the [Edit Requirement] option is enabled")
//    public void verifyEditButtonIsEnabled() {
//        Pages.clientMasterPage().verifyEditButton();
//    }
	
	@And("Verify that the [View Requirement] option is enabled")
    public void verifyViewRequirementIsEnabled() {
        Pages.clientMasterPage().verifyViewRequirementButton();
    }
	
//	@And("Verify that the [Approve Requirement] option is enabled")
//    public void verifyApproveRequirementIsEnabled() {
//        Pages.clientMasterPage().verifyApproveRequirementButton();
//    }
	
//	@And("Verify that the [Intelligence Permissions] from the side menu is enabled")
//    public void verifyIntelligencePermissions() {
//        Pages.clientMasterPage().verifyIntelligencePermissionsEnabled();
//    }
	
//	@And("Verify [Delete Facility] button is enabled on [Configuration] page")
//    public void verifyDeleteFacilityButton() {
//        Pages.clientMasterPage().verifyDeleteFacilityButtonIsEnabled();
//    }
	
//	@And("Verify [View Result] and [Delete Result] button is enabled")
//    public void verifyViewDeleteButton() {
//        Pages.clientMasterPage().verifyViewDeleteButtonEnabled();
//    }

	@And("Click on [Version Requirements] dropdown option")
    public void clickVersionRequirement() {
        Pages.clientMasterPage().openVersionRequirementsPage();
    }
	
//	@And("Verify that the [Activate Requirement] view option is enabled")
//    public void verifyActivateRequirementOptionEnabled() {
//        Pages.clientMasterPage().isActivateRequirementOptionEnabled();
//    }
	
//	@And("Verify [Delete Requirement] option is enabled")
//    public void verifyDeleteRequirementOptionEnabled() {
//        Pages.clientMasterPage().isDeleteRequirementOptionEnabled();
//    }
	
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
}
