package Pages.atlas;

import Constants.Constants;
import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class RequirementsPage extends PageTools {
	By requirementsPageTitle = By.xpath("//div[@id='task-grid']//p[contains(text(),'Requirements')]");
	By requirementsTableRecords = By.xpath("//table[@id='licenses-list-main']/tbody/tr");
	By requirementsPDFUpload = By.xpath("//div[@class='modal-content']//p[contains(text(),'Requirement PDF Upload')]");
	By closeRequirementsPDFUploadWindowButton = By.xpath("//div[@id='modal']//button[@class='close']");
	By errorText = By.xpath("//div[@id='text_error']");
	By errorWindowOkButton = By.xpath("//a[@id='modal-danger-ok']");
	public boolean isRequirementsPageOpened(){
		waitForElementVisibility(requirementsPageTitle);
		return isElementVisible(requirementsPageTitle);
	}

	public void clickOnThePlusPDFButton(int index){
		waitForElementVisibility(requirementsTableRecords);
		getElements(requirementsTableRecords).get(index).findElement(By.xpath("./td[14]/a")).click();
	}

	public boolean isRequirementsPDFUploadPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(requirementsPDFUpload);
	}

	public void closeRequirementsPDFUploadWindow(){
		waitForElementVisibility(closeRequirementsPDFUploadWindowButton);
		click(closeRequirementsPDFUploadWindowButton);
	}

	public boolean isErrorTextDisplayed(String text){
		waitForElementVisibility(errorText);
		return getSelenideElement(errorText).getText().equals(text);
	}

	public void clickErrorWindowOkButton(){
		waitForElementVisibility(errorWindowOkButton);
		click(errorWindowOkButton);
	}

}
