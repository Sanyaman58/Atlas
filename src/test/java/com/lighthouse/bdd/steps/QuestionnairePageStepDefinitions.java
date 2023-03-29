package com.lighthouse.bdd.steps;

import Pages.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class QuestionnairePageStepDefinitions {
    @Then("The [Questionnaire] page is opened")
    public void theQuestionnairePageIsOpened() {
        Assert.assertTrue(Pages.questionnairePage().isQuestionnairePageOpened());
    }

    @And("Validate the [Questionnaire] page elements")
    public void validateTheQuestionnairePageElements() {
        Assert.assertTrue(Pages.questionnairePage().isFinancialOwnershipSectionVisible());
        Assert.assertTrue(Pages.questionnairePage().isProductSectionVisible());
        Assert.assertTrue(Pages.questionnairePage().isPhysicalPossessionSectionVisible());
    }

    @Then("Get the questions values")
    public void getTheQuestionsValues() {
        Pages.questionnairePage().saveQuestionsAnswers();
    }

    @And("Click the [Next] button on the [Questionnaire] page")
    public void clickTheNextButtonOnTheQuestionnairePage() {
        Pages.questionnairePage().clickTheNextButton();
    }

    @Then("Verify the breadcrumbs on the [Questionnaire] page")
    public void verifyTheBreadcrumbsOnTheQuestionnairePage() {
        Pages.jurisdictionPage().clickTheJurisdictionBreadcrumb();
        Assert.assertTrue(Pages.jurisdictionPage().isJurisdictionPageOpened());
        Pages.newResearchPage().goBackInBrowser();
        Assert.assertTrue(Pages.questionnairePage().isQuestionnairePageOpened());
        Pages.newResearchPage().clickOnSurveillanceSetupBreadcrumb();
        Assert.assertTrue(Pages.newResearchPage().isSurveillanceSetupPageOpened());
        Pages.newResearchPage().goBackInBrowser();
        Assert.assertTrue(Pages.questionnairePage().isQuestionnairePageOpened());
    }

    @And("Select questions to match the complex selector criteria")
    public void selectQuestionsToMatchTheComplexSelectorCriteria() {
        Pages.questionnairePage().selectQuestion(1);
        Pages.questionnairePage().selectQuestion(2);
        Pages.questionnairePage().selectQuestion(4);
    }

    @When("Click on the [Clear All] button on the [Questionnaire] page")
    public void clickOnTheClearAllButtonOnTheQuestionnairePage() {
        Pages.questionnairePage().clickClearAllButton();
    }

    @Then("Verify that all questions answers are 'No' on the [Questionnaire] page")
    public void verifyThatAllQuestionsAnswersAreNoOnTheQuestionnairePage() {
        Pages.questionnairePage().getQuestionsAnswers();
        Assert.assertFalse(Pages.questionnairePage().getQuestionsAnswers().containsValue(false));
    }

    @And("The tooltip near the {int} question is visible on the [Questionnaire] page")
    public void theTooltipNearTheQuestionIsVisibleOnTheQuestionnairePage(int index) {
        Assert.assertTrue(Pages.questionnairePage().isTooltipVisible(index));
    }

    @When("Hover over tooltip near the {int} question on the [Questionnaire] page")
    public void hoverOverTooltipNearTheQuestionOnTheQuestionnairePage(int index) {
        Pages.questionnairePage().hoverOverTooltip(index);
    }

    @Then("The tooltip window is displayed")
    public void theTooltipWindowIsDisplayed() {
        Assert.assertTrue(Pages.questionnairePage().isTooltipWindowDisplayed());
    }

    @And("The tooltip window's comment is {string} on the [Questionnaire] page")
    public void theTooltipWindowSCommentIsOnTheQuestionnairePage(String comment) {
        Assert.assertEquals(Pages.questionnairePage().getTooltipWindowComment(), comment);
    }

    @And("The tooltip window's URL is {string} on the [Questionnaire] page")
    public void theTooltipWindowSURLIsOnTheQuestionnairePage(String url) {
        Assert.assertEquals(Pages.questionnairePage().getTooltipWindowURL(), url);
    }

    @And("Select questions to match the complex selector criteria 2.0")
    public void selectQuestionsToMatchTheComplexSelectorCriteria2() {
        Pages.questionnairePage().selectQuestion(1);
        Pages.questionnairePage().selectQuestion(3);
        Pages.questionnairePage().selectQuestion(42);
        Pages.questionnairePage().selectQuestion(46);
        Pages.questionnairePage().selectQuestion(77);
        Pages.questionnairePage().selectQuestion(78);
        Pages.questionnairePage().selectQuestion(81);
        Pages.questionnairePage().selectQuestion(83);
    }
}
