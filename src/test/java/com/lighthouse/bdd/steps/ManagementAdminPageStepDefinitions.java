package com.lighthouse.bdd.steps;
import Pages.Pages;
import Utils.SelenideTools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import org.junit.Assert;

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

}
