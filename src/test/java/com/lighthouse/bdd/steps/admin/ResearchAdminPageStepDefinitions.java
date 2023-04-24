package com.lighthouse.bdd.steps.admin;

import Pages.Pages;
import Utils.SelenideTools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ResearchAdminPageStepDefinitions {

	@Then("The [Research Admin] page is opened")
	public void theResearchAdminPageIsOpened() {
		Assert.assertTrue(Pages.researchAdminPage().isResearchAdminPageOpened());
	}

	@Then("The [Requirements Admin] page is opened")
	public void theRequirementsAdminPageIsOpened() {
		SelenideTools.sleep(5);
		Pages.researchAdminPage().isRequirementsAdminPageOpened();
	}

	@When("Click on the [Requirements] button on admin")
	public void clickOnTheRequirementsButtonOnAdmin() {
		Pages.researchAdminPage().clickTheRequirementsButton();
	}

	@When("Click on the [Questionnaire] button on admin")
	public void clickOnTheQuestionnaireButtonOnAdmin() {
		Pages.researchAdminPage().clickTheQuestionnaireButton();
	}

	@When("Click on the [Ends Up In State] button on admin")
	public void clickOnTheEndsUpInStateButtonOnAdmin() {
		Pages.researchAdminPage().clickTheEndsUpInStateButton();
	}

	@When("Click on [Audit Logs] sidebar button")
	public void clickAuditLogsSidebarButton() {
		Pages.researchAdminPage().auditLogsSidebarButton();
	}

	@When("The [Logs] page is opened")
	public void logsPageOpened() {
		Pages.researchAdminPage().isLogsPageOpened();
	}

	@When("Click on [Requirements View] sidebar button")
	public void clickRequirementsViewSidebarButton() {
		Pages.researchAdminPage().clickRequirementsViewButton();
	}

	@When("Verify the child buttons under [Intelligence Admin] section")
	public void verifyButtonsUnderIntelligenceAdmin() {
//		SelenideTools.sleep(3);
		Pages.researchAdminPage().verifyIntelligenceAdminChildOptions();
	}

	@When("Click on the [Research] sidebar button on admin")
	public void clickOnTheResearchSidebarButtonOnAdmin() {
		Pages.researchAdminPage().clickTheResearchSidebarButton();
	}

	@When("Click on the [Requirements View] sidebar button on admin")
	public void clickOnTheRequirementsViewSidebarButtonOnAdmin() {
		Pages.researchAdminPage().clickTheRequirementsViewSidebarButton();
	}

	@When("Click on the [Notifications] sidebar button on admin")
	public void clickOnTheNotificationsSidebarButtonOnAdmin() {
		Pages.researchAdminPage().clickTheNotificationsSidebarButton();
	}

	@When("Click on the [EUI Versions] sidebar button on admin")
	public void clickOnTheEUIVersionsSidebarButtonOnAdmin() {
		Pages.researchAdminPage().clickTheEUIVersionsSidebarButton();
	}

	@When("Click on the [Questionnaire Versions] sidebar button on admin")
	public void clickOnTheQuestionnaireVersionsSidebarButtonOnAdmin() {
		Pages.researchAdminPage().clickTheQuestionnaireVersionsSidebarButton();
	}

	@When("The [Requirements Admin] is opened")
	public void requirementViewPageOpened() {
		Pages.researchAdminPage().isRequirementViewPageOpened();
	}

	@When("Click on [Version Requirements] sidebar button")
	public void clickVersionRequirementSidebarButton() {
		Pages.researchAdminPage().clickVersionRequirement();
	}

	@Then("The [Version Requirements] page is opened")
	public void versionRequirementsPageOpened() {
		Pages.researchAdminPage().isversionRequirementsPageOpened();
	}

	@When("Click on [Active Requirements] sidebar button")
	public void clickActiveRequirementsSidebarButton() {
		Pages.researchAdminPage().clickActiveRequirementsButton();
	}

	@Then("The [Active Requirements] page is opened")
	public void activeRequirementsPageOpened() {
		Pages.researchAdminPage().isactiveRequirementsPageOpened();
	}

	@When("Click on [Notifications] sidebar button")
	public void clickNotificationsSidebarButton() {
		Pages.researchAdminPage().clickNotificationsButton();
	}

	@Then("The [Notifications] page is opened")
	public void notificationsPageOpened() {
		Pages.researchAdminPage().isnotificationsPageOpened();
	}

	@When("Click on [EUI Versions] sidebar button")
	public void clickEUIVersionsSidebarButton() {
		Pages.researchAdminPage().clickEUIVersionsButton();
	}

	@Then("The [EUI Version] page is opened")
	public void euiVersionsPageOpened() {
		Pages.researchAdminPage().isEuiVersionsPageOpened();
	}

	@When("Click on [Questionnaire Versions] sidebar button")
	public void clickQuestionnaireVersionsSidebarButton() {
		Pages.researchAdminPage().clickQuestionnaireVersionsButton();
	}

	@When("Click on [Permissions] sidebar button")
	public void clickPermissionsSidebarButton() {
		Pages.researchAdminPage().clickPermissionsButton();
	}

	@Then("The [Permissions] page is opened")
	public void permissionsPageOpened() {
		Pages.researchAdminPage().isPermissionsPageOpened();
	}

	@And("Disable the [Delete Facility] checkbox for [System Admin]")
	public void disableTheDeleteFacilityCheckboxForSystemAdmin() {

	}
}
