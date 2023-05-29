package com.lighthouse.bdd.steps.atlas;

import Pages.Pages;
import Utils.SelenideTools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TaskManagerPageStepDefinitions {


    @Then("The [Task Manager] page is opened")
    public void theTaskManagerPageIsOpened() {
        Assert.assertTrue(Pages.atlasDashboardManagementPage().isTaskManagerPageOpened());
    }

    @When("Click on Go to Task button of the {int} record on the [Task Manager] page")
    public void clickOnGoToTaskButtonOfTheRecordOnTheTaskManagerPage(int index) {
        Pages.taskManagerPage().clickGoToTaskButton(index-1);
    }

    @And("Double click on {int} task on the task popup on the [Task Manager] page")
    public void doubleClickOnTaskOnTheTaskPopupOnTheTaskManagerPage(int index) {
        SelenideTools.sleep(5);
        Pages.taskManagerPage().doubleClickOnActiveTask(index-1);
    }

    @Then("Select {string} task status on the Edit Task window on the [Task Manager] page")
    public void selectTaskStatusOnTheEditTaskWindowOnTheTaskManagerPage(String status) {
        SelenideTools.sleep(10);
        Pages.taskManagerPage().selectStatus(status);
    }

    @And("Click on Save task button on the EditTask window on the [Task Manager] page")
    public void clickOnSaveTaskButtonOnTheEditTaskWindowOnTheTaskManagerPage() {
        Pages.taskManagerPage().clickSaveTaskButton();
        SelenideTools.sleep(5);
    }

    @Then("Verify that status of the {int} task is changed to {string} on the task popup on the [Task Manager] page")
    public void verifyThatStatusOfTheTaskIsChangedToOnTheTaskPopupOnTheTaskManagerPage(int index, String status) {
        SelenideTools.sleep(2);
        Pages.taskManagerPage().isStatusDisplayed(index-1,status);
    }
}
