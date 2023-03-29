package Pages;

import Utils.ExcelReader;
import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

public class ViewResultsPage extends PageTools {
    By viewResultsPageTitle = By.xpath("//*[@id=\"wrapper\"]/main/div/section/div[1]/div[1]/h2");
    By table= By.xpath("//table[@id='DataTables_Table_0']/tbody");
    By tableJobs = By.xpath("//table[@id='DataTables_Table_0']/tbody/tr");
    By tableLabels = By.xpath("(//table)[1]/thead[1]/tr[1]/th");
    By actionTableLabel = By.xpath("//div[@class='dataTables_scroll']//table/thead/tr/th[last()]");
    By showResultsSelect = By.xpath("//select[@name='DataTables_Table_0_length']");
    By researchResults = By.xpath("//div[@id='viewResult']");
    By researchResultsTable = By.xpath("//table[@id='DataTables_Table_1']");
    By researchResultsTableLabels = By.xpath("//div[@id='DataTables_Table_1_wrapper']//div[@class='dataTables_scroll']/div[@class='dataTables_scrollHead']//table/thead/tr[1]/th");
    By researchResultsTableFixedLabels = By.xpath("//div[@id='DataTables_Table_1_wrapper']//div[@class='dataTables_scroll']/div[@class='dataTables_scrollHead']//table/thead/tr[1]/th[contains(@class,'fixed-column')]");
    By researchResultsTableLabelsSearch = By.xpath("//div[@id='DataTables_Table_1_wrapper']//div[@class='dataTables_scroll']/div[@class='dataTables_scrollHead']//table/thead/tr[2]/th/input");
    By researchResultsViewResultButton = By.xpath("(//table[@id='DataTables_Table_0']/tbody/tr/td[6]/div/button[1])[%s]");
    By researchResultsDeleteResultButton = By.xpath("(//table[@id='DataTables_Table_0']/tbody/tr/td[6]/div/button[2])[%s]");
    By researchResultsActivityLogsButton = By.xpath("(//table[@id='DataTables_Table_0']/tbody/tr/td[6]/div/button[3])[%s]");


    By surveillanceResultsTableRecords = By.xpath("//div[@class='dataTables_scrollBody']//table[@id='DataTables_Table_0']//tbody/tr");
    By surveillanceResultsTableRecordsElements = By.xpath("//div[@class='dataTables_scrollBody']//table[@id='DataTables_Table_0']//tbody/tr/td");

    By researchResultsTableRecords = By.xpath("//div[@class='dataTables_scrollBody']//table[@id='DataTables_Table_1']//tbody/tr");
    By researchResultsTableRecordsElements = By.xpath("//div[@class='dataTables_scrollBody']//table[@id='DataTables_Table_1']//tbody/tr/td");
    By searchField = By.xpath("//div[@id='DataTables_Table_0_filter']/label/input");
    By researchResultsNoRecords = By.xpath("//td[@class='dataTables_empty']");
    By closeViewResultsWindowButton = By.xpath("//div[@id='viewResult']//h2[text()='Surveillance Results']/following-sibling::button");
    By resultsSidebarButton = By.xpath("//ul[@id='menu']/li[5]/ul/li[2]/a");
    By clientSelect = By.xpath("//select[@class='new_client_id form-control']");

    By companySelect = By.xpath("//select[@class='company_val form-control']");
    By exportButton = By.xpath("//button[contains(text(),'Export')]");

    List<List<String>> tableRecords;
    List<List<String>> excelTableRecords;
    static String facilityName;
    static String companyName;
    static int requirementsCount;
    static int activityLogsCount;

    public int getRequirementsCount(){
        return requirementsCount;
    }

    static Map<Integer,Integer> fixedLabelCoordinates;

    public boolean isViewResultsPageOpened(){
        waitForElementVisibility(viewResultsPageTitle);
        return isElementVisible(viewResultsPageTitle);
    }

