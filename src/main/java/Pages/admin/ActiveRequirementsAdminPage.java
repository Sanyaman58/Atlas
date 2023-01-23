package Pages.admin;

import Constants.Constants;
import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class ActiveRequirementsAdminPage extends PageTools {
	By activeRequirementsPageTitle = By.xpath("//h2[text()='Requirements Admin']");

	public boolean isActiveRequirementsPageOpened(){
		SelenideTools.sleep(5);
		return isElementVisible(activeRequirementsPageTitle);
	}


}
