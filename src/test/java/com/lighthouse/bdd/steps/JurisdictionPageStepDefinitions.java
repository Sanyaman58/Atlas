package com.lighthouse.bdd.steps;

import Pages.Pages;
import Utils.SelenideTools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class JurisdictionPageStepDefinitions {

    @Then("The [Jurisdiction] page is opened")
    public void theQuestionnairePageIsOpened() {
        Assert.assertTrue(Pages.jurisdictionPage().isJurisdictionPageOpened());
        SelenideTools.sleep(3);
    }

    @When("Select {string} state on the [Jurisdiction] page")
    public void selectStateOnTheJurisdictionPage(String state) {
        Pages.jurisdictionPage().selectState(state);
    }

    @When("Select all jurisdictions on the [Jurisdiction] page")
    public void selectAllStatesOnTheQuestionnairePage() {
        Pages.jurisdictionPage().clickSelectAllJurisdictionsButton();
    }
    @And("Select the [Yes] requirements checks include radio button")
    public void selectTheYesRequirementsChecksIncludeRadioButton() {
        Pages.jurisdictionPage().clickRequirementsChecksIncludeYesRadio();
        SelenideTools.sleep(10);
    }

    @Then("Click the [Next] button on the [Jurisdiction] page")
    public void clickTheNextButtonOnTheJurisdictionPage() {
        Pages.jurisdictionPage().clickTheNextButton();
    }

    @And("Get the jurisdictions checkboxes values")
    public void getTheJurisdictionsValues() {
        Pages.jurisdictionPage().getStateCheckboxesValues();
    }

    @When("Click on the [Jurisdiction] breadcrumb")
    public void clickOnTheJurisdictionBreadcrumb() {
        Pages.jurisdictionPage().clickTheJurisdictionBreadcrumb();
    }

    @And("Validate that previously selected jurisdictions are saved")
    public void validateThatPreviouslySelectedJurisdictionsAreSaved() {
        Assert.assertTrue(Pages.jurisdictionPage().validateThatPreviouslySelectedJurisdictionsAreSave());
    }

    @And("Verify the breadcrumbs on the [Jurisdiction] page")
    public void verifyTheBreadcrumbsOnTheJurisdictionPage() {
        Pages.newResearchPage().clickOnSurveillanceSetupBreadcrumb();
        Assert.assertTrue(Pages.newResearchPage().isSurveillanceSetupPageOpened());
        Pages.newResearchPage().goBackInBrowser();
        Assert.assertTrue(Pages.jurisdictionPage().isJurisdictionPageOpened());
        Assert.assertTrue(Pages.jurisdictionPage().isJurisdictionPageOpened());
    }

    @Then("Verify that all 53 states are visible and enabled")
    public void verifyThatAllStatesAreVisibleAndEnabled() {
        Pages.jurisdictionPage().areAllStatesCheckboxesVisibleAndClickable();
    }
    
    @When("Verify Jurisdictions state is {string} as selected earlier on the [Jurisdiction] page")
    public void verifyJurisdictionState(String Selectedstate) {
        Pages.jurisdictionPage().selectedState(Selectedstate);
    }
}
