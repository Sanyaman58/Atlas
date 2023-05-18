package com.lighthouse.bdd.steps.atlas;

import Pages.Pages;
import Utils.SelenideTools;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AtlasDashboardManagementPageStepDefinitions {

	@Then("Management Dashboard page is opened")
	public void managementDashboardPageIsOpened() {
		SelenideTools.sleep(5);
		Assert.assertTrue(Pages.atlasDashboardManagementPage().isDashboardPageOpened());
		SelenideTools.sleep(5);
	}

	@When("Click on the [Results] sidebar atlas button")
	public void clickOnTheResultsSidebarAtlasButton() {
		Pages.atlasDashboardManagementPage().clickSurveillanceIntelligenceSidebarCollapseButton();
		SelenideTools.sleep(2);
		Pages.atlasDashboardManagementPage().clickResultsSidebarButton();
		SelenideTools.sleep(10);
		SelenideTools.switchToLastTab();
		// SelenideTools.closeCurrentTab();
		SelenideTools.sleep(2);
		Assert.assertTrue(Pages.viewResultsPage().isViewResultsPageOpened());
		SelenideTools.sleep(2);
	}

	@When("Click on the [Research] sidebar button")
	public void clickOnTheResearchSidebarButton() {
		Pages.atlasDashboardManagementPage().clickIntelligenceAdminSidebarCollapseButton();
		SelenideTools.sleep(2);
		Pages.atlasDashboardManagementPage().clickResearchAdminSidebarButton();
		SelenideTools.sleep(10);
		SelenideTools.switchToLastTab();
		// SelenideTools.closeCurrentTab();
		SelenideTools.sleep(5);
		Assert.assertTrue(Pages.researchAdminPage().isResearchAdminPageOpened());
	}

	@When("Click on the [Versioned Requirements] sidebar button")
	public void clickOnTheVersionedRequirementsSidebarButton() {
		Pages.atlasDashboardManagementPage().clickIntelligenceAdminSidebarCollapseButton();
		SelenideTools.sleep(2);
		Pages.atlasDashboardManagementPage().clickVersionRequirementsSidebarButton();
		SelenideTools.sleep(10);
		SelenideTools.switchToLastTab();
		// SelenideTools.closeCurrentTab();
		SelenideTools.sleep(3);
		Assert.assertTrue(Pages.versionRequirementsAdminPage().isVersionedRequirementsAdminPageOpened());
	}

	@When("Click on the [Requirements] button on Atlas")
	public void clickOnTheRequirementsButtonOnAtlas() {
		Pages.atlasDashboardManagementPage().clickRequirementsManagementSidebarCollapseButton();
		SelenideTools.sleep(2);
		Pages.atlasDashboardManagementPage().clickRequirementsSidebarButton();
		SelenideTools.sleep(3);
	}

	@When("Click on the [Intelligence Admin] sidebar collapse button")
	public void clickOnTheIntelligenceAdminSidebarCollapseButton() {
		SelenideTools.sleep(10);
		Pages.atlasDashboardManagementPage().clickIntelligenceAdminSidebarCollapseButton();
		SelenideTools.sleep(2);
	}

	@When("Click the [Home] sidebar button")
	public void clickHomepage() {
		Pages.atlasDashboardManagementPage().clickHomepageSidebarButton();
		SelenideTools.sleep(2);
	}

	@When("Verify [Release Notes] is present on the Homepage")
	public void verifyReleaseNotesPresent() {
		Pages.atlasDashboardManagementPage().verifyReleaseNotes();
	}
	
	@When("Click on the [Research] button")
	public void clickOnTheResearchButton() {
		Pages.atlasDashboardManagementPage().clickResearchAdminSidebarButton();
		SelenideTools.sleep(10);
		Assert.assertTrue(Pages.researchAdminPage().isResearchAdminPageOpened());
	}

    @When("Click on the [Document Repository] sidebar button")
    public void clickOnTheDocumentRepositorySidebarButton() {
		Pages.atlasDashboardManagementPage().clickDocumentRepositorySidebarButton();
    }

    @When("Click on the [Notifications] atlas collapse button")
    public void clickOnTheNotificationsAtlasCollapseButton() {
		Pages.atlasDashboardManagementPage().clickNotificationsAtlasCollapseButton();
    }

	@And("Click on the [Documents] sidebar button under the [Notifications] section")
	public void clickOnTheDocumentsSidebarButtonUnderTheNotificationsSection() {
		Pages.atlasDashboardManagementPage().clickNotificationsDocumentsSidebarButton();
	}

	@Then("The [Documents Notifications] page is opened")
	public void theDocumentsNotificationsPageIsOpened() {
		Assert.assertTrue(Pages.atlasDashboardManagementPage().isDocumentsNotificationsPageOpened());
	}
}
