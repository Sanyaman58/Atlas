package Pages.admin;

import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.*;

import java.util.ArrayList;
import java.util.List;

public class RequirementsAdminPage extends PageTools {
	By requirementsAdminPageTitle = By.xpath("//h2[text()='Requirements Admin']");
	By requirementCollapseButton = By.xpath("//form[@id='versionned_requirement_form']/div/div[3]//div[contains(@class,'collapsible')]");
	By attachmentsCollapseButton = By.xpath("//form[@id='versionned_requirement_form']/div/div[4]//div[contains(@class,'collapsible')]");
	By prerequisitesCollapseButton = By.xpath("//form[@id='versionned_requirement_form']/div/div[5]//div[contains(@class,'collapsible')]");
	By productLineCollapseButton = By.xpath("//form[@id='versionned_requirement_form']/div/div[6]//div[contains(@class,'collapsible')]");
	By businessModelCollapseButton = By.xpath("//form[@id='versionned_requirement_form']/div/div[7]//div[contains(@class,'collapsible')]");
	By questionSelectionCollapseButton = By.xpath("//form[@id='versionned_requirement_form']/div/div[8]//div[contains(@class,'collapsible')]");
	By questionSelectionCollapseActiveButton = By.xpath("//form[@id='versionned_requirement_form']/div/div[8]//div[contains(@class,'collapsible active')]");
	By productionDataRadioButton = By.xpath("//input[@id='production-data']/following-sibling::label");
	By preliminaryDataRadioButton = By.xpath("//input[@id='preliminary-data']/following-sibling::label");
	By jurisdictionSelect = By.xpath("//select[@id='filter_Jurisdiction']");
	By requirementCategorySelect = By.xpath("//select[@id='filter_Requirement_Category']");
	By requirementTypeSelect = By.xpath("//select[@id='filter_Requirement_Type']");
	By requirementNameSelect = By.xpath("//select[@id='filter_Name_Requirement']");
	By statusSelect = By.xpath("//select[@id='status']");
	By requirementNameGeneralInformationInput = By.xpath("//input[@name='Name_Requirement']");
	By applicationNameGeneralInformationInput = By.xpath("//input[@name='Name_Application']");
	By jurisdictionGeneralInformationSelect = By.xpath("//select[@id='Jurisdiction']");
	By processingTimeGeneralInformationInput = By.xpath("//input[@name='Application_ProcessingTime']");
	By definitionGeneralInformationInput = By.xpath("//textarea[@name='Definition']");
	By renewalTermGeneralInformationInput = By.xpath("//input[@name='Renewal_Term']");
	By applicationTypeGeneralInformationInput = By.xpath("//select[@id='Application_Type']");
	By notesGeneralInformationInput = By.xpath("//textarea[@name='Notes']");
	By formsGeneralInformationInput = By.xpath("//input[@name='Forms']");
	By bondRequiredYRadioButton = By.xpath("//input[@id='bond-required_yes']");
	By bondRequiredNRadioButton = By.xpath("//input[@id='bond-required_no']");
	By stateRegisteredAgentYRadioButton = By.xpath("//input[@id='state-registered-yes']");
	By stateRegisteredAgentNRadioButton = By.xpath("//input[@id='state-registered-no']");
	By stateForeignQualificationYRadioButton = By.xpath("//input[@id='state-foreign-yes']");
	By stateForeignQualificationNRadioButton = By.xpath("//input[@id='state-foreign-no']");
	By applicationFeeInput = By.xpath("//input[@name='Fee_Application[fee]']");
	By additionalFeeInput = By.xpath("//input[@name='Fee_ApplicationAdditional[fee]']");
	By bondFeeInput = By.xpath("//input[@name='Fee_Bond[fee]']");
	By controlledSubstancesFeeInput = By.xpath("//input[@name='Fee_ControlledSubstance[fee]']");
	By renewalFeeInput = By.xpath("//input[@name='Fee_Renewal[fee]']");
	By deleteSelectorButton = By.xpath("//button[@data-delete='rule']");
	By addSelectorButton = By.xpath("//button[@data-add='rule']");
	By addGroupButton = By.xpath("//button[@data-add='group']");


