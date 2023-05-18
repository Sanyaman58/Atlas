package Pages.admin;

import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VersionRequirementsAdminPage extends PageTools {
	By versionedRequirementsSidebarButton = By.xpath("(//ul[@id='menu']//a[contains(@href,'versions')])[1]");
	By versionRequirementsPageTitle = By.xpath("//h2[contains(text(),'Versioned Requirements')]");
	By versionRequirementsTable = By.xpath("//table[@id='DataTables_Table_0']/tbody");
	By versionRequirementsTableLabels = By.xpath("//table/thead/tr/th/div/label");
	By versionRequirementsTableActionLabel = By.xpath("//table/thead/tr/th[text()='Action']");
	By versionRequirementsTableRecords = By.xpath("//table[contains(@id,'DataTables_Table')]/tbody/tr");
	By versionRequirementsActivateRequirementButton = By.xpath("//table[contains(@id,'DataTables_Table')]/tbody/tr/td[11]/div/button[@title='Activate Requirement']");
	By versionRequirementsDeleteRequirementButton = By.xpath("//table[contains(@id,'DataTables_Table')]/tbody/tr/td[11]/div/button[@title='Delete Latest Requirement']");
	By versionRequirementsApproveRequirementButton = By.xpath("//table[contains(@id,'DataTables_Table')]/tbody/tr/td[11]/div/button[@title='Approve Requirement']");
	By versionRequirementsEditRequirementButton = By.xpath("//table[contains(@id,'DataTables_Table')]/tbody/tr/td[11]/div/a[@title='Edit Requirement']");
	By versionRequirementsViewRequirementButton = By.xpath("//table[contains(@id,'DataTables_Table')]/tbody/tr/td[11]/div/a[@title='View Requirement']");

	By versionRequirementsTableRecordElements = By.xpath("//table[@id='DataTables_Table_0']/tbody/tr/td");
	By versionRequirementsTableNoRecords = By.xpath("//td[@class='dataTables_empty']");
	By numberOfEntriesSelect = By.xpath("//select[@name='DataTables_Table_0_length']");
	By numberOfEntriesInfo = By.xpath("//div[@id='DataTables_Table_0_info']");
	By searchField = By.xpath("//div[@id='DataTables_Table_0_filter']/label/input");
	By requirementJJReqtypeSearchField = By.xpath("//input[@placeholder='Search JJ-CATEGORY-REQTYPE']");
	By requirementSKUSearchField = By.xpath("//input[@placeholder='Search SKU']");
	By requirementVersionSearchField = By.xpath("//input[@placeholder='Search Version']");
	By requirementNameSearchField = By.xpath("//input[@placeholder='Search Name Requirement']");
	By requirementQueryCriteriaSearchField = By.xpath("//input[@placeholder='Search Query Criteria']");
	By requirementCreatedSearchField = By.xpath("//input[@placeholder='Search Created']");
	By requirementApprovedSearchField = By.xpath("//input[@placeholder='Search Approved']");
	By requirementActivatedSearchField = By.xpath("//input[@placeholder='Search Activated']");
	By requirementStatusSearchField = By.xpath("//input[@placeholder='Search Status']");
	By changeNoteForCustomerInput = By.xpath("//textarea[@name='Change_Note_for_Customer']");
	By yesIncludeRadioButton = By.xpath("//input[@checked and @id='requirements_checks_include_yes']");
	By processingTimeInput = By.xpath("//input[@name='Application_ProcessingTime']");

	String requirementSku;
	String changeNoteText;
	String processingTime;
	String searchFieldText;
	public String getSearchFieldText(){
		return searchFieldText;
	}
	public String getChangeNoteText(){
		return changeNoteText;
	}
	public String getProcessingTime() { return processingTime;}
	public String getRequirementSku(){
		return requirementSku;
	}

	public boolean isVersionedRequirementsAdminPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(versionRequirementsPageTitle);
	}

	public boolean isIncludeRadioButtonChecked(){
		return isElementVisible(yesIncludeRadioButton);
	}

	public void selectNumberOfEntriesToBeDisplayed(String entries){
		waitForElementVisibility(numberOfEntriesSelect);
		selectOption(entries, numberOfEntriesSelect);
	}

	public int getNumberOfRecords(){
		if(isElementVisible(versionRequirementsTableNoRecords))
			return 0;
		waitForElementPresent(versionRequirementsTableRecords);
		return getElements(versionRequirementsTableRecords).size();
	}

	public boolean isTableLabelsPresent(List<String> labels){
		List<String> tableLabelsList = new ArrayList<>();
		List<SelenideElement> elements = getElements(versionRequirementsTableLabels);
		for(SelenideElement element : elements){
			tableLabelsList.add(element.getText());
		}

		tableLabelsList.add(getSelenideElement(versionRequirementsTableActionLabel).getAttribute("aria-label"));
		System.out.println(tableLabelsList);
		for(int i = 0; i < tableLabelsList.size(); i++){
			System.out.println(tableLabelsList.get(i) + " " + labels.get(i));
			if(!tableLabelsList.get(i).contains(labels.get(i)))
				if(!tableLabelsList.get(i).equals(labels.get(i)))
					return false;
		}
		return true;
	}

	public void clickOnTheLabel(String label){
		List<SelenideElement> elements = getElements(versionRequirementsTableLabels);
		for(SelenideElement element : elements){
			if(element.getText().equals(label)) {
				element.click();
				break;
			}
		}
	}

	public boolean verifyThatRecordsSortedByTheLabel(String label){
		List<String> tableRecords = new ArrayList<>();
		List<SelenideElement> elements = getElements(versionRequirementsTableLabels);
		for(int i = 0;i < elements.size(); i++){
			if(elements.get(i).getText().contains(label)){
				for(int j = 0; j < getElements(versionRequirementsTableRecords).size(); j++)
					tableRecords.add(getSelenideElement(versionRequirementsTable).findElement(By.xpath("./tr["+(j+1)+"]/td["+(i+1)+"]")).getText());
			}
		}
		System.out.println(tableRecords.size());
		List<String> sortedTableRecords = tableRecords;
		Collections.sort(sortedTableRecords);
		return sortedTableRecords.equals(tableRecords);
	}

	public boolean verifyThatRecordsSortedBackwardsByTheLabel(String label){
		List<String> tableRecords = new ArrayList<>();
		List<SelenideElement> elements = getElements(versionRequirementsTableLabels);
		for(int i = elements.size()-1;i >= 0; i--){
			if(elements.get(i).getText().contains(label)){
				for(int j = 0; j < getElements(versionRequirementsTableRecords).size(); j++)
					tableRecords.add(getSelenideElement(versionRequirementsTable).findElement(By.xpath("./tr["+(j+1)+"]/td["+(i+1)+"]")).getText());
			}
		}
		List<String> sortedTableRecords = tableRecords;
		Collections.sort(sortedTableRecords, Collections.reverseOrder());
		return sortedTableRecords.equals(tableRecords);
	}

	public void enterTextInTheSearchField(String text){
		waitForElementVisibility(searchField);
		type(text, searchField);
	}

	public boolean isNoRecordsFoundMessageDisplayed(){
		SelenideTools.sleep(2);
		return isElementVisible(versionRequirementsTableNoRecords);
	}

	public void clickOnViewRequirementButton(int index){
		waitForElementVisibility(versionRequirementsTableRecords);
		requirementSku = getElements(versionRequirementsTableRecords).get(index).findElement(By.xpath("./td[3]")).getText();
		getElements(versionRequirementsTableRecords).get(index).findElement(By.xpath("./td[11]/div/a[@title='View Requirement']")).click();
	}

	public void clickOnViewRequirementButton(String status){
		waitForElementVisibility(versionRequirementsTableRecords);
		for(int i = 0;i < getElements(versionRequirementsTableRecords).size();i++){
			String statusOfCurrentRecord = getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[10]")).getText();
			if(statusOfCurrentRecord.equals(status)){
				requirementSku = getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[3]")).getText();
				getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[11]/div/a[@title='View Requirement']")).click();
				System.out.println(i);
				break;
			}
		}
	}

	public void clickOnViewButtonOfTheEarlyOpenedRequirement(){
		for(int i = 0;i < getElements(versionRequirementsTableRecords).size();i++){
			String sku = getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[3]")).getText();
			if(sku.equals(requirementSku)){
				getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[11]/div/a[@title='View Requirement']")).click();
				break;
			}
		}
	}

	public void clickOnEditRequirementButton(int index){
		waitForElementVisibility(versionRequirementsTableRecords);
		requirementSku = getElements(versionRequirementsTableRecords).get(index-1).findElement(By.xpath("./td[3]")).getText();
		getElements(versionRequirementsTableRecords).get(index-1).findElement(By.xpath("./td[11]/div/a[@title='Edit Requirement']")).click();
	}

	public void clickOnEditRequirementButton(String status){
		waitForElementVisibility(versionRequirementsTableRecords);
		for(int i = 0;i < getElements(versionRequirementsTableRecords).size();i++){
			String statusOfCurrentRecord = getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[10]")).getText();
			if(statusOfCurrentRecord.equals(status)){
				requirementSku = getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[3]")).getText();
				getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[11]/div/a[@title='Edit Requirement']")).click();
				break;
			}
		}
	}

	public void clickOnEditButtonOfTheEarlyOpenedRequirement(){
		for(int i = 0;i < getElements(versionRequirementsTableRecords).size();i++){
			String sku = getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[3]")).getText();
			if(sku.equals(requirementSku)){
				getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[11]/div/a[@title='Edit Requirement']")).click();
				break;
			}
		}
	}

	public void clickOnDeleteRequirementButton(int index){
		waitForElementVisibility(versionRequirementsTableRecords);
		requirementSku = getElements(versionRequirementsTableRecords).get(index).findElement(By.xpath("./td[3]")).getText();
		getElements(versionRequirementsTableRecords).get(index).findElement(By.xpath("./td[11]/div/button[@title='Delete Latest Requirement']")).click();
	}

	public void clickOnDeleteRequirementButton(String status){
		waitForElementVisibility(versionRequirementsTableRecords);
		for(int i = 0;i < getElements(versionRequirementsTableRecords).size();i++){
			String statusOfCurrentRecord = getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[10]")).getText();
			if(statusOfCurrentRecord.equals(status)){
				requirementSku = getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[3]")).getText();
				getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[11]/div/button[@title='Delete Latest Requirement']")).click();
				break;
			}
		}
	}

	public void clickOnDeleteButtonOfTheEarlyOpenedRequirement(){
		for(int i = 0;i < getElements(versionRequirementsTableRecords).size();i++){
			String sku = getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[3]")).getText();
			if(sku.equals(requirementSku)){
				getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[11]/div/button[@title='Delete Latest Requirement']")).click();
				break;
			}
		}
	}

	public void clickOnApproveRequirementButton(int index){
		waitForElementVisibility(versionRequirementsTableRecords);
		requirementSku = getElements(versionRequirementsTableRecords).get(index).findElement(By.xpath("./td[3]")).getText();
		getElements(versionRequirementsTableRecords).get(index).findElement(By.xpath("./td[11]/div/button[@title='Approve Requirement']")).click();
	}

	public void clickOnApproveRequirementButton(String status){
		waitForElementVisibility(versionRequirementsTableRecords);
		for(int i = 0;i < getElements(versionRequirementsTableRecords).size();i++){
			String statusOfCurrentRecord = getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[10]")).getText();
			if(statusOfCurrentRecord.equals(status)){
				requirementSku = getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[3]")).getText();
				getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[11]/div/button[@title='Approve Requirement']")).click();
				break;
			}
		}
	}

	public void clickOnApproveButtonOfTheEarlyOpenedRequirement(){
		for(int i = 0;i < getElements(versionRequirementsTableRecords).size();i++){
			String sku = getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[3]")).getText();
			if(sku.equals(requirementSku)){
				getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[11]/div/button[@title='Approve Requirement']")).click();
				break;
			}
		}
	}

	public void clickOnActivateRequirementButton(int index){
		waitForElementVisibility(versionRequirementsTableRecords);
		requirementSku = getElements(versionRequirementsTableRecords).get(index).findElement(By.xpath("./td[3]")).getText();
		getElements(versionRequirementsTableRecords).get(index).findElement(By.xpath("./td[11]/div/button[@title='Activate Requirement']")).click();
	}

	public void clickOnActivateRequirementButton(String status){
		waitForElementVisibility(versionRequirementsTableRecords);
		for(int i = 0;i < getElements(versionRequirementsTableRecords).size();i++){
			String statusOfCurrentRecord = getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[10]")).getText();
			if(statusOfCurrentRecord.equals(status)){
				requirementSku = getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[3]")).getText();
				getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[11]/div/button[@title='Activate Requirement']")).click();
				break;
			}
		}
	}

	public void clickOnActivateButtonOfTheEarlyOpenedRequirement(){
		for(int i = 0;i < getElements(versionRequirementsTableRecords).size();i++){
			String sku = getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[3]")).getText();
			if(sku.equals(requirementSku)){
				getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[11]/div/button[@title='Activate Requirement']")).click();
				break;
			}
		}
	}

	public String getRequirementStatus(int index){
		waitForElementVisibility(versionRequirementsTableRecords);
		System.out.println(getElements(versionRequirementsTableRecords).get(index).findElement(By.xpath("./td[10]")).getText());
		return getElements(versionRequirementsTableRecords).get(index).findElement(By.xpath("./td[10]")).getText();
	}

	public boolean isRequirementViewButtonClickable(int index){
		return getElements(versionRequirementsTableRecords).get(index).findElement(By.xpath("./td[11]/div/a[@title='View Requirement']")).isDisplayed();
	}
	public boolean isRequirementEditButtonClickable(int index){
		return getElements(versionRequirementsTableRecords).get(index).findElement(By.xpath("./td[11]/div/a[@title='Edit Requirement']")).isDisplayed();
	}
	public boolean isRequirementApproveButtonClickable(int index){
		return getElements(versionRequirementsTableRecords).get(index).findElement(By.xpath("./td[11]/div/button[@title='Approve Requirement']")).isDisplayed();
	}

	public boolean isRequirementActivateButtonClickable(int index){
		return getElements(versionRequirementsTableRecords).get(index).findElement(By.xpath("./td[11]/div/button[@title='Activate Requirement']")).isDisplayed();
	}

	public boolean isRequirementActivateButtonVisible(){
 		return isElementVisible(versionRequirementsActivateRequirementButton);
 	}
	public boolean isRequirementDeleteButtonClickable(int index){
		return getElements(versionRequirementsTableRecords).get(index).findElement(By.xpath("./td[11]/div/button[@title='Delete Latest Requirement']")).isDisplayed();
	}

	public boolean isRequirementDeleteButtonVisible(){
		return isElementVisible(versionRequirementsDeleteRequirementButton);
	}

	public boolean isRequirementViewButtonVisible(){
		return isElementVisible(versionRequirementsViewRequirementButton);
	}

	public boolean isRequirementEditButtonVisible(){
		return isElementVisible(versionRequirementsEditRequirementButton);
	}

	public boolean isRequirementApproveButtonVisible(){
		return isElementVisible(versionRequirementsApproveRequirementButton);
	}

	public void enterRequirementJJReqtypeInTheSearchField(String requiremenJJReqtype){
		waitForElementVisibility(requirementJJReqtypeSearchField);
		type(requiremenJJReqtype, requirementJJReqtypeSearchField);
	}

	public void enterRequirementSkuInTheSearchField(String requirementSKU){
		waitForElementVisibility(requirementSKUSearchField);
		type(requirementSKU, requirementSKUSearchField);
	}

	public void enterRequirementVersionInTheSearchField(String requirementVersion){
		waitForElementVisibility(requirementVersionSearchField);
		type(requirementVersion, requirementVersionSearchField);
	}

	public void enterRequirementNameInTheSearchField(String requirementName){
		waitForElementPresent(requirementNameSearchField);
		scrollToElement(requirementNameSearchField);
		type(requirementName, requirementNameSearchField);
		System.out.println(requirementName);
	}

	public void enterSKUTheSearchField(String SKU){
		waitForElementPresent(requirementSKUSearchField);
		scrollToElement(requirementSKUSearchField);
		type(SKU, requirementSKUSearchField);
		System.out.println(SKU);
	}

	public void saveTextFromSearchField(){
		waitForElementVisibility(requirementNameSearchField);
		System.out.println("Value - "+getSelenideElement(requirementStatusSearchField).getValue());
		System.out.println("Text - "+getSelenideElement(requirementStatusSearchField).getText());
		searchFieldText = getSelenideElement(requirementStatusSearchField).getValue();
	}

	public String getTextFromSearchField(){
		waitForElementVisibility(requirementNameSearchField);
		return getSelenideElement(requirementNameSearchField).getValue();
	}

	public void enterRequirementQueryCriteriaInTheSearchField(String requirementQuery){
		waitForElementVisibility(requirementQueryCriteriaSearchField);
		type(requirementQuery, requirementQueryCriteriaSearchField);
	}

	public void enterRequirementCreatedInTheSearchField(String requirementCreated){
		waitForElementVisibility(requirementCreatedSearchField);
		type(requirementCreated, requirementCreatedSearchField);
	}

	public void enterRequirementApprovedInTheSearchField(String requirementApproved){
		waitForElementVisibility(requirementApprovedSearchField);
		type(requirementApproved, requirementApprovedSearchField);
	}

	public void enterRequirementActivatedInTheSearchField(String requirementActivated){
		waitForElementVisibility(requirementActivatedSearchField);
		type(requirementActivated, requirementActivatedSearchField);
	}

	public void enterRequirementStatusInTheSearchField(String requirementStatus){
		waitForElementVisibility(requirementStatusSearchField);
		type(requirementStatus, requirementStatusSearchField);
	}
	public void clickOnVersionedRequirementSidebarButton(){
		waitForElementClickable(versionedRequirementsSidebarButton);
		click(versionedRequirementsSidebarButton);
	}

	public boolean isSelectorCriteriaMatch(String selectorCriteria){
		SelenideTools.sleep(2);
		if(isElementVisibleWithNoLog(versionRequirementsTableNoRecords))
			return false;
		waitForElementVisibility(versionRequirementsTableRecords);
		System.out.println(getSelenideElement(versionRequirementsTableRecords).findElement(By.xpath("./td[6]")).getText());
		System.out.println(selectorCriteria);
		return getSelenideElement(versionRequirementsTableRecords).findElement(By.xpath("./td[6]")).getText().contains(selectorCriteria);
	}

	public void enterChangeNoteForCustomer(String text){
		waitForElementVisibility(changeNoteForCustomerInput);
		getSelenideElement(changeNoteForCustomerInput).sendKeys(text);
		getSelenideElement(changeNoteForCustomerInput).click();
		type(text, changeNoteForCustomerInput);
		System.out.println(text);
		changeNoteText = getSelenideElement(changeNoteForCustomerInput).getText();
		System.out.println(changeNoteText);
		SelenideTools.sleep(10);
	}

	public void enterProcessingTime(String text){
		SelenideTools.sleep(2);
		waitForElementVisibility(processingTimeInput);
		type(text, processingTimeInput);
		processingTime = getSelenideElement(processingTimeInput).getText();
		SelenideTools.sleep(10);
	}

	public boolean isRecordWithRequirementNameDisplayed(String requirementName){
		waitForElementVisibility(versionRequirementsTableRecords);
		if(isNoRecordsFoundMessageDisplayed())
			return false;
		SelenideTools.sleep(2);
		System.out.println(requirementName);
		for(int i = 0;i < getElements(versionRequirementsTableRecords).size();i++){
			String requirementNameOfCurrentRecord = getElements(versionRequirementsTableRecords).get(i).findElement(By.xpath("./td[5]")).getText();
			if(requirementNameOfCurrentRecord.equals(requirementName)){
				return true;
			}
		}
		return false;
	}
	public void saveRequirementSku(int index){
		waitForElementVisibility(versionRequirementsTableRecords);
		requirementSku = getElements(versionRequirementsTableRecords).get(index).findElement(By.xpath("./td[3]")).getText();
	}
}
