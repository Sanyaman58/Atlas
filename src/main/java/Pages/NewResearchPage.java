package Pages;

import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

public class NewResearchPage extends PageTools {

	By surveillanceSetupPageTitle = By.xpath("//h2[text()='Configuration']");
	By companyLabelAsterisk = By.xpath("//div[@class='form-row']/label[contains(text(),'Company')]/span[@class='red']");
	By facilityLabelAsterisk = By
			.xpath("//div[@class='form-row']/label[contains(text(),'Facility')]/span[@class='red']");
	By companyNameInput = By.xpath("//select[@id='company_name']");
	By facilityInput = By.xpath("//select[@id='facility_name']");
	By helpTip = By.xpath("//span[@class='facility-tip']");
	By alertMessage = By.xpath("//p[@class='response-msg'] | //p[@id='reponse-msg']");
	By popUpMessage = By.xpath("//p[@id='alert-msg']");
	By popUpCloseButton = By.xpath("//div[@id='alert-modal']//button[@class='close']");
	By anotherAlertMessage = By.xpath("//p[@id='alert-btw-msg']");
	By alertSubmittedJobMessage = By.xpath("//p[@class='response-msg-submitted-job']");
	By companyNameSelect = By.xpath("//select[@id='company_name']");
	By facilityNameSelect = By.xpath("//select[@id='facility_name']");
	By errorMessage = By.xpath("//div[@id='text_error']");
	By profileDropdown = By.xpath("//li[contains(@class,'profile-dropdown')]/a[@id='dropdown06']/i");
	By logOutButton = By.xpath("//div[contains(@class,'dropdown-menu')]/a[text()='Logout']");
	By alertOkButton = By
			.xpath("//div[@class='modal-content']/div[contains(@class,'modal-footer')]/button[text()='OK']");
	By alertXButton = By.xpath("//div[@class='modal-content']//button[@class='close']");
	By submitNewJobButton = By.xpath("//button[@id='submit-new']");
	By copyFromResearchButton = By.xpath("//button[@id='copyfrom_research_job']");
	By tableJobs = By.xpath("//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr");
	By noDataInTable = By.xpath(
			"//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr/td[text()='No data available in table']");
	By tableJobsRadioButton = By.xpath(
			"//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr/td/input[@name='copy_from_job_id']");
	By clientDropdown = By.xpath("//select[contains(@class,'Client_id')] | //select[contains(@class,'new_client_id')]");
	By surveillanceIntelligenceSidebarButton = By.xpath("//ul[@id='menu']/li[5]/a");
	By clientDropdownResults = By.xpath("//select[contains(@class,'new_client_id')]");
	// By surveillanceIntelligenceSidebarButton =
	// By.xpath("//ul[@id='menu']/li[5]");
	By configurationSidebarButton = By.xpath("//ul[@id='menu']/li[5]/ul/li[1]/a");
	By resultsSidebarButton = By.xpath("//ul[@id='menu']/li[5]/ul/li[2]/a");
	By permissionsSidebarButton = By.xpath("//ul[@id='menu']/li[5]/ul/li[3]/a");
	By surveillanceSetupBreadcrumb = By
			.xpath("//h4[contains(@class,'cardInner-heading')]/a/span[contains(text(),'Configuration Setup')]");
	By configurationDeleteButton = By.xpath("//button[contains(@class,'delete-job-research')]");
	By alertYesDeleteButton = By.xpath("(//button[text()='Yes Delete'])[%s]");
	By createdLabelSort = By.xpath("//table//tr/th[text()='Created']");
	By intelligenceCountMessage = By.xpath("//div[@class='dataTables_info']");
	By intelligenceSidebarButton = By.xpath("//*[@id=\"menu\"]/li[5]/a");
	By configurationSidebarOption = By.xpath("//*[@id=\"menu\"]/li[5]/ul/li[1]/a");
	By knowledgeResultSidebarOption = By.xpath("//*[@id=\"menu\"]/li[5]/ul/li[2]/a");
	By configurationSetupHeader = By.xpath("//*[@id=\"mange-job-research\"]/div/div[1]/div[1]/div/div[2]/h4");
	By configurationPageRightHeader = By.xpath("//*[@id=\"mange-job-research\"]/div/div[2]/div[1]/div/div[2]/h4");
	By configurationSetupHeaderElement = By.xpath("//*[@id=\"wrapper\"]/main/div/section/div/div[2]/div/div[1]/div/h4/a/span");

