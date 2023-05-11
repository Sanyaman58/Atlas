package com.lighthouse.bdd.steps.admin;

import Pages.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;

public class EditRequirementAdminPageStepDefinitions {

    @Then("The [Edit Requirement] page is opened")
    public void theResearchAdminPageIsOpened() {
        Assert.assertTrue(Pages.editRequirementAdminPage().isEditRequirementAdminPageOpened());
    }

    @And("Get the data from the [Edit Requirement] page")
    public void getTheDataFromTheEditRequirementPage() throws IOException {
        Pages.editRequirementAdminPage().getGeneralInfo();
    }

    @And("Compare the data on the [Edit Requirement] with the data from the [View Requirement] page")
    public void compareTheDataOnTheEditRequirementWithTheDataFromTheViewRequirementPage() throws IOException {
        Pages.viewRequirementsAdminPage().compareInfoLists(Pages.editRequirementAdminPage().getGeneralInfo());}

    @When("Click on the [Edit Requirement] button on the [Edit Requirement] page")
    public void clickOnTheEditRequirementButtonOnTheEditRequirementPage() {
        Pages.editRequirementAdminPage().clickOnEditButton();
    }
}
