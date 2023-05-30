package Pages.atlas;

import Constants.Constants;
import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class AtlasDashboardManagementPage extends PageTools {
	By dashboardGrid = By.xpath(
			"//a[text()[contains(.,'Dashboard')]] | //a[@href='https://qa-atlas.lha.pharma.solutions/home'] | //img[@src='https://stagingatlas.pharma.solutions/theme/build/images/Group 907_p.svg']");
	By requirementsSidebarButton = By.xpath("//ul[@id='menu']/li[4]/ul/li/a");
	By activitiesSidebarButton = By.xpath("(//ul[@id='menu']/li[4]/ul/li/a)[2]");
	By tasksSidebarButton = By.xpath("(//ul[@id='menu']/li[4]/ul/li/a)[3]");
	By surveillanceIntelligenceSidebarCollapse = By.xpath("//ul[@id='menu']/li[5]");
	By configurationSidebarButton = By.xpath("//ul[@id='menu']/li[5]/ul/li/a");
	By resultsSidebarButton = By.xpath("//ul[@id='menu']/li[5]/ul/li[2]/a");
	By intelligenceAdminSidebarCollapse = By.xpath("//ul[@id='menu']/li/a[contains(text(),'Intelligence Admin')]");
	By researchSidebarButton = By.xpath("//*[@id=\"menu\"]/li[10]/ul/li[1]/a");
	By documentRepositorySidebarButton = By.xpath("//a[contains(text(),'Document Repository')]");
	By auditLogSidebarButton = By.xpath("//ul[@id='menu']/li[10]/ul/li[2]/a");
	By requirementsViewSidebarButton = By.xpath("//ul[@id='menu']/li[10]/ul/li[3]/a");
	By versionRequirementsSidebarButton = By.xpath("//ul[@id='menu']/li[10]/ul/li[4]/a");
	By activeRequirementsSidebarButton = By.xpath("//ul[@id='menu']/li[10]/ul/li[5]/a");
	By notificationsSidebarButton = By.xpath("//ul[@id='menu']/li[10]/ul/li[6]/a");
	By euiVersionsSidebarButton = By.xpath("//ul[@id='menu']/li[10]/ul/li[7]/a");
	By questionnaireVersionsButton = By.xpath("//ul[@id='menu']/li[10]/ul/li[8]/a");
	By permissionsSidebarButton = By.xpath("//ul[@id='menu']/li[10]/ul/li[9]/a");
	By managementAdminSidebarCollapse = By.xpath("//ul[@id='menu']/li[9]");
	By homepageSidebarButton = By.xpath("//*[@id=\"menu\"]/li[2]/a");
	By releaseNotesButton = By.xpath("//*[@id=\"wrapper\"]/main/div[1]/div[2]/div/div/ul/li[4]/a");
	By notificationsCollapseButton = By.xpath("//a[text()='Notifications ']");
	By notificationsDocumentsSidebarButton = By.xpath("//a[@id='notify-header-doc']");
	By documentsNotificationsPage = By.xpath("//p[contains(text(),'Document Notification')]");
	By tasksNotificationsSidebarButton = By.xpath("//a[@id='notify-header-task']");
	By tasksNotificationPage = By.xpath("//p[contains(text(), 'Task Notification')]");
	By documentsNotificationsSidebarButton = By.xpath("//a[@id='notify-header-doc']");
	By documentsNotificationPage = By.xpath("//p[contains(text(), 'Document Notification')]");
	By expirationNotificationsSidebarButton = By.xpath("//a[@id='notify-header-LicenseExp']");
	By expirationNotificationPage = By.xpath("//p[contains(text(), 'Requirement Expiry Notification')]");
	By intelligenceNotificationsSidebarButton = By.xpath("//a[contains(text(),'Intelligence -')]");
	By intelligenceNotificationPage = By.xpath("//h2[contains(text(), 'Research Notification')]");
	By requirementsManagementCollapse = By.xpath("//a[text()='Requirements Management ']");
	By taskManagerSidebarButton = By.xpath("//a[text()='Task Management']");
	By taskManagerPage = By.xpath("//span[contains(text(),'Tasks')]");
	By popUpOkButton = By.xpath("//a[@id='successok']");
	By companyProfileSidebarButton = By.xpath("//a[text()='Company Profile']");


	public void openLighthouse() {
		SelenideTools.openUrl(Constants.URL);
	}

	public void openAtlas() {
		SelenideTools.openUrl(Constants.ATLAS_URL);
	}

	public String getTabName() {
		return Selenide.title();
	}

	public boolean isDashboardPageOpened() {
		SelenideTools.sleep(2);
		return isElementVisible(dashboardGrid);
	}

	public void clickNotificationsAtlasCollapseButton(){
		waitForElementVisibility(notificationsCollapseButton);
		click(notificationsCollapseButton);
	}

	public boolean isDocumentsNotificationsPageOpened(){
		SelenideTools.sleep(5);
		return isElementVisible(documentsNotificationsPage);
	}

	public void clickNotificationsDocumentsSidebarButton(){
		waitForElementVisibility(notificationsDocumentsSidebarButton);
		click(notificationsDocumentsSidebarButton);
	}

	public void clickRequirementsManagementSidebarCollapseButton() {
		waitForElementVisibility(requirementsManagementCollapse);
		click(requirementsManagementCollapse);
	}

	public void clickRequirementsSidebarButton() {
		waitForElementVisibility(requirementsSidebarButton);
		click(requirementsSidebarButton);
	}

	public boolean isRequirementsSidebarButtonVisible(){
		SelenideTools.sleep(2);
		return isElementVisible(requirementsSidebarButton);
	}

	public void clickTaskManagerSidebarButton() {
		waitForElementVisibility(taskManagerSidebarButton);
		click(taskManagerSidebarButton);
	}

	public void clickActivitiesSidebarButton() {
		waitForElementVisibility(activitiesSidebarButton);
		click(activitiesSidebarButton);
	}

	public void clickTasksSidebarButton() {
		waitForElementVisibility(tasksSidebarButton);
		click(tasksSidebarButton);
	}

	public void clickSurveillanceIntelligenceSidebarCollapseButton() {
		waitForElementVisibility(surveillanceIntelligenceSidebarCollapse);
		click(surveillanceIntelligenceSidebarCollapse);
	}

	// s
	public void clickManagementAdminSidebarCollapseButton() {
		waitForElementVisibility(managementAdminSidebarCollapse);
		click(managementAdminSidebarCollapse);
	}

	public void clickConfigurationSidebarButton() {
		waitForElementVisibility(configurationSidebarButton);
		click(configurationSidebarButton);
	}

	public void clickResultsSidebarButton() {
		waitForElementVisibility(resultsSidebarButton);
		click(resultsSidebarButton);
	}

	public void clickIntelligenceAdminSidebarCollapseButton() {
		waitForElementVisibility(intelligenceAdminSidebarCollapse);
		click(intelligenceAdminSidebarCollapse);
	}

	public void clickResearchAdminSidebarButton() {
		waitForElementVisibility(researchSidebarButton);
		click(researchSidebarButton);
	}

	public void clickDocumentRepositorySidebarButton() {
		waitForElementVisibility(documentRepositorySidebarButton);
		click(documentRepositorySidebarButton);
	}

	public void clickRequirementsViewSidebarButton() {
		waitForElementVisibility(requirementsViewSidebarButton);
		click(requirementsViewSidebarButton);
	}

	public void clickAuditLogsSidebarButton() {
		waitForElementVisibility(auditLogSidebarButton);
		click(auditLogSidebarButton);
	}

	public void clickVersionRequirementsSidebarButton() {
		waitForElementVisibility(versionRequirementsSidebarButton);
		click(versionRequirementsSidebarButton);
	}

	public void clickHomepageSidebarButton() {
		waitForElementVisibility(homepageSidebarButton);
		click(homepageSidebarButton);
	}

	public void clickTasksNotificationsSidebarButton() {
		waitForElementVisibility(tasksNotificationsSidebarButton);
		click(tasksNotificationsSidebarButton);
	}

	public void clickDocumentsNotificationsSidebarButton() {
		waitForElementVisibility(documentsNotificationsSidebarButton);
		click(documentsNotificationsSidebarButton);
	}

	public void clickExpirationNotificationsSidebarButton() {
		waitForElementVisibility(expirationNotificationsSidebarButton);
		click(expirationNotificationsSidebarButton);
	}

	public void clickIntelligenceNotificationsSidebarButton() {
		waitForElementVisibility(intelligenceNotificationsSidebarButton);
		click(intelligenceNotificationsSidebarButton);
	}

	public boolean isTasksNotificationPageOpened(){
		waitForElementVisibility(tasksNotificationPage);
		return isElementVisible(tasksNotificationPage);
	}

	public boolean isExpirationNotificationPageOpened(){
		waitForElementVisibility(expirationNotificationPage);
		return isElementVisible(expirationNotificationPage);
	}

	public boolean isDocumentsNotificationPageOpened(){
		waitForElementVisibility(documentsNotificationPage);
		return isElementVisible(documentsNotificationPage);
	}

	public boolean isIntelligenceNotificationPageOpened(){
		waitForElementVisibility(intelligenceNotificationPage);
		return isElementVisible(intelligenceNotificationPage);
	}

	public boolean isTaskManagerPageOpened(){
		waitForElementVisibility(taskManagerPage);
		return isElementVisible(taskManagerPage);
	}

	public void clickOnOkPopupButton(){
		waitForElementVisibility(popUpOkButton);
		click(popUpOkButton);
	}

	public void clickOnCompanyProfileSidebarButton(){
		waitForElementVisibility(companyProfileSidebarButton);
		click(companyProfileSidebarButton);
	}

	public void verifyReleaseNotes() {
		waitForElementVisibility(releaseNotesButton);
	}

}
