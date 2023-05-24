package Pages.admin;

import Pages.Pages;
import Utils.SelenideTools;
import base.PageTools;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EditRequirementAdminPage extends PageTools {
	By editRequirementAdminPageTitle = By.xpath("//h2[contains(text(),'Requirements Admin')]");
	By editRequirementInfo = By.xpath("");
	By editRequirementGeneralInfo = By.xpath("(//section)[2]//div/textarea | (//section)[2]//div/select | (//section)[2]//label/following-sibling::input[@type='text']");
	By generalInfoRequirementName = By.xpath("//input[@name='Name_Requirement']");
	By generalInfoApplicationName = By.xpath("//input[@name='Name_Application']");
	By generalInfoJurisdiction = By.xpath("//select[@id='Jurisdiction']");
	By generalInfoProcessingTime = By.xpath("//input[@name='Application_ProcessingTime']");
	By generalInfoDefinition = By.xpath("//textarea[@name='Definition']");
	By generalInfoRenewalTerm = By.xpath("//input[@name='Renewal_Term']");
	By generalInfoNotes = By.xpath("//textarea[@name='Notes']");
	By generalInfoApplicationType = By.xpath("//select[@id='Application_Type']");
	By editButton = By.xpath("//a[text()='Edit']");

	List<String> generalInfoForComparison;

	
	public boolean isEditRequirementAdminPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(editRequirementAdminPageTitle);
	}

	public void clickOnEditButton(){
		waitForElementVisibility(editButton);
		click(editButton);
	}

	public List<String> getGeneralInfo() throws IOException {
		generalInfoForComparison = new ArrayList<>();
		generalInfoForComparison.add(getSelenideElement(generalInfoRequirementName).getText());
		generalInfoForComparison.add(getSelenideElement(generalInfoApplicationName).getText());
		generalInfoForComparison.add(getSelenideElement(generalInfoJurisdiction).getText());
		generalInfoForComparison.add(getSelenideElement(generalInfoProcessingTime).getText());
		generalInfoForComparison.add(getSelenideElement(generalInfoDefinition).getText());
		generalInfoForComparison.add(getSelenideElement(generalInfoRenewalTerm).getText());
		generalInfoForComparison.add(getSelenideElement(generalInfoNotes).getText());
		generalInfoForComparison.add(getSelenideElement(generalInfoApplicationType).getText());

		System.out.println(generalInfoForComparison.size());
			generalInfoForComparison.replaceAll(String::trim);
			generalInfoForComparison.removeAll(Collections.singleton(""));
			System.out.println("////////");
			System.out.println(generalInfoForComparison.size());
			for (String element : generalInfoForComparison) {
				System.out.println(element);
			}
			return generalInfoForComparison;
//		catch (IndexOutOfBoundsException e){
//			TakesScreenshot scrShot =((TakesScreenshot)SelenideTools.getDriver());
//			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//			File DestFile=new File("screenshots/"+ RandomStringUtils.random(5, false, true)+".png");
////Copy file at destination
//			FileUtils.copyFile(SrcFile, DestFile);
//			return null;
//		}
	}
}
