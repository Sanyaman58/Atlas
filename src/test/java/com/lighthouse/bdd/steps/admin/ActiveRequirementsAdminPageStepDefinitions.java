package com.lighthouse.bdd.steps.admin;

import Pages.Pages;
import Utils.SelenideTools;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ActiveRequirementsAdminPageStepDefinitions {
    @Then("The [Active Requirements] page is opened")
    public void theActiveRequirementsPageIsOpened() {
        SelenideTools.switchToLastTab();
        Assert.assertTrue(Pages.activeRequirementsAdminPage().isActiveRequirementsPageOpened());
    }

    @When("Close the current tab")
    public void closeTheCurrentTab() {
        SelenideTools.closeCurrentTab();
        SelenideTools.sleep(2);
        SelenideTools.switchToLastTab();
    }
}
