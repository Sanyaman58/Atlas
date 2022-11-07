package Pages;

import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.Selenide;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

public class NewResearchPage extends PageTools {

	By surveillanceSetupPageTitle = By.xpath("//h3[contains(@class,'cardInner-heading')]/span[@class='active yellow' and contains(text(),'Surveillance Setup')]");
	By companyLabelAsterisk = By.xpath("//div[@class='form-row']//div[@class='inner-box']//label[contains(text(),'Company')]/span[@class='red']");
	By facilityLabelAsterisk = By.xpath("//div[@class='form-row']//div[@class='inner-box']//label[contains(text(),'Facility')]/span[@class='red']");
	By companyNameInput = By.xpath("//input[@id='company_name']");
	By facilityInput = By.xpath("//input[@id='facility_name']");
	By helpTip = By.xpath("//span[@class='facility-tip']");
	By alertMessage = By.xpath("//p[@id='alert-msg']");
	By errorMessage = By.xpath("//div[@id='text_error']");
	By profileDropdown = By.xpath("//li[contains(@class,'profile-dropdown')]/a[@id='dropdown06']/i");
	By logOutButton = By.xpath("//div[contains(@class,'dropdown-menu')]/a[text()='Logout']");
	By alertOkButton = By.xpath("//div[@class='modal-content']/div[contains(@class,'modal-footer')]/button[text()='OK']");
	By submitNewJobButton = By.xpath("//button[@id='submit-new']");
	By copyFromResearchButton = By.xpath("//button[@id='copyfrom_research_job']");
	By tableJobs = By.xpath("//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr");
	By noDataInTable = By.xpath("//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr/td[text()='No data available in table']");
	By tableJobsRadioButton = By.xpath("//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr/td/input[@name='copy_from_job_id']");
	By clientDropdown = By.xpath("//select[contains(@class,'Client_id')]");
	By configurationSidebarButton = By.xpath("//ul[@id='menu']/li[3]/ul/li[1]/a");
	By resultsSidebarButton = By.xpath("//ul[@id='menu']/li[3]/ul/li[2]/a");
	By permissionsSidebarButton = By.xpath("//ul[@id='menu']/li[3]/ul/li[3]/a");
	By surveillanceSetupBreadcrumb = By.xpath("//h3[contains(@class,'cardInner-heading')]/a/span[contains(text(),'Surveillance Setup')]");

	String companyName;
	String facilityName;
	public void goBackInBrowser(){
		Selenide.back();
	}

	public void logOut(){
		waitForElementVisibility(profileDropdown);
		click(profileDropdown);
		waitForElementVisibility(logOutButton);
		click(logOutButton);
	}
	public boolean isSurveillanceSetupPageOpened() {
		waitForElementVisibility(surveillanceSetupPageTitle);
		return isElementVisible(surveillanceSetupPageTitle);
	}

	public boolean isCompanyLabelAsteriskPresent(){
		return isElementVisible(companyLabelAsterisk);
	}

	public boolean isFacilityLabelAsteriskPresent(){
		return isElementVisible(facilityLabelAsterisk);
	}

	public String getCompanyNameInputPlaceholder(){
		return getSelenideElement(companyNameInput).getAttribute("placeholder");
	}

	public void enterCompanyName(String name){
		type(name,companyNameInput);
		companyName = name;
	}

	public void enterRandomCompanyName(){
		String name = RandomStringUtils.random(10,true,false);
		type(name,companyNameInput);
		companyName = name;
	}

	public String getCompanyName(){
		return companyName;
	}

	public String getFacilityName(){
		return facilityName;
	}

	public void clearEnteredCompanyName(){
		getSelenideElement(companyNameInput).clear();
	}

	public String getEnteredCompanyName(){
		return getElementAttributeValue("value",companyNameInput);
	}

	public String getFacilityInputPlaceholder(){
		return getSelenideElement(facilityInput).getAttribute("placeholder");
	}

	public void enterFacility(String name){
		type(name,facilityInput);
		facilityName = name;
	}

	public void enterRandomFacilityName(){
		String name = RandomStringUtils.random(10,true,false);
		type(name,facilityInput);
		facilityName = name;
	}

	public String getEnteredFacility(){
		return getElementAttributeValue("value",facilityInput);
	}

	public void clearEnteredFacility(){
		getSelenideElement(facilityInput).clear();
	}

	public String getHelpTipText(){
		waitForElementVisibility(helpTip);
		return getSelenideElement(helpTip).getAttribute("title");
	}

	public void clickSubmitNewJobButton(){
		waitForElementClickable(submitNewJobButton);
		click(submitNewJobButton);
	}
	public void clickCopyFromResearchButton(){
		waitForElementClickable(copyFromResearchButton);
		click(copyFromResearchButton);
	}

	public boolean isAlertMessageVisible(){
		SelenideTools.sleep(2);
		return isElementVisible(alertMessage);
	}

	public boolean isErrorMessageVisible(){
		SelenideTools.sleep(2);
		return isElementVisible(errorMessage);
	}

	public String getAlertMessage(){
		return getElementText(alertMessage);
	}
	public String getErrorMessage(){
		return getElementText(errorMessage).trim();
	}

	public void clickAlertOkButton(){
		click(alertOkButton);
	}

	public boolean isNewlyCreatedJobDisplayed(String status){
		SelenideTools.sleep(7);
		if(isElementVisible(noDataInTable))
			return false;
		for(int i = 0;i < getElements(tableJobs).size();i++){
			if(getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr)["+(i+1)+"]" +
					"/td[2]")).getText().equals(companyName)
			&& getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr)["+(i+1)+"]" +
					"/td[3]")).getText().equals(facilityName)
			&& getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr)["+(i+1)+"]" +
					"/td[4]")).getText().equals(status))
			{
//				System.out.println(getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr)["+(i+1)+"]" +
//						"/td[3]")).getText());
//				System.out.println(getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr)["+(i+1)+"]" +
//						"/td[4]")).getText());
			return true;}

		}
		return false;
	}

	public void selectTheJobFromTheTable(int index){
		getElements(tableJobsRadioButton).get(index).click();
	}

	public void selectTheJobFromTheTable(){
		for(int i = 0;i < getElements(tableJobs).size();i++){
			if(isElementExistsWithNoLog(By.xpath("(//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr)["+i+"]" +
					"/td[text()='"+companyName+"']"))
					&& isElementExistsWithNoLog(By.xpath("(//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr)["+i+"]" +
					"/td[text()='"+facilityName+"']"))){
				getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody[@class='get-dynamic-jobs']/tr)["+i+"]/td/input[@name='copy_from_job_id']")).click();
			}

		}
	}

	public boolean isSelectClientVisibleAndClickable(){
		return isElementVisible(clientDropdown)
				&& isElementClickable(clientDropdown);
	}

	public void selectClient(String client){
		waitForElementVisibility(clientDropdown);
		selectOption(client,clientDropdown);
	}

	public void clickConfigurationSidebarButton(){
		waitForElementVisibility(configurationSidebarButton);
		click(configurationSidebarButton);
	}

	public void clickResultsSidebarButton(){
		waitForElementVisibility(resultsSidebarButton);
		click(resultsSidebarButton);
	}

	public void clickPermissionsSidebarButton(){
		waitForElementVisibility(permissionsSidebarButton);
		click(permissionsSidebarButton);
	}

	public void clickOnSurveillanceSetupBreadcrumb(){
		waitForElementVisibility(surveillanceSetupBreadcrumb);
		click(surveillanceSetupBreadcrumb);
	}

}
