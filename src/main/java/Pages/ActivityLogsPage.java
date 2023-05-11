package Pages;

import Utils.SelenideTools;
import base.PageTools;
import org.openqa.selenium.By;

import java.util.List;

public class ActivityLogsPage extends PageTools {
    By activityLogsPageTitle = By.xpath("//h2[contains(text(),'Activity logs')]");
    By searchField = By.xpath("//div[@id='DataTables_Table_0_filter']/label/input");

    By table= By.xpath("//table/tbody");
    By tableLogs = By.xpath("//table/tbody/tr");
    By tableLogsNoRecords = By.xpath("//td[@class='dataTables_empty']");
    By tableLabels = By.xpath("//table/thead/tr/th");


    List<List<String>> tableRecords;
    static int activityLogsCount;

    public boolean isActivityLogsPageOpened(){
        waitForElementVisibility(activityLogsPageTitle);
        return isElementVisible(activityLogsPageTitle);
    }

    public void enterTextInTheSearchField(String text){
        SelenideTools.sleep(3);
        waitForElementVisibility(searchField);
        type(text, searchField);
        System.out.println(text);
    }

    public boolean isRecordDescriptionContainsText(String text){
        waitForElementVisibility(tableLogs);
        System.out.println(text);
        for(int i = 0; i < getElements(tableLogs).size();i++){
            System.out.println(getElements(tableLogs).get(i).findElement(By.xpath("./td[2]")).getText());
            if(getElements(tableLogs).get(i).findElement(By.xpath("./td[2]")).getText().contains(text))
                return true;
        }
        return false;
    }

    public int getNumberOfLogs(){
        if(isElementVisibleWithNoLog(tableLogsNoRecords))
            return 0;
        return getElements(tableLogs).size();
    }

    public void saveActivityLogsRecordsCount(){
        activityLogsCount = getElements(tableLogs).size();
    }

    public int getActivityLogsRecordsCount(){
        return activityLogsCount;
    }

}
