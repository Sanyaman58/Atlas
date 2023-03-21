package Pages;

import Utils.SelenideTools;
import base.PageTools;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

public class ClientMasterPage extends PageTools {

	By clientMasterPageTitle = By.xpath("//p[@class=' li-text']");
	By addClientButton = By.xpath("//button[text()='ADD Client ']");
	By addClientsPopupWindowTitle = By.xpath("//p[@class='company-1 mb-1']");
	By addClientTableLabels = By.xpath("//*[@id=\"modal-content\"]/div/div[2]//label");
	By jurisdictionPageFirstCheckbox = By.xpath("//*[@id=\"Alabama\"]");
	By EuiSaveButton = By.xpath("//*[@id=\"save_state\"]");
	By EuiVersionApproveButton = By.xpath("//button[@class=\"approve approve-document\"]");
	By EuiApprovePopupYesButton = By.xpath("//button[@id=\"yes_btn\"]");
	By versionedEuiPageVersionHeader = By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[3]/div/label");
	By EuiVersionActivateButton = By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[8]/div/button/i");
	By jurisdictionDropwdown = By.xpath("//select[@id=\"filter_Jurisdiction\"]");
	By requirementCategoryDropdown = By.xpath("//*[@id=\"Requirement_Category\"]");
	By requirementTypeDropdown = By.xpath("//*[@id=\"Requirement_Type\"]");
	By requirementCreateNewButton = By.xpath("//*[@id=\"start_new\"]");
	By genralInfoPageJurisdictionDropdown = By.xpath("//*[@id=\"Jurisdiction\"]");
	By stateCheckboxes = By.xpath("//form[@id='mange-job-research']//div[@class='row']//div[@class='list-checkbox']");
	By surveillanceIntelligenceDropdown = By.xpath("//*[@id=\"menu\"]/li[5]/a");
	By configurationDropdownButton = By.xpath("//*[@id=\"menu\"]/li[5]/ul/li[1]/a");
	By resultsDropdownButton = By.xpath("//*[@id=\"menu\"]/li[5]/ul/li[2]/a");
	By activityLogOption = By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]/div/a");
	By activityLogTitle = By.xpath("//*[@id=\"wrapper\"]/main/div/section/div/div[1]/h2");
	By activityLogFilter = By.xpath("//*[@id=\"DataTables_Table_0_length\"]/label/select");
	By setupPageNextButton = By.xpath("//*[@id=\"submit-new\"]");
	By existingConfiguration = By.xpath("//*[@id=\"DataTables_Table_0\"]//tbody//tr");
	By endUpInStatesTitle = By.xpath("//*[@id=\"wrapper\"]/main/div/section/div/div[1]/h2");
	By jurisdictionPageStates = By.xpath("//label[@class=\"ml-1 jurisdictions_check-text\"]");

	HashMap<String, Boolean> statesCheckboxes = new HashMap<>();
	HashMap<String, Boolean> statesCheckboxesToCompare = new HashMap<>();
	String categoryName;
	String requirementTypeName;
	String All;

	public boolean isClientMasterPageOpened() {
		waitForElementVisibility(clientMasterPageTitle);
		return isElementVisible(clientMasterPageTitle);
	}

	public void clickSubmitNewJobButton() {
		waitForElementClickable(addClientButton);
		click(addClientButton);
		SelenideTools.sleep(1);
	}

	public boolean isAddClientPopupWindowOpened() {
		waitForElementVisibility(addClientsPopupWindowTitle);
		return isElementVisible(addClientsPopupWindowTitle);
	}

	public void isAddClientTableLabelsPresent(List<String> labels) {
		List<String> tableLabelsList = new ArrayList<>();
		List<SelenideElement> elements = getElements(addClientTableLabels);
		for (SelenideElement element : elements) {
			tableLabelsList.add(element.getText());
			System.out.println(element.getText());
		}
		System.out.println("-------------------------");
		System.out.println("Verifying the data tables");
		System.out.println("-------------------------");
		tableLabelsList.add(getSelenideElement(addClientTableLabels).getText());
		for (int i = 0; i < labels.size(); i++) {
			System.out.println(labels.get(i) + " " + tableLabelsList.get(i));
			if ((labels.get(i) == null)) {
				System.out.println("Value is null");
			} else if (!labels.get(i).equals(tableLabelsList.get(i))) {
				System.out.println("Value is not equal");
			}
		}
	}

	public void chekcUncheckEuiCheckbox() {
		SelenideElement jurisdictionPageFirstCheckboxElement = getSelenideElement(jurisdictionPageFirstCheckbox)
				.shouldBe(Condition.visible);
		if (jurisdictionPageFirstCheckboxElement.isSelected()) {
			jurisdictionPageFirstCheckboxElement.click();
			System.out.println("Unchecked the checkbox");
		} else {
			jurisdictionPageFirstCheckboxElement.click();
		}
	}

	public void jurisdictionEuiSaveButton() {
		waitForElementClickable(EuiSaveButton);
		click(EuiSaveButton);
		SelenideTools.sleep(1);
	}

	public void approveActivateEUIVersion() {
		SelenideElement versionedEuiPageVersionHeaderElement = getSelenideElement(versionedEuiPageVersionHeader)
				.shouldBe(Condition.visible);
		versionedEuiPageVersionHeaderElement.doubleClick();

		waitForElementClickable(EuiVersionApproveButton);
		click(EuiVersionApproveButton);
		SelenideTools.sleep(1);

		waitForElementVisibility(EuiApprovePopupYesButton);
		click(EuiApprovePopupYesButton);
		SelenideTools.sleep(5);

		versionedEuiPageVersionHeaderElement.doubleClick();
		SelenideTools.sleep(5);

		SelenideElement EuiVersionActivateButtonElement = getSelenideElement(EuiVersionActivateButton)
				.shouldBe(Condition.visible);
		EuiVersionActivateButtonElement.click();

		waitForElementVisibility(EuiApprovePopupYesButton);
		click(EuiApprovePopupYesButton);
		SelenideTools.sleep(5);
	}

	public void jurisdictionsInJurisdictionDropdown() {
		SelenideElement jurisdictionDropdownElement = getSelenideElement(jurisdictionDropwdown)
				.shouldBe(Condition.visible);
		int dropdownElementCount = jurisdictionDropdownElement.findAll("option").size();
		if (dropdownElementCount == 53) {
			List<String> options = jurisdictionDropdownElement.findAll("options").texts();
			System.out.println("Total count of elements present in jurisdiction dropdown = " + dropdownElementCount);
			System.out.println("Text of elements present in jurisdiction dropdown = " + options);
		} else {
			System.out.println("Count mismatch");
		}
	}

	public void selectFromRequirementCategoryDropdown(int index) {
		waitForElementClickable(requirementCategoryDropdown);
		getSelenideElement(requirementCategoryDropdown).selectOption(index);
		categoryName = getSelenideElement(requirementCategoryDropdown).getText();
	}

	public void selectFromRequirementCategoryType(int index) {
		waitForElementClickable(requirementTypeDropdown);
		getSelenideElement(requirementTypeDropdown).selectOption(index);
		requirementTypeName = getSelenideElement(requirementTypeDropdown).getText();
		SelenideTools.sleep(5);
	}

	public void createNewButton() {
		waitForElementClickable(requirementCreateNewButton);
		click(requirementCreateNewButton);
		SelenideTools.sleep(6);
	}

	public void jurisdictionsInGeneralInfoPage() {
		SelenideElement jurisdictionDropdownOnGeneralInfoElement = getSelenideElement(
				genralInfoPageJurisdictionDropdown).shouldBe(Condition.visible);
		int jurisdictionDropdownElementCount = jurisdictionDropdownOnGeneralInfoElement.findAll("option").size();
		if (jurisdictionDropdownElementCount == 53) {
			List<String> options = jurisdictionDropdownOnGeneralInfoElement.findAll("options").texts();
			System.out.println(
					"Total count of elements present in jurisdiction dropdown = " + jurisdictionDropdownElementCount);
			System.out.println("Text of elements present in jurisdiction dropdown = " + options);
		} else {
			System.out.println("Count mismatch");
		}
	}

	public void reloadBrowser() {
		WebDriverRunner.getWebDriver().navigate().refresh();
		SelenideTools.sleep(8);
	}

	public void getStateCheckboxesValuesAndCount() {
		for (SelenideElement element : getElements(stateCheckboxes)) {
			statesCheckboxes.put(element.findElement(By.xpath("./label")).getText(),
					element.findElement(By.xpath("./input")).isSelected());
		}
		SelenideElement jurisdictionStatesElement = getSelenideElement(stateCheckboxes).shouldBe(Condition.visible);
		int stateCheckboxesElementCount = jurisdictionStatesElement.findAll("div").size();
		if (stateCheckboxesElementCount == 52) {
			System.out.println(
					"Total count of elements present in jurisdiction dropdown = " + stateCheckboxesElementCount);
		} else {
			System.out.println("Count mismatch");
		}
	}

	public void clickSurveillanceDropdown() {
		waitForElementClickable(surveillanceIntelligenceDropdown);
		click(surveillanceIntelligenceDropdown);
		SelenideTools.sleep(1);
		waitForElementVisibility(configurationDropdownButton);
		waitForElementVisibility(resultsDropdownButton);
	}

	public void clickResulsDropdownButton() {
		waitForElementVisibility(resultsDropdownButton);
		click(resultsDropdownButton);
		SelenideTools.sleep(1);
	}

	public void clickActivityLogOfLineItem() {
		waitForElementVisibility(activityLogOption);
		click(activityLogOption);
	}

	public void verifyActivityLogScreen() {
		waitForElementVisibility(activityLogTitle);
		waitForElementVisibility(activityLogFilter);

		SelenideElement activityLogFilterElement = getSelenideElement(activityLogFilter).shouldBe(Condition.visible);
		activityLogFilterElement.getText();
		if (activityLogFilterElement.getText() == "All") {
			System.out.println("Filter is already set to 'All'");
		} else {
			System.out.println("Filter is not set to 'All'");
		}
	}

	public void verifyNextButtonEnabled() {
		SelenideTools.sleep(6);
		SelenideElement setupPageNextButtonElement = getSelenideElement(setupPageNextButton)
				.shouldBe(Condition.visible);
		if (setupPageNextButtonElement.isEnabled()) {
			System.out.println("Next button is enabled");
		} else {
			System.out.println("Next button is disabled");
		}
	}
	
	public void euiStates() {
		boolean endUpInStatesTitleElement = getSelenideElement(endUpInStatesTitle).isDisplayed();
		System.out.println("Element displayed = "+ endUpInStatesTitleElement);
		List<SelenideElement> jurisdictionPageStatesElement = getElements(jurisdictionPageStates);
		if(jurisdictionPageStatesElement.size() >0) {
			System.out.println("EUI states visible");
		}
	}
	
	

}
