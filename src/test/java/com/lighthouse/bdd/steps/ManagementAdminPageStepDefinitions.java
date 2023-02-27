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
	
	@And("Check or uncheck the jurisdiction checkbox on [End Up in States]")
	public void checkOrUncheckJurisdictionCheckbox() {
        Pages.clientMasterPage().chekcUncheckEuiCheckbox();
    }
	
	@Then("Click on EUI save button")
    public void clickEuiSaveButton() {
        Pages.clientMasterPage().jurisdictionEuiSaveButton();
    }
	
	@And("Approve and Activate the newly created EUI version")
    public void approveAndActivateEuiVersion() {
        Pages.clientMasterPage().approveActivateEUIVersion();
    }
	
	@And("Verify all the Jurisdictions are displayed in [Jurisidction] dropdown")
    public void verifyAllJurisdictionOnRequirementAdminPage() {
        Pages.clientMasterPage().jurisdictionsInJurisdictionDropdown();
    }
	
	@And("Select {int} value from [Requirement Category] dropdown")
    public void selectValueFronRequirementCategory(int index) {
        Pages.clientMasterPage().selectFromRequirementCategoryDropdown(index);
    }
	
	@And("Select {int} value from [Requirement Type] dropdown")
    public void selectValueFronRequirementType(int index) {
        Pages.clientMasterPage().selectFromRequirementCategoryDropdown(index);
    }
	
	@And("Click on [Create New] button")
    public void clickCreateNewButton() {
        Pages.clientMasterPage().createNewButton();
    }
	
	@And("Click on [General information] Jurisdiction dropdown and verify the count")
    public void verifyAllJurisdictionOnGeneralInfoPage() {
        Pages.clientMasterPage().jurisdictionsInGeneralInfoPage();
    }
	

}
