package Pages;

import base.PageTools;
import com.codeborne.selenide.SelenideElement;
import com.google.common.collect.Ordering;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ViewResultsPage extends PageTools {
    By viewResultsPageTitle = By.xpath("//h2[text()='Surveillance Results']");
    By table= By.xpath("//table[@id='DataTables_Table_0']/tbody");

    By tableJobs = By.xpath("//table[@id='DataTables_Table_0']/tbody/tr");
    By tableLabels = By.xpath("//div[@class='dataTables_scroll']//table/thead/tr/th/div/label");
    By actionTableLabel = By.xpath("//div[@class='dataTables_scroll']//table/thead/tr/th[last()]");
    By showResultsSelect = By.xpath("//select[@name='DataTables_Table_0_length']");


    public boolean isViewResultsPageOpened(){
        waitForElementVisibility(viewResultsPageTitle);
        return isElementVisible(viewResultsPageTitle);
    }

    public boolean isNewlySubmittedJobDisplayed(String status){
        for(int i = 0;i < getElements(tableJobs).size();i++){
            if(isElementExistsWithNoLog(By.xpath("(//table[@id='DataTables_Table_0_info']/table/tr)["+i+"]" +
                    "/td[text()='"+Pages.newResearchPage().getCompanyName()+"']"))
                    && isElementExistsWithNoLog(By.xpath("(//table[@id='DataTables_Table_0_info']/table/tr)["+i+"]" +
                    "/td[text()='"+Pages.newResearchPage().getFacilityName()+"']"))
                    && isElementExistsWithNoLog(By.xpath("(//table[@id='DataTables_Table_0_info']/table/tr)["+i+"]" +
                    "/td[text()='"+status+"']")));
            return true;
        }
        return false;
    }

    public List<String> getTableLabels(List<String> labels){
        List<String> tableLabelsList = new ArrayList<>();
        List<SelenideElement> elements = getElements(tableLabels);
        for(SelenideElement element : elements){
            tableLabelsList.add(element.getText());
        }
        return tableLabelsList;
    }

    public boolean isTableLabelsPresent(List<String> labels){
        List<String> tableLabelsList = new ArrayList<>();
        List<SelenideElement> elements = getElements(tableLabels);
        for(SelenideElement element : elements){
            tableLabelsList.add(element.getText());
        }
        tableLabelsList.add(getSelenideElement(actionTableLabel).getText());
        return tableLabelsList.equals(labels);
    }

    public void selectEntries(String entries){
        selectOption(entries, showResultsSelect);
    }

    public String verifyDisplayedNumberOfEntries(){
        return Integer.toString(getElements(tableJobs).size());
    }

    public void clickOnTheLabel(String label){
        List<SelenideElement> elements = getElements(tableLabels);
        for(SelenideElement element : elements){
            if(element.getText()==label);
                element.click();
        }
    }

    public boolean verifyThatRecordsSortedByTheLabel(String label){
        List<String> tableRecords = new ArrayList<>();
        List<SelenideElement> elements = getElements(tableLabels);
        for(int i = 0;i < elements.size(); i++){
            if(elements.get(i).getText().contains(label)){
                for(int j = 0; j < getElements(tableJobs).size(); j++)
                    tableRecords.add(getSelenideElement(table).findElement(By.xpath("./tr["+(j+1)+"]/td["+(i+1)+"]")).getText());
            }
        }
        System.out.println(tableRecords.size());
        List<String> sortedTableRecords = tableRecords;
        Collections.sort(sortedTableRecords);
        return sortedTableRecords.equals(tableRecords);
    }
}
