package Pages.admin;

import Utils.SelenideTools;
import base.PageTools;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EndsUpInStatesAdminPage extends PageTools {
	By endsUpInStateAdminPageTitle = By.xpath("//h2[contains(text(),'Ends Up in States')]");
	By endsUpInStatesCheckboxes = By.xpath("//form[@id='ends-up-states']//input[@class='jurisdictions_check']");
	By endsUpInStatesCheckboxesLabels = By.xpath("//form[@id='ends-up-states']//input[@class='jurisdictions_check']/following-sibling::div/label");
	By endsUpInStatesCheckboxRedCrosser =By.xpath("(//form[@id='ends-up-states']//input[@class='jurisdictions_check'])[%s]/following-sibling::div/label[contains(@class,'eui-color-red')]");
	By endsUpInStatesSaveButton = By.xpath("//button[@id='save_state']");
	By endsUpInStatesExitButton = By.xpath("//button[@id='exit-state']");

	List<String> checkboxLabels = new ArrayList();
	
	public boolean isEndsUpInStateAdminPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(endsUpInStateAdminPageTitle);
	}

	public void uncheckJurisdiction(int index){
		waitForElementVisibility(endsUpInStatesCheckboxes);
		if(getElements(endsUpInStatesCheckboxes).get(index).isSelected())
			getElements(endsUpInStatesCheckboxes).get(index).click();
	}

	public void checkJurisdiction(int index){
		waitForElementVisibility(endsUpInStatesCheckboxes);
		if(!getElements(endsUpInStatesCheckboxes).get(index).isSelected())
			getElements(endsUpInStatesCheckboxes).get(index).click();
	}

	public boolean isSaveButtonClickable(){
		return isElementClickable(endsUpInStatesSaveButton);
	}

	public boolean isExitButtonClickable(){
		return isElementClickable(endsUpInStatesExitButton);
	}

	public void clickSaveButton(){
		waitForElementVisibility(endsUpInStatesSaveButton);
		click(endsUpInStatesSaveButton);
	}

	public void clickExitButton(){
		waitForElementVisibility(endsUpInStatesExitButton);
		click(endsUpInStatesExitButton);
	}

	public boolean isCheckboxRedCrossed(int index){
		waitForElementVisibility(endsUpInStatesCheckboxes);
		return isElementVisible(endsUpInStatesCheckboxRedCrosser,index);
	}

	public boolean areCheckboxLabelsSortedAlphabetically(){
		for(int i = 0; i < getElements(endsUpInStatesCheckboxesLabels).size()-1; i++){
			checkboxLabels.add(getElements(endsUpInStatesCheckboxesLabels).get(i).getText().trim());
			System.out.println(getElements(endsUpInStatesCheckboxesLabels).get(i).getText().trim());
		}
		return checkboxLabels.stream().sorted().collect(Collectors.toList()).equals(checkboxLabels);
	}
}
