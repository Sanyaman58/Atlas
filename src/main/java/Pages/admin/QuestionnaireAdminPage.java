package Pages.admin;

import Utils.SelenideTools;
import base.PageTools;
import org.openqa.selenium.By;

public class QuestionnaireAdminPage extends PageTools {
	By questionnaireAdminPageTitle = By.xpath("//h2[text()='Questionnaire']");
	By questionnaireVersionsPageTitle = By.xpath("//h2[text()='Versioned QUESTIONNAIRE']");
	By questionnaireQuestions = By.xpath("//div[@id='category']/div/ul//li/label");
	By contextMenuAddCommentButton = By.xpath("(//nav[@id='context-menu-question']/ul/li/a)[6]");
	By commentWindowContentTextarea = By.xpath("//div[@class='modal-content']//textarea");
	
	public boolean isQuestionnaireAdminPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(questionnaireAdminPageTitle);
	}

	public boolean isQuestionnaireVersionsPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(questionnaireVersionsPageTitle);
	}

	public void rightClickOnQuestion(int index){
		waitForElementVisibility(questionnaireQuestions);
		getElements(questionnaireQuestions).get(index).contextClick();
	}

	public void clickOnContextMenuAddCommentButton(){
		waitForElementVisibility(contextMenuAddCommentButton);
		click(contextMenuAddCommentButton);
	}

	public void clickOnUpdateCommentIcon(int index){
		waitForElementVisibility(questionnaireQuestions);
		getElements(questionnaireQuestions).get(index).findElement(By.xpath("./i[contains(@class,'pdate-comment-icon')]")).click();
	}

	public boolean isCommentWindowOpened(){
		waitForElementVisibility(commentWindowContentTextarea);
		return isElementVisible(commentWindowContentTextarea);
	}

}
