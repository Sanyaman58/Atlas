package com.lighthouse.bdd.steps.admin;

import Pages.Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RequirementsAdminPageStepDefinitions {

    @Then("The [Requirements Admin] page is opened")
    public void theRequirementsAdminPageIsOpened() {
        Pages.requirementsAdminPage().isRequirementsAdminPageOpened();
    }
}
