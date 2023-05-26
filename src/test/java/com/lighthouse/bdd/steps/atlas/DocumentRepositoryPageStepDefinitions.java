package com.lighthouse.bdd.steps.atlas;

import Pages.Pages;
import Utils.SelenideTools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DocumentRepositoryPageStepDefinitions {


    @Then("The [Document Repository] page is opened")
    public void theRequirementsPageIsOpened() {
        Assert.assertTrue(Pages.documentRepositoryPage().isDocumentRepositoryPageOpened());
    }


    @When("Select {string} client from the client select on the [Document Repository] page")
    public void selectClientFromTheClientSelectOnTheDocumentRepositoryPage(String client) {
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
}
