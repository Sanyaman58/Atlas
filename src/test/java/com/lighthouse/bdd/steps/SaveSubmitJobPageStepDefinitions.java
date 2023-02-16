package com.lighthouse.bdd.steps;

import Pages.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SaveSubmitJobPageStepDefinitions {

    @Then("The [SaveSubmit Job] page is opened")
    public void theSaveSubmitJobPageIsOpened() {
        Assert.assertTrue(Pages.saveSubmitJobPage().isSaveSubmitConfigurationPageOpened());
    }

    @When("Click on the [Change Jurisdictions] button")
    public void clickOnTheChangeJurisdictionsButton() {
        Pages.saveSubmitJobPage().clickTheChangeJurisdictionsButton();
    }

    @When("Click on the [Change Questionnaire] button")
    public void clickOnTheChangeQuestionnaireButton() {
        Pages.saveSubmitJobPage().clickTheChangeQuestionnaireButton();
    }

    @Then("Validate fields on the [SaveSubmit Job] page")
    public void validateFieldsOnTheSaveSubmitJobPage() {
    }

    @Then("Validate that the displayed on the [SaveSubmit Job] page jurisdictions correspond to the selected earlier")
    public void validateThatTheDisplayedOnTheSaveSubmitJobPageJurisdictionsCorrespondToTheSelectedEarlier() {
        Assert.assertTrue(Pages.saveSubmitJobPage().compareTheJurisdictionCheckboxes(Pages.jurisdictionPage().getJurisdictionStatesValues()));
    }

    @And("Validate that the displayed on the [SaveSubmit Job] page questions and answers correspond to the selected earlier")
    public void validateThatTheDisplayedOnTheSaveSubmitJobPageQuestionsAndAnswersCorrespondToTheSelectedEarlier() {
        Assert.assertTrue(Pages.saveSubmitJobPage().compareTheQuestionsAnswers(Pages.questionnairePage().getQuestionsAnswers()));
    }

    @When("Click on the [Save Job] button")
    public void clickOnTheSaveJobButton() {
        Pages.saveSubmitJobPage().clickSaveConfigurationButton();
    }

    @When("Click on the [Submit Job] button")
    public void clickOnTheSubmitJobButton() {
        Pages.saveSubmitJobPage().clickSubmitConfigurationButton();
    }

    @Then("Verify the breadcrumbs on the [SaveSubmit Job] page")
    public void verifyTheBreadcrumbsOnTheSaveSubmitJobPage() {
        Pages.questionnairePage().clickTheQuestionnaireBreadcrumb();
        Assert.assertTrue(Pages.questionnairePage().isQuestionnairePageOpened());
        Pages.newResearchPage().goBackInBrowser();
        Assert.assertTrue(Pages.saveSubmitJobPage().isSaveSubmitConfigurationPageOpened());
        Pages.jurisdictionPage().clickTheJurisdictionBreadcrumb();
        Assert.assertTrue(Pages.jurisdictionPage().isJurisdictionPageOpened());
        Pages.newResearchPage().goBackInBrowser();
        Assert.assertTrue(Pages.saveSubmitJobPage().isSaveSubmitConfigurationPageOpened());
        Pages.newResearchPage().clickOnSurveillanceSetupBreadcrumb();
        Assert.assertTrue(Pages.newResearchPage().isSurveillanceSetupPageOpened());
        Pages.newResearchPage().goBackInBrowser();
        Assert.assertTrue(Pages.saveSubmitJobPage().isSaveSubmitConfigurationPageOpened());
    }

    @And("Verify the buttons on the [SaveSubmit Job] page")
    public void verifyTheButtonsOnTheSaveSubmitJobPage() {

    }
}
