package Pages;

import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.google.common.collect.Ordering;
import org.junit.Assert;
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
    By researchResults = By.xpath("//div[@id='viewResult']");
    By researchResultsTable = By.xpath("//table[@id='DataTables_Table_1']");
    By researchResultsTableRecords = By.xpath("//table[@id='DataTables_Table_1']/tbody/tr");
    By researchResultsTableRecordsElements = By.xpath("//table[@id='DataTables_Table_1']/tbody/tr/td");
    By closeViewResultsWindowButton = By.xpath("//div[@id='viewResult']//h2[text()='Surveillance Results']/following-sibling::button");


    List<List<String>> tableRecords;


    public boolean isViewResultsPageOpened(){
        waitForElementVisibility(viewResultsPageTitle);
        return isElementVisible(viewResultsPageTitle);
    }

    public boolean isNewlySubmittedJobDisplayed(String status){
        SelenideTools.sleep(70);
        System.out.println(Pages.newResearchPage().getCompanyName());
        System.out.println(Pages.newResearchPage().getFacilityName());
        for(int i = 0;i < getElements(tableJobs).size();i++){
            System.out.println(getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody/tr/td[2])["+(i+1)+"]")).getText());
            System.out.println(getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody/tr/td[3])["+(i+1)+"]")).getText());
            if(getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody/tr/td[2])["+(i+1)+"]")).getText().equals(Pages.newResearchPage().getCompanyName())
                    && getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody/tr/td[3])["+(i+1)+"]")).getText().equals(Pages.newResearchPage().getFacilityName())
                    && (getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody/tr/td[5])["+(i+1)+"]")).getText().equals(status)
                    || getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody/tr/td[5])["+(i+1)+"]")).getText().equals("Result Pending")))
            return true;
        }
        return false;
    }

    public void clickOnTheViewButtonOfTheNewlyCreatedJob(){
        for(int i = 0; i < getElements(tableJobs).size(); i++){
            if(getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody/tr/td[2])["+(i+1)+"]")).getText().equals(Pages.newResearchPage().getCompanyName())
                    && getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody/tr/td[3])["+(i+1)+"]")).getText().equals(Pages.newResearchPage().getFacilityName())) {
                getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody/tr/td[6]/div/button[1])[" + (i + 1) + "]")).click();
                break;
            }
        }
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

    public boolean isResearchResultsPageOpened(){
        SelenideTools.sleep(3);
        return isElementVisible(researchResults);
    }



    public void getResearchResultsTableData(){
        tableRecords = new ArrayList<>();
        for(int i = 0;i < getElements(researchResultsTableRecords).size(); i++){
            List<String> singleRecord = new ArrayList<>();
            for(int j = 0; j < getElements(By.xpath("//table[@id='DataTables_Table_1']/tbody/tr["+(i+1)+"]/td")).size(); j++){
                singleRecord.add(getSelenideElement(By.xpath("//table[@id='DataTables_Table_1']/tbody/tr["+(i+1)+"]/td["+(j+1)+"]")).getText());
            }
            tableRecords.add(singleRecord);
        }
    }

    public boolean isRequirementPresentInTheList(String jurisdiction, String aName, String rName){
        for (List<String> tableRecord : tableRecords) {
            if (tableRecord.contains(jurisdiction)
                    || tableRecord.contains(aName)
                    || tableRecord.contains(rName))
                return true;
        }
        return false;
    }

    public void closeViewResultWindow(){
        waitForElementClickable(closeViewResultsWindowButton);
        click(closeViewResultsWindowButton);
    }


}
