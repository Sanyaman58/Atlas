package Pages.admin;

import Utils.SelenideTools;
import base.PageTools;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EditRequirementAdminPage extends PageTools {
	By editRequirementAdminPageTitle = By.xpath("//h2[contains(text(),'Requirements Admin')]");
	By editRequirementInfo = By.xpath("");
	By editRequirementGeneralInfo = By.xpath("(//section)[2]//div[@class='card-body']/div/div/div/*[2]/div/textarea | (//section)[2]//div[@class='card-body']/div/div/div/*[2]/div/select | (//section)[2]//div[@class='card-body']/div/div/div/*[2]/div/input");
	List<String> generalInfoForComparison;

	
	public boolean isEditRequirementAdminPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(editRequirementAdminPageTitle);
	}

	public List<String> getGeneralInfo(){
		generalInfoForComparison = new ArrayList<>();
		for(int i = 0;i < getElements(editRequirementGeneralInfo).size();i++){
			generalInfoForComparison.add(getElements(editRequirementGeneralInfo).get(i).getValue());
			System.out.println(getElements(editRequirementGeneralInfo).get(i).getValue());
		}
		generalInfoForComparison.replaceAll(String::trim);
		generalInfoForComparison.remove(2);
		generalInfoForComparison.remove(7);
		generalInfoForComparison.remove(7);
		generalInfoForComparison.remove(2);
		generalInfoForComparison.remove(1);
		generalInfoForComparison.removeAll(Collections.singleton(""));
		System.out.println(generalInfoForComparison.size());
		for (String element: generalInfoForComparison) {
			System.out.println(element);
		}
		return generalInfoForComparison;
	}
}
