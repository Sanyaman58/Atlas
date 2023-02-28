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
        Pages.questionnairePage().selectQuestion(5);
        Pages.questionnairePage().selectQuestion(6);
        Pages.questionnairePage().selectQuestion(8);
        Pages.questionnairePage().selectQuestion(9);
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
}
