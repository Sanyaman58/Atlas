package com.lighthouse.bdd.steps.admin;

import Pages.Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ResearchAdminPageStepDefinitions {

    @Then("The [Research Admin] page is opened")
    public void theResearchAdminPageIsOpened() {
        Assert.assertTrue(Pages.researchAdminPage().isResearchAdminPageOpened());
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

    @Then("The [Research Notification] page is opened")
    public void theResearchNotificationPageIsOpened() {
        Pages.researchAdminPage().isResearchNotificationPageOpened();
    }

    @Then("The [Versioned EUI] page is opened")
    public void theVersionedEUIPageIsOpened() {
        Pages.researchAdminPage().isVersionedEUIPageOpened();
    }
}
