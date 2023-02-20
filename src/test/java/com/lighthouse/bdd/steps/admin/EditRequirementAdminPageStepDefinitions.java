package com.lighthouse.bdd.steps.admin;

import Pages.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EditRequirementAdminPageStepDefinitions {

    @Then("The [Edit Requirement] page is opened")
    public void theResearchAdminPageIsOpened() {
        Assert.assertTrue(Pages.editRequirementAdminPage().isEditRequirementAdminPageOpened());
    }

    @And("Get the data from the [Edit Requirement] page")
    public void getTheDataFromTheEditRequirementPage() {
        Pages.editRequirementAdminPage().getGeneralInfo();
    }

    @And("Compare the data on the [Edit Requirement] with the data from the [View Requirement] page")
    public void compareTheDataOnTheEditRequirementWithTheDataFromTheViewRequirementPage() {
        Assert.assertTrue(Pages.viewRequirementsAdminPage().compareInfoLists(Pages.editRequirementAdminPage().getGeneralInfo()));}
}
