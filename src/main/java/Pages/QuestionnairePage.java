package Pages;

import Utils.SelenideTools;
import base.PageTools;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.HashMap;

public class QuestionnairePage extends PageTools {
    By questionnairePageTitle = By.xpath("//span[@class='active yellow' and contains(text(),'Questionnaire')]");
    By financialOwnershipSection = By.xpath("//div[@id='questionnaire-container']/div/h4[text()='Financial Ownership']");
    By physicalPossessionSection = By.xpath("//div[@id='questionnaire-container']/div/h4[text()='Physical Possession']");
    By productSection = By.xpath("//div[@id='questionnaire-container']/div/h4[text()='Product']");
    By questions = By.xpath("//div[@id='questionnaire-container']//li/label");
    By questionTooltip = By.xpath("(//div[@id='questionnaire-container']//li/label)[%s]/following-sibling::span[contains(@id,'comment-info-popover')]/i");
    By answers = By.xpath("//div[@id='questionnaire-container']//li/label/following-sibling::span/input[1]");
    By nextButton = By.xpath("//button[@id='save_questionnaires']");
    By questionnaireBreadcrumb = By.xpath("//h4[contains(@class,'cardInner-heading')]/a/span[contains(text(),'Questionnaire')]");
    By clearAllButton = By.xpath("//button[@id='clear_all_questionnaire']");
    By tooltipWindowComment = By.xpath("//div[@class='popover-body']/span[@class='comment-content-data']");
    By tooltipWindowURL = By.xpath("//div[@class='popover-body']/a[@class='comment-link-data']");


    HashMap<String,Boolean> questionsAnswers = new HashMap<>();

    public boolean isQuestionnairePageOpened() {
        waitForElementVisibility(questionnairePageTitle);
        return isElementVisible(questionnairePageTitle);
    }

    public boolean isFinancialOwnershipSectionVisible(){
        return isElementVisible(financialOwnershipSection);
    }

    public boolean isPhysicalPossessionSectionVisible(){
        return isElementVisible(physicalPossessionSection);
    }

    public boolean isProductSectionVisible(){
        return isElementVisible(productSection);
    }

    public void saveQuestionsAnswers(){
        List<SelenideElement> elements = getElements(questions);
        for(int i = 0;i < elements.size();i++){
            if(isElementExistsWithNoLog(By.xpath("(//div[@id='questionnaire-container']//li/label)["+(i+1)+"]/following-sibling::span/input[1]"))){
                questionsAnswers.put(elements.get(i).getText()
                        , elements.get(i).findElement(By.xpath("./following-sibling::span/input[1]")).isSelected());
                //System.out.println(elements.get(i).getText() + " " + Boolean.toString(elements.get(i).findElement(By.xpath("./following-sibling::span/input[1]")).isSelected()));
            }
            else if(isElementExistsWithNoLog(By.xpath("(//div[@id='questionnaire-container']//li/label)["+(i+1)+"]/following-sibling::input[1]"))) {
                questionsAnswers.put(elements.get(i).getText()
                        , elements.get(i).findElement(By.xpath("./following-sibling::input[1]")).isSelected());
                //System.out.println(elements.get(i).findElement(By.xpath("./following-sibling::input[1]")).isSelected()+"  "+elements.get(i).findElement(By.xpath("./following-sibling::input[1]")).getAttribute("value"));
            }
        }

        //questionsAnswers.forEach((key, value) -> logInfo(key + " " + value));
    }

    public void selectQuestion(int index){
        getElements(answers).get(index-1).click();
    }

    public HashMap<String, Boolean> getQuestionsAnswers(){
        return questionsAnswers;
    }

    public void clickTheNextButton(){
        waitForElementClickable(nextButton);
        click(nextButton);
    }

    public void clickTheQuestionnaireBreadcrumb(){
        waitForElementVisibility(questionnaireBreadcrumb);
        click(questionnaireBreadcrumb);
    }

    public void clickClearAllButton(){
        waitForElementClickable(clearAllButton);
        click(clearAllButton);
        SelenideTools.sleep(2);
        click(clearAllButton);
    }

    public boolean isTooltipVisible(int index){
        return isElementVisible(questionTooltip, index);
    }

    public void hoverOverTooltip(int index){
        waitForElementVisibility(questionTooltip, index);
        getSelenideElement(questionTooltip, index).hover();
    }

    public boolean isTooltipWindowDisplayed(){
        return isElementVisible(tooltipWindowComment);
    }

    public String getTooltipWindowComment(){
        waitForElementVisibility(tooltipWindowComment);
        return getSelenideElement(tooltipWindowComment).getText();
    }

    public String getTooltipWindowURL(){
        waitForElementVisibility(tooltipWindowURL);
        System.out.println(getSelenideElement(tooltipWindowURL).getText());
        return getSelenideElement(tooltipWindowURL).getAttribute("href");
    }

    public boolean isQuestionElementsVisible(){
        waitForElementVisibility(questions);
        return isElementVisible(By.xpath("//div[@id='questionnaire-container']//li/label/i"))
                && isElementVisible (By.xpath("//div[@id='questionnaire-container']//li/span[2]/input[@value='Y']"))
                && isElementVisible (By.xpath("//div[@id='questionnaire-container']//li/span[2]/input[@value='N']"));
    }
    
    By questionNoButton = By.xpath("//input[@name=\"questionnaire[FIN1]\"][@value=\"N\"]");
    By disabledChildQuestion = By.xpath("//input[@name=\"questionnaire[FIN1.1]\"][@value=\"N\"]");
    
    public void clickQuestionNoButton(){
       waitForElementVisibility(questionNoButton);
       click(questionNoButton);
    }
    
    public void verifyDisabledQuestion(){
    	SelenideElement disabledChildQuestionElement = getSelenideElement(disabledChildQuestion);
//        waitForElementVisibility(disabledChildQuestion);
//        String disabledChildQuestionAttribute = disabledChildQuestionElement.getAttribute("HTML");
//        if (disabledChildQuestionAttribute.contains("deactive-question")) {
//    		System.out.println("Question is disabled");
//    	} else {
//    		System.out.println("Question is enabled");
//    	}
    	String disbaledValue = disabledChildQuestionElement.getAttribute("disabled");
    	if(disbaledValue != null && (disbaledValue.equals("true") || disbaledValue.equals("disbaled"))) {
    		disabledChildQuestionElement.shouldBe(Condition.disabled);
    		System.out.println("Verified disabled child question");
    	}
    	else {
    		disabledChildQuestionElement.shouldNotBe(Condition.disabled);
    	}
     }
    

}
