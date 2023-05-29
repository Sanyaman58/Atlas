package com.lighthouse.bdd.steps.atlas;

import Pages.Pages;
import Utils.SelenideTools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;

public class DocumentRepositoryPageStepDefinitions {


    @Then("The [Document Repository] page is opened")
    public void theRequirementsPageIsOpened() {
        Assert.assertTrue(Pages.documentRepositoryPage().isDocumentRepositoryPageOpened());
    }


    @When("Select {string} client from the client select on the [Document Repository] page")
    public void selectClientFromTheClientSelectOnTheDocumentRepositoryPage(String client) {
        SelenideTools.sleep(2);
        Pages.documentRepositoryPage().selectClient(client);
    }

    @Then("Enter {string} text in the search field on the [Document Repository] page")
    public void enterTextInTheSearchFieldOnTheDocumentRepositoryPage(String text) {
        Pages.documentRepositoryPage().enterTextInSearchField(text);
    }

    @And("Double click on the record on the [Document Repository] page")
    public void doubleClickOnTheRecordOnTheDocumentRepositoryPage() {
        SelenideTools.sleep(2);
        Pages.documentRepositoryPage().doubleClickOnRecord();
    }

    @Then("The [Edit Document] window is opened")
    public void theEditDocumentWindowIsOpened() {
        SelenideTools.sleep(5);
        Pages.documentRepositoryPage().isEditDocumentWindowOpened();
    }

    @When("Close the [Edit Document] window")
    public void closeTheEditDocumentWindow() {
        Pages.documentRepositoryPage().closeEditDocumentWindow();
    }

    @Then("Verify that +PDF button is visible")
    public void verifyThatButtonIsVisible() {
        Pages.documentRepositoryPage().isPDFButtonVisible();
    }

    @And("Click on the +PDF button")
    public void clickOnThePDFButton() {
        Pages.documentRepositoryPage().clickPDFButton();
    }

    @And("Verify that Select File button is visible on the [Edit Document] window")
    public void verifyThatSelectFileButtonIsVisibleOnTheEditDocumentWindow() {
        Assert.assertTrue(Pages.documentRepositoryPage().isSelectFileButtonVisible());
    }

    @When("Click on Request Document button on the [Document Repository] page")
    public void clickOnRequestDocumentButtonOnTheDocumentRepositoryPage() {
        SelenideTools.sleep(3);
        Pages.documentRepositoryPage().clickRequestDocumentButton();
    }

    @Then("The [Add Request Document] window is displayed")
    public void theAddRequestDocumentWindowIsDisplayed() {
        Assert.assertTrue(Pages.documentRepositoryPage().isAddRequestDocumentWindowVisible());
    }

    @When("Select {string} document category on [Add Request Document] window")
    public void selectDocumentCategoryOnAddRequestDocumentWindow(String category) {
        Pages.documentRepositoryPage().selectDocumentCategory(category);
    }

    @And("Enter random owner name on [Add Request Document] window")
    public void enterRandomOwnerNameOnAddRequestDocumentWindow() {
        Pages.documentRepositoryPage().enterOwnerName(RandomStringUtils.random(10, true, false));
    }

    @And("Select {string} assignee on [Add Request Document] window")
    public void selectAssigneeOnAddRequestDocumentWindow(String assignee) {
        Pages.documentRepositoryPage().selectAssignee(assignee);
    }

    @And("Select {string} document type on [Add Request Document] window")
    public void selectDocumentTypeOnAddRequestDocumentWindow(String type) {
        Pages.documentRepositoryPage().selectDocumentType(type);
    }

    @And("Click on Save button on [Add Request Document] window")
    public void clickOnSaveButtonOnAddRequestDocumentWindow() {
        Pages.documentRepositoryPage().clickAddRequestDocumentSaveButton();
    }

    @Then("A newly created document is displayed in the table on the [Document Repository] page")
    public void aNewlyCreatedDocumentIsDisplayedInTheTableOnTheDocumentRepositoryPage() {
        SelenideTools.sleep(5);
        Assert.assertTrue(Pages.documentRepositoryPage().isDocumentWithOwnerDisplayed(Pages.documentRepositoryPage().getOwnerName()));
    }

    @Then("A newly created document is not displayed in the table on the [Document Repository] page")
    public void aNewlyCreatedDocumentIsNotDisplayedInTheTableOnTheDocumentRepositoryPage() {
        SelenideTools.sleep(5);
        Assert.assertTrue(!Pages.documentRepositoryPage().isDocumentWithOwnerDisplayed(Pages.documentRepositoryPage().getOwnerName()));
    }

    @And("Select [Yes] confidential document radio button on [Add Request Document] window")
    public void selectYesConfidentialDocumentRadioButtonOnAddRequestDocumentWindow() {
        Pages.documentRepositoryPage().selectYesConfidentialDocumentRadioButton();
    }
}
