package Pages;

import base.PageTools;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.List;

public class SaveSubmitJobPage extends PageTools {
    By saveSubmitConfigurationPageTitle = By.xpath("//span[@class='active yellow' and contains(text(),' Save/Submit Configuration ')]");
    By changeJurisdictionsButton = By.xpath("//div[@class='mb-3']/a[text()='Change Jurisdictions']");
    By changeQuestionnaireButton = By.xpath("//div[@class='mb-3']/a[text()='Change Questionnaire']");
    By jurisdictionsCheckboxes = By.xpath("//div[@class='list-checkbox']/div[@class='d-flex']");
    By questions = By.xpath("//div[@class='list-scroll']/ul[@class='qa-ulList']//h5");
    By saveConfigurationButton = By.xpath("//button[@id='save_research_job']");
    By submitConfigurationButton = By.xpath("//button[@id='save_submit_job']");

    HashMap<String,Boolean> statesCheckboxes = new HashMap<>();
    HashMap<String,Boolean> questionsAnswers = new HashMap<>();

    public boolean isSaveSubmitConfigurationPageOpened(){
        waitForElementVisibility(saveSubmitConfigurationPageTitle);
        return isElementVisible(saveSubmitConfigurationPageTitle);
    }

    public void clickTheChangeJurisdictionsButton(){
        waitForElementClickable(changeJurisdictionsButton);
        click(changeJurisdictionsButton);
    }

    public void clickTheChangeQuestionnaireButton(){
        waitForElementClickable(changeQuestionnaireButton);
        click(changeQuestionnaireButton);
    }

    public boolean compareTheJurisdictionCheckboxes(HashMap<String,Boolean> checkboxes){
        for(SelenideElement element : getElements(jurisdictionsCheckboxes)){
            statesCheckboxes.put(element.findElement(By.xpath("./div/label")).getText()
                    ,element.findElement(By.xpath("./input")).isSelected());
        }
        return statesCheckboxes.equals(checkboxes);
    }

    public boolean compareTheQuestionsAnswers(HashMap<String,Boolean> questionsToCompare){
        List<SelenideElement> elements = getElements(questions);
        for(int i = 0;i < elements.size();i++){
            if(isElementExistsWithNoLog(By.xpath("(//div[@class='list-scroll']/ul[@class='qa-ulList']//h5)["+(i+1)+"]/following-sibling::p"))){
                questionsAnswers.put(elements.get(i).getText()
                        ,!elements.get(i).findElement(By.xpath("./following-sibling::p")).getText().equalsIgnoreCase("No"));
            }
        }
        return questionsAnswers.entrySet().stream().allMatch(e -> e.getValue().equals(questionsToCompare.get(e.getKey())));
    }

    public void clickSaveConfigurationButton(){
        waitForElementClickable(saveConfigurationButton);
        click(saveConfigurationButton);
    }

    public void clickSubmitConfigurationButton(){
        waitForElementClickable(submitConfigurationButton);
        click(submitConfigurationButton);
    }
}
