package com.lighthouse.bdd.steps;

import Pages.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ActivityLogsPageStepDefinitions {

    @Then("The [Activity Logs] page is opened")
    public void theViewResultsPageIsOpened() {
        Assert.assertTrue(Pages.activityLogsPage().isActivityLogsPageOpened());
    }

    @Then("Enter requirement name in the activity search on the [Activity Logs] page")
    public void enterRequirementNameInTheActivitySearchOnTheActivityLogsPage() {
        Pages.activityLogsPage().enterTextInTheSearchField(Pages.requirementsAdminPage().getRequirementName());
    }

    @Then("Enter {string} in the activity search on the [Activity Logs] page")
    public void enterInTheActivitySearchOnTheActivityLogsPage(String text) {
        Pages.activityLogsPage().enterTextInTheSearchField(text);
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
        Pages.activityLogsPage().enterTextInTheSearchField(Pages.viewResultsPage().getFacilityNameOfTheTableRecord());
    }

    @And("Verify that log containing requirement name saved on the [Research Results] page in description text is displayed on the [Activity Logs] page")
    public void verifyThatLogContainingRequirementNameSavedOnTheResearchResultsPageInDescriptionTextIsDisplayedOnTheActivityLogsPage() {
        Assert.assertTrue(Pages.activityLogsPage().isRecordDescriptionContainsText(Pages.viewResultsPage().getFacilityNameOfTheTableRecord()));
    }

    @Then("Enter created requirement's name in the activity search on the [Activity Logs] page")
    public void enterCreatedRequirementSNameInTheActivitySearchOnTheActivityLogsPage() {
        Pages.activityLogsPage().enterTextInTheSearchField(Pages.requirementsAdminPage().getRequirementName());
    }

    @And("Get activity logs count")
    public void getActivityLogsCount() {
        Pages.activityLogsPage().saveActivityLogsRecordsCount();
    }

    @And("Verify that log containing created earlier requirement in description text is displayed on the [Activity Logs] page")
    public void verifyThatLogContainingCreatedEarlierRequirementInDescriptionTextIsDisplayedOnTheActivityLogsPage() {
        String SKU = Pages.versionRequirementsAdminPage().getRequirementSku();
        String trimSKU = SKU.substring(SKU.length() - 9);
        Assert.assertTrue(Pages.activityLogsPage().isRecordDescriptionContainsText(trimSKU));

    }

    @Then("Enter requirement SKU in the activity search on the [Activity Logs] page")
    public void enterRequirementSKUInTheActivitySearchOnTheActivityLogsPage() {
        String SKU = Pages.versionRequirementsAdminPage().getRequirementSku();
        String trimSKU = SKU.substring(SKU.length() - 9);
        System.out.println(trimSKU);
        Pages.activityLogsPage().enterTextInTheSearchField(trimSKU);
    }
}
