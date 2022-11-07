package Pages.admin;

import Constants.Constants;
import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class RequirementsAdminPage extends PageTools {
	By requirementsAdminPageTitle = By.xpath("//h2[text()='Requirements Admin']");

	public boolean isRequirementsAdminPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(requirementsAdminPageTitle);
	}
}
