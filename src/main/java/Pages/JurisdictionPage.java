package Pages;

import base.PageTools;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.HashMap;

public class JurisdictionPage extends PageTools {
	By jurisdictionPageTitle = By.xpath("//span[@class='yellow active' and contains(text(),'Jurisdictions')]");
	By stateSelect = By.xpath("//select[@name='resident_state']");
	By selectAllJurisdictionsButton = By.xpath("//button[@id='jurisdictions_select_all']");
	By clearAllJurisdictionsButton = By.xpath("//button[@id='jurisdictions_unselect_all']");
	By stateCheckboxes = By.xpath("//form[@id='mange-job-research']//div[@class='row']//div[@class='list-checkbox']");
	By requirementsChecksIncludeYesRadio = By.xpath("//input[@id='requirements_checks_include_yes']");
	By requirementsChecksIncludeNoRadio = By.xpath("//input[@id='requirements_checks_include_no']");
	By nextButton = By.xpath("//button[@id='save_juricdis']");
	By jurisdictionBreadcrumb = By.xpath("//h4[contains(@class,'cardInner-heading')]/a[2]/span[contains(text(),'Jurisdictions')]");
	By selectedResidentState = By.xpath("//*[@id=\"mange-job-research\"]/div/div[3]/div/span");



	HashMap<String,Boolean> statesCheckboxes = new HashMap<>();
	HashMap<String,Boolean> statesCheckboxesToCompare = new HashMap<>();
	public boolean isJurisdictionPageOpened() {
		waitForElementVisibility(jurisdictionPageTitle);
		return isElementVisible(jurisdictionPageTitle);
	}

	public void selectState(int index){
		getSelenideElement(stateSelect).selectOption(index);
	}

	public void selectState(String state){
		getSelenideElement(stateSelect).selectOption(state);
	}

	public void clickSelectAllJurisdictionsButton(){
		click(selectAllJurisdictionsButton);
	}

	public void clickClearAllJurisdictionsButton(){
		click(clearAllJurisdictionsButton);
	}

	public void getStateCheckboxesValues(){
		for(SelenideElement element : getElements(stateCheckboxes)){
			statesCheckboxes.put(element.findElement(By.xpath(".//label")).getText()
					,element.findElement(By.xpath(".//input")).isSelected());
		}
//		logInfo("Dupa" + statesCheckboxes.size());
//		statesCheckboxes.forEach((key, value) -> logInfo(key + " " + value));
//
//		SelenideTools.sleep(10);
	}

	public boolean areAllStatesCheckboxesVisibleAndClickable(){
		if(getElements(stateCheckboxes).size()!=53)
			return false;
		for(SelenideElement element : getElements(stateCheckboxes)){
			if(!element.findElement(By.xpath(".//input")).isEnabled())
				return false;
		}
		return true;
	}

	public void clickRequirementsChecksIncludeYesRadio(){
		waitForElementVisibility(requirementsChecksIncludeYesRadio);
		click(requirementsChecksIncludeYesRadio);
	}

	public void clickRequirementsChecksIncludeNoRadio(){
		click(requirementsChecksIncludeNoRadio);
	}

	public void clickTheNextButton(){
		click(nextButton);
	}

	public void clickTheJurisdictionBreadcrumb(){
		waitForElementVisibility(jurisdictionBreadcrumb);
		click(jurisdictionBreadcrumb);
	}

	public boolean validateThatPreviouslySelectedJurisdictionsAreSave(){
		for(SelenideElement element : getElements(stateCheckboxes)){
			statesCheckboxesToCompare.put(element.findElement(By.xpath(".//label")).getText()
					,element.findElement(By.xpath(".//input")).isSelected());
		}
		return statesCheckboxes.equals(statesCheckboxesToCompare);
	}

	public HashMap<String,Boolean> getJurisdictionStatesValues(){
		return statesCheckboxes;
	}
	
	public void selectedState(String Selectedstate){
		SelenideElement selectedResidentStateElement = getSelenideElement(selectedResidentState);
		if(selectedResidentStateElement.getText() == Selectedstate) {
			System.out.println("Resident state found to be same as selected earlier = "+ Selectedstate);
		}		
	}
	public boolean isEUIStatesRadioButtonsVisible(){
		return isElementVisible(requirementsChecksIncludeYesRadio) && isElementVisible(requirementsChecksIncludeNoRadio);
	}

}