	String companyName;
	String facilityName;
	static int yesButtonCounter = 0;

	public void goBackInBrowser() {
		Selenide.back();
	}

	public void logOut() {
		waitForElementVisibility(profileDropdown);
		click(profileDropdown);
		waitForElementVisibility(logOutButton);
		click(logOutButton);
	}

	public boolean isSurveillanceSetupPageOpened() {
		waitForElementVisibility(surveillanceSetupPageTitle);
		return isElementVisible(surveillanceSetupPageTitle);
	}

	public boolean isCompanyLabelAsteriskPresent() {
		return isElementVisible(companyLabelAsterisk);
	}

	public boolean isFacilityLabelAsteriskPresent() {
		return isElementVisible(facilityLabelAsterisk);
	}

	public String getCompanyNameInputPlaceholder() {
		return getSelenideElement(companyNameInput).getAttribute("placeholder");
	}

	public void enterCompanyName(String name) {
		type(name, companyNameInput);
		companyName = name;
	}

	public void enterRandomCompanyName() {
		String name = RandomStringUtils.random(10, true, false);
		waitForElementVisibility(companyNameInput);
		type(name, companyNameInput);
		companyName = name;
	}

	public void selectCompanyName(int index) {
		waitForElementClickable(companyNameSelect);
		getSelenideElement(companyNameSelect).selectOption(index);
		companyName = getSelenideElement(companyNameSelect).getText();
	}

