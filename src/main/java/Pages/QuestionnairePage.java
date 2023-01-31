package Pages;

import base.PageTools;
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
    By answers = By.xpath("//div[@id='questionnaire-container']//li/label/following-sibling::span/input[1]");
    By nextButton = By.xpath("//button[@id='save_questionnaires']");
    By questionnaireBreadcrumb = By.xpath("//h4[contains(@class,'cardInner-heading')]/a/span[contains(text(),'Questionnaire')]");


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


}
