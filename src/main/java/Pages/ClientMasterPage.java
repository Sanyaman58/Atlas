package Pages;

import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Condition;
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

	String clientLabelText = "Client";
	String companyLabelText = "Company *";
	String facilityLabelText = "Facility * Help Tip";
	String helpToolTipLabelText = "Help Tip";
	String deletePopupText = "The selected research will be deleted and cannot be undone. Are you sure want to delete?";
	String nextButtonPopupBodyText = "Please enter all required fields";
	String selectResidentStateLabelText = "Please select the resident state for your facility: *";
	String selectJurisdictionLabelText = "Please select all jurisdictions you would like to include in this facility configuration:";

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
	
	By jurisdictionName = By.xpath("//div[@class=\"list-checkbox\"]//label");
	String washingtonText = "Washington DC";
	String disctrictOfColumbiaText = "District Of Columbia";
	
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
	
	By requirementViewButton = By.xpath("//*[@id=\"menu\"]/li[10]/ul/li[3]/a");
	By requirementViewPageHeader = By.xpath("//*[@id=\"versionned_requirement_form\"]/div/div[1]/section/div[1]/h2");
	
	public void clickRequirementViewButton() {
		waitForElementVisibility(requirementViewButton);
		click(requirementViewButton);
		SelenideTools.sleep(5);
		waitForElementVisibility(requirementViewPageHeader);
	}
	
	By jurisdictionDropdown = By.xpath("//select[@id=\"filter_Jurisdiction\"]");
	By jurisdictionDropdownOption = By.xpath("//select[@id=\"filter_Jurisdiction\"]//option");
	
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

}
