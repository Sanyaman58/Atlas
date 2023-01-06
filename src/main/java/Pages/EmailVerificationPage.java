package Pages;

import Utils.SelenideTools;
import base.PageTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailVerificationPage extends PageTools {
	private WebDriver podriver = null;

	By emailTxt = By.xpath("//input[@name='loginfmt'] | //input[@type='email']");
	By submitBtn = By.xpath("//input[@type='submit'] | //input[@data-report-value='Submit']");
	By passwordTxt = By.xpath("//input[@name='passwd'] | //input[@type='password']");
	By signinBtn = By.xpath("(//a[@data-task='signin'])[1]");
	By inboxFirstEmail = By.xpath("(//span[text()='ATLAS Support at Pharma Solutions'])[1]");
	By otpCode = By.xpath("//p/b");
	By notRecognizedPopOkBtn= By.xpath("//a[@id='modal-danger-ok']");
	By enterValidationCodeTxt = By.xpath("//input[@id='verificationCode']");
	By validationSubmitBtn = By.xpath("//button[@id='verificationcode__submit']");
	By validationCanselBtn = By.xpath("//button[text()='Cancel']");
	
	
	String getOtpCode = "";
	

	public EmailVerificationPage() {
	}

	public void navigateToUrl(String Url) throws InterruptedException {
		SelenideTools.openUrl(Url);
	}

	public static void openUrlInNewTab(String url) {
		SelenideTools.openUrlInNewWindow(url);
		SelenideTools.switchToLastTab();
	}
	
	public void enterUserNameAndPassword(String username, String password) {
		waitForElementVisibility(emailTxt);
		type(username, emailTxt);
		
		click(submitBtn);
		
		waitForElementVisibility(passwordTxt);
		type(password, passwordTxt);
		
		click(submitBtn);
		
		waitForElementVisibility(submitBtn);
		click(submitBtn);
		
	}
	
	public void clickOnInboxFirstEmail() {
		waitForElementVisibility(inboxFirstEmail);
		click(inboxFirstEmail);
		
		waitForElementVisibility(otpCode);
		getOtpCode = getElementText(otpCode);
	}	

	public void enterValidationCode() {
		waitForElementVisibility(enterValidationCodeTxt);
		type(getOtpCode, enterValidationCodeTxt);
	}
	
	public void clickOnValidationSubmitButton() {
		waitForElementVisibility(validationSubmitBtn);
		click(validationSubmitBtn);
	}

	public void clickOnValidationCancelButton() {
		waitForElementVisibility(validationCanselBtn);
		click(validationCanselBtn);
	}
	
	public Boolean verifyNotRecognizedPopOkButton() {
		SelenideTools.sleep(3);
		return isElementVisible(notRecognizedPopOkBtn);
	}
	
	public void clickOnNotRecognizedPopOkButton() {
		click(notRecognizedPopOkBtn);
	}
	
	public void clickOnSigninButton() {
		waitForElementVisibility(signinBtn);
		click(signinBtn);
	}
	
	
}
