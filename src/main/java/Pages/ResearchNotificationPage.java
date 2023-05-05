package Pages;

import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ResearchNotificationPage extends PageTools {
    By researchNotificationPageTitle = By.xpath("//h2[text()='Research Notifications']");
    By researchNotificationTable = By.xpath("//div[@id='DataTables_Table_0_wrapper']//table/tbody");
    By researchNotificationTableLabels = By.xpath("(//thead)[1]/tr[1]/th");
    By researchNotificationTableRecords = By.xpath("//div//table/tbody/tr");
    By researchNotificationTableRecordElements = By.xpath("//div[@id='DataTables_Table_0_wrapper']//table/tbody/tr/td");
    By researchNotificationSidebarButton = By.xpath("//*[@id=\"menu\"]/li[10]/ul/li[6]/a");
    By searchField = By.xpath("//div[@id='DataTables_Table_0_filter']/label/input");
    By researchNotificationsNoRecords = By.xpath("//td[@class='dataTables_empty']");
    String requirementName;
    By notificationsSidebarButton = By.xpath("//*[@id=\"menu\"]/li[8]/a");
    By notificationInteligenceOption = By.xpath("//*[@id=\"menu\"]/li[8]/ul/li[4]/a");
    By researchNotificationPageHeader = By.xpath("//h2[@class=\"card-heading \"]");
    String researchNotificationHeaderText = "Research Notification";
    By researchNotificationSearchBar = By.xpath("//input[@class=\"form-control form-control-sm\"]");
    String searchNotificationText = "Manufacturer-Non-Resident (REPACKAGER, RELABLER, CMO, ACTUAL MANUFACTURER";
    String SKU;
    By readMore_LessButton = By.xpath("//button[@class=\"read-more read-more-btn\"]");
    
    public String getRequirementName(){
        return requirementName;
    }
    public String getSKU(){
        return SKU;
    }

    public boolean isResearchNotificationPageVisible(){
        waitForElementVisibility(researchNotificationPageTitle);
        return isElementVisible(researchNotificationPageTitle);
    }

    public void clickOnResearchNotificationSidebarButton(){
    	Pages.atlasDashboardManagementPage().clickIntelligenceAdminSidebarCollapseButton();
        SelenideTools.sleep(2);
        waitForElementVisibility(researchNotificationSidebarButton);
        click(researchNotificationSidebarButton);
        SelenideTools.sleep(10);
    }

    public boolean isTableLabelsPresent(List<String> labels){
        List<String> tableLabelsList = new ArrayList<>();
        List<SelenideElement> elements = getElements(researchNotificationTableLabels);
        for(SelenideElement element : elements) {
            tableLabelsList.add(element.getAttribute("aria-label"));
            System.out.println(element.getAttribute("aria-label"));
        }
        System.out.println(" //////////////////////// ");
        tableLabelsList.add(getSelenideElement(researchNotificationTableLabels).getText());
        for(int i = 0; i < labels.size(); i++){
            System.out.println(labels.get(i)+" "+tableLabelsList.get(i));
            if(!tableLabelsList.get(i).contains(labels.get(i)))
                return false;
        }
        return true;
        //return tableLabelsList.retainAll(labels);
    }

    public void clickOnTheLabel(String label){
        List<SelenideElement> elements = getElements(researchNotificationTableLabels);
        for(SelenideElement element : elements){
            if(element.getText()==label){
            element.click();
            break;
            }
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
        requirementName = getElements(researchNotificationTableRecords).get(index).findElement(By.xpath("./td[4]")).getText();
    }

    public void saveSKUOfTheRecord(int index){
        waitForElementVisibility(researchNotificationTableRecords);
        SKU = getElements(researchNotificationTableRecords).get(index).findElement(By.xpath("./td[2]")).getText();
    }

    public boolean isRecordsOnlyWithRequirementName(){
        boolean returnValue = false;
        waitForElementVisibility(researchNotificationTableRecords);
        for(int i = 0; i < getElements(researchNotificationTableRecords).size(); i++){
            returnValue = false;
            System.out.println((getElements(researchNotificationTableRecords).get(i).findElement(By.xpath("./td[4]")).getText()));
            System.out.println(requirementName);
            if ((getElements(researchNotificationTableRecords).get(i).findElement(By.xpath("./td[4]")).getText() == requirementName)
            || (getElements(researchNotificationTableRecords).get(i).findElement(By.xpath("./td[4]")).getText().contains(requirementName))) {
                returnValue = true;
            }
        }
        SelenideTools.sleep(20);
        return returnValue;
    }

    public boolean isRecordsOnlyWithSKU(){
        boolean returnValue = false;
        waitForElementVisibility(researchNotificationTableRecords);
        for(int i = 0; i < getElements(researchNotificationTableRecords).size(); i++){
            returnValue = false;
            System.out.println((getElements(researchNotificationTableRecords).get(i).findElement(By.xpath("./td[2]")).getText()));
            System.out.println(SKU);
            if ((getElements(researchNotificationTableRecords).get(i).findElement(By.xpath("./td[2]")).getText() == SKU)
                    || (getElements(researchNotificationTableRecords).get(i).findElement(By.xpath("./td[2]")).getText().contains(SKU))) {
                returnValue = true;
            }
        }
        SelenideTools.sleep(20);
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
    
    public void clickNotificationsButton(){
        waitForElementVisibility(notificationsSidebarButton);
        click(notificationsSidebarButton);
        SelenideTools.sleep(4);
    }
    
    public void selectIntelligence(){
        waitForElementVisibility(notificationInteligenceOption);
        click(notificationInteligenceOption);
        SelenideTools.sleep(4);
    }
    
    public void verifyResearchNotificationsPageOpened(){
    	SelenideElement researchNotificationPageHeaderText = getSelenideElement(researchNotificationPageHeader);
		assertEquals(researchNotificationPageHeaderText.getText(), researchNotificationHeaderText);
    }
    
    public void verifyTextWrappingOnNotificationsPage(){
    	SelenideElement researchNotificationSearchBarElement = getSelenideElement(researchNotificationSearchBar);
        waitForElementVisibility(researchNotificationSearchBar);
        researchNotificationSearchBarElement.setValue(searchNotificationText);
        SelenideTools.sleep(3);
        SelenideElement readMore_LessButtonElement = getSelenideElement(readMore_LessButton);
        if(readMore_LessButtonElement.getText() == "Read More") {
        	System.out.println("Text of wrap button found to be = "+ readMore_LessButtonElement.getText());
        }
        readMore_LessButtonElement.click();
        
        if(readMore_LessButtonElement.getText() == "Read Less") {
        	System.out.println("Text of wrap button found to be = "+ readMore_LessButtonElement.getText());
        }
    }
}
