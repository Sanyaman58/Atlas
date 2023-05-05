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
	List<String> generalInfoForComparison;

	
	public boolean isEditRequirementAdminPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(editRequirementAdminPageTitle);
	}

	public List<String> getGeneralInfo() throws IOException {
			generalInfoForComparison = new ArrayList<>();
			for (int i = 0; i < getElements(editRequirementGeneralInfo).size(); i++) {
				generalInfoForComparison.add(getElements(editRequirementGeneralInfo).get(i).getText());
				System.out.println(getElements(editRequirementGeneralInfo).get(i).getText());
			}
		System.out.println(generalInfoForComparison.size());
			generalInfoForComparison.replaceAll(String::trim);
			Pages.atlasDashboardManagementPage().clickResultsSidebarButton();
			generalInfoForComparison.remove(2);
			generalInfoForComparison.remove(7);
			generalInfoForComparison.remove(2);
			generalInfoForComparison.remove(1);
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
