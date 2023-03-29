package Pages;

import Constants.Constants;
import Utils.SelenideTools;
import base.PageTools;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageTools {
	By loginPageTitle = By.xpath("//title[text()='Login']");
	By loginUserNameTxt = By.xpath("//input[@name='username']");
	By loginPasswordTxt = By.xpath("//input[@name='password']");
	By cancelBtn = By.xpath("//button[text()='CANCEL'] | //button[text()='Cancel']");
	By loginBtn = By.xpath("//button[text()='LOGIN']");
	By loginAssistanceBtn = By.xpath("//a[text()='Login Assistance']");
	By fillOutFieldMessage = By.xpath("//*[contains(.,'Please fill out this field')]");
	By errorMessage = By.xpath("//p[@class='error_msg']");
	By roleSelect = By.xpath("//form[@method='POST']/div/select[@name='type']");
	By atlasProfileDropDown = By.xpath("//*[text()=\"Nikita Danilevskiy\"]");
	By atlasLogOutButton = By.xpath("//a[text()='Logout']");

	public void openLighthouse() {
		SelenideTools.openUrl(Constants.URL);
	}

	public void openAtlas() {
		SelenideTools.openUrl(Constants.ATLAS_URL);
	}

	public String getTabName() {
		return Selenide.title();
	}

	public boolean isLoginPageOpened() {
		SelenideTools.sleep(2);
		return isElementVisible(loginPageTitle);
	}

	public String getErrorMessageText() {
		SelenideTools.sleep(3);
		return getElementText(errorMessage);
	}

	public boolean isFillOutMessageDisplayed() {
		SelenideTools.sleep(1);
		return isElementVisible(fillOutFieldMessage);
	}

	public void selectRole(String role) {
		waitForElementVisibility(roleSelect);
		selectOption(role, roleSelect);
	}

	public void enterUserName(String username) {
		waitForElementVisibility(loginUserNameTxt);
		type(username, loginUserNameTxt);
	}

	public void enterPassword(String password) {
		waitForElementVisibility(loginPasswordTxt);
		type(password, loginPasswordTxt);
	}

	public void enterUserName() {
		waitForElementVisibility(loginUserNameTxt);
		type(Constants.Username, loginUserNameTxt);
	}

	public void enterPassword() {
		waitForElementVisibility(loginPasswordTxt);
		type(Constants.Password, loginPasswordTxt);
	}

	public String getLoginInputPlaceholder() {
		return getSelenideElement(loginUserNameTxt).getAttribute("placeholder");
	}

	public String getPasswordInputPlaceholder() {
		return getSelenideElement(loginPasswordTxt).getAttribute("placeholder");
	}

	public String getPasswordFieldType() {
		return getElementAttributeValue("type", loginPasswordTxt);
	}

	public boolean isLoginButtonClickable() {
		return isElementClickable(loginBtn);
	}

	public boolean isCancelButtonClickable() {
		return isElementClickable(cancelBtn);
	}

	public boolean isLoginAssistanceButtonClickable() {
		return isElementClickable(loginAssistanceBtn);
	}

	public void clickCancelButton() {
		waitForElementVisibility(cancelBtn);
	}

	public void clickLoginAssistanceBtn() {
		waitForElementVisibility(loginAssistanceBtn);
		click(loginAssistanceBtn);
	}

	public void clickOnLoginButton() {
		waitForElementVisibility(loginBtn);
		click(loginBtn);
	}

	public void logOutFromAtlas() {
		SelenideTools.sleep(10);
		waitForElementVisibility(atlasProfileDropDown);
	    click(atlasProfileDropDown);
	    SelenideTools.sleep(2);
		waitForElementVisibility(atlasLogOutButton);
		click(atlasLogOutButton);
	}

	public void clearPassword() {
		SelenideElement loginPasswordTxtElement = getSelenideElement(loginPasswordTxt);
		loginPasswordTxtElement.clear();
	}

	public void clearEmail() {
		SelenideElement loginEmailTxtElement = getSelenideElement(loginUserNameTxt);
		loginEmailTxtElement.clear();
	}

	public void verifyEmptyEmailPasswordField() {
		SelenideTools.sleep(4);
		SelenideElement loginPasswordTxtElement = getSelenideElement(loginPasswordTxt);
		SelenideElement loginEmailTxtElement = getSelenideElement(loginUserNameTxt);
		loginPasswordTxtElement.shouldBe(Condition.empty);
		loginEmailTxtElement.shouldBe(Condition.empty);
	}

}
