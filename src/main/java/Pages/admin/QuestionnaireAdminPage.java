package Pages.admin;

import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class QuestionnaireAdminPage extends PageTools {
	By questionnaireAdminPageTitle = By.xpath("//h2[text()='Questionnaire']");
	By questionnaireVersionsPageTitle = By.xpath("//h2[text()='Versioned QUESTIONNAIRE']");
	By questionnaireVersionsLabels = By.xpath("//table/thead/tr/th/div/label");
	By questionnaireVersionsRecords = By.xpath("//table/tbody/tr");
	By questionnaireQuestions = By.xpath("//div[@id='category']/div/ul//li/label");
	By questionnaireQuestionTooltip = By.xpath("(//div[@id='category']/div/ul//li/label)[%s]/span[@id='comment-info-popover-FIN1']");
	By saveQuestionnaireButton = By.xpath("//button[@id='save_in_dynamo']");
	By contextMenuActivateDeactivateButton = By.xpath("(//nav[@id='context-menu-question']/ul/li/a/i)[5]");
	By contextMenuAddCommentButton = By.xpath("(//nav[@id='context-menu-question']/ul/li/a)[6]");
	By commentWindowContentTextarea = By.xpath("//div[@class='modal-content']//textarea");
	By commentWindowURLInput = By.xpath("//div[@class='modal-content']//input[@type='text']");
	By saveCommentButton = By.xpath("//div[@class='modal-content']//button[@id='yes_btn']");
	By yesApproveButton = By.xpath("//button[@id='yes_btn']");
	By questionnaireViewButton = By.xpath("//table[@id='DataTables_Table_0']//a[@class='view']");
	By questionnaireActivateButton = By.xpath("//table[@id='DataTables_Table_0']//button[@title='Activate questionnaire']");


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
		SelenideTools.sleep(2);
	}

	public boolean isViewQuestionnaireVersionButtonVisible(){
		return isElementVisible(questionnaireViewButton);
	}

	public boolean isActivateQuestionnaireVersionButtonVisible(){
		return isElementVisible(questionnaireActivateButton);
	}

	public void clickOnContextMenuActivateDeactivateButton(){
		waitForElementVisibility(contextMenuActivateDeactivateButton);
		click(contextMenuActivateDeactivateButton);
		SelenideTools.sleep(5);
	}

	public void clickOnContextMenuAddCommentButton(){
		waitForElementVisibility(contextMenuAddCommentButton);
		click(contextMenuAddCommentButton);
	}

	public void clickOnUpdateCommentIcon(int index){
		waitForElementVisibility(questionnaireQuestions);
		getElements(questionnaireQuestions).get(index).findElement(By.xpath("./i[contains(@class,'update-comment-icon')]")).click();
	}

	public void selectActivate(int index){
		waitForElementVisibility(questionnaireQuestions);
		Select select = new Select(getElements(questionnaireQuestions).get(index).findElement(By.xpath("./select[contains(@id,'is_active')]")));
		select.selectByIndex(0);
	}

	public void selectDeactivate(int index){
		waitForElementVisibility(questionnaireQuestions);
		Select select = new Select(getElements(questionnaireQuestions).get(index).findElement(By.xpath("./select[contains(@id,'is_active')]")));
		select.selectByIndex(1);
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

	public boolean isQuestionDeactivated(int index){
		waitForElementVisibility(questionnaireQuestions);
		return getElements(questionnaireQuestions).get(index).findElement(By.xpath("./span[2]")).getAttribute("class").contains("deactive-question");

	}

}
