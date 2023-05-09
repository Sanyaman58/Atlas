package Pages.atlas;

import Constants.Constants;
import Utils.SelenideTools;
import base.PageTools;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.actions;

public class RequirementsPage extends PageTools {
	By requirementsPageTitle = By.xpath("//div[@id='task-grid']//p[contains(text(),'Requirements')]");
	By requirementsTableRecords = By.xpath("//table[@id='licenses-list-main']/tbody/tr");
	By requirementsTableRecordsPdfUploadButton = By.xpath("//table[@id='licenses-list-main']/tbody/tr/td[14]/a");
	By requirementsPDFUpload = By.xpath("//div[@class='modal-content']//p[contains(text(),'Requirement PDF Upload')]");
	By closeRequirementsPDFUploadWindowButton = By.xpath("//div[@id='modal']//button[@class='close']");
	By errorText = By.xpath("//div[@id='text_error']");
	By errorWindowOkButton = By.xpath("//a[@id='modal-danger-ok']");
	By requirementHeaderSearchField = By.xpath("//th[@class=\"header-text\"]//input[not(contains(@type, 'hidden'))]");
	By requirementsPageTableLabels = By.xpath("//table/thead/tr[1]/th");
	By showRequirementsDetailsButton = By.xpath("//div[@id='reserachRequirementDetails']");
	By productLineLabel = By.xpath("//label[text()='Product Line']");
	By businessModelLabel = By.xpath("//label[text()='Business Model']");
	By changeNoteLabel = By.xpath("//label[text()='Change Note']");
	By companyProfilePageTitle = By.xpath("//*[@id=\"wrapper\"]/main/section[1]/div/div[1]/div/p");
	By companyProfileViewDetails = By.xpath("//*[@title=\"View Details\"]//button");
	By clientNavigationHeader = By.xpath("//*[@id=\"client-li-span\"]");
	By projectsNavigationHeader = By.xpath("//*[@id=\"projects-li-span\"]");
	By contactNavigationHeader = By.xpath("//*[@id=\"contact-li-span\"]");
	By disciplineNavigationHeader = By.xpath("//*[@id=\"disciplines-li-span\"]");

	public boolean isRequirementsPageOpened() {
		waitForElementVisibility(requirementsPageTitle);
		return isElementVisible(requirementsPageTitle);
	}

	public boolean isProductLineLabelVisible(){
		return isElementVisible(productLineLabel);
	}
	public boolean isBusinessModelLabelVisible(){
		return isElementVisible(businessModelLabel);
	}

	public boolean isChangeNoteLabelVisible(){
		return isElementVisible(changeNoteLabel);
	}

	public void clickOnThePlusPDFButton(int index) {
		waitForElementVisibility(requirementsTableRecords);
		getElements(requirementsTableRecords).get(index).findElement(By.xpath("./td[14]/a")).click();
	}

	public void rightClickOnTableRecord(int index) {
		waitForElementVisibility(requirementsTableRecords);
		WebElement record = getElements(requirementsTableRecords).get(index).findElement(By.xpath("./td[12]"));
		actions().contextClick(record).build().perform();
		SelenideTools.sleep(1);
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

	public void clickOnTheTableLabel(String labelText){
		waitForElementVisibility(requirementsPageTableLabels);
		for(SelenideElement element : getElements(requirementsPageTableLabels)){
			if(element.getText().equals(labelText) || element.getText().contains(labelText))
				element.click();
		}
	}

	public void clickShowRequirementsDetailsButton(){
		waitForElementVisibility(showRequirementsDetailsButton);
		click(showRequirementsDetailsButton);
	}
	
	public void isCompanyProfilePageOpened() {
		waitForElementVisibility(companyProfilePageTitle);
	}
	
	public void clickCompanyViewDetailsButton() {
		click(companyProfileViewDetails);
		SelenideTools.sleep(5);
		waitForElementVisibility(clientNavigationHeader);
		
	}
	
	public void verifyNavigationBetweenCompanyProfilePages() {
		SelenideElement clientNavigationHeaderElement = getSelenideElement(clientNavigationHeader);
		String classAttribute = clientNavigationHeaderElement.getAttribute("class");
		if (classAttribute.contains("active")) {
			System.out.println("Client page is opened");
		} else {
			System.out.println("Client page not opened");
		}
		SelenideElement projectsNavigationHeaderElement = getSelenideElement(projectsNavigationHeader);
		projectsNavigationHeaderElement.click();
		SelenideTools.sleep(2);
		String projectsClassAttribute = projectsNavigationHeaderElement.getAttribute("class");
		if (projectsClassAttribute.contains("active")) {
			System.out.println("Projects page is opened");
		} else {
			System.out.println("Projects page not opened");
		}
		
		SelenideElement contactNavigationHeaderElement = getSelenideElement(contactNavigationHeader);
		contactNavigationHeaderElement.click();
		SelenideTools.sleep(2);
		String contactClassAttribute = contactNavigationHeaderElement.getAttribute("class");
		if (projectsClassAttribute.contains("active")) {
			System.out.println("Contact page is opened");
		} else {
			System.out.println("Contact page not opened");
		}
		
		SelenideElement disciplineNavigationHeaderElement = getSelenideElement(disciplineNavigationHeader);
		disciplineNavigationHeaderElement.click();
		SelenideTools.sleep(2);
		String disciplineClassAttribute = disciplineNavigationHeaderElement.getAttribute("class");
		if (disciplineClassAttribute.contains("active")) {
			System.out.println("Contact page is opened");
		} else {
			System.out.println("Contact page not opened");
		}
	}
}
