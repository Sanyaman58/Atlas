package com.lighthouse.bdd.steps.admin;

import Pages.Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class QuestionnaireAdminPageStepDefinitions {

    @Then("The [Questionnaire Admin] page is opened")
    public void theQuestionnaireAdminPageIsOpened() {
        Assert.assertTrue(Pages.questionnaireAdminPage().isQuestionnaireAdminPageOpened());
    }

    @Then("The [Questionnaire Versions] page is opened")
    public void theQuestionnaireVersionsPageIsOpened() {
        Pages.questionnaireAdminPage().isQuestionnaireVersionsPageOpened();
    }

    @When("Select {int} question on the [Questionnaire] page")
    public void selectQuestionOnTheQuestionnairePage(int index) {
        Pages.questionnairePage().selectQuestion(index);
    }
}
