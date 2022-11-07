package Pages.admin;

import Utils.SelenideTools;
import base.PageTools;
import org.openqa.selenium.By;

public class EndsUpInStatesAdminPage extends PageTools {
	By endsUpInStateAdminPageTitle = By.xpath("//h2[contains(text(),'Ends Up in States')]");
	
	public boolean isEndsUpInStateAdminPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(endsUpInStateAdminPageTitle);
	}
}
