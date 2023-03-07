package Pages;

import Utils.SelenideTools;
import base.PageTools;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.Selenide.*;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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

	HashMap<String, Boolean> statesCheckboxes = new HashMap<>();
	HashMap<String, Boolean> statesCheckboxesToCompare = new HashMap<>();
	String categoryName;
	String requirementTypeName;
	String All;

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

	public void euiStatesNotVisible() {
		boolean endUpInStatesTitleElement = getSelenideElement(endUpInStatesTitle).isDisplayed();
		System.out.println("Element displayed = " + endUpInStatesTitleElement);
	}

	public void progressBarOfNewJob() {
		SelenideElement progressBarElement = getSelenideElement(jobProgressBar).shouldBe(Condition.visible);
		progressBarElement.isDisplayed();

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

	By addQuestionAddButton = By.xpath("//button[@id=\"add-question-FIN1.1-0\"]");
	By addQuestionCancelButton = By.xpath("//button[@id=\"cancel-question-FIN1.1-0\"]");
	By questionPopupEditOption = By.xpath("//*[@id=\"context-menu-question\"]/ul/li[2]/a");
	By questionsEditIcon = By.xpath("//i[@class=\"fa fa-edit edit-icon\"]");

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

	By questionPopupActivateOption = By.xpath("//*[@id=\"context-menu-question\"]/ul/li[5]/a");
	By activateDeactivateDropdown = By.xpath("//select[@class=\"activate-deactivate-dropdown \"]");
	By firstActivateDeactivateDropdown = By.xpath("//*[@id=\"is_active-FIN1\"]");
	By questionnairePageSaveButton = By.xpath("//button[@id=\"save_in_dynamo\"]");
	By questionnairePageExitButton = By.xpath("//button[@id=\"exit-state\"]");
	By questionnaireVersionSidebarButton  = By.xpath("//*[@id=\"menu\"]/li[10]/ul/li[8]/a");
	By questionnaireVersionPageTitle = By.xpath("//*[@id=\"wrapper\"]/main/div/section/div[1]/div[1]/h2");

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
		System.out.println("Total count of all the activate and deactivate dropdown = "
				+ activateDeactivateDropdownElement.size());

		SelenideElement firstActivateDeactivateDropdownElement = getSelenideElement(firstActivateDeactivateDropdown);
		firstActivateDeactivateDropdownElement.selectOption("Deactivate");
		SelenideTools.sleep(2);
		firstActivateDeactivateDropdownElement.is(Condition.exactText("Deactivate"));

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
	
	By questionnairePageVersionLabel = By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[3]/div/label");
	By approveButton = By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[8]/div/button[1]");
	By approvePopupYesButton = By.xpath("//button[@id=\"yes_btn\"]");
	By firstQuestionnaireActivateButton = By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[8]/div/button");
	
	public void activateNewlyCreatedQuestionnaire() {
		SelenideElement questionnairePageVersionLabelElement = getSelenideElement(questionnairePageVersionLabel).shouldBe(Condition.visible);
		questionnairePageVersionLabelElement.doubleClick();
		SelenideTools.sleep(2);
		
		waitForElementVisibility(approveButton);
		click(approveButton);
		
		waitForElementVisibility(approvePopupYesButton);
		click(approvePopupYesButton);
		SelenideTools.sleep(8);
		
		questionnairePageVersionLabelElement.doubleClick();
		waitForElementVisibility(firstQuestionnaireActivateButton);
		click(firstQuestionnaireActivateButton);
		
		waitForElementVisibility(approvePopupYesButton);
		click(approvePopupYesButton);
		SelenideTools.sleep(8);
	
	}

}