	public void selectFacilityName(int index) {
		waitForElementClickable(facilityNameSelect);
		getSelenideElement(facilityNameSelect).selectOption(index);
		facilityName = getSelenideElement(facilityNameSelect).getText();
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public void clearEnteredCompanyName() {
		getSelenideElement(companyNameInput).clear();
	}

	public String getEnteredCompanyName() {
		return getElementAttributeValue("value", companyNameInput);
	}

	public String getFacilityInputPlaceholder() {
		return getSelenideElement(facilityInput).getAttribute("placeholder");
	}

	public void enterFacility(String name) {
		type(name, facilityInput);
		facilityName = name;
	}

	public void enterRandomFacilityName() {
		String name = RandomStringUtils.random(10, true, false);
		type(name, facilityInput);
		facilityName = name;
	}

	public String getEnteredFacility() {
		return getElementAttributeValue("value", facilityInput);
	}

	public void clearEnteredFacility() {
		getSelenideElement(facilityInput).clear();
	}

	public String getHelpTipText() {
		waitForElementVisibility(helpTip);
		return getSelenideElement(helpTip).getAttribute("title");
	}

	public void sortByCreatedLabel() {
		waitForElementVisibility(createdLabelSort);
		click(createdLabelSort);
	}

	public void clickSubmitNewJobButton() {
		waitForElementClickable(submitNewJobButton);
		click(submitNewJobButton);
	}

	public void clickCopyFromResearchButton() {
		waitForElementClickable(copyFromResearchButton);
		click(copyFromResearchButton);
	}

	public boolean isAlertMessageVisible() {
		SelenideTools.sleep(2);
		return isElementVisible(alertMessage);
	}

	public boolean isPopupMessageVisible() {
		SelenideTools.sleep(2);
		return isElementVisible(popUpMessage);
	}

	public String getPopUpMessage() {
		waitForElementVisibility(popUpMessage);
		return getElementText(popUpMessage);
	}

	public void closePopUpWindow() {
		waitForElementVisibility(popUpCloseButton);
		click(popUpCloseButton);
	}

	public boolean isErrorMessageVisible() {
		SelenideTools.sleep(2);
		return isElementVisible(errorMessage);
	}

	public String getAlertMessage() {
		waitForElementVisibility(alertMessage);
		return getElementText(alertMessage);
	}

	public String getSecondAlertMessage() {
		waitForElementVisibility(anotherAlertMessage);
		return getElementText(anotherAlertMessage);
	}

	public String getAlertSubmittedJobMessage() {
		waitForElementVisibility(alertSubmittedJobMessage);
		return getElementText(alertSubmittedJobMessage);
	}

	public String getErrorMessage() {
		return getElementText(errorMessage).trim();
	}

	public void clickAlertOkButton() {
		click(alertOkButton);
	}

	public void clickAlertXButton() {
		click(alertXButton);
	}

	public int getNumberOfJobs() {
		System.out.println(getElements(tableJobs).size());
		if (isElementVisible(noDataInTable))
			return 0;
		else
			return getElements(tableJobs).size();
	}

	public boolean isNewlyCreatedJobDisplayed(String status) {
		SelenideTools.sleep(7);
		if (isElementVisible(noDataInTable))
			return false;
		for (int i = 0; i < getElements(tableJobs).size(); i++) {
			if (getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr)["
					+ (i + 1) + "]" + "/td[2]")).getText().equals(companyName)
					&& getSelenideElement(
							By.xpath("(//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr)["
									+ (i + 1) + "]" + "/td[3]"))
							.getText().equals(facilityName)
					&& getSelenideElement(
							By.xpath("(//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr)["
									+ (i + 1) + "]" + "/td[4]"))
							.getText().equals(status)) {
//				System.out.println(getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr)["+(i+1)+"]" +
//						"/td[3]")).getText());
//				System.out.println(getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr)["+(i+1)+"]" +
//						"/td[4]")).getText());
				return true;
			}
		}
		return false;
	}

	public void selectNewlyCreatedJob() {
		for (int i = 0; i < getElements(tableJobs).size(); i++) {
			if (getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr)["
					+ (i + 1) + "]" + "/td[2]")).getText().equals(companyName)
					&& getSelenideElement(
							By.xpath("(//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr)["
									+ (i + 1) + "]" + "/td[3]"))
							.getText().equals(facilityName)) {
				getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr)["
						+ (i + 1) + "]" + "/td[1]/input")).click();
			}
		}
	}

	public void selectTheJobFromTheTable(int index) {
		System.out.println(getElements(tableJobsRadioButton).size());
		getElements(tableJobsRadioButton).get(index).click();
		companyName = getElements(tableJobs).get(index).findElement(By.xpath("./td[2]")).getText();
		facilityName = getElements(tableJobs).get(index).findElement(By.xpath("./td[3]")).getText();
	}

	public void selectTheJobFromTheTable() {
		for (int i = 0; i < getElements(tableJobs).size(); i++) {
			if (isElementExistsWithNoLog(
					By.xpath("(//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr)[" + i + "]"
							+ "/td[text()='" + companyName + "']"))
					&& isElementExistsWithNoLog(
							By.xpath("(//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr)[" + i
									+ "]" + "/td[text()='" + facilityName + "']"))) {
				getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr)["
						+ (i + 1) + "]" + "/td[1]/input")).click();
			}

		}
	}

	public boolean isSelectClientVisibleAndClickable() {
		return isElementClickable(clientDropdown);
	}

	public void selectClient(String client) {
		waitForElementVisibility(clientDropdown);
		selectOption(client, clientDropdown);
	}

	public void clickSurveillanceIntelligenceCollapseButton() {
		waitForElementVisibility(surveillanceIntelligenceSidebarButton);
		click(surveillanceIntelligenceSidebarButton);
	}

	public void clickConfigurationSidebarButton() {
		waitForElementVisibility(configurationSidebarButton);
		click(configurationSidebarButton);
	}

	public void clickResultsSidebarButton() {
		waitForElementVisibility(resultsSidebarButton);
		click(resultsSidebarButton);
	}

	public void clickPermissionsSidebarButton() {
		waitForElementVisibility(permissionsSidebarButton);
		click(permissionsSidebarButton);
	}

	public void clickOnSurveillanceSetupBreadcrumb() {
		waitForElementVisibility(surveillanceSetupBreadcrumb);
		click(surveillanceSetupBreadcrumb);
	}

	public void clickOnTheDeleteButton(int number) {
		companyName = getElements(tableJobs).get(number).findElement(By.xpath("./td[2]")).getText();
		facilityName = getElements(tableJobs).get(number).findElement(By.xpath("./td[3]")).getText();
		getElements(configurationDeleteButton).get(number).click();
	}

	public boolean isDeleteButtonVisible() {
		SelenideTools.sleep(2);
		return isElementVisible(configurationDeleteButton);
	}

	public void clickOnTheDeleteButton(String status) {
		for (int i = 0; i < getElements(tableJobs).size(); i++) {
			if (getElements(tableJobs).get(i).findElement(By.xpath("./td[4]")).getText().equals(status)
					|| getElements(tableJobs).get(i).findElement(By.xpath("./td[2]")).getText().equals(companyName)
					|| getElements(tableJobs).get(i).findElement(By.xpath("./td[3]")).getText().equals(facilityName)) {
				companyName = getElements(tableJobs).get(i).findElement(By.xpath("./td[2]")).getText();
				facilityName = getElements(tableJobs).get(i).findElement(By.xpath("./td[3]")).getText();
				getElements(configurationDeleteButton).get(i).click();
				break;
			}
		}
	}

	public void clickOnTheDeleteButtonWithStatus(String status) {
		for (int i = 0; i < getElements(tableJobs).size(); i++) {
			if (getElements(tableJobs).get(i).findElement(By.xpath("./td[4]")).getText().equals(status)) {
				companyName = getElements(tableJobs).get(i).findElement(By.xpath("./td[2]")).getText();
				facilityName = getElements(tableJobs).get(i).findElement(By.xpath("./td[3]")).getText();
				getElements(configurationDeleteButton).get(i).click();
				break;
			}
		}
	}

	public void clickYesDeleteButton() {
		SelenideTools.sleep(1);
		waitForElementClickable(alertYesDeleteButton, 1);
		doubleClick(alertYesDeleteButton, 1);
	}

	public void clickYesDeleteButtonForTheSecondTime() {
		SelenideTools.sleep(1);
		waitForElementClickable(alertYesDeleteButton, 2);
		doubleClick(alertYesDeleteButton, 2);
	}

	public void clickYesDeleteButtonForTheThirdTime() {
		SelenideTools.sleep(1);
		waitForElementClickable(alertYesDeleteButton, 3);
		doubleClick(alertYesDeleteButton, 3);
	}

	public boolean verifyThatTheJobIsDeleted() {
		if (isElementVisible(noDataInTable))
			return true;
		for (SelenideElement element : getElements(tableJobs)) {
			if (element.findElement(By.xpath("./td[2]")).getText().equals(companyName))
				if (element.findElement(By.xpath("./td[3]")).getText().equals(facilityName))
					return false;
		}
		return true;
	}

	public void clickYesDeleteButtonIfVisible() {
		SelenideTools.sleep(1);
		if (isElementVisible(alertYesDeleteButton, 1)) {
			doubleClick(alertYesDeleteButton, 1);
		} else if (isElementVisible(alertYesDeleteButton, 2)) {
			doubleClick(alertYesDeleteButton, 2);
		} else if (isElementVisible(alertYesDeleteButton, 3)) {
			doubleClick(alertYesDeleteButton, 3);
		}
	}

	By configurationTableNextButton = By.xpath("//button[@id=\"copyfrom_research_job\"]");

	public void selectConfigurationTableNextButton() {
		waitForElementVisibility(configurationTableNextButton);
		click(configurationTableNextButton);
		SelenideTools.sleep(5);
	}

	public boolean isIntelligenceCountMessageDisplayed() {
		return isElementVisible(intelligenceCountMessage);
	}

	public void clickIntelligenceSidebarButton() {
		waitForElementVisibility(intelligenceSidebarButton);
		click(intelligenceSidebarButton);
		SelenideTools.sleep(4);
	}

	public void verifyIntelligenceDropdown() {
		waitForElementVisibility(configurationSidebarOption);
		waitForElementVisibility(knowledgeResultSidebarOption);
	}

	public void verifyConfigurationHeaderText() {
		SelenideElement configurationSetupHeaderElement = getSelenideElement(configurationSetupHeader);
		waitForElementVisibility(configurationSetupHeader);
		if (configurationSetupHeaderElement.getText().contains("Start New Configuration")) {
			System.out.println("Expected test found "+ configurationSetupHeaderElement.getText());
		} else {
			System.out.println("Exepected configuration header text not found");
		}
	}
	
	public void verifyConfigurationHeaderTextOnRight() {
		SelenideElement configurationSetupHeaderRightElement = getSelenideElement(configurationPageRightHeader);
		waitForElementVisibility(configurationPageRightHeader);
		if (configurationSetupHeaderRightElement.getText().contains("Modify Existing Configuration")) {
			System.out.println("Expected test found "+ configurationSetupHeaderRightElement.getText());
		} else {
			System.out.println("Expected configuration header text not found");
		}
	}
	
	public void verifyConfigurationSetupText() {
		SelenideElement configurationSetupHeaderElementText = getSelenideElement(configurationSetupHeaderElement);
		waitForElementVisibility(configurationSetupHeaderElement);
		if (configurationSetupHeaderElementText.getText().contains("Configuration Setup")) {
			System.out.println("Expected test found "+ configurationSetupHeaderElementText.getText());
		} else {
			System.out.println("Expected configuration header text not found");
		}
	}

}
