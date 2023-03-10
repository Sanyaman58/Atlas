package com.lighthouse.bdd.steps.admin;

import Pages.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EndsUpInStatesAdminPageStepDefinitions {

    @Then("The [Ends Up In States Admin] page is opened")
    public void theEndsUpInStatesAdminPageIsOpened() {
        Assert.assertTrue(Pages.endsUpInStatesAdminPage().isEndsUpInStateAdminPageOpened());
    }

    @When("Check {int} checkbox on the [Ends Up In States Admin] page")
    public void checkCheckboxOnTheEndsUpInStatesAdminPage(int index) {
        Pages.endsUpInStatesAdminPage().checkJurisdiction(index-1);
    }

    @When("Uncheck {int} checkbox on the [Ends Up In States Admin] page")
    public void uncheckCheckboxOnTheEndsUpInStatesAdminPage(int index) {
        Pages.endsUpInStatesAdminPage().uncheckJurisdiction(index-1);
    }

    @Then("Click on the [Save] button on the [Ends Up In States Admin] page")
    public void clickOnTheSaveButtonOnTheEndsUpInStatesAdminPage() {
        Pages.endsUpInStatesAdminPage().clickSaveButton();
    }

    @And("Verify that {int} checkbox is red crossed on the [Ends Up In States Admin] page")
    public void verifyThatCheckboxIsRedCrossedOnTheEndsUpInStatesAdminPage(int index) {
        Assert.assertTrue(Pages.endsUpInStatesAdminPage().isCheckboxRedCrossed(index));
    }
}
