package Pages;

import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ResearchNotificationPage extends PageTools {
    By researchNotificationPageTitle = By.xpath("//h2[text()='Research Notification']");
    By researchNotificationTable = By.xpath("//div[@id='DataTables_Table_0_wrapper']//table/tbody");
    By researchNotificationTableLabels = By.xpath("//div[@id='DataTables_Table_0_wrapper']//table/thead/tr/th");
    By researchNotificationTableRecords = By.xpath("//div[@id='DataTables_Table_0_wrapper']//table/tbody/tr");
    By researchNotificationTableRecordElements = By.xpath("//div[@id='DataTables_Table_0_wrapper']//table/tbody/tr/td");
    By researchNotificationSidebarButton = By.xpath("//ul[@id='menu']/li[5]/ul/li[3]/a");
    By searchField = By.xpath("//div[@id='DataTables_Table_0_filter']/label/input");
    By researchNotificationsNoRecords = By.xpath("//td[@class='dataTables_empty']");
    String requirementName;
    public String getRequirementName(){
        return requirementName;
    }
    public boolean isResearchNotificationPageVisible(){
        waitForElementVisibility(researchNotificationPageTitle);
        return isElementVisible(researchNotificationPageTitle);
    }

    public void clickOnResearchNotificationSidebarButton(){
        waitForElementVisibility(researchNotificationSidebarButton);
        click(researchNotificationSidebarButton);
    }

    public boolean isTableLabelsPresent(List<String> labels){
        List<String> tableLabelsList = new ArrayList<>();
        List<SelenideElement> elements = getElements(researchNotificationTableLabels);
        for(SelenideElement element : elements) {
            tableLabelsList.add(element.getText());
            System.out.println(element.getText());
        }
        System.out.println(" //////////////////////// ");
        tableLabelsList.add(getSelenideElement(researchNotificationTableLabels).getText());
        for(int i = 0; i < labels.size(); i++){
            System.out.println(labels.get(i)+" "+tableLabelsList.get(i));
            if(!labels.get(i).equals(tableLabelsList.get(i)))
                return false;
        }
        return true;
        //return tableLabelsList.retainAll(labels);
    }

    public void clickOnTheLabel(String label){
        List<SelenideElement> elements = getElements(researchNotificationTableLabels);
        for(SelenideElement element : elements){
            if(element.getText()==label);
            element.click();
        }
    }

    public boolean verifyThatRecordsSortedByTheLabel(String label){
        List<String> tableRecords = new ArrayList<>();
        List<SelenideElement> elements = getElements(researchNotificationTableLabels);
        for(int i = 0;i < elements.size(); i++){
            if(elements.get(i).getText().contains(label)){
                for(int j = 0; j < getElements(researchNotificationTableRecords).size(); j++)
                    tableRecords.add(getSelenideElement(researchNotificationTable).findElement(By.xpath("./tr["+(j+1)+"]/td["+(i+1)+"]")).getText());
            }
        }
        List<String> sortedTableRecords = tableRecords;
        Collections.sort(sortedTableRecords);
        return sortedTableRecords.equals(tableRecords);
    }

    public boolean verifyThatRecordsSortedDescendingByTheLabel(String label){
        List<String> tableRecords = new ArrayList<>();
        List<SelenideElement> elements = getElements(researchNotificationTableLabels);
        for(int i = elements.size()-1;i >= 0; i--){
            if(elements.get(i).getText().contains(label)){
                for(int j = 0; j < getElements(researchNotificationTableRecords).size(); j++)
                    tableRecords.add(getSelenideElement(researchNotificationTable).findElement(By.xpath("./tr["+(j+1)+"]/td["+(i+1)+"]")).getText());
            }
        }
        List<String> sortedTableRecords = tableRecords;
        Collections.sort(sortedTableRecords, Collections.reverseOrder());
        return sortedTableRecords.equals(tableRecords);
    }

    public void enterTextInTheSearchField(String text){
        waitForElementVisibility(searchField);
        type(text, searchField);
    }

    public boolean isNoRecordsFoundMessageDisplayed(){
        SelenideTools.sleep(2);
        return isElementVisible(researchNotificationsNoRecords);
    }

    public void saveRequirementNameOfTheRecord(int index){
        waitForElementVisibility(researchNotificationTableRecords);
        requirementName = getElements(researchNotificationTableRecords).get(index).findElement(By.xpath("./td[7]")).getText();
    }

    public boolean isRecordsOnlyWithRequirementName(){
        boolean returnValue = false;
        waitForElementVisibility(researchNotificationTableRecords);
//        if(getElements(researchNotificationTableRecords).get(0).findElement(By.xpath("./td[7]")).getText().equals(requirementName))
//            return true;
//        return false;
        for(int i = 0; i < getElements(researchNotificationTableRecords).size(); i++){
            returnValue = false;
            for(int j = 0; j < getElements(researchNotificationTableRecordElements).size();j++) {
                if (getElements(researchNotificationTableRecords).get(i).findElement(By.xpath("./td[" + j + "]")).getText() == requirementName) {
                    returnValue = true;
                }
            }
        }
        return returnValue;
    }

    public boolean isRecordWithTypeAndScopeAndNoteDisplayed(String type, String scope, String note){
        boolean returnValue = false;
        for(int i = 0; i < getElements(researchNotificationTableRecords).size(); i++){
            returnValue = false;
            if(getElements(researchNotificationTableRecords).get(i).findElement(By.xpath("./td[4]")).getText().contains(type)
                && getElements(researchNotificationTableRecords).get(i).findElement(By.xpath("./td[8]")).getText().contains(scope)
                && getElements(researchNotificationTableRecords).get(i).findElement(By.xpath("./td[9]")).getText().contains(type))
                returnValue = true;
        }
        return returnValue;
    }
}
