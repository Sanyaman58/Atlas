package Pages.admin;

import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

public class EUIVersionAdminPage extends PageTools {
	By EUIVersionAdminPageTitle = By.xpath("//h2[text()='Versioned EUI']");
	By euiVersionAdminTableLabels = By.xpath("//table[@id='DataTables_Table_0']/thead/tr/th/div/label");
	By euiVersionAdminTableRecords = By.xpath("//table[@id='DataTables_Table_0']/tbody/tr");
	By yesApproveButton = By.xpath("//button[@id='yes_btn']");
	
	public boolean isEUIVersionAdminPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(EUIVersionAdminPageTitle);
	}

	public void clickOnTheTableLabel(String label){
		List<SelenideElement> elements = getElements(euiVersionAdminTableLabels);
		System.out.println(label);
		for(SelenideElement element : elements){
			if(element.getText().equals(label)){
				element.click();
				System.out.println(element.getText());
				break;
			}

		}
	}

	public void clickOnTheApproveEUIButton(int index){
		waitForElementVisibility(euiVersionAdminTableRecords);
		getElements(euiVersionAdminTableRecords).get(index).findElement(By.xpath("./td[8]/div/button[@title='Approve EUI']")).click();
	}

	public void clickOnTheActivateEUIButton(int index){
		waitForElementVisibility(euiVersionAdminTableRecords);
		getElements(euiVersionAdminTableRecords).get(index).findElement(By.xpath("./td[8]/div/button[@title='Activate EUI']")).click();
	}

	public void clickYesApproveButton(){
		waitForElementClickable(yesApproveButton);
		click(yesApproveButton);
	}
}
