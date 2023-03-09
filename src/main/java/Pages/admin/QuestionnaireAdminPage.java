package Pages.admin;

import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

public class QuestionnaireAdminPage extends PageTools {
	By questionnaireAdminPageTitle = By.xpath("//h2[text()='Questionnaire']");
	By questionnaireVersionsPageTitle = By.xpath("//h2[text()='Versioned QUESTIONNAIRE']");
	By questionnaireVersionsLabels = By.xpath("//table[@id='DataTables_Table_0']/thead/tr/th/div/label");
	By questionnaireVersionsRecords = By.xpath("//table[@id='DataTables_Table_0']/tbody/tr");

	By questionnaireQuestions = By.xpath("//div[@id='category']/div/ul//li/label");
	By questionnaireQuestionTooltip = By.xpath("(//div[@id='category']/div/ul//li/label)[%s]/span[@id='comment-info-popover-FIN1']");
	By saveQuestionnaireButton = By.xpath("//button[@id='save_in_dynamo']");
	By contextMenuAddCommentButton = By.xpath("(//nav[@id='context-menu-question']/ul/li/a)[6]");
	By commentWindowContentTextarea = By.xpath("//div[@class='modal-content']//textarea");
	By commentWindowURLInput = By.xpath("//div[@class='modal-content']//input[@type='text']");
	By saveCommentButton = By.xpath("//div[@class='modal-content']//button[@id='yes_btn']");
	By yesApproveButton = By.xpath("//button[@id='yes_btn']");


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
		getElements(questionnaireQuestions).get(index).findElement(By.xpath("./i[contains(@class,'update-comment-icon')]")).click();
	}

	public boolean isCommentWindowOpened(){
		waitForElementVisibility(commentWindowContentTextarea);
		return isElementVisible(commentWindowContentTextarea);
	}

	public void enterTextInCommentTextarea(String text){
		waitForElementVisibility(commentWindowContentTextarea);
		type(text, commentWindowContentTextarea);
	}

	public void enterLinkInURLInput(String url){
		waitForElementVisibility(commentWindowURLInput);
		type(url, commentWindowURLInput);
	}

	public void clickOnSaveCommentButton(){
		waitForElementVisibility(saveCommentButton);
		click(saveCommentButton);
	}

	public boolean isTooltipVisible(int index){
		SelenideTools.sleep(2);
		return isElementVisible(questionnaireQuestionTooltip, index);
	}

	public void clickOnSaveQuestionnaireButton(){
		waitForElementVisibility(saveQuestionnaireButton);
		click(saveQuestionnaireButton);
	}

	public void clickOnQuestionnaireVersionLabel(String label){
		List<SelenideElement> elements = getElements(questionnaireVersionsLabels);
		for(SelenideElement element : elements){
			if(label.equals(element.getText()) || label.contains(element.getText())) {
				System.out.println(element.getText());
				element.click();
				break;
			}
		}
	}

	public void approveTheQuestionnaireVersion(int index){
		waitForElementVisibility(questionnaireVersionsRecords);
		getElements(questionnaireVersionsRecords).get(index).findElement(By.xpath("./td[8]/div/button[@title='Approve questionnaire']")).click();
	}

	public void activateTheQuestionnaireVersion(int index){
		waitForElementVisibility(questionnaireVersionsRecords);
		getElements(questionnaireVersionsRecords).get(index).findElement(By.xpath("./td[8]/div/button[@title='Activate questionnaire']")).click();
	}

	public void clickYesApproveButton(){
		waitForElementClickable(yesApproveButton);
		click(yesApproveButton);
	}

}