    public boolean isNewlySubmittedJobDisplayed(String status){
        SelenideTools.sleep(130);
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

    public void clickOnTheViewButtonOfTheRecord(int index){
//        getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody/tr/td[6]/div/button[1])[" + (index) + "]")).click();
        getSelenideElement(researchResultsViewResultButton, index).click();
    }

    public boolean isViewResultButtonVisible(){
        SelenideTools.sleep(2);
        return isElementVisible(researchResultsViewResultButton, 1);
    }

    public void clickOnTheDeleteButtonOfTheRecord(int index){
        getSelenideElement(researchResultsDeleteResultButton, index).click();
    }

    public boolean isDeleteResultButtonVisible(){
        SelenideTools.sleep(2);
        return isElementVisible(researchResultsDeleteResultButton, 1);
    }

    public void clickOnTheActivityLogsButtonOfTheRecord(int index){
        getSelenideElement(researchResultsActivityLogsButton, index).click();
    }

    public void clickOnTheActivityLogsButtonOfTheNewlyCreatedJob(){
        for(int i = 0; i < getElements(tableJobs).size(); i++){
            if(getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody/tr/td[2])["+(i+1)+"]")).getText().equals(Pages.newResearchPage().getCompanyName())
                    && getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody/tr/td[3])["+(i+1)+"]")).getText().equals(Pages.newResearchPage().getFacilityName())) {
                getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody/tr/td[6]/div/a)[" + (i + 1) + "]")).click();
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
            System.out.println(element.getText());
        }
        System.out.println(tableLabelsList.size());
//        tableLabelsList.add(getSelenideElement(actionTableLabel).getText());
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
            if(element.getText()==label) {
                element.click();
                break;
            }
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
        List<String> sortedTableRecords = tableRecords;
        Collections.sort(sortedTableRecords);
        return sortedTableRecords.equals(tableRecords);
    }

    public boolean verifyThatRecordsSortedDescendingByTheLabel(String label){
        List<String> tableRecords = new ArrayList<>();
        List<SelenideElement> elements = getElements(tableLabels);
        for(int i = elements.size()-1;i >= 0; i--){
            if(elements.get(i).getText().contains(label)){
                for(int j = 0; j < getElements(tableJobs).size(); j++)
                    tableRecords.add(getSelenideElement(table).findElement(By.xpath("./tr["+(j+1)+"]/td["+(i+1)+"]")).getText());
            }
        }
        List<String> sortedTableRecords = tableRecords;
        Collections.sort(sortedTableRecords, Collections.reverseOrder());
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

    public void getResearchResultsRecordsCount(){
        requirementsCount = getElements(researchResultsTableRecords).size();
    }



    public String getFacilityNameOfTheTableRecord(){
        return facilityName;
    }
    public String getCompanyNameOfTheTableRecord(){
        return companyName;
    }

    public void saveRequirementNameOfTheTableRecord(int index){
        waitForElementVisibility(surveillanceResultsTableRecords);
        facilityName = getElements(surveillanceResultsTableRecords).get(index).findElement(By.xpath("./td[3]")).getText().trim();
        System.out.println(facilityName);
    }

    public void saveCompanyNameOfTheTableRecord(int index){
        waitForElementVisibility(surveillanceResultsTableRecords);
        companyName = getElements(surveillanceResultsTableRecords).get(index).findElement(By.xpath("./td[2]")).getText().trim();
        System.out.println(companyName);
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

    public boolean isResultPresentInTheList(String cName, String fName){
        for(int i = 0;i < getElements(tableJobs).size();i++){
            if(getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody/tr/td[2])["+(i+1)+"]")).getText().equals(cName)
                    && getSelenideElement(By.xpath("(//table[@id='DataTables_Table_0']/tbody/tr/td[3])["+(i+1)+"]")).getText().equals(fName))
                return true;
        }
        return false;
    }

    public void closeViewResultWindow(){
        waitForElementClickable(closeViewResultsWindowButton);
        click(closeViewResultsWindowButton);
    }

    public void enterTextInTheSearchField(String text){
        SelenideTools.sleep(3);
        waitForElementVisibility(searchField);
        type(text, searchField);
    }

    public int getNumberOfResults(){
        if(isElementVisibleWithNoLog(researchResultsNoRecords))
            return 0;
        return getElements(surveillanceResultsTableRecords).size();
    }
    public boolean isNoRecordsFoundMessageDisplayed(){
        SelenideTools.sleep(2);
        return isElementVisible(researchResultsNoRecords);
    }

    public boolean isTableLabelsPresentOnResearchResultsPage(List<String> labels){
        List<String> tableLabelsList = new ArrayList<>();
        List<SelenideElement> elements = getElements(researchResultsTableLabels);
        for(SelenideElement element : elements){
            System.out.println(element.getAttribute("innerHTML"));
            tableLabelsList.add(element.getAttribute("innerHTML"));
        }
        return tableLabelsList.equals(labels);
    }

    public void saveFixedLabelsCoordinates(){
        fixedLabelCoordinates = new HashMap<>();
        List<SelenideElement> elements = getElements(researchResultsTableFixedLabels);
        for(SelenideElement element : elements){
            fixedLabelCoordinates.put(element.getLocation().getX(),element.getLocation().getY());
        }
    }

    public boolean isFixedLabelsCoordinatesNotChanged(){
        Map<Integer,Integer> currentCoordinates = new HashMap<>();
        List<SelenideElement> elements = getElements(researchResultsTableFixedLabels);
        for(SelenideElement element : elements){
            currentCoordinates.put(element.getLocation().getX(), element.getLocation().getY());
        }
        currentCoordinates.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
        fixedLabelCoordinates.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
        return currentCoordinates.equals(fixedLabelCoordinates);
    }

    public void scrollToLabel(String label){
        List<String> tableLabelsList = new ArrayList<>();
        List<SelenideElement> elements = getElements(researchResultsTableLabels);
        for(SelenideElement element : elements){
            if(element.getAttribute("innerHTML").contains(label)){
                System.out.println(element.getAttribute("innerHTML"));
                ((JavascriptExecutor) SelenideTools.getDriver()).executeScript("arguments[0].argument[0].scrollIntoView()", element);
                element.scrollTo();
                break;
            }
        }

        SelenideTools.sleep(5);
    }

    public void clickOnResultsSidebarButton(){
        waitForElementVisibility(resultsSidebarButton);
        click(resultsSidebarButton);
    }

    public void selectClient(String client){
        waitForElementVisibility(clientSelect);
        selectOption(client, clientSelect);
    }

    public void selectCompany(String client){
        waitForElementVisibility(companySelect);
        selectOption(client, companySelect);
    }

    public void clickExportButton(){
        waitForElementVisibility(exportButton);
        click(exportButton);
    }

    public Object[][] getData(String filename, String SheetName) {
        ExcelReader excel;
        if (System.getProperty("os.name").contains("Windows")) {
            excel = new ExcelReader(
                    System.getProperty("user.dir") + "\\src\\test\\resources\\data\\ExcelFile\\" + filename);
        }else {
            excel = new ExcelReader(
                    System.getProperty("user.dir") + "/src/test/resources/data/" + filename + ".xlsx");
        }
        int rows = excel.getRowCount(SheetName);
        int columns = excel.getColumnCountAtRow(SheetName,1);
        System.out.println("Rows: "+rows+"\nColumns:"+columns);
        Object[][] data = new Object[rows - 1][columns];
        for (int rowNum = 2; rowNum <= rows; rowNum++) {
            for (int colNum = 0; colNum < columns; colNum++) {
                data[rowNum - 2][colNum] = excel.getCellData(SheetName, colNum, rowNum);
            }
        }
        return data;
    }
}
