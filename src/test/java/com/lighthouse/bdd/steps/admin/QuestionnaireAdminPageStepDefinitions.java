package com.lighthouse.bdd.steps.admin;

import Pages.Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QuestionnaireAdminPageStepDefinitions {

    @Then("The [Questionnaire Admin] page is opened")
    public void theQuestionnaireAdminPageIsOpened() {
        Pages.questionnaireAdminPage().isQuestionnaireAdminPageOpened();
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
