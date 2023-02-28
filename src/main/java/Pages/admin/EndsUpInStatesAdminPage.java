package Pages.admin;

import Utils.SelenideTools;
import base.PageTools;
import org.openqa.selenium.By;

public class EndsUpInStatesAdminPage extends PageTools {
	By endsUpInStateAdminPageTitle = By.xpath("//h2[contains(text(),'Ends Up in States')]");
	By endsUpInStatesCheckboxes = By.xpath("//form[@id='ends-up-states']//input[@class='jurisdictions_check']");
	By endsUpInStatesCheckboxRedCrosser =By.xpath("(//form[@id='ends-up-states']//input[@class='jurisdictions_check'])[%s]/following-sibling::div/label[contains(@class,'eui-color-red')]");
	By endsUpInStatesSaveButton = By.xpath("//button[@id='save_state']");
	
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

	public void clickSaveButton(){
		waitForElementVisibility(endsUpInStatesSaveButton);
		click(endsUpInStatesSaveButton);
	}

	public boolean isCheckboxRedCrossed(int index){
		waitForElementVisibility(endsUpInStatesCheckboxes);
		return isElementVisible(endsUpInStatesCheckboxRedCrosser,index);
	}
}
