package Pages;

import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.Selenide.*;
import Constants.Constants;
import static org.testng.Assert.assertEquals;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClientMasterPage extends PageTools {

	By clientMasterPageTitle = By.xpath("//p[@class=' li-text']");
	By addClientButton = By.xpath("//button[text()='ADD Client ']");
	By addClientsPopupWindowTitle = By.xpath("//p[@class='company-1 mb-1']");
	By addClientTableLabels = By.xpath("//*[@id=\"modal-content\"]/div/div[2]//label");
	By clientMasterSidebarButton = By.xpath("//ul[@id='menu']/li[9]/ul/li[1]");
	By userMasterSidebarButton = By.xpath("//ul[@id='menu']/li[9]/ul/li[13]");
	By userMasterPageTitle = By.xpath("//p[@class=' li-text']");
	By addUserButton = By.xpath("//button[text()='ADD User ']");
	By addUserPopupWindowTitle = By.xpath("//p[@class='company-1 mb-1']");
	By categoryDropdown = By.xpath("//select[@id='UserCategoryKey']");
	By categoryDropdownElements = By.xpath("//select[@id='UserCategoryKey']//option");
	By userRoleComplianceDropdown = By.xpath("//select[@id='UserRoleComplianceKey']");
	By userRoleComplianceDropdownElements = By.xpath("//select[@id='UserRoleComplianceKey']//option");
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
	By jobProgressBar = By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[5]/div/div");
	By jobPendingStatusText = By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[5]");
	By intelligenceAdminDropdownButton = By.xpath("//*[@id=\"menu\"]/li[10]/a");
	By permissionsSidebarButton = By.xpath("//ul[@id='menu']/li[10]/ul/li[9]/a");
	By permissionsPageTitle = By.xpath("//*[@id=\"wrapper\"]/main/div/section/div/div[1]/h2");
	By deleteFacilityCheckbox = By.xpath("//input[@name=\"permissions[1][delete_facility]\"]");
	By updatePermissionButton = By.xpath("//*[text()=\"Update Permission\"]");
	By profileDropdownButton = By.xpath("//*[@id=\"dropdown06\"]");
	By logoutOption = By.xpath("/html/body/header/nav/div[2]/ul/li[1]/div/a[2]");
	By deleteActionButton = By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]/div/button");
	By deletePopupExitButton = By.xpath("//*[@id=\"confirmation-modal\"]/div/div/div[3]/button[1]");
	By qauestionnairePageName = By.xpath("//span[@class=\"indexing-color\"]");
	By finSectionQuestionName = By.xpath("//div[@id=\"sort_cat-0\"]//li //span[@class=\"indexing-color\"]");
	By financialCategoryHeader = By.xpath("//*[@id=\"sort_cat-0\"]/div/h4/span");
	By addNewCategoryButton = By.xpath("//*[@id=\"context-menu-category\"]/ul/li[1]/a");
	By enterNewCategoryInputField = By.xpath("//input[@placeholder=\"Enter New Category Name\"]");
	By newCategorySaveButton = By.xpath("//button[@class=\"btn common-btn save_category\"]");
	By newCategoryCancelButton = By.xpath("//button[@class=\"btn common-btn cancel_cat_btn\"]");
	By categoryHeaders = By.xpath("//h4[@class=\"card-header\"]");
	By reorderCategoryButton = By.xpath("//*[@id=\"context-menu-category\"]/ul/li[2]/a");
	By reorderSourceButton = By.xpath("//*[@id=\"sort_cat-0\"]/div/h4/i[1]");
	By reorderSaveButton = By.xpath("//button[@id=\"save_in_dynamo\"]");
	By reorderDropButton = By.xpath("//*[@id=\"sort_cat-1\"]/div/h4/i[1]");
	By questionLabel = By.xpath("//label[@id=\"hover-FIN1\"]");
	By questionContextMenu = By.xpath("//*[@id=\"context-menu-question\"]/ul");
	By addNewQuestionOption = By.xpath("//*[@id=\"context-menu-question\"]/ul/li[1]/a");
	By addQuestionPlusIcon = By.xpath("//i[@class=\"icon fa fa-plus add-icon-question \"]");
	By finQuestionPlusIcon = By.xpath("//i[@id=\"add-question-sub-FIN1.1\"]");
	By questionInputField = By.xpath("//textarea[@id=\"add-question-FIN1.1-0\"]");
	By firstEditIcon = By.xpath("//*[@id=\"edit-FIN1\"]");
	By editQuestionInputField = By.xpath("//*[@id=\"input-FIN1\"]");
	By editQuestionUpdateButton = By.xpath("//*[@id=\"update-FIN1\"]");
	By editQuestionCancelButton = By.xpath("//*[@id=\"cancel-FIN1\"]");
	By questionnairePageVersionLabel = By.xpath("//*[@id=\"DataTables_Table_0_wrapper\"]//div[1]//th[3]/div/label");
	By approveButton = By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[8]/div/button[1]");
	By approvePopupYesButton = By.xpath("//button[@id=\"yes_btn\"]");
	By firstQuestionnaireActivateButton = By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[8]/div/button");
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
	By questionText = By.xpath("//*[@id=\"questionnaire-container\"]/ul[1]/li/label");
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
	By addQuestionAddButton = By.xpath("//button[@id=\"add-question-FIN1.1-0\"]");
	By addQuestionCancelButton = By.xpath("//button[@id=\"cancel-question-FIN1.1-0\"]");
	By questionPopupEditOption = By.xpath("//*[@id=\"context-menu-question\"]/ul/li[2]/a");
	By questionsEditIcon = By.xpath("//i[@class=\"fa fa-edit edit-icon\"]");
	By questionPopupActivateOption = By.xpath("//*[@id=\"context-menu-question\"]/ul/li[5]/a");
	By activateDeactivateDropdown = By.xpath("//select[@class=\"activate-deactivate-dropdown \"]");
	By firstActivateDeactivateDropdown = By.xpath("//*[@id=\"is_active-FIN1\"]");
	By questionnairePageSaveButton = By.xpath("//button[@id=\"save_in_dynamo\"]");
	By questionnairePageExitButton = By.xpath("//button[@id=\"exit-state\"]");
	By questionnaireVersionSidebarButton  = By.xpath("//*[@id=\"menu\"]/li[10]/ul/li[8]/a");
	By questionnaireVersionPageTitle = By.xpath("//*[@id=\"wrapper\"]/main/div/section/div[1]/div[1]/h2");
	By saveSubmitPageCompanyName = By.xpath("//*[@id=\"mange-job-research\"]/div/div[1]/div/label");
	By saveSubmitPageLabelName = By.xpath("//*[@id=\"mange-job-research\"]/div/div[2]/div/label");
	By saveSubmitPageResidentState = By.xpath("//*[@id=\"mange-job-research\"]/div/div[3]/div/label");
	By saveSubmitPageCheckbox = By.xpath("//input[@name='juricdictions[]']");
	By saveSubmitPageChangeButton = By.xpath("//a[@class='btn common-btn']");
	By requirementViewButton = By.xpath("//*[@id=\"menu\"]/li[10]/ul/li[3]/a");
	By requirementViewPageHeader = By.xpath("//*[@id=\"versionned_requirement_form\"]/div/div[1]/section/div[1]/h2");
	By jurisdictionDropdown = By.xpath("//select[@id=\"filter_Jurisdiction\"]");
	By jurisdictionDropdownOption = By.xpath("//select[@id=\"filter_Jurisdiction\"]//option");
	By jurisdictionName = By.xpath("//div[@class=\"list-checkbox\"]//label");
	

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
	String questionLabelText = "Does your company sell (for profit or charitable) the products managed at this facility?";
	String selectResidentStateLabelText = "Please select the resident state for your facility: *";
	String selectJurisdictionLabelText = "Please select all jurisdictions you would like to include in this facility configuration:";
	String saveSubmitPageCompanyNameText = "Company Name :";
	String saveSubmitPageFacilityNameText = "Facility Name :";
	String saveSubmitPageResidentStateText = "Resident State :";
	String washingtonText = "Washington DC";
	String disctrictOfColumbiaText = "District Of Columbia";

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

	public boolean euiStates() {
		boolean endUpInStatesTitleElement = getSelenideElement(endUpInStatesTitle).isDisplayed();
		System.out.println("Element displayed = " + endUpInStatesTitleElement);
		List<SelenideElement> jurisdictionPageStatesElement = getElements(jurisdictionPageStates);
		if (jurisdictionPageStatesElement.size() > 0) {
			System.out.println("EUI states visible");
		}
		return endUpInStatesTitleElement;
	}
	
	public void euiStatesNotVisible() {
		boolean endUpInStatesTitleElement = getSelenideElement(endUpInStatesTitle).isDisplayed();
		System.out.println("Element displayed = " + endUpInStatesTitleElement);
	}

	public void progressBarOfNewJob() {
		SelenideElement progressBarElement = getSelenideElement(jobProgressBar).shouldBe(Condition.visible);
		Assert.assertTrue(progressBarElement.isDisplayed());
		SelenideElement progressBarTextElement = getSelenideElement(jobPendingStatusText).shouldBe(Condition.visible);
		System.out.println("Progress bar text = " + progressBarTextElement.getText());
		if (progressBarTextElement.getText().contains("Result Pending")) {
			System.out.println("Progress bar contains text as = " + progressBarTextElement.getText());
		} else {
			System.out.println("Text mismatch");
		}
	}

	public void clickIntelligenceAdminDropdownButton() {
		waitForElementVisibility(intelligenceAdminDropdownButton);
		click(intelligenceAdminDropdownButton);
		SelenideTools.sleep(1);
	}

	public void clickPermissionsSidebarButton() {
		waitForElementVisibility(permissionsSidebarButton);
		click(permissionsSidebarButton);
		SelenideTools.sleep(1);
	}

	public boolean isPermissionsPageOpened() {
		waitForElementVisibility(permissionsPageTitle);
		return isElementVisible(permissionsPageTitle);
	}

	public void disableDeleteFacilityCheckbox() {
		waitForElementVisibility(deleteFacilityCheckbox);
		SelenideElement deleteFacilityCheckboxElement = getSelenideElement(deleteFacilityCheckbox);
		if (deleteFacilityCheckboxElement.isSelected()) {
			deleteFacilityCheckboxElement.click();
		} else {
			System.out.println("Checkbox is already disabled");
		}
	}

	public void clickUpdatePermission() {
		waitForElementVisibility(updatePermissionButton);
		click(updatePermissionButton);
		SelenideTools.sleep(1);
	}

	public void userLogout() {
		waitForElementVisibility(profileDropdownButton);
		click(profileDropdownButton);
		SelenideTools.sleep(3);
		waitForElementVisibility(logoutOption);
		click(logoutOption);
		SelenideTools.sleep(10);
	}

	public void deleteActionButton() {
		waitForElementVisibility(deleteActionButton);
		SelenideElement deleteActionButtonElelment = getSelenideElement(deleteActionButton);
		String classAttribute = deleteActionButtonElelment.getAttribute("class");
		if (classAttribute.contains("disabled")) {
			System.out.println("Delete button is disabled");
		} else {
			System.out.println("Delete button is enabled");
		}
	}

	public void enableDeleteFacilityCheckbox() {
		waitForElementVisibility(deleteFacilityCheckbox);
		SelenideElement deleteFacilityCheckboxElement = getSelenideElement(deleteFacilityCheckbox);
		if (deleteFacilityCheckboxElement.isSelected()) {
			System.out.println("Checkbox is already enabled");
		} else {
			deleteFacilityCheckboxElement.click();
		}
	}

	public void deleteActionButtonEnabledAndClick() {
		waitForElementVisibility(deleteActionButton);
		SelenideElement deleteActionButtonElelment = getSelenideElement(deleteActionButton);
		String classAttribute = deleteActionButtonElelment.getAttribute("class");
		if (classAttribute.contains("disabled")) {
			System.out.println("Delete button is disabled");
		} else {
			System.out.println("Delete button is enabled");
		}
		deleteActionButtonElelment.click();
		SelenideTools.sleep(1);
		waitForElementVisibility(deletePopupExitButton);
		click(deletePopupExitButton);
	}

	public void verifyQuestionName() {
		List<SelenideElement> finSectionQuestionNameelements = getElements(finSectionQuestionName);
		int finSectionQuestionNameelementsCount = finSectionQuestionNameelements.size();
		System.out.println(
				"Count of question names present on questionnaire page = " + finSectionQuestionNameelementsCount);

		for (int i = 0; i < finSectionQuestionNameelementsCount; i++) {
			finSectionQuestionNameelements.get(i);
			String finSectionQuestionNameelementsText = finSectionQuestionNameelements.get(i).getText();
			System.out.println(finSectionQuestionNameelementsText);

			if (finSectionQuestionNameelements.get(i).getText().contains(finSectionQuestionNameelementsText)) {
				System.out.println(finSectionQuestionNameelementsText + "text found in Financial Ownership section");
			} else {
				System.out.println("Text does not match");
			}
		}
	}

	public void existingJobRadioButton() {
		click(configurationRadioButton);
		SelenideTools.sleep(8);
		click(existingJobNextButton);
	}

	public void verifyQuestionsElementsOnQuestionnairePage() {
		SelenideElement questionTextElement = getSelenideElement(questionText);
		String actualQuestionName = questionTextElement.getText();
		System.out.println("Actual text of the question present = " + actualQuestionName);
		questionTextElement.shouldBe(Condition.text(questionTextElement.getText()));
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

	public void addCategoryButton() {
		waitForElementVisibility(financialCategoryHeader);
		SelenideElement financialCategoryHeaderElelment = getSelenideElement(financialCategoryHeader);
		Actions actions = new Actions(WebDriverRunner.getWebDriver());
		actions.contextClick(financialCategoryHeaderElelment).perform();
		waitForElementVisibility(addNewCategoryButton);
		click(addNewCategoryButton);
		SelenideTools.sleep(10);
		waitForElementVisibility(enterNewCategoryInputField);
		waitForElementVisibility(newCategorySaveButton);
		waitForElementVisibility(newCategoryCancelButton);
	}

	public void clickSaveWithEmptyCategory() {
		SelenideElement enterNewCategoryInputFieldElelment = getSelenideElement(enterNewCategoryInputField);
		enterNewCategoryInputFieldElelment.is(Condition.empty);
		SelenideTools.sleep(3);
		click(newCategorySaveButton);
		SelenideTools.sleep(5);
		Alert alert = Selenide.switchTo().alert();
		System.out.println("Switched back to alert window");
		String alertText = alert.getText();
		System.out.println("Alert message text = " + alertText);
		alert.accept();
		Selenide.switchTo().defaultContent();
		System.out.println("Switched back to default content");
	}

	public void addNewCategory() {
		SelenideElement enterNewCategoryInputFieldElelment = getSelenideElement(enterNewCategoryInputField);
		enterNewCategoryInputFieldElelment.setValue("Test Category");
		String enterNewCategoryInputFieldElelmentText = enterNewCategoryInputFieldElelment.getText();
		System.out.println("Text in new category input field = " + enterNewCategoryInputFieldElelmentText);
		enterNewCategoryInputFieldElelment.is(Condition.exactText(enterNewCategoryInputFieldElelmentText));
		click(newCategorySaveButton);
		List<SelenideElement> categoryHeaderselements = getElements(categoryHeaders);
		int categoryHeaderselementsCount = categoryHeaderselements.size();
		for (int i = 0; i < categoryHeaderselementsCount; i++) {
			categoryHeaderselements.get(i);
			String categoryHeaderselementsText = categoryHeaderselements.get(i).getText();
			System.out.println(categoryHeaderselementsText);

			if (categoryHeaderselementsText.contains(enterNewCategoryInputFieldElelmentText)) {
				System.out.println("New cateegory is added");
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

	public void reorderCategoryButton() {
		waitForElementVisibility(financialCategoryHeader);
		SelenideElement financialCategoryHeaderElelment = getSelenideElement(financialCategoryHeader);
		Actions actions = new Actions(WebDriverRunner.getWebDriver());
		actions.contextClick(financialCategoryHeaderElelment).perform();
		waitForElementVisibility(reorderCategoryButton);
		click(reorderCategoryButton);
		SelenideTools.sleep(10);
		waitForElementVisibility(reorderSourceButton);
		waitForElementVisibility(reorderSaveButton);
	}

	public void reorderCategoryHeaders() {
		SelenideElement reorderSourceButtonElement = getSelenideElement(reorderSourceButton);
		SelenideElement reorderDropButtonElement = getSelenideElement(reorderDropButton);
		SelenideTools.sleep(5);
		Actions actions = new Actions(WebDriverRunner.getWebDriver());
		new Actions(WebDriverRunner.getWebDriver()).clickAndHold(reorderSourceButtonElement)
				.moveToElement(reorderDropButtonElement).release().perform();
		SelenideTools.sleep(8);
	}

	public void addNewQuestion() {
		waitForElementVisibility(questionLabel);
		SelenideElement questionLabelElement = getSelenideElement(questionLabel);
		Actions actions = new Actions(WebDriverRunner.getWebDriver());
		actions.contextClick(questionLabelElement).perform();
		waitForElementVisibility(questionContextMenu);
		waitForElementVisibility(addNewQuestionOption);
		click(addNewQuestionOption);
		SelenideTools.sleep(4);

		List<SelenideElement> addQuestionPlusIconElement = getElements(addQuestionPlusIcon);
		waitForElementVisibility(addQuestionPlusIcon);
		System.out.println("Total count of all the plus icons visible = " + addQuestionPlusIconElement.size());
	}

	
	public void clickQuestionsPlusIcon() {
		SelenideElement finQuestionPlusIconElemnt = getSelenideElement(finQuestionPlusIcon);
		waitForElementVisibility(finQuestionPlusIcon);
		click(finQuestionPlusIcon);
		SelenideTools.sleep(4);
		waitForElementVisibility(questionInputField);
		waitForElementVisibility(addQuestionAddButton);
		waitForElementVisibility(addQuestionCancelButton);
	}

	public void enterQuestionClickAdd() {
		SelenideElement questionInputFieldElelment = getSelenideElement(questionInputField);
		questionInputFieldElelment.is(Condition.empty);
		questionInputFieldElelment.setValue("Demo Question");
		questionInputFieldElelment.is(Condition.exactValue("Demo Question"));
		click(addQuestionAddButton);
		SelenideTools.sleep(12);
		waitForElementInvisibility(addQuestionAddButton);
		waitForElementInvisibility(addQuestionCancelButton);
	}

	public void clickAndEditQuestion() {
		waitForElementVisibility(questionLabel);
		SelenideElement questionLabelElement = getSelenideElement(questionLabel);
		Actions actions = new Actions(WebDriverRunner.getWebDriver());
		actions.contextClick(questionLabelElement).perform();
		waitForElementVisibility(questionContextMenu);
		waitForElementVisibility(questionPopupEditOption);
		click(questionPopupEditOption);
		waitForElementVisibility(questionsEditIcon);
		List<SelenideElement> questionsEditIconElelment = getElements(questionsEditIcon);
		waitForElementVisibility(questionsEditIcon);
		System.out.println(
				"Total count of edit icons present besides the question = " + questionsEditIconElelment.size());
	}

	public void editTheQuestionAndVerifyEditFields() {
		SelenideElement firstEditIconElement = getSelenideElement(firstEditIcon);
		waitForElementVisibility(firstEditIcon);
		firstEditIconElement.click();
		SelenideTools.sleep(4);
		waitForElementVisibility(editQuestionInputField);
		waitForElementVisibility(editQuestionUpdateButton);
		waitForElementVisibility(editQuestionCancelButton);
		SelenideElement editQuestionInputFieldElement = getSelenideElement(editQuestionInputField);
		editQuestionInputFieldElement.clear();
		editQuestionInputFieldElement.is(Condition.empty);
		editQuestionInputFieldElement.setValue("Updated Question");
		editQuestionInputFieldElement.is(Condition.exactValue("Updated Question"));
		click(editQuestionUpdateButton);
		SelenideTools.sleep(2);
		waitForElementInvisibility(editQuestionUpdateButton);
	}

	public void activateDeactivateButtonFunctionality() {
		waitForElementVisibility(questionLabel);
		SelenideElement questionLabelElement = getSelenideElement(questionLabel);
		Actions actions = new Actions(WebDriverRunner.getWebDriver());
		actions.contextClick(questionLabelElement).perform();
		waitForElementVisibility(questionContextMenu);
		waitForElementVisibility(questionPopupActivateOption);
		click(questionPopupActivateOption);
		SelenideTools.sleep(2);
		waitForElementVisibility(activateDeactivateDropdown);
		List<SelenideElement> activateDeactivateDropdownElement = getElements(activateDeactivateDropdown);
		System.out.println("Total count of all the activate and deactivate dropdown = "+ activateDeactivateDropdownElement.size());

		SelenideElement firstActivateDeactivateDropdownElement = getSelenideElement(firstActivateDeactivateDropdown);
		firstActivateDeactivateDropdownElement.selectOption(1);
		SelenideTools.sleep(4);
		waitForElementVisibility(questionnairePageSaveButton);
		click(questionnairePageSaveButton);
		SelenideTools.sleep(12);

		String classAttribute = questionLabelElement.getAttribute("class");
		if (classAttribute.contains("deactive-question")) {
			System.out.println("Question is disabled");
		} else {
			System.out.println("Question is enabled");
		}
		waitForElementVisibility(questionnairePageExitButton);
		click(questionnairePageExitButton);
		SelenideTools.sleep(3);
	}
	
	public void selectQuestionnarieVersions() {
		waitForElementVisibility(questionnaireVersionSidebarButton);
		click(questionnaireVersionSidebarButton);
		SelenideTools.sleep(2);
		waitForElementVisibility(questionnaireVersionPageTitle);
	}
	
	public void activateNewlyCreatedQuestionnaire() {
		SelenideTools.sleep(5);
		SelenideElement questionnairePageVersionLabelElement = getSelenideElement(questionnairePageVersionLabel).shouldBe(Condition.visible);
		questionnairePageVersionLabelElement.doubleClick();
		SelenideTools.sleep(5);
		waitForElementVisibility(approveButton);
		click(approveButton);
		waitForElementVisibility(approvePopupYesButton);
		click(approvePopupYesButton);
		SelenideTools.sleep(8);
		questionnairePageVersionLabelElement.doubleClick();
		SelenideTools.sleep(3);
		waitForElementVisibility(firstQuestionnaireActivateButton);
		click(firstQuestionnaireActivateButton);
		waitForElementVisibility(approvePopupYesButton);
		click(approvePopupYesButton);
		SelenideTools.sleep(8);
	}
	
	public void navigateToLoginPage() {
		SelenideTools.openUrl("https://qa-atlas.lha.pharma.solutions/");
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
	
	
	
	public void verifyJurisdictionName() {
		List<SelenideElement> jurisdictionNameElement = getElements(jurisdictionName);
		for(int i =0; i<jurisdictionNameElement.size(); i++) {
			String jurisdictionText = jurisdictionNameElement.get(i).getText();
			if(jurisdictionText.contains(washingtonText)) {
				System.out.println("Washington DC Jurisdiction found in Jurisdiction list");
				throw new AssertionError("Element " + i + " contains text: " + washingtonText);
			}
			else {
				System.out.println("Washington DC Jurisdiction not found in Jurisdiction list");
			}
		}
	}
	
	public void verifyDistrictOfColumbia() {
		List<SelenideElement> jurisdictionNameElement = getElements(jurisdictionName);
		for(int i =0; i<jurisdictionNameElement.size(); i++) {
			String jurisdictionText = jurisdictionNameElement.get(i).getText();
			if(jurisdictionText.contains(disctrictOfColumbiaText)) {
				System.out.println("Washington DC Jurisdiction is renamed with District of Columbia");
			}
			else {
				System.out.println("Washington DC Jurisdiction is not renamed with District of Columbia");
			}
		}
	}
	
	
	
	public void clickRequirementViewButton() {
		waitForElementVisibility(requirementViewButton);
		click(requirementViewButton);
		SelenideTools.sleep(5);
		waitForElementVisibility(requirementViewPageHeader);
	}
	
	public void clickJurisdictionDropdownAndVerifyJurisdiction() {
		waitForElementVisibility(jurisdictionDropdown);
		click(jurisdictionDropdown);
		List<SelenideElement> jurisdictionDropdownOptionElement = getElements(jurisdictionDropdownOption);
		for(int i = 0; i < jurisdictionDropdownOptionElement.size(); i++) {
			String jurisdictionDropdownOptionText = jurisdictionDropdownOptionElement.get(i).getText();
			if(jurisdictionDropdownOptionText.contains("District of Columbia")) {
				System.out.println("Found [District of Columbia in the list of Jurisdiction]");
			}
		}
	}

	By entitlementHeader = By.xpath("//div[@class=\"card-body\"]//h3");

	public void noEntitlementMessage() {
		SelenideElement entitlementHeaderElement = getSelenideElement(entitlementHeader);
		if (entitlementHeaderElement.isDisplayed() == false) {
			System.out.println("Entitlement header is not present");
		} else {
			System.out.println("Entitlement header is present");
		}
	}

	By enitilementUpperLimit = By.xpath("//*[@id=\"wrapper\"]/main/div[1]/section/div/div[2]/div/div[2]/h3/span[2]");
	By entitlementLowerLimit = By.xpath("//*[@id=\"wrapper\"]/main/div[1]/section/div/div[2]/div/div[2]/h3/span[1]");
	List<SelenideElement> enitilementUpperLimitElement = getElements(enitilementUpperLimit);
		List<SelenideElement> entitlementLowerLimitElement = getElements(entitlementLowerLimit);

	public void verifyEntitlementMessage() {
		SelenideElement entitlementHeaderElement = getSelenideElement(entitlementHeader);
		if(entitlementHeaderElement.isDisplayed() == true) {
			System.out.println("Entrilement header displayed");
		}
		if (enitilementUpperLimitElement.size() > entitlementLowerLimitElement.size()) {
			System.out.println("Correct entitlement message is shown");
		} else {
			System.out.println("Correct entitlement message is not shown");
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
		System.out.println("Count of System Admin checkboxes = " + systemAdminPermissionsCheckboxesElement.size());
		for (SelenideElement checkbox : systemAdminPermissionsCheckboxesElement) {
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
