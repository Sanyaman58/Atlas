package com.lighthouse.bdd.steps;

import Pages.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class ActivityLogsPageStepDefinitions {

    @Then("The [Activity Logs] page is opened")
    public void theViewResultsPageIsOpened() {
        Assert.assertTrue(Pages.activityLogsPage().isActivityLogsPageOpened());
    }

    @Then("Enter requirement name in the activity search on the [Activity Logs] page")
    public void enterRequirementNameInTheActivitySearchOnTheActivityLogsPage() {
        Pages.activityLogsPage().enterTextInTheSearchField(Pages.requirementsAdminPage().getRequirementName());
    }

    @And("Verify that log containing {string} description text is displayed on the [Activity Logs] page")
    public void verifyThatLogContainingTextIsDisplayedOnTheActivityLogsPage(String text) {
        Assert.assertTrue(Pages.activityLogsPage().isRecordDescriptionContainsText(text));
    }

    @And("Verify that logs are displayed on the [Activity Logs] page")
    public void verifyThatLogsAreDisplayedOnTheActivityLogsPage() {
        Assert.assertTrue(Pages.activityLogsPage().getNumberOfLogs()>0);
    }

    @Then("Enter requirement name saved on the [Research Results] page in the activity search on the [Activity Logs] page")
    public void enterRequirementNameSavedOnTheResearchResultsPageInTheActivitySearchOnTheActivityLogsPage() {
        Pages.activityLogsPage().enterTextInTheSearchField(Pages.viewResultsPage().getRequirementNameOfTheTableRecord());
    }

    @And("Verify that log containing requirement name saved on the [Research Results] page in description text is displayed on the [Activity Logs] page")
    public void verifyThatLogContainingRequirementNameSavedOnTheResearchResultsPageInDescriptionTextIsDisplayedOnTheActivityLogsPage() {
        Assert.assertTrue(Pages.activityLogsPage().isRecordDescriptionContainsText(Pages.viewResultsPage().getRequirementNameOfTheTableRecord()));
    }
}
