package Pages.atlas;

import Constants.Constants;
import Utils.SelenideTools;
import base.PageTools;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import org.openqa.selenium.By;

public class RequirementsPage extends PageTools {
	By requirementsPageTitle = By.xpath("//div[@id='task-grid']//p[contains(text(),'Requirements')]");
	By requirementsTableRecords = By.xpath("//table[@id='licenses-list-main']/tbody/tr");
	By requirementsTableRecordsPdfUploadButton = By.xpath("//table[@id='licenses-list-main']/tbody/tr/td[14]/a");
	By requirementsPDFUpload = By.xpath("//div[@class='modal-content']//p[contains(text(),'Requirement PDF Upload')]");
	By closeRequirementsPDFUploadWindowButton = By.xpath("//div[@id='modal']//button[@class='close']");
	By errorText = By.xpath("//div[@id='text_error']");
	By errorWindowOkButton = By.xpath("//a[@id='modal-danger-ok']");
	By requirementHeaderSearchField = By.xpath("//th[@class=\"header-text\"]//input[not(contains(@type, 'hidden'))]");

	public boolean isRequirementsPageOpened() {
		waitForElementVisibility(requirementsPageTitle);
		return isElementVisible(requirementsPageTitle);
	}

	public void clickOnThePlusPDFButton(int index) {
		waitForElementVisibility(requirementsTableRecords);
		getElements(requirementsTableRecords).get(index).findElement(By.xpath("./td[14]/a")).click();
	}

	public void clickOnThePlusPDFButton() {
		waitForElementVisibility(requirementsTableRecordsPdfUploadButton);
		click(requirementsTableRecordsPdfUploadButton);
	}

	public boolean isRequirementsPDFUploadPageOpened() {
		SelenideTools.sleep(2);
		return isElementVisible(requirementsPDFUpload);
	}

	public void closeRequirementsPDFUploadWindow() {
		waitForElementVisibility(closeRequirementsPDFUploadWindowButton);
		click(closeRequirementsPDFUploadWindowButton);
	}

	public boolean isErrorTextDisplayed(String text) {
		waitForElementVisibility(errorText);
		return getSelenideElement(errorText).getText().equals(text);
	}

	public void clickErrorWindowOkButton() {
		waitForElementVisibility(errorWindowOkButton);
		click(errorWindowOkButton);
	}

	public void verifyRequirementPageSearchFields() {
		List<SelenideElement> elements = getElements(requirementHeaderSearchField);
		int searhBarSize = elements.size();
		if (searhBarSize == 11) {
			System.out.println("Verified that all the search bar is present with count = " + searhBarSize);
		} else {
			System.out.println("Search bar not present");
		}
		for (SelenideElement element : elements) {
			if (element.isDisplayed()) {
				System.out.println("All requirement page header search bar are displayed");
			} else {
				System.out.println("Requirement page header search bars not displayed");
			}
		}
	}

}
