package Pages;

import base.PageTools;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.List;

public class ViewResultsPage extends PageTools {
    By viewResultsPageTitle = By.xpath("//h2[text()='Surveillance Results']");
    By tableJobs = By.xpath("//table[@id='DataTables_Table_0']/tbody/tr");


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
}
