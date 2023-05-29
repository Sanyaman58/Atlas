package Pages.atlas;

import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.actions;

public class DocumentRepositoryPage extends PageTools {
	By documentRepositoryPageTitle = By.xpath("//div[@id='task-grid']//p[contains(text(),'Documents')]");
	By documentRepositoryTableRecord = By.xpath("//table[@id='document-list-main']/tbody/tr[%s]");
	By documentRepositoryTableRecords = By.xpath("//table[@id='document-list-main']/tbody/tr");
	By documentRepositoryTableNoRecords = By.xpath("//table[@id='document-list-main']/tbody/tr/td[contains(text(),'No data available in table')]");
	By documentRepositoryTableRecordsPdfUploadButton = By.xpath("//table[@id='document-list-main']/tbody/tr/td[15]/a");
	By documentRepositoryClientSelect = By.xpath("//select[@id='DocClientKey']");
	By documentRepositorySearchField = By.xpath("//input[@type='search']");
	By editDocumentWindow = By.xpath("//p[contains(text(), 'Edit Document')]");
	By editDocumentCloseButton = By.xpath("//div[@class='modal-content']//button[@onclick='showKeyPressConfirm()']/span");
	By selectFileButton = By.xpath("//button[@id='FileUpload']");
	By requestDocumentButton = By.xpath("//button[@id='adddocument']");
	By addRequestDocumentWindow = By.xpath("//p[contains(text(), 'Add Request Document')]");
	By documentCategorySelect = By.xpath("//select[@id='DocCategoryId']");
	By ownerNameInput = By.xpath("//input[@id='OwnerName']");
	By assigneeSelect = By.xpath("//select[@id='Assignee']");
	By documentTypeSelect = By.xpath("//select[@id='DocNameId']");
	By addRequestDocumentSaveButton = By.xpath("//button[@id='add_edit_document_save_btn']");
	By yesConfidentialDocumentRadioButton = By.xpath("//input[@id='DocConyes']");
	String ownerName;

	public String getOwnerName() {
		return ownerName;
	}

	public boolean isDocumentRepositoryPageOpened() {
		waitForElementVisibility(documentRepositoryPageTitle);
		return isElementVisible(documentRepositoryPageTitle);
	}
	public boolean isEditDocumentWindowOpened() {
		waitForElementVisibility(editDocumentWindow);
		return isElementVisible(editDocumentWindow);
	}

	public void selectClient(String client){
		SelenideTools.sleep(2);
//		waitForElementVisibility(documentRepositoryClientSelect);
		selectOption(client, documentRepositoryClientSelect);
	}

	public void enterTextInSearchField(String text){
		waitForElementVisibility(documentRepositorySearchField);
		type(text, documentRepositorySearchField);
	}

	public void doubleClickOnRecord(int index){
		waitForElementVisibility(documentRepositoryTableRecord, index);
		doubleClick(documentRepositoryTableRecord, index);
	}

	public void closeEditDocumentWindow(){
		waitForElementVisibility(editDocumentCloseButton);
		click(editDocumentCloseButton);
	}

	public boolean isPDFButtonVisible(){
		SelenideTools.sleep(2);
		return isElementVisible(documentRepositoryTableRecordsPdfUploadButton);
	}

	public void clickPDFButton(){
		waitForElementVisibility(documentRepositoryTableRecordsPdfUploadButton);
		click(documentRepositoryTableRecordsPdfUploadButton);
	}

	public boolean isSelectFileButtonVisible(){
		SelenideTools.sleep(2);
		return isElementClickable(selectFileButton);
	}

	public void clickRequestDocumentButton(){
		waitForElementClickable(requestDocumentButton);
		click(requestDocumentButton);
	}

	public boolean isAddRequestDocumentWindowVisible(){
		SelenideTools.sleep(2);
		return isElementVisible(addRequestDocumentWindow);
	}

	public void selectDocumentCategory(String category){
		waitForElementVisibility(documentCategorySelect);
		selectOption(category, documentCategorySelect);
	}

	public void enterOwnerName(String name){
		waitForElementVisibility(ownerNameInput);
		type(name, ownerNameInput);
		ownerName = name;
	}

	public void selectAssignee(String assignee){
		waitForElementVisibility(assigneeSelect);
		selectOption(assignee, assigneeSelect);
	}

	public void selectDocumentType(String type){
		waitForElementVisibility(documentTypeSelect);
		selectOption(type, documentTypeSelect);
	}

	public void clickAddRequestDocumentSaveButton(){
		waitForElementVisibility(addRequestDocumentSaveButton);
		click(addRequestDocumentSaveButton);
	}

	public boolean isDocumentWithOwnerDisplayed(String name){
		waitForElementVisibility(documentRepositoryTableRecords);
		if(isElementVisible(documentRepositoryTableNoRecords))
			return false;
		for(int i = 0; i < getElements(documentRepositoryTableRecords).size(); i++){
			if(getElements(documentRepositoryTableRecords).get(i).findElement(By.xpath("./td[5]")).getText().equals(name))
				return true;
		}
		return false;
	}

	public void selectYesConfidentialDocumentRadioButton(){
		waitForElementVisibility(yesConfidentialDocumentRadioButton);
		click(yesConfidentialDocumentRadioButton);
	}
}
