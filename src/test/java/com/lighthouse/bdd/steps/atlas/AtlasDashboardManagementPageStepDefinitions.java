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
        Assert.assertTrue(Pages.atlasDashboardManagementPage().isDashboardPageOpened());
    }

    @When("Click on the [Results] sidebar atlas button")
    public void clickOnTheResultsSidebarAtlasButton() {
        Pages.atlasDashboardManagementPage().clickSurveillanceIntelligenceSidebarCollapseButton();
        SelenideTools.sleep(2);
        Pages.atlasDashboardManagementPage().clickResultsSidebarButton();
        SelenideTools.sleep(10);
        SelenideTools.switchToLastTab();
        //SelenideTools.closeCurrentTab();
        SelenideTools.sleep(2);
        Assert.assertTrue(Pages.viewResultsPage().isViewResultsPageOpened());
    }

    @When("Click on the [Research] sidebar button")
    public void clickOnTheResearchSidebarButton() {
        Pages.atlasDashboardManagementPage().clickIntelligenceAdminSidebarCollapseButton();
        SelenideTools.sleep(2);
        Pages.atlasDashboardManagementPage().clickResearchAdminSidebarButton();
        SelenideTools.sleep(10);
        SelenideTools.switchToLastTab();
        //SelenideTools.closeCurrentTab();
        SelenideTools.sleep(2);
        Assert.assertTrue(Pages.researchAdminPage().isResearchAdminPageOpened());
    }
}
