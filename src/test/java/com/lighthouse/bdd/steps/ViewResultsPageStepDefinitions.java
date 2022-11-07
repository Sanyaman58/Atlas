package com.lighthouse.bdd.steps;

import Pages.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ViewResultsPageStepDefinitions {

    @Then("The [View Results] page is opened")
    public void theViewResultsPageIsOpened() {
        Assert.assertTrue(Pages.viewResultsPage().isViewResultsPageOpened());
    }

    @And("Verify that newly created job with status {string} is displayed in the table on the [View Results] page")
    public void verifyThatNewlyCreatedJobWithStatusIsDisplayedInTheTableOnTheViewResultsPage(String status) {
        Assert.assertTrue(Pages.viewResultsPage().isNewlySubmittedJobDisplayed(status));
    }
}