	By requirementViewersTable = By.xpath("//div[@id='requirement-table']//table[@class='table table-inner table-hove fixed_headers']");
	By requirementViewersTableLabels = By.xpath("//div[@id='requirement-table']//table//thead/tr/th");
	By requirementViewersTableRecords = By.xpath("//div[@id='requirement-table']//table/tbody/tr");
	By contextMenu = By.xpath("//div[@id='context-menu']");
	By contextMenuViewButton = By.xpath("//div[@id='context-menu']/div[@id='view']/a");
	By contextMenuEditButton = By.xpath("//div[@id='context-menu']/div[@id='edit']/a");
	By contextMenuDeleteButton = By.xpath("//div[@id='context-menu']/div[@id='delete']/a");
	By attachmentsCheckboxes = By.xpath("(//form[@id='versionned_requirement_form']//section)[4]//div[@class='row']/div//input");
	By prerequisitesCheckboxes = By.xpath("(//form[@id='versionned_requirement_form']//section)[5]//div[@class='row']/div//input");
	By productLinesCheckboxes = By.xpath("(//form[@id='versionned_requirement_form']//section)[6]//div[@class='row']/div//input");
	By businessModelCheckboxes = By.xpath("(//form[@id='versionned_requirement_form']//section)[7]//div[@class='row']/div//input");
	By questionSelectionRES1 = By.xpath("//input[@id='RES1']");
	By questionSelectionsResidentStateSelect = By.xpath("//li[@id='res-container']");
	By questionSelectionsResidentType = By.xpath("//input[@name='resident_type']/following-sibling::label");
	By questionSelectionCheckboxes = By.xpath("//section[@id='Question_Selection']//div[@class='row']/div//input | //div[@id='Question_Selection']//div[@class='row']/div//input");
	By selectorCriteriaSelects = By.xpath("//div[@id='selector_criteria_group_0']//select");
	By selectorCriteriaRuleContainer = By.xpath("//div[@class='rule-container']");
	By selectorCriteriaQuestionsSelects = By.xpath("//div[contains(@class,'rule-filter-container')]/select");
	By selectorCriteriaQuestionSelect = By.xpath("(//div[contains(@class,'rule-filter-container')]/select)[%s]");
	By selectorCriteriaAnswersSelects = By.xpath("//div[@id='selector_criteria']//div[@id='builder-basic']//div[contains(@class,'rule-value-container')]/select");
	By selectorCriteriaAnswerSelect = By.xpath("(//div[contains(@class,'rule-value-container')]/select)[%s]");

	By selectorCriteriaAndOrSelection = By.xpath("//div[@id='selector_criteria']//div[@class='rules-group-header']/div[2]");
	By changeNoteForCustomerInput = By.xpath("//textarea[@name='Change_Note_for_Customer']");
	By newRequirementCategorySelect = By.xpath("//select[@id='Requirement_Category']");
	By newRequirementTypeSelect = By.xpath("//select[@id='Requirement_Type']");
	By createNewRequirementButton = By.xpath("//button[@id='start_new']");
	By RES1QuestionCheckbox = By.xpath("//input[@id='RES1']");
	By RES1ResidentState = By.xpath("//li[@id='res-container']/select");
	By RES1InStateRadioButton = By.xpath("//input[@id='resident-requirement']/following-sibling::label");
	By RES1OutOfStateRadioButton = By.xpath("//input[@id='non-resident-requirement']/following-sibling::label");
	By submitForApprovalButton = By.xpath("//button[@id='submit_selected_criteria']");
	By saveButton = By.xpath("//button[@id='save_selected_criteria']");
	By noRecords = By.xpath("//td[@class='dataTables_empty']");

