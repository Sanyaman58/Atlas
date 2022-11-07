package Pages.admin;

import Utils.SelenideTools;
import base.PageTools;
import org.openqa.selenium.By;

public class QuestionnaireAdminPage extends PageTools {
	By questionnaireAdminPageTitle = By.xpath("//h2[text()='Questionnaire']");
	By questionnaireVersionsPageTitle = By.xpath("//h2[text()='Versioned QUESTIONNAIRE']");
	
	public boolean isQuestionnaireAdminPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(questionnaireAdminPageTitle);
	}

	public boolean isQuestionnaireVersionsPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(questionnaireVersionsPageTitle);
	}
}
