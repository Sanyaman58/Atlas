package com.lighthouse.bdd.steps.admin;

import Pages.Pages;
import Utils.SelenideTools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ViewRequirementsAdminPageStepDefinitions {
    @Then("The [View Requirements] page is opened")
    public void theActiveRequirementsPageIsOpened() {
        SelenideTools.switchToLastTab();
        Assert.assertTrue(Pages.viewRequirementsAdminPage().isActiveRequirementsPageOpened());
    }

    @Then("The [View Requirements] page is opened after clicking on the button")
    public void theActiveRequirementsPageIsOpenedAfterClick() {
        SelenideTools.sleep(2);
        Assert.assertTrue(Pages.viewRequirementsAdminPage().isActiveRequirementsPageOpened());
    }


    @When("Close the current tab")
    public void closeTheCurrentTab() {
        SelenideTools.closeCurrentTab();
        SelenideTools.sleep(2);
        SelenideTools.switchToLastTab();
    }

    @And("Get the data from the [View Requirements] page")
    public void getTheDataFromTheViewRequirementsPage() {
        Pages.viewRequirementsAdminPage().getViewRequirementsPageData();
    }
}
