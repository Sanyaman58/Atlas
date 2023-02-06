package com.lighthouse.bdd.steps.admin;

import Pages.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AuditLogsAdminPageStepDefinitions {


    @Then("The [Audit Logs] page is opened")
    public void theAuditLogsPageIsOpened() {
        Assert.assertTrue(Pages.auditLogsAdminPage().isAuditLogsPageOpened());
    }

    @Then("The following labels are displayed in the [Audit Logs] table")
    public void theFollowingLabelsAreDisplayedInTheAuditLogsTable(List<String> listOfLabels) {
        Assert.assertTrue(Pages.auditLogsAdminPage().isTableLabelsPresent(listOfLabels));
    }

    @And("Click on the [Audit Logs] sidebar button on Lighthouse")
    public void clickOnTheAuditLogsSidebarButtonOnLighthouse() {
        Pages.auditLogsAdminPage().clickOnAuditLogsSidebarButton();
    }

    @Then("Click on the {string} label on the [Audit Logs] page")
    public void clickOnTheLabelOnTheAuditLogsPage(String label) {
        Pages.auditLogsAdminPage().clickOnTheLabel(label);
    }

    @Then("Verify that new log with {string} type is in the list")
    public void verifyThatNewLogWithTypeIsInTheList(String type) {
        Assert.assertTrue(Pages.auditLogsAdminPage().isLogPresentInTheList(type, Pages.newResearchPage().getCompanyName(), Pages.newResearchPage().getFacilityName()));
    }

    @When("Get audit logs from the table")
    public void getAuditLogsFromTheTable() {
        Pages.auditLogsAdminPage().getLogsTableData();
    }
}
