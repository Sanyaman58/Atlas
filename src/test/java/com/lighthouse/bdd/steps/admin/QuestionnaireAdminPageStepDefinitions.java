package com.lighthouse.bdd.steps.admin;

import Pages.Pages;
import io.cucumber.java.en.And;
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

    @When("Right click on {int} question on the [Questionnaire Admin] page")
    public void rightClickOnQuestionOnTheQuestionnaireAdminPage(int index) {
    }

    @And("Click on the Add Comment context menu button on the [Questionnaire Admin] page")
    public void clickOnTheAddCommentContextMenuButtonOnTheQuestionnaireAdminPage() {
        Pages.questionnaireAdminPage().clickOnContextMenuAddCommentButton();
    }

    @And("The [Add Comment] window is displayed on the [Questionnaire Admin] page")
    public void theAddCommentWindowIsDisplayedOnTheQuestionnaireAdminPage() {
        Assert.assertTrue(Pages.questionnaireAdminPage().isCommentWindowOpened());
    }
}