	By approveButton = By.xpath("//button[@id='approve_requirement_changes']");
	By yesApproveButton = By.xpath("//button[@id='yes_btn']");
	By intelligenceAdminSidebarCollapseButton = By.xpath("//a[contains(text(),'Intelligence Admin')]");
	By editJurisdictionSelect = By.xpath("//select[@id='filter_Jurisdiction']");
	By editRequirementCategorySelect = By.xpath("//select[@id='edit_Requirement_Category']");
	By editRequirementTypeSelect = By.xpath("//select[@id='edit_Requirement_Type']");
	By editRequirementNameSelect = By.xpath("//select[@id='edit_Name_Requirement']");

	String requirementName;
	String oldRequirementName;
	String applicationName;
	String state;
	String RESState;
	String selectedQuestionText;
	String selectorCriteria;

	public String getRequirementName() {
		return requirementName;
	}
	public String getApplicationName() {
		return applicationName;
	}
	public String getState(){
		return state;
	}

	public boolean isRequirementsAdminPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(requirementsAdminPageTitle);
	}

	public void clickOnAttachmentCollapseButton(){
		waitForElementVisibility(attachmentsCollapseButton);
		click(attachmentsCollapseButton);
	}

	public void clickOnPrerequisitesCollapseButton(){
		waitForElementVisibility(prerequisitesCollapseButton);
		click(prerequisitesCollapseButton);
	}

	public void clickOnProductLineCollapseButton(){
		waitForElementVisibility(productLineCollapseButton);
		click(productLineCollapseButton);
	}

	public void clickOnBusinessModelCollapseButton(){
		waitForElementVisibility(businessModelCollapseButton);
		click(businessModelCollapseButton);
	}

	public void clickOnQuestionSelectionCollapseButton(){
		waitForElementVisibility(questionSelectionCollapseButton);
		if(!isElementVisible(questionSelectionCollapseActiveButton))
			click(questionSelectionCollapseButton);
	}
	public void clickOnRequirementCollapseButton(){
		waitForElementVisibility(requirementCollapseButton);
		click(requirementCollapseButton);
	}

	public boolean isProductionDataSelectable(){
		waitForElementVisibility(productionDataRadioButton);
		return isElementClickable(productionDataRadioButton);
	}

	public void selectProductionDataRadioButton(){
		waitForElementVisibility(productionDataRadioButton);
		click(productionDataRadioButton);
	}

	public boolean isPreliminaryDataSelectable(){
		waitForElementVisibility(preliminaryDataRadioButton);
		return isElementClickable(preliminaryDataRadioButton);
	}

	public void selectPreliminaryDataRadioButton(){
		waitForElementVisibility(preliminaryDataRadioButton);
		scrollToElement(preliminaryDataRadioButton);
		click(preliminaryDataRadioButton);
	}

	public boolean isJurisdictionSelectSelectable(){
		waitForElementVisibility(productionDataRadioButton);
		selectOption(0, jurisdictionSelect);
		return isElementClickable(jurisdictionSelect);
	}

	public void selectRequirementFilterJurisdiction(String jurisdiction){
		waitForElementVisibility(jurisdictionSelect);
		selectOption(jurisdiction, jurisdictionSelect);
	}

	public boolean isRequirementCategorySelectSelectable(){
		waitForElementVisibility(requirementCategorySelect);
		selectOption(0, requirementCategorySelect);
		return isElementClickable(requirementCategorySelect);
	}

	public boolean isRequirementTypeSelectSelectable(){
		waitForElementVisibility(requirementTypeSelect);
		selectOption(0, requirementTypeSelect);
		return isElementClickable(requirementTypeSelect);
	}

	public boolean isRequirementNameSelectSelectable(){
		waitForElementVisibility(requirementNameSelect);
		selectOption(0, requirementNameSelect);
		return isElementClickable(requirementNameSelect);
	}

	public void selectRequirementName(String text){
		waitForElementVisibility(requirementNameSelect);
		selectOption(text, requirementNameSelect);
	}

	public boolean isStatusSelectSelectable(){
		waitForElementVisibility(statusSelect);
		selectOption(0, statusSelect);
		return isElementClickable(statusSelect);
	}

	public void selectRequirementsViewerFiltersStatus(String status){
		waitForElementVisibility(statusSelect);
		selectOption(status, statusSelect);
		SelenideTools.sleep(8);
	}

	public boolean isRequirementNameInputWorking(){
		waitForElementVisibility(requirementNameGeneralInformationInput);
		return isElementClickable(requirementNameGeneralInformationInput);
	}

	public boolean isApplicationNameInputWorking(){
		waitForElementVisibility(applicationNameGeneralInformationInput);
		return isElementClickable(applicationNameGeneralInformationInput);
	}

	public boolean isGeneralInformationJurisdictionSelectDisplayed(){
		waitForElementVisibility(jurisdictionGeneralInformationSelect);
		return isElementVisible(jurisdictionGeneralInformationSelect);
	}

	public boolean isProcessingTimeInputWorking(){
		waitForElementVisibility(processingTimeGeneralInformationInput);
		return isElementClickable(processingTimeGeneralInformationInput);
	}

	public boolean isGeneralInformationDefinitionInputWorking(){
		waitForElementVisibility(definitionGeneralInformationInput);
		return isElementClickable(definitionGeneralInformationInput);
	}

	public boolean isRenewalTermInputWorking(){
		waitForElementVisibility(renewalTermGeneralInformationInput);
		return isElementClickable(renewalTermGeneralInformationInput);
	}

	public boolean isApplicationTypeSelectSelectable(){
		waitForElementVisibility(applicationTypeGeneralInformationInput);
		return isElementClickable(applicationTypeGeneralInformationInput);
	}

	public boolean isGeneralInformationNotesInputWorking(){
		waitForElementVisibility(notesGeneralInformationInput);
		return isElementClickable(notesGeneralInformationInput);
	}

	public boolean isGeneralInformationFormsInputWorking(){
		waitForElementVisibility(formsGeneralInformationInput);
		return isElementClickable(formsGeneralInformationInput);
	}

	public boolean isRequiredBondYRadioButtonSelectable(){
		waitForElementVisibility(bondRequiredYRadioButton);
		return isElementClickable(bondRequiredYRadioButton);
	}

	public boolean isStateRegisteredAgentYRadioButtonSelectable(){
		waitForElementVisibility(stateRegisteredAgentYRadioButton);
		return isElementClickable(stateRegisteredAgentYRadioButton);
	}

	public boolean isStateRegisteredAgentNRadioButtonSelectable(){
		waitForElementVisibility(stateRegisteredAgentNRadioButton);
		return isElementClickable(stateRegisteredAgentNRadioButton);
	}

	public boolean isStateForeignQualificationYRadioButtonSelectable(){
		waitForElementVisibility(stateForeignQualificationYRadioButton);
		return isElementClickable(stateForeignQualificationYRadioButton);
	}

	public boolean isStateForeignQualificationNRadioButtonSelectable(){
		waitForElementVisibility(stateForeignQualificationNRadioButton);
		return isElementClickable(stateForeignQualificationNRadioButton);
	}

	public boolean isApplicationFeeInputWorking(){
		waitForElementVisibility(applicationFeeInput);
		return isElementClickable(applicationFeeInput);
	}

	public boolean isAdditionalFeeInputWorking(){
		waitForElementVisibility(additionalFeeInput);
		return isElementClickable(additionalFeeInput);
	}

	public boolean isBondFeeInputWorking(){
		waitForElementVisibility(bondFeeInput);
		return isElementClickable(bondFeeInput);
	}

	public boolean isControlledSubstancesInputWorking(){
		waitForElementVisibility(controlledSubstancesFeeInput);
		return isElementClickable(controlledSubstancesFeeInput);
	}

	public boolean isRenewalInputWorking(){
		waitForElementVisibility(renewalFeeInput);
		return isElementClickable(renewalFeeInput);
	}

	public boolean isRequiredBondNRadioButtonSelectable(){
		waitForElementVisibility(bondRequiredNRadioButton);
		return isElementClickable(bondRequiredNRadioButton);
	}

	public List<String> getTableLabels(){
		List<String> labels = new ArrayList<>();
		for(SelenideElement element : getElements(requirementViewersTableLabels))
			labels.add(element.getText());
		return labels;
	}

	public boolean isTableLabelsPresent(List<String> labels){
		List<String> tableLabelsList = new ArrayList<>();
		List<SelenideElement> elements = getElements(requirementViewersTableLabels);
		for(SelenideElement element : elements) {
			tableLabelsList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		}
		System.out.println(" //////////////////////// ");
//		tableLabelsList.add(getSelenideElement(requirementViewersTableLabels).getAttribute("aria-label"));
		for(int i = 0; i < labels.size(); i++){
			System.out.println(labels.get(i)+" "+tableLabelsList.get(i));
			if(!tableLabelsList.get(i).contains(labels.get(i)))
				return false;
		}
		return true;
		//return tableLabelsList.retainAll(labels);
	}

	public boolean isTableDisplayed(){
		SelenideTools.sleep(20);
		return isElementVisible(requirementViewersTable);
	}
	public void rightClickOnTableRecord(int index){
		WebElement record = getElements(requirementViewersTableRecords).get(index-1).findElement(By.xpath("./td[1]"));
		actions().contextClick(record).build().perform();
		SelenideTools.sleep(1);
		Assert.assertTrue(isElementVisible(contextMenu));
	}

	public void rightClickOnTableRecordWithStatus(String status){
		for (SelenideElement element : getElements(requirementViewersTableRecords)){
			if(element.findElement(By.xpath("./td[4]")).getText().equals(status)){
				WebElement record = element.findElement(By.xpath("./td[1]"));
				actions().moveToElement(record).contextClick(record).build().perform();
				break;
			}
		}
		SelenideTools.sleep(1);
		Assert.assertTrue(isElementVisible(contextMenu));
	}

	public void getTableRecordDataWithStatus(String status){
		for (SelenideElement element : getElements(requirementViewersTableRecords)){
			if(element.findElement(By.xpath("./td[4]")).getText().equals(status)){
				state = element.findElement(By.xpath("./td[1]")).getText();
				requirementName = element.findElement(By.xpath("./td[2]")).getText();
				applicationName = element.findElement(By.xpath("./td[3]")).getText();
				break;
			}
		}
	}
	public void clickOnViewButtonOfTheContextMenu(){
		waitForElementVisibility(contextMenu);
		getSelenideElement(contextMenuViewButton).click();
	}

	public boolean isEditButtonFromContextMenuVisible(){
		SelenideTools.sleep(1);
		return isElementVisible(contextMenuEditButton);
	}

	public void clickOnEditButtonOfTheContextMenu(){
		waitForElementVisibility(contextMenu);
		getSelenideElement(contextMenuEditButton).click();
	}

	public void clickOnDeleteButtonOfTheContextMenu(){
		waitForElementVisibility(contextMenu);
		//getSelenideElement(contextMenuDeleteButton).click();
		waitForElementVisibility(contextMenuDeleteButton);
		click(contextMenuDeleteButton);
	}

	public boolean isDeleteButtonFromContextMenuVisible(){
		SelenideTools.sleep(1);
		return isElementVisible(contextMenuDeleteButton);
	}

	public boolean areAttachmentsCheckboxesClickable(){
		SelenideTools.sleep(1);
		scrollToElement(attachmentsCheckboxes);
		System.out.println(getElements(attachmentsCheckboxes).size());
		for(int i = 0; i < getElements(attachmentsCheckboxes).size(); i++){
			if(!getElements(attachmentsCheckboxes).get(i).isDisplayed()) {
				System.out.println(i);
				return false;
			}
		}
		return true;
	}

	public boolean arePrerequisitesCheckboxesClickable(){
		for(int i = 0; i < getElements(prerequisitesCheckboxes).size(); i++){
			if(!getElements(prerequisitesCheckboxes).get(i).isEnabled())
				return false;
		}
		return true;
	}

	public boolean areProductLinesCheckboxesClickable(){
		for(int i = 0; i < getElements(productLinesCheckboxes).size(); i++){
			if(!getElements(productLinesCheckboxes).get(i).isEnabled())
				return false;
		}
		return true;
	}

	public boolean areBusinessModelCheckboxesClickable(){
		for(int i = 0; i < getElements(businessModelCheckboxes).size(); i++){
			if(!getElements(businessModelCheckboxes).get(i).isEnabled())
				return false;
		}
		return true;
	}

	public boolean areQuestionSelectionCheckboxesClickable(){
		for(int i = 0; i < getElements(questionSelectionCheckboxes).size(); i++){
			if(!getElements(questionSelectionCheckboxes).get(i).isEnabled())
				return false;
		}
		return true;
	}

	public boolean areSelectorCriteriaSelectsClickable(){
		for(int i = 0; i < getElements(selectorCriteriaSelects).size(); i++){
			if(!getElements(selectorCriteriaSelects).get(i).isEnabled())
				return false;
		}
		return true;
	}

	public void selectTheLastSelectorCriteria(int index){
		waitForElementVisibility(selectorCriteriaQuestionSelect, index);
		System.out.println(getElementsText(selectorCriteriaQuestionSelect, index));
		getSelenideElement(selectorCriteriaQuestionSelect, index).selectOption(selectedQuestionText);
	}

	public void getRequirementNameFromEditRequirement(){
		requirementName = getSelenideElement(requirementNameGeneralInformationInput).getValue();
	}

	public void getApplicationNameFromEditRequirement(){
		applicationName = getSelenideElement(applicationNameGeneralInformationInput).getValue();
	}

	public boolean isChangeNoteForCustomerWorking(){
		return isElementClickable(changeNoteForCustomerInput);
	}

	public void selectNewRequirementCategory(String category){
		waitForElementVisibility(newRequirementCategorySelect);
		selectOption(category, newRequirementCategorySelect);
	}

	public boolean isRequirementCategorySelectable(){
		waitForElementVisibility(newRequirementCategorySelect);
		return isElementClickable(newRequirementCategorySelect);
	}

	public void selectNewRequirementType(String type){
		waitForElementVisibility(newRequirementTypeSelect);
		scrollToElement(newRequirementCategorySelect);
		selectOption(type, newRequirementTypeSelect);
	}

	public boolean isRequirementTypeSelectable(){
		waitForElementVisibility(newRequirementTypeSelect);
		return isElementClickable(newRequirementTypeSelect);
	}

	public void clickCreateNewRequirementButton(){
		waitForElementVisibility(createNewRequirementButton);
		click(createNewRequirementButton);
	}

	public boolean isCreateNewRequirementButtonClickable(){
		waitForElementVisibility(createNewRequirementButton);
		return isElementClickable(createNewRequirementButton);
	}

	public void enterRequirementName(String name){
		SelenideTools.sleep(5);
		waitForElementVisibility(requirementNameGeneralInformationInput);
		getSelenideElement(requirementNameGeneralInformationInput).clear();
		type(name, requirementNameGeneralInformationInput);
		requirementName = name;
	}

	public void enterApplicationName(String name){
		waitForElementVisibility(applicationNameGeneralInformationInput);
		type(name, applicationNameGeneralInformationInput);
		applicationName = name;
	}
	public void selectJurisdiction(String jurisdiction){
		waitForElementVisibility(jurisdictionGeneralInformationSelect);
		selectOption(jurisdiction, jurisdictionGeneralInformationSelect);
		state = jurisdiction;
	}

	public void checkRES1Question(){
		waitForElementVisibility(RES1QuestionCheckbox);
		if(!getSelenideElement(RES1QuestionCheckbox).isSelected())
			click(RES1QuestionCheckbox);
	}

	public void selectRES1State(String state){
		waitForElementVisibility(RES1ResidentState);
		selectOption(state,RES1ResidentState);
		RESState = state;
	}

	public void checkRESInStateCheckbox(){
		waitForElementVisibility(RES1InStateRadioButton);
		click(RES1InStateRadioButton);
	}

	public void checkRESOutOfStateCheckbox(){
		waitForElementVisibility(RES1OutOfStateRadioButton);
		click(RES1OutOfStateRadioButton);
	}

	public void checkQuestion(int index){
		waitForElementVisibility(questionSelectionCheckboxes);
		getElements(questionSelectionCheckboxes).get(index).click();
		selectedQuestionText = getElements(questionSelectionCheckboxes).get(index).findElement(By.xpath("./following-sibling::span")).getText();
		System.out.println(selectedQuestionText);
	}

	public void selectOrRule(int index){
		getElements(selectorCriteriaAndOrSelection).get(index).findElement(By.xpath("./label[2]")).click();
	}

	public String getSelectorValue(int index){
		return getElements(selectorCriteriaAndOrSelection).get(index).findElement(By.xpath("./label[contains(@class,'active')]/input")).getAttribute("value").trim();
	}

	public void selectAndRule(int index){
		getElements(selectorCriteriaAndOrSelection).get(index).findElement(By.xpath("./label[1]")).click();
	}

	public void selectQuestionInTheSelectorCriteria(String yesOrNo){
		waitForElementVisibility(selectorCriteriaSelects);
		getElements(selectorCriteriaSelects).get(2).selectOption(yesOrNo);
	}

	public void deleteLastQuestion(){
		waitForElementVisibility(deleteSelectorButton);
		getElements(deleteSelectorButton).get(getElements(deleteSelectorButton).size()-1).click();
	}

	public void deleteQuestion(int index){
		waitForElementVisibility(deleteSelectorButton);
		getElements(deleteSelectorButton).get(index).click();
	}

	public void addRule(int index){
		waitForElementVisibility(addSelectorButton);
		getElements(addSelectorButton).get(index).click();
	}

	public void addGroup(int index) {
		waitForElementVisibility(addGroupButton);
		getElements(addGroupButton).get(index).click();
	}

	public void clickSubmitForApprovalButton(){
		scrollToElement(submitForApprovalButton);
		waitForElementVisibility(submitForApprovalButton);
		click(submitForApprovalButton);
	}
	public boolean isSubmitForApprovalButtonVisible(){
		SelenideTools.sleep(5);
		return isElementVisible(submitForApprovalButton);
	}

	public void clickSaveButton(){
		scrollToElement(saveButton);
		waitForElementVisibility(saveButton);
		click(saveButton);
	}

	public void clickApproveButton(){
		waitForElementVisibility(approveButton);
		click(approveButton);
	}

	public void clickYesApproveButton(){
		waitForElementClickable(yesApproveButton);
		click(yesApproveButton);
	}

	public void clickOnIntelligenceAdminSidebarCollapseButton(){
		waitForElementVisibility(intelligenceAdminSidebarCollapseButton);
		click(intelligenceAdminSidebarCollapseButton);
	}

	public void selectQuestionAndAnswer(int index, int selectOptionIndex, String yesOrNo){
		waitForElementVisibility(selectorCriteriaRuleContainer);
		getSelenideElement(selectorCriteriaQuestionSelect, index).selectOption(selectOptionIndex);
		getSelenideElement(selectorCriteriaAnswerSelect, index).selectOption(yesOrNo);
	}

	public void selectQuestion(int index, int selectOptionIndex){
		waitForElementVisibility(selectorCriteriaRuleContainer);
		getSelenideElement(selectorCriteriaQuestionSelect, index).selectOption(selectOptionIndex);
	}

	public boolean isRES1Checked(){
		waitForElementVisibility(questionSelectionRES1);
		return getSelenideElement(questionSelectionRES1).isSelected();
	}

	public void checkRES1Checkbox(){
		waitForElementVisibility(questionSelectionRES1);
		click(questionSelectionRES1);
	}

	public boolean isRES1StateSelectVisible(){
		SelenideTools.sleep(2);
		return isElementVisible(questionSelectionsResidentStateSelect);
	}

	public boolean areRES1ResidentTypeRadioButtonsVisible(){
		SelenideTools.sleep(2);
		return isElementVisible(questionSelectionsResidentType);
	}

	public boolean isRecordDisplayed(String state,String applicationName, String requirementName){
		for (SelenideElement element : getElements(requirementViewersTableRecords)){
			if(element.findElement(By.xpath("./td[1]")).getText().equals(state)
			&& element.findElement(By.xpath("./td[2]")).getText().equals(applicationName)
			&& element.findElement(By.xpath("./td[3]")).getText().equals(requirementName))
				return true;
			}
		return false;
	}

	public boolean isRecordWithStatusDisplayed(String state, String requirementName, String applicationName, String status){
		System.out.println(state);
		System.out.println(requirementName);
		System.out.println(applicationName);
		System.out.println(status);
		for (SelenideElement element : getElements(requirementViewersTableRecords)){
			if(element.findElement(By.xpath("./td[1]")).getText().equals(state)
					&& element.findElement(By.xpath("./td[2]")).getText().equals(requirementName)
					&& element.findElement(By.xpath("./td[3]")).getText().equals(applicationName)
					&& element.findElement(By.xpath("./td[4]/span")).getText().equals(status))
				return true;
		}
		return false;
	}

	public boolean areAllStatesSelectableInTheRequirementsViewerFiltersJurisdictionSelect(){
		waitForElementVisibility(jurisdictionSelect);
		return getSelenideElement(jurisdictionSelect).findElements(By.xpath("./option")).size()==54;
	}

	public boolean areAllStatesSelectableInTheGeneralInformationJurisdictionSelect(){
		waitForElementVisibility(jurisdictionGeneralInformationSelect);
		return getSelenideElement(jurisdictionGeneralInformationSelect).findElements(By.xpath("./option")).size()==54;
	}

	public boolean isTableRecordWithRequirementNameDisplayed(String requirementName){
		waitForElementVisibility(requirementViewersTableRecords);
		for(int i = 0; i < getElements(requirementViewersTableRecords).size();i++){
			if(!getElements(requirementViewersTableRecords).get(i).findElement(By.xpath("./td[3]")).getText().equals(requirementName))
				return false;
		}
		return true;
	}

	public boolean isTableRecordWithJurisdictionDisplayed(String jurisdiction){
		waitForElementVisibility(requirementViewersTableRecords);
		if(isElementVisible(noRecords))
			return false;
		for(int i = 0; i < getElements(requirementViewersTableRecords).size();i++){
			if(!getElements(requirementViewersTableRecords).get(i).findElement(By.xpath("./td[1]")).getText().equals(jurisdiction))
				return false;
		}
		return true;
	}

	public void saveOldRequirementsName(){
		SelenideTools.sleep(5);
		waitForElementVisibility(requirementNameGeneralInformationInput);
		oldRequirementName = getSelenideElement(requirementNameGeneralInformationInput).getValue();
		System.out.println(getSelenideElement(requirementNameGeneralInformationInput).getValue());
	}

	public String getOldRequirementName(){
		return oldRequirementName;
	}

	public boolean isEditJurisdictionSelectVisible(){
		return isElementVisible(editJurisdictionSelect);
	}
	public boolean isJurisdictionDisplayed(String state){
		getSelenideElement(editJurisdictionSelect).click();
		System.out.println();
		for(int i = 0; i < getSelenideElement(editJurisdictionSelect).findElements(By.xpath("./option")).size();i++){
			System.out.println(getSelenideElement(editJurisdictionSelect).findElements(By.xpath("./option")).get(i).getText());
			if(getSelenideElement(editJurisdictionSelect).findElements(By.xpath("./option")).get(i).getText().equals(state))
				return true;
		}
		return false;
	}

	public boolean isEditRequirementCategoryVisible(){
		return isElementVisible(editRequirementCategorySelect);
	}

	public boolean isEditRequirementTypeSelectVisible(){
		return isElementVisible(editRequirementTypeSelect);
	}

	public boolean isEditRequirementNameSelectVisible(){
		return isElementVisible(editRequirementNameSelect);
	}

}
