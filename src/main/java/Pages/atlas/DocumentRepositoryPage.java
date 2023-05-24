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
	By documentRepositoryTableRecordsPdfUploadButton = By.xpath("//table[@id='document-list-main']/tbody/tr/td[15]/a");
	By documentRepositoryClientSelect = By.xpath("//select[@id='DocClientKey']");
	By documentRepositorySearchField = By.xpath("//input[@type='search']");
	By editDocumentWindow = By.xpath("//p[contains(text(), 'Edit Document')]");
	By editDocumentCloseButton = By.xpath("//div[@class='modal-content']//button[@onclick='showKeyPressConfirm()']/span");
	By selectFileButton = By.xpath("//button[@id='FileUpload']");



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


}
