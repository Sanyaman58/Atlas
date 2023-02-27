package com.lighthouse.bdd.steps;
import Pages.Pages;
import Utils.SelenideTools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import org.junit.Assert;

import com.codeborne.selenide.Selenide;

public class ManagementAdminPageStepDefinitions {

	@Then("The [Client Master] page is opened")
    public void clientMasterPageIsOpened() {
        Assert.assertTrue(Pages.clientMasterPage().isClientMasterPageOpened());
    }
	
	@Then("Click [Add Client] button")
    public void clickAddClinetButton() {
        Pages.clientMasterPage().clickSubmitNewJobButton();
    }
	
	@Then("add client popup wondow is opened")
    public void addClientPopIsOpened() {
		Assert.assertTrue(Pages.clientMasterPage().isClientMasterPageOpened());
    }
	
	@Then("verify the following fileds are displayed on the client master page")
	public void theFollowingAddClientLabelsAreDisplayed(List<String> listOfLabels) {
        Pages.clientMasterPage().isAddClientTableLabelsPresent(listOfLabels);
    }
	
	@And("Verify the [Surveillance Setup] section")
	public void verifySurveillanceSetupSection() {
		Pages.clientMasterPage().clientLabel();
		Pages.clientMasterPage().companyLabel();
		Pages.clientMasterPage().facilityLabel();
		Pages.clientMasterPage().helpToolTip();
	}
	
	@Then("Validate the [Modify Existing Surveillance Configuration] table elements")
	public void verifyModifyExistingSurveillanceTableData(List<String> listOfLabels) {
		Pages.clientMasterPage().surveillancePageTableHeaders(listOfLabels);
    }
	
	@Then("Verify radio button is enabled")
	public void verifyRadioButton() {
		Pages.clientMasterPage().radioButtonEnabled();
    }
	
	@Then("Verify [Delete] button is clickable")
	public void verifyDeleteButton() {
		Pages.clientMasterPage().deleteButtonClickable();
    }
	
	@Then("Click surveillance setup [Next] button")
	public void clickSurveillanceSetupNextButton() {
		SelenideTools.sleep(20);
		Pages.clientMasterPage().clickNextButton();
    }
	
	@Then("Verify the Validation popup")
	public void verifyNextButtonPopup() {
		Pages.clientMasterPage().nextButtonValidationPopup();
    }
	
	@Then("Navigate back to surveillance page")
	public void selectJob() {
		Pages.clientMasterPage().selectJobOnSurveillancePage();
    }
	
	@Then("Reload the browser")
	public void browserReload() {
		Pages.clientMasterPage().reloadBrowser();
    }
	
	@Then("Select radio button of existing job and click Next")
	public void selectRadioButton() {
		Pages.clientMasterPage().existingJobRadioButton();
    }
	
	@Then("Verify labels on [Jurisdiction] page")
	public void verifyLabelsOnJurisdictionPage() {
		Pages.clientMasterPage().labelsOnJurisdictionPage();
    }
	
	@Then("Click on [Clear All] button")
	public void verifyClickOnClearAllButton() {
		Pages.clientMasterPage().clickClearAllButton();
    }
	
	@And("Verify all checkboxes are not selected")
    public void verifyUnSelectedCheckbox() {
        Pages.clientMasterPage().unselectedCheckbox();
    }
	
	@And("Verify child questions ae unclickable as parent questions are not clicked")
    public void verifyChildQuestionUnclickable() {
        Pages.clientMasterPage().clickChildQuestion();
    }
	
	@And("Validate the lables on the [SaveSubmit Job] page")
    public void verifySaveSubmitPageLabels() {
        Pages.clientMasterPage().saveSubmitPageLabels();
    }

}
