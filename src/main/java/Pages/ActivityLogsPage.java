package Pages;

import Utils.SelenideTools;
import base.PageTools;
import org.openqa.selenium.By;

import java.util.List;

public class ActivityLogsPage extends PageTools {
    By activityLogsPageTitle = By.xpath("//h2[contains(text(),'Activity logs')]");
    By searchField = By.xpath("//div[@id='DataTables_Table_0_filter']/label/input");

    By table= By.xpath("//table[@id='DataTables_Table_0']/tbody");
    By tableLogs = By.xpath("//table[@id='DataTables_Table_0']/tbody/tr");
    By tableLogsNoRecords = By.xpath("//td[@class='dataTables_empty']");
    By tableLabels = By.xpath("//div[@class='dataTables_scroll']//table/thead/tr/th");


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
    }

    public boolean isRecordDescriptionContainsText(String text){
        waitForElementVisibility(tableLogs);
        String logDescription = getSelenideElement(tableLogs).findElement(By.xpath("./td[2]")).getText();
        return logDescription.contains(text);
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
