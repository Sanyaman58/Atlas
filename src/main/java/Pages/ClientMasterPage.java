package Pages;

import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

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
	By clientMasterSidebarButton = By.xpath("//ul[@id='menu']/li[9]/ul/li[1]");
	By userMasterSidebarButton = By.xpath("//ul[@id='menu']/li[9]/ul/li[13]");
	By userMasterPageTitle = By.xpath("//p[@class=' li-text']");
	By addUserButton = By.xpath("//button[text()='ADD User ']");
	By addUserPopupWindowTitle = By.xpath("//p[@class='company-1 mb-1']");
	By categoryDropdown = By.xpath("//select[@id='UserCategoryKey']");
	By categoryDropdownElements = By.xpath("//select[@id='UserCategoryKey']//option");
	By userRoleComplianceDropdown = By.xpath("//select[@id='UserRoleComplianceKey']");
	By userRoleComplianceDropdownElements = By.xpath("//select[@id='UserRoleComplianceKey']//option");
	By clientLabel = By.xpath("//*[@id=\"mange-job-research\"]/div/div[1]/div[2]/div/div[1]/div/label");
	By companyLabel = By.xpath("//*[@id=\"mange-job-research\"]/div/div[1]/div[2]/div/div[2]/label");
	By facilityLabel = By.xpath("//*[@id=\"mange-job-research\"]/div/div[1]/div[2]/div/div[3]/label");
	By helpToolTipLabel = By.xpath("//*[@id=\"mange-job-research\"]/div/div[1]/div[2]/div/div[3]/label/span[2]");
	By surveillancePageHeaders = By.xpath("//div[@class='dataTables_scrollHeadInner']//table//th");
	By configurationRadioButton = By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[1]/input");
	By configurationDeleteButton = By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]/div/button");
	By deletePopupBodyText = By.xpath("//*[@id=\"confirmation-modal\"]/div/div/div[2]/p");
	By deletePoupCloseButton = By.xpath("//*[@id=\"confirmation-modal\"]/div/div/div[1]/button");
	By surveillanceSetupNextButton = By.xpath("//*[@id=\"submit-new\"]");
	By nextButtonPopupBody = By.xpath("//*[@id=\"alert-msg\"]");
	By nextButtonPopupCrossIcon = By.xpath("//*[@id=\"alert-modal\"]/div/div/div[1]/button");
	By existingJobNextButton = By.xpath("//*[@id=\"copyfrom_research_job\"]");
	By selectResidentStateLabel = By.xpath("//*[@id=\"mange-job-research\"]/div[1]/div/div/label");
	By selectJurisdictionsLabel = By.xpath("//*[@id=\"mange-job-research\"]/div[2]/div/div/div[1]/label");
	By jusrisdictionPageSelectAllButton = By.xpath("//*[@id=\"jurisdictions_select_all\"]");
	By jurisdictionPageClearAllButton = By.xpath("//*[@id=\"jurisdictions_unselect_all\"]");
	By jurisdictionPageNextButton = By.xpath("//*[@id=\"save_juricdis\"]");
	By jurisdictionPageCheckboxes = By.xpath("//*[@id=\"mange-job-research\"]/div[2]/div/div/div[2]//input");
	By childQuestionRadioButton = By.xpath("//*[@id=\"POS1.1_Y\"]");
	By questionnaireClearAllButton = By.xpath("//*[@id=\"clear_all_questionnaire\"]");
    By checkboxText = By.xpath("//label[@class=\"ml-1 jurisdictions_check-text\"]");
	By checkboxInputField = By.xpath("//input[@name=\"juricdictions[]\"]");
	By submitPageJurisidctionCheckboxText = By.xpath("//div[@class=\"ml-2\"]//label");
	By viewResultButton = By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]/div/button[1]");
	By deleteResultButtton = By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]/div/button[2]");
	By versionRequirementsOption = By.xpath("//*[@id=\"menu\"]/li[10]/ul/li[4]/a");
	By versionRequirementsHeader = By.xpath("//*[@id=\"wrapper\"]/main/div/section/div[1]/div[1]/h2");
	By editRequirementButton = By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[11]/div/a[2]");
	By viewRequirementButton = By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[11]/div/a[1]");
	By approveRequirementButton = By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[11]/div/button[2]");
	By permissionsDropdownOption = By.xpath("//*[@id=\"menu\"]/li[10]/ul/li[9]/a");
	By permissionsPageHeader = By.xpath("//*[@id=\"wrapper\"]/main/div/section/div/div[1]/h2");
	By systemAdminPermissionsCheckboxes = By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody//td[2]/input");
	By facilityDeleteButton = By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]/div/button");
	By deleteRequirementButton = By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[11]/div/button");
	By statusInputField = By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[10]/input");
	By activateRequirementToggle = By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[11]/div/div/label/input");
	By saveSubmitPageCompanyName = By.xpath("//*[@id=\"mange-job-research\"]/div/div[1]/div/label");
	By saveSubmitPageLabelName = By.xpath("//*[@id=\"mange-job-research\"]/div/div[2]/div/label");
	By saveSubmitPageResidentState = By.xpath("//*[@id=\"mange-job-research\"]/div/div[3]/div/label");
	By saveSubmitPageCheckbox = By.xpath("//input[@name='juricdictions[]']");
	By saveSubmitPageChangeButton = By.xpath("//a[@class='btn common-btn']");


	HashMap<String, Boolean> statesCheckboxes = new HashMap<>();
	HashMap<String, Boolean> statesCheckboxesToCompare = new HashMap<>();
	String categoryName;
	String requirementTypeName;
	String All;
	String clientLabelText = "Client";
	String companyLabelText = "Company *";
	String facilityLabelText = "Facility * Help Tip";
	String helpToolTipLabelText = "Help Tip";
	String deletePopupText = "The selected research will be deleted and cannot be undone. Are you sure want to delete?";
	String nextButtonPopupBodyText = "Please enter all required fields";
	String selectResidentStateLabelText = "Please select the resident state for your facility: *";
	String selectJurisdictionLabelText = "Please select all jurisdictions you would like to include in this facility configuration:";
	String saveSubmitPageCompanyNameText = "Company Name :";
	String saveSubmitPageFacilityNameText = "Facility Name :";
	String saveSubmitPageResidentStateText = "Resident State :";

	HashMap<String, Boolean> jurisdictionPageCheckboxesInput = new HashMap<>();

	public void clickClientMasterSidebarButton() {
		waitForElementVisibility(clientMasterSidebarButton);
		click(clientMasterSidebarButton);
	}

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

	public void clickUserMasterSidebarButton() {
		waitForElementVisibility(userMasterSidebarButton);
		click(userMasterSidebarButton);
	}

	public boolean isUserMasterPageOpened() {
		waitForElementVisibility(userMasterPageTitle);
		return isElementVisible(userMasterPageTitle);
	}

	public void clickAddUserButton() {
		waitForElementClickable(addUserButton);
		click(addUserButton);
		SelenideTools.sleep(6);
	}

	public boolean isAddUserPopupWindowOpened() {
		waitForElementVisibility(addUserPopupWindowTitle);
		return isElementVisible(addUserPopupWindowTitle);
	}

	public void clickCategoryDropdown() {
		waitForElementClickable(categoryDropdown);
		click(categoryDropdown);
		SelenideTools.sleep(3);
	}

	public void isCategoryRolesPresentInDropdown(List<String> labels) {
		List<String> tableLabelsList = new ArrayList<>();
		List<SelenideElement> elements = getElements(categoryDropdownElements);
		for (SelenideElement element : elements) {
			tableLabelsList.add(element.getText());
			System.out.println(element.getText());
		}
		System.out.println("-------------------------");
		System.out.println("Verifying the data tables");
		System.out.println("-------------------------");
		tableLabelsList.add(getSelenideElement(categoryDropdownElements).getText());
		for (int i = 0; i < labels.size(); i++) {
			System.out.println(labels.get(i) + " " + tableLabelsList.get(i));
			if ((labels.get(i) == null)) {
				System.out.println("Value is null");
			} else if (!labels.get(i).equals(tableLabelsList.get(i))) {
				System.out.println("Value is not equal");
			}
		}
	}

	public void selectUserCategory(String client) {
		waitForElementVisibility(categoryDropdown);
		selectOption(client, categoryDropdown);
		SelenideTools.sleep(10);
	}

	public void clickRolesComplianceIntelligenceDropdown() {
		waitForElementClickable(userRoleComplianceDropdown);
		click(userRoleComplianceDropdown);
		SelenideTools.sleep(3);
	}

	public void isuserRoleCompliancePresentInDropdown(List<String> labels) {
		List<String> tableLabelsList = new ArrayList<>();
		List<SelenideElement> elements = getElements(userRoleComplianceDropdownElements);
		for (SelenideElement element : elements) {
			tableLabelsList.add(element.getText());
			System.out.println(element.getText());
		}
		System.out.println("-------------------------");
		System.out.println("Verifying the data tables");
		System.out.println("-------------------------");
		tableLabelsList.add(getSelenideElement(userRoleComplianceDropdownElements).getText());

		for (int i = 0; i < labels.size(); i++) {
			System.out.println(labels.get(i) + " " + tableLabelsList.get(i));
			if ((labels.get(i) == null)) {
				System.out.println("Value is null");
			} else if (!labels.get(i).equals(tableLabelsList.get(i))) {
				System.out.println("Value is not equal");
			}
		}
	}

	public boolean nouserRoleCompliancePresentInDropdown() {
		SelenideElement userRoleCount = getSelenideElement(userRoleComplianceDropdownElements);
		return isElementVisible(userRoleComplianceDropdownElements);
	}

	public void clientLabel() {
		SelenideElement clientLabelElement = getSelenideElement(clientLabel);
		assertEquals(clientLabelElement.getText(), clientLabelText);
	}

	public void companyLabel() {
		SelenideElement companyLabelElement = getSelenideElement(companyLabel);
		assertEquals(companyLabelElement.getText(), companyLabelText);
	}

	public void facilityLabel() {
		SelenideElement facilityLabelElement = getSelenideElement(facilityLabel);
		assertEquals(facilityLabelElement.getText(), facilityLabelText);
	}

	public void helpToolTip() {
		SelenideElement helpToolTipLabelElement = getSelenideElement(helpToolTipLabel);
		assertEquals(helpToolTipLabelElement.getText(), helpToolTipLabelText);
		Actions actions = new Actions(WebDriverRunner.getWebDriver());
		actions.moveToElement(helpToolTipLabelElement).perform();

		String actualTitle = helpToolTipLabelElement.getAttribute("title");
		System.out.println("Actual title of the tool tip = " + actualTitle);
		String expectedTitle = "Suggestion: Use the City and State the facilty resides in for the facility name.";
		System.out.println("Expected title of the tool tip = " + actualTitle);
		assertEquals(expectedTitle, actualTitle);
	}

	public void surveillancePageTableHeaders(List<String> labels) {
		List<String> tableLabelsList = new ArrayList<>();
		List<SelenideElement> elements = getElements(surveillancePageHeaders);
		for (SelenideElement element : elements) {
			tableLabelsList.add(element.getText());
			System.out.println(element.getText());
		}
		System.out.println("-------------------------");
		System.out.println("Verifying the data tables");
		System.out.println("-------------------------");
		tableLabelsList.add(getSelenideElement(surveillancePageHeaders).getText());
		for (int i = 0; i < labels.size(); i++) {
			System.out.println(labels.get(i) + " " + tableLabelsList.get(i));
			if ((labels.get(i) == null)) {
				System.out.println("Value is null");
			} else if (!labels.get(i).equals(tableLabelsList.get(i))) {
				System.out.println("Value is not equal");
			}
		}
	}

	public void radioButtonEnabled() {
		SelenideElement configurationRadioButtonElement = getSelenideElement(configurationRadioButton);
		if (configurationRadioButtonElement.isEnabled()) {
			System.out.println("Radio button is enabled");
		} else {
			System.out.println("Radio button is enabled");
		}
	}

	public void deleteButtonClickable() {
		SelenideElement configurationDeleteButtonElement = getSelenideElement(configurationDeleteButton);
		if (configurationDeleteButtonElement.isEnabled()) {
			System.out.println("Delete button is enabled");
		} else {
			System.out.println("Delete button is enabled");
		}
		configurationDeleteButtonElement.click();
		Selenide.sleep(30);
		click(deletePoupCloseButton);
	}

	public void clickNextButton() {
		waitForElementClickable(surveillanceSetupNextButton);
		click(surveillanceSetupNextButton);
		SelenideTools.sleep(1);
	}

	public void nextButtonValidationPopup() {
		SelenideElement nextButtonPopupText = getSelenideElement(nextButtonPopupBody);
		assertEquals(nextButtonPopupText.getText(), nextButtonPopupBodyText);
		click(nextButtonPopupCrossIcon);
	}

	public void selectJobOnSurveillancePage() {
		WebDriverRunner.getWebDriver().navigate().back();
	}

	public void reloadBrowser() {
		WebDriverRunner.getWebDriver().navigate().refresh();
		SelenideTools.sleep(6);
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

	public void existingJobRadioButton() {
		click(configurationRadioButton);
		SelenideTools.sleep(8);
		click(existingJobNextButton);
	}

	

	public void verifyJurisdictionCheckboxLeftPosition() {
		List<SelenideElement> checkboxTextElements = getElements(checkboxText);
		List<SelenideElement> checkboxInputFieldElements = getElements(checkboxInputField);

		for (int i = 0; i < checkboxInputFieldElements.size(); i++) {
			int checkboxX = checkboxInputFieldElements.get(i).getLocation().getX();
			int textX = checkboxTextElements.get(i).getLocation().getX();

			if (checkboxX >= textX) {
				fail("Checkbox is not to  the left of Jurisdiction text");
			}
		}
	}

	public void verifyJurisdictionCheckboxLeftPositionOnSaveSubmitPage() {
		List<SelenideElement> submitPageJurisidctionCheckboxTextElements = getElements(
				submitPageJurisidctionCheckboxText);
		List<SelenideElement> checkboxInputFieldElements = getElements(checkboxInputField);

		for (int i = 0; i < checkboxInputFieldElements.size(); i++) {
			int checkboxX = checkboxInputFieldElements.get(i).getLocation().getX();
			int textX = submitPageJurisidctionCheckboxTextElements.get(i).getLocation().getX();

			if (checkboxX >= textX) {
				fail("Checkbox is not to  the left of Jurisdiction text");
			}
		}
	}
	public void labelsOnJurisdictionPage() {
		SelenideElement residentStateElement = getSelenideElement(selectResidentStateLabel);
		assertEquals(residentStateElement.getText(), selectResidentStateLabelText);

		SelenideElement selectJurisdictionElement = getSelenideElement(selectJurisdictionsLabel);
		assertEquals(selectJurisdictionElement.getText(), selectJurisdictionLabelText);

		waitForElementPresent(jusrisdictionPageSelectAllButton);
		waitForElementPresent(jurisdictionPageClearAllButton);
		waitForElementPresent(jurisdictionPageNextButton);

		List<SelenideElement> jurisdictionPageCheckboxElement = getElements(jurisdictionPageCheckboxes);
		for (SelenideElement element : jurisdictionPageCheckboxElement) {
			element.isDisplayed();
		}
	}

	public void clickClearAllButton() {
		waitForElementPresent(jurisdictionPageClearAllButton);
		click(jurisdictionPageClearAllButton);
	}

	public void unselectedCheckbox() {
		List<SelenideElement> jurisdictionPageCheckBoxElement = getElements(jurisdictionPageCheckboxes);
		for (SelenideElement jurisdictionCheckbox : jurisdictionPageCheckBoxElement) {
			if (jurisdictionCheckbox.isSelected()) {
				fail("Checkbox is selected: " + jurisdictionCheckbox.getAttribute("value"));
			}
		}
	}

	public void clickChildQuestion() {
		SelenideTools.sleep(2);
		click(questionnaireClearAllButton);
		SelenideTools.sleep(5);
		SelenideElement childQuestionRadioButtonElement = getSelenideElement(childQuestionRadioButton);
		if (childQuestionRadioButtonElement.isEnabled()) {
			fail("Checkbox is enabled" + childQuestionRadioButtonElement.getAttribute("value"));
		}
	}
	
	
	
	public void openVersionRequirementsPage() {
		waitForElementVisibility(versionRequirementsOption);
		click(versionRequirementsOption);
		SelenideTools.sleep(3);
		waitForElementVisibility(versionRequirementsHeader);
	}
	
	
	
	public void isActivateRequirementOptionEnabled() {
		SelenideElement statusInputFieldElement = getSelenideElement(statusInputField);
		statusInputFieldElement.clear();
		statusInputFieldElement.setValue("Activated");
		SelenideTools.sleep(2);
		
		SelenideElement activateRequirementToggleElement = getSelenideElement(activateRequirementToggle);
		activateRequirementToggleElement.shouldBe(Condition.enabled);
	}
	
	
	
	public void isDeleteRequirementOptionEnabled() {
		SelenideElement statusInputFieldElement = getSelenideElement(statusInputField);
		statusInputFieldElement.clear();
		statusInputFieldElement.setValue("Invalid");
		SelenideTools.sleep(2);
		SelenideElement deleteRequirementButtonElement = getSelenideElement(deleteRequirementButton);
		deleteRequirementButtonElement.shouldBe(Condition.enabled);
	}
	
	
	public void isEditRequirementOptionEnabled() {
		SelenideElement statusInputFieldElement = getSelenideElement(statusInputField);
		statusInputFieldElement.clear();
		statusInputFieldElement.setValue("Activated");
		SelenideTools.sleep(2);
		SelenideElement editRequirementButtonElement = getSelenideElement(editRequirementButton);
		editRequirementButtonElement.shouldBe(Condition.enabled);
	}
	
	
	
	public void isViewRequirementOptionEnabled() {
		SelenideElement viewRequirementButtonElement = getSelenideElement(viewRequirementButton);
		viewRequirementButtonElement.shouldBe(Condition.enabled);
	}
	
	
	
	public void isApproveRequirementOptionEnabled() {
		SelenideElement statusInputFieldElement = getSelenideElement(statusInputField);
		statusInputFieldElement.clear();
		statusInputFieldElement.setValue("Pending");
		SelenideTools.sleep(2);
		SelenideElement approveRequirementButtonElement = getSelenideElement(approveRequirementButton);
		approveRequirementButtonElement.shouldBe(Condition.enabled);
	}
	
	
	
	public void isIntelligencePermissionsEnabled() {
		waitForElementVisibility(permissionsDropdownOption);
		click(permissionsDropdownOption);
		SelenideTools.sleep(3);
		waitForElementVisibility(permissionsPageHeader);
		List<SelenideElement> systemAdminPermissionsCheckboxesElement = getElements(systemAdminPermissionsCheckboxes);
		System.out.println("Count of System Admin checkboxes = "+ systemAdminPermissionsCheckboxesElement.size());
		for(SelenideElement checkbox : systemAdminPermissionsCheckboxesElement) {
			checkbox.shouldBe(Condition.selected);
		}
	}
	
	
	
	public void isDeleteFacilityButtonEnabled() {
		waitForElementVisibility(facilityDeleteButton);
		SelenideElement facilityDeleteButtonElement = getSelenideElement(facilityDeleteButton);
		facilityDeleteButtonElement.shouldBe(Condition.enabled);
	}
	
	
	
	public void isViewAndDeleteButtonEnabled() {
		waitForElementVisibility(viewResultButton);
		SelenideElement viewResultButtonElement = getSelenideElement(viewResultButton);
		viewResultButtonElement.shouldBe(Condition.enabled);
		
		waitForElementVisibility(deleteResultButtton);
		SelenideElement deleteResultButttonElement = getSelenideElement(deleteResultButtton);
		deleteResultButttonElement.shouldBe(Condition.enabled);
	}

	public void saveSubmitPageLabels() {
		SelenideElement saveSubmitPageCompanyNameElement = getSelenideElement(saveSubmitPageCompanyName);
		assertEquals(saveSubmitPageCompanyNameElement.getText(), saveSubmitPageCompanyNameText);

		SelenideElement saveSubmitPageFacilityNameElement = getSelenideElement(saveSubmitPageLabelName);
		assertEquals(saveSubmitPageFacilityNameElement.getText(), saveSubmitPageFacilityNameText);

		SelenideElement saveSubmitPageResidentStateElement = getSelenideElement(saveSubmitPageResidentState);
		assertEquals(saveSubmitPageResidentStateElement.getText(), saveSubmitPageResidentStateText);

		List<SelenideElement> saveSubmitPageCheckboxElement = getElements(saveSubmitPageCheckbox);
		for (SelenideElement element : saveSubmitPageCheckboxElement) {
			element.isDisplayed();
		}

		List<SelenideElement> saveSubmitPageChangeButtonElement = getElements(saveSubmitPageChangeButton);
		for (SelenideElement element1 : saveSubmitPageChangeButtonElement) {
			element1.isDisplayed();
		}
	}

}
