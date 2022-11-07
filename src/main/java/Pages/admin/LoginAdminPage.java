package Pages.admin;

import Constants.Constants;
import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class LoginAdminPage extends PageTools {
	By loginAdminPageTitle = By.xpath("//title[text()='Login']");
	By loginUserNameTxt =  By.xpath("//input[@name='username']");
	By loginPasswordTxt =  By.xpath("//input[@name='password']");
	By cancelBtn =  By.xpath("//button[text()='CANCEL'] | //button[text()='Cancel']");
	By loginBtn =  By.xpath("//button[text()='LOGIN']");
	By loginAssistanceBtn = By.xpath("//a[text()='Login Assistance']");
	By fillOutFieldMessage = By.xpath("//*[contains(.,'Please fill out this field')]");
	By errorMessage = By.xpath("//p[@class='error_msg']");



	public void openLighthouseAdmin(){
		SelenideTools.openUrl(Constants.ADMIN_URL);
	}

	public String getTabName() {
		return Selenide.title();
	}

	public boolean isLoginAdminPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(loginAdminPageTitle);
	}


	public String getErrorMessageText(){
		SelenideTools.sleep(3);
		return getElementText(errorMessage);
	}

	public boolean isFillOutMessageDisplayed(){
		SelenideTools.sleep(1);
		return isElementVisible(fillOutFieldMessage);
	}

	public void enterUserName(String username) {
		waitForElementVisibility(loginUserNameTxt);
		type(username, loginUserNameTxt);
	}

	public void enterPassword (String password) {
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

	public String getLoginInputPlaceholder(){
		return getSelenideElement(loginUserNameTxt).getAttribute("placeholder");
	}

	public String getPasswordInputPlaceholder(){
		return getSelenideElement(loginPasswordTxt).getAttribute("placeholder");
	}

	public String getPasswordFieldType(){
		return getElementAttributeValue("type",loginPasswordTxt);
	}

	public boolean isLoginButtonClickable(){
		return isElementClickable(loginBtn);
	}

	public boolean isCancelButtonClickable(){
		return isElementClickable(cancelBtn);
	}

	public boolean isLoginAssistanceButtonClickable(){
		return isElementClickable(loginAssistanceBtn);
	}

	public void clickCancelButton(){
		waitForElementVisibility(cancelBtn);
	}

	public void clickLoginAssistanceBtn(){
		waitForElementVisibility(loginAssistanceBtn);
		click(loginAssistanceBtn);
	}
	public void clickOnLoginButton() {
		waitForElementVisibility(loginBtn);
		click(loginBtn);
	}
}
