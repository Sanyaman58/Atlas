package Pages;

import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;

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

	public boolean isAddClientTableLabelsPresent(List<String> labels) {
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
		return true;
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
	
	public boolean isCategoryRolesPresentInDropdown(List<String> labels) {
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
		return true;
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
	
	public boolean isuserRoleCompliancePresentInDropdown(List<String> labels) {
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
		return true;
	}
	
	public void nouserRoleCompliancePresentInDropdown() {
		SelenideElement userRoleCount = getSelenideElement(userRoleComplianceDropdownElements);
		Assert.assertFalse(userRoleCount.isDisplayed());
		
	
	}

}
