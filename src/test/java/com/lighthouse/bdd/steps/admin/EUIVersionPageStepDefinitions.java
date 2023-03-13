package com.lighthouse.bdd.steps.admin;

import Pages.Pages;
import Utils.SelenideTools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EUIVersionPageStepDefinitions {

    @Then("The [Versioned EUI] page is opened")
    public void theVersionedEUIPageIsOpened() {
        Assert.assertTrue(Pages.euiVersionAdminPage().isEUIVersionAdminPageOpened());
    }

    @Then("Click on the {string} label on the [Versioned EUI] page")
    public void clickOnTheLabelOnTheVersionedEUIPage(String label) {
        Pages.euiVersionAdminPage().clickOnTheTableLabel(label);
        SelenideTools.sleep(1);
    }

    @And("Activate the {int} EUI on the [Versioned EUI] page")
    public void activateTheEUIOnTheVersionedEUIPage(int index) {
        Pages.euiVersionAdminPage().clickOnTheActivateEUIButton(index-1);
    }

    @And("Approve the {int} EUI on the [Versioned EUI] page")
    public void approveTheEUIOnTheVersionedEUIPage(int index) {
        Pages.euiVersionAdminPage().clickOnTheApproveEUIButton(index-1);
    }

    @And("Click on the [Yes Approve] button on the [Versioned EUI] page")
    public void clickOnTheYesApproveButtonOnTheVersionedEUIPage() {
        Pages.euiVersionAdminPage().clickYesApproveButton();
        SelenideTools.sleep(10);
    }

    @Then("{int} EUI with status {string} is displayed on the [Versioned EUI] page")
    public void euiWithStatusIsDisplayedOnTheVersionedEUIPage(int index, String status) {
        Assert.assertTrue(Pages.euiVersionAdminPage().isEUIWithStatusDisplayed(index-1, status));
    }
}
