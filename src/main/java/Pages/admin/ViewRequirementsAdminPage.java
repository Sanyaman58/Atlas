package Pages.admin;

import Utils.SelenideTools;
import base.PageTools;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ViewRequirementsAdminPage extends PageTools {
	By activeRequirementsPageTitle = By.xpath("//h2[text()='Requirements Admin']");
	By viewRequirementInfo = By.xpath("//div[@class='content-wrapper']//p");

	List<String> viewRequirementData;

	public boolean isActiveRequirementsPageOpened(){
		SelenideTools.sleep(5);
		return isElementVisible(activeRequirementsPageTitle);
	}

	public void getViewRequirementsPageData(){
		viewRequirementData = new ArrayList<>();
		for(int i = 0; i < getElements(viewRequirementInfo).size();i++){
			viewRequirementData.add(getElements(viewRequirementInfo).get(i).getText());
		}
		viewRequirementData.removeAll(Collections.singleton(""));
		viewRequirementData.removeAll(Collections.singleton(null));
		viewRequirementData.replaceAll(String::trim);
		for (String element : viewRequirementData){
			System.out.println(element);
		}
	}

	public List<String> returnViewRequirementsData(){
		return viewRequirementData;
	}

	public boolean compareInfoLists(List<String> listToCompare){
		for(String element: listToCompare){
			if(!viewRequirementData.contains(element))
				return false;
		}
		return true;
	}
}
