package com.lighthouse.bdd.steps.admin;

import Pages.Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EndsUpInStatesAdminPageStepDefinitions {

    @Then("The [Ends Up In States Admin] page is opened")
    public void theEndsUpInStatesAdminPageIsOpened() {
        Assert.assertTrue(Pages.endsUpInStatesAdminPage().isEndsUpInStateAdminPageOpened());
    }
}
