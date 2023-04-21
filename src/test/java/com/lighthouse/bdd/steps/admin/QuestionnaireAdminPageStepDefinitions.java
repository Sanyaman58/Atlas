package com.lighthouse.bdd.steps.admin;

import Pages.Pages;
import Utils.SelenideTools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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

    @When("Right click on {int} question on the [Questionnaire Admin] page")
    public void rightClickOnQuestionOnTheQuestionnaireAdminPage(int index) {
        Pages.questionnaireAdminPage().rightClickOnQuestion(index-1);
    }

    @And("Click on the Add Comment context menu button on the [Questionnaire Admin] page")
    public void clickOnTheAddCommentContextMenuButtonOnTheQuestionnaireAdminPage() {
        Pages.questionnaireAdminPage().clickOnContextMenuAddCommentButton();
    }

    @And("The [Add Comment] window is displayed on the [Questionnaire Admin] page")
    public void theAddCommentWindowIsDisplayedOnTheQuestionnaireAdminPage() {
        Assert.assertTrue(Pages.questionnaireAdminPage().isCommentWindowOpened());
    }

    @Then("Enter {string} comment in the [Add Comment] window on the [Questionnaire Admin] page")
    public void enterCommentInTheAddCommentWindowOnTheQuestionnaireAdminPage(String commentText) {
        Pages.questionnaireAdminPage().enterTextInCommentTextarea(commentText);
    }

    @Then("Enter {string} URL in the [Add Comment] window on the [Questionnaire Admin] page")
    public void enterURLInTheAddCommentWindowOnTheQuestionnaireAdminPage(String url) {
        Pages.questionnaireAdminPage().enterLinkInURLInput(url);
    }

    @And("Click on the [Save Comment] button in the [Add Comment] window on the [Questionnaire Admin] page")
    public void clickOnTheSaveCommentButtonInTheAddCommentWindowOnTheQuestionnaireAdminPage() {
        Pages.questionnaireAdminPage().clickOnSaveCommentButton();
        SelenideTools.sleep(5);
    }

    @Then("The tooltip near the {int} question is visible on the [Questionnaire Admin] page")
    public void theTooltipNearTheQuestionIsVisibleOnTheQuestionnaireAdminPage(int index) {
        Assert.assertTrue(Pages.questionnaireAdminPage().isTooltipVisible(index));
    }

    @And("Click on [Update Comment] icon of the {int} question on the [Questionnaire Admin] page")
    public void clickOnUpdateCommentIconOfTheQuestionOnTheQuestionnaireAdminPage(int index) {
        Pages.questionnaireAdminPage().clickOnUpdateCommentIcon(index-1);
    }

    @When("Click on the [Save] button on the [Questionnaire Admin] page")
    public void clickOnTheSaveButtonOnTheQuestionnaireAdminPage() {
        Pages.questionnaireAdminPage().clickOnSaveQuestionnaireButton();
        SelenideTools.sleep(6);
    }

    @Then("Click on the {string} label on the [Questionnaire Versions] page is opened")
    public void clickOnTheLabelOnTheQuestionnaireVersionsPageIsOpened(String label) {
        SelenideTools.sleep(2);
        Pages.questionnaireAdminPage().clickOnQuestionnaireVersionLabel(label);
    }

    @And("Activate the {int} questionnaire version on the [Questionnaire Versions] page")
    public void activateTheQuestionnaireVersionOnTheQuestionnaireVersionsPage(int index) {
        Pages.questionnaireAdminPage().activateTheQuestionnaireVersion(index-1);
    }

    @And("Click on the [Yes Approve] button on the [Questionnaire Versions] page")
    public void clickOnTheYesApproveButtonOnTheQuestionnaireVersionsPage() {
        Pages.questionnaireAdminPage().clickYesApproveButton();
        SelenideTools.sleep(5);
    }

    @And("Approve the {int} questionnaire version on the [Questionnaire Versions] page")
    public void approveTheQuestionnaireVersionOnTheQuestionnaireVersionsPage(int index) {
        Pages.questionnaireAdminPage().approveTheQuestionnaireVersion(index-1);
    }

    @And("Click on the Activate Deactivate context menu button on the [Questionnaire Admin] page")
    public void clickOnTheActivateDeactivateContextMenuButtonOnTheQuestionnaireAdminPage() {
        Pages.questionnaireAdminPage().clickOnContextMenuActivateDeactivateButton();
    }

    @Then("Select Activate value of the Activate Deactivate select near the {int} question on the [Questionnaire Admin] page")
    public void selectValueOfTheActivateDeactivateSelectNearTheQuestionOnTheQuestionnaireAdminPage(int index) {
        Pages.questionnaireAdminPage().selectActivate(index);
    }

    @Then("Select Deactivate value of the Activate Deactivate select near the {int} question on the [Questionnaire Admin] page")
    public void selectValueOfTheDeactivateSelectNearTheQuestionOnTheQuestionnaireAdminPage(int index) {
        Pages.questionnaireAdminPage().selectDeactivate(index);
    }

    @Then("The {int} question is deactivated")
    public void theQuestionIsDeactivated(int index) {
        Assert.assertTrue(Pages.questionnaireAdminPage().isQuestionDeactivated(index));
    }

    @Then("The {int} question is activated")
    public void theQuestionIsActivated(int index) {
        Assert.assertFalse(Pages.questionnaireAdminPage().isQuestionDeactivated(index));
    }
}
