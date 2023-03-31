package Pages.admin;

import Constants.Constants;
import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class ResearchAdminPage extends PageTools {
	By researchAdminPageTitle = By.xpath("//h2[text()='Research Admin']");
	By researchNotificationPageTitle = By.xpath("//h2[text()='Research Notification']");
	By versionedEUIPageTitle = By.xpath("//h2[text()='Versioned EUI']");
	By requirementsAdminButton = By.xpath("//a[@id='requirements']");
	By questionnaireAdminButton = By.xpath("//a[@id='questionnaire']");
	By endsUpInStateAdminButton = By.xpath("//a[@id='ends-up-states']");
	By researchSidebarButton = By.xpath("(//ul[@id='menu']//a[contains(@href,'research')])[last()]");
	By requirementsViewSidebarButton = By.xpath("//ul[@id='menu']//a[contains(@href,'requirement-view')]");
	By notificationsSidebarButton = By.xpath("(//ul[@id='menu']//a[contains(@href,'notifications')])[last()]");
	By euiVersionsSidebarButton = By.xpath("(//ul[@id='menu']//a[contains(@href,'EUI')])[last()]");
	By questionnaireVersionsSidebarButton = By.xpath("(//ul[@id='menu']//a[contains(@href,'versions/questionnaire')])[last()]");
	By surveillanceIntelligenceSidebarButton = By.xpath("//ul[@id='menu']/li[10]");
	By requirementsAdminPageTitle = By.xpath("//h2[text()='Requirements Admin']");
	By auditLogsSidebarButton = By.xpath("//*[@id=\"menu\"]/li[10]/ul/li[2]/a");
	By versionedRequirementsSidebarButton = By.xpath("//*[@id=\"menu\"]/li[10]/ul/li[4]/a");
	By activeRequirementsSidebarButton = By.xpath("//*[@id=\"menu\"]/li[10]/ul/li[5]/a");
	By EUIVersionsSidebarButton = By.xpath("//*[@id=\"menu\"]/li[10]/ul/li[7]/a");
	By questionnaireVerionsSidebarButton = By.xpath("//*[@id=\"menu\"]/li[10]/ul/li[8]/a");
	By permissionsSidebarButton = By.xpath("//*[@id=\"menu\"]/li[10]/ul/li[9]/a");
	By logsPageHeaderTitle = By.xpath("//h2[text()='Logs']");
	By requirementAdminPageHeader = By.xpath("//h2[text()='Requirements Admin']");
	By versionRequirementsPageHeader = By.xpath("//h2[text()='Versioned Requirements']");
	By activeRequirementsPageHeader = By.xpath("//h2[text()='Active Requirements']");
	By notificationsPageHeader = By.xpath("//h2[text()='Research Notifications']");
	By EUIVersionPageHeader = By.xpath("//h2[text()='Versioned EUI']");
	By permissionsPageHeader = By.xpath("//h2[text()='Research Results']");
	By systemAdminDeleteFacilityCheckbox = By.xpath("//");

	public void openLighthouse(){
		SelenideTools.openUrl(Constants.URL);
	}

	public String getTabName() {
		return Selenide.title();
	}

	public boolean isResearchAdminPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(researchAdminPageTitle);
	}
	
	public boolean isRequirementsAdminPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(researchAdminPageTitle);
	}

	public boolean isResearchNotificationPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(researchNotificationPageTitle);
	}

	public boolean isVersionedEUIPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(versionedEUIPageTitle);
	}

	public void clickTheRequirementsButton(){
		waitForElementVisibility(requirementsAdminButton);
		click(requirementsAdminButton);
	}

	public void clickTheQuestionnaireButton(){
		waitForElementVisibility(questionnaireAdminButton);
		click(questionnaireAdminButton);
	}

	public void clickTheEndsUpInStateButton(){
		waitForElementVisibility(endsUpInStateAdminButton);
		click(endsUpInStateAdminButton);
	}
	
	
	public void auditLogsSidebarButton(){
		waitForElementVisibility(auditLogsSidebarButton);
		click(auditLogsSidebarButton);
	}
	
	public void isLogsPageOpened(){
		waitForElementVisibility(logsPageHeaderTitle);
	}
	
	public void clickRequirementsViewButton(){
		waitForElementVisibility(requirementsViewSidebarButton);
		click(requirementsViewSidebarButton);
	}

	public void clickTheResearchSidebarButton(){
		waitForElementVisibility(researchSidebarButton);
		click(researchSidebarButton);
	}

	public void clickTheRequirementsViewSidebarButton(){
		waitForElementVisibility(requirementsViewSidebarButton);
		click(requirementsViewSidebarButton);
	}

	public void clickTheNotificationsSidebarButton(){
		waitForElementVisibility(notificationsSidebarButton);
		click(notificationsSidebarButton);
	}

	public void clickTheEUIVersionsSidebarButton(){
		waitForElementVisibility(euiVersionsSidebarButton);
		click(euiVersionsSidebarButton);
	}
	
	public void verifyIntelligenceAdminChildOptions(){
		waitForElementVisibility(researchSidebarButton);
		waitForElementVisibility(auditLogsSidebarButton);
		waitForElementVisibility(requirementsViewSidebarButton);
		waitForElementVisibility(versionedRequirementsSidebarButton);
		waitForElementVisibility(activeRequirementsSidebarButton);
		waitForElementVisibility(notificationsSidebarButton);
		waitForElementVisibility(EUIVersionsSidebarButton);
		waitForElementVisibility(questionnaireVerionsSidebarButton);
		waitForElementVisibility(permissionsSidebarButton);
	}

	public void clickTheQuestionnaireVersionsSidebarButton(){
		waitForElementVisibility(questionnaireVersionsSidebarButton);
		click(questionnaireVersionsSidebarButton);
	}

	public void clickSurveillanceIntelligenceCollapseButton(){
		waitForElementVisibility(surveillanceIntelligenceSidebarButton);
		click(surveillanceIntelligenceSidebarButton);
	}
	
	public void isRequirementViewPageOpened(){
		waitForElementVisibility(requirementAdminPageHeader);
	}
	
	public void clickVersionRequirement(){
		waitForElementVisibility(versionedRequirementsSidebarButton);
		click(versionedRequirementsSidebarButton);
	}
	
	public void isversionRequirementsPageOpened(){
		waitForElementVisibility(versionRequirementsPageHeader);
	}
	
	public void clickActiveRequirementsButton(){
		waitForElementVisibility(activeRequirementsSidebarButton);
		click(activeRequirementsSidebarButton);
	}
	
	public void isactiveRequirementsPageOpened(){
		waitForElementVisibility(activeRequirementsPageHeader);
	}
	
	public void clickNotificationsButton(){
		waitForElementVisibility(notificationsSidebarButton);
		click(notificationsSidebarButton);
	}
	
	public void isnotificationsPageOpened(){
		waitForElementVisibility(notificationsPageHeader);
	}
	
	public void clickEUIVersionsButton(){
		waitForElementVisibility(EUIVersionsSidebarButton);
		click(EUIVersionsSidebarButton);
	}
	
	public void isEuiVersionsPageOpened(){
		waitForElementVisibility(EUIVersionPageHeader);
	}
	
	public void clickQuestionnaireVersionsButton(){
		waitForElementVisibility(questionnaireVerionsSidebarButton);
		click(questionnaireVerionsSidebarButton);
	}
	
	public void clickPermissionsButton(){
		waitForElementVisibility(permissionsSidebarButton);
		click(permissionsSidebarButton);
	}
	
	public void isPermissionsPageOpened(){
		waitForElementVisibility(permissionsPageHeader);
	}
}
