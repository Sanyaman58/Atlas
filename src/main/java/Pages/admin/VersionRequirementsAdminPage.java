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
	By versionRequirementsTableLabels = By.xpath("//table[@id='DataTables_Table_0']/thead/tr/th/div/label");
	By versionRequirementsTableActionLabel = By.xpath("//table[@id='DataTables_Table_0']/thead/tr/th[text()='Action']");
	By versionRequirementsTableRecords = By.xpath("//table[@id='DataTables_Table_0']/tbody/tr");
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

	String requirementSku;

	public boolean isVersionedRequirementsAdminPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(versionRequirementsPageTitle);
	}

	public void selectNumberOfEntriesToBeDisplayed(String entries){
		waitForElementVisibility(numberOfEntriesSelect);
		selectOption(entries, numberOfEntriesSelect);
	}

	public int getNumberOfRecords(){
		waitForElementPresent(versionRequirementsTableRecords);
		return getElements(versionRequirementsTableRecords).size();
	}

	public boolean isTableLabelsPresent(List<String> labels){
		List<String> tableLabelsList = new ArrayList<>();
		List<SelenideElement> elements = getElements(versionRequirementsTableLabels);
		for(SelenideElement element : elements){
			tableLabelsList.add(element.getText());
		}
		tableLabelsList.add(getSelenideElement(versionRequirementsTableActionLabel).getText());
		return tableLabelsList.equals(labels);
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
		getElements(versionRequirementsTableRecords).get(index-1).findElement(By.xpath("./td[11]/div/a[@title='View Requirement']")).click();
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
		getElements(versionRequirementsTableRecords).get(index-1).findElement(By.xpath("./td[11]/div/button[@title='Delete Latest Requirement']")).click();
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
		waitForElementVisibility(requirementNameSearchField);
		type(requirementName, requirementNameSearchField);
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
		waitForElementVisibility(versionedRequirementsSidebarButton);
		click(versionedRequirementsSidebarButton);
	}

	public boolean isSelectorCriteriaMatch(String selectorCriteria){
		SelenideTools.sleep(2);
		if(isElementVisibleWithNoLog(versionRequirementsTableNoRecords))
			return false;
		waitForElementVisibility(versionRequirementsTableRecords);
		System.out.println(getSelenideElement(versionRequirementsTableRecords).findElement(By.xpath("./td[6]")).getText());
		System.out.println(selectorCriteria);
		return getSelenideElement(versionRequirementsTableRecords).findElement(By.xpath("./td[6]")).getText().equals(selectorCriteria);
	}
}
