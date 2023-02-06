package Pages.admin;

import Constants.Constants;
import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class AuditLogsAdminPage extends PageTools {
	By auditLogsAdminPageTitle = By.xpath("//h2[text()='Logs']");
	By auditLogsTableLabels = By.xpath("//div[@id='DataTables_Table_0_wrapper']//table/thead/tr/th");
	By auditLogsTableRecords = By.xpath("//div[@id='DataTables_Table_0_wrapper']//table/tbody/tr");

	By auditLogsSidebarButton = By.xpath("//a[contains(@href,'audit-logs')]");

	List<List<String>> tableRecords;


	public boolean isAuditLogsPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(auditLogsAdminPageTitle);
	}

	public void clickOnAuditLogsSidebarButton(){
		waitForElementVisibility(auditLogsSidebarButton);
		click(auditLogsSidebarButton);
	}

	public void getLogsTableData(){
		tableRecords = new ArrayList<>();
		for(int i = 0;i < getElements(auditLogsTableRecords).size(); i++){
			List<String> singleRecord = new ArrayList<>();
			for(int j = 0; j < getElements(By.xpath("//div[@id='DataTables_Table_0_wrapper']//table/tbody/tr["+(i+1)+"]/td")).size(); j++){
				singleRecord.add(getSelenideElement(By.xpath("//div[@id='DataTables_Table_0_wrapper']//table/tbody/tr["+(i+1)+"]/td["+(j+1)+"]")).getText());
			}
			tableRecords.add(singleRecord);
		}
	}

	public boolean isLogPresentInTheList(String type, String cName, String fName){
		for (List<String> tableRecord : tableRecords) {
			if (tableRecord.contains(type)
					|| tableRecord.contains(cName)
					|| tableRecord.contains(fName))
				return true;
		}
		return false;
	}

	public void clickOnTheLabel(String label){
		List<SelenideElement> elements = getElements(auditLogsTableLabels);
		for(SelenideElement element : elements){
			if(element.getText().equals(label));
			element.click();
		}
	}


	public boolean isTableLabelsPresent(List<String> labels){
		List<String> tableLabelsList = new ArrayList<>();
		List<SelenideElement> elements = getElements(auditLogsTableLabels);
		for(SelenideElement element : elements) {
			tableLabelsList.add(element.getText());
		}
		tableLabelsList.add(getSelenideElement(auditLogsTableLabels).getText());
		for(int i = 0; i < labels.size(); i++){
			System.out.println(labels.get(i)+" "+tableLabelsList.get(i));
			if(!labels.get(i).equals(tableLabelsList.get(i)))
				return false;
		}
		return true;
	}

}
