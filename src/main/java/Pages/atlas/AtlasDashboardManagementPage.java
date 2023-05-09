package Pages.atlas;

import Constants.Constants;
import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class AtlasDashboardManagementPage extends PageTools {
	By dashboardGrid = By.xpath(
			"//a[text()[contains(.,'Dashboard')]] | //a[@href='https://qa-atlas.lha.pharma.solutions/home'] | //img[@src='https://stagingatlas.pharma.solutions/theme/build/images/Group 907_p.svg']");
	By requirementsManagementCollapse = By.xpath("//ul[@id='menu']/li[4]");
	By requirementsSidebarButton = By.xpath("//ul[@id='menu']/li[4]/ul/li/a");
	By activitiesSidebarButton = By.xpath("(//ul[@id='menu']/li[4]/ul/li/a)[2]");
	By tasksSidebarButton = By.xpath("(//ul[@id='menu']/li[4]/ul/li/a)[3]");
	By surveillanceIntelligenceSidebarCollapse = By.xpath("//ul[@id='menu']/li[5]");
	By configurationSidebarButton = By.xpath("//ul[@id='menu']/li[5]/ul/li/a");
	By resultsSidebarButton = By.xpath("//ul[@id='menu']/li[5]/ul/li[2]/a");
	By intelligenceAdminSidebarCollapse = By.xpath("//ul[@id='menu']/li/a[contains(text(),'Intelligence Admin')]");
	By researchSidebarButton = By.xpath("//*[@id=\"menu\"]/li[10]/ul/li[1]/a");
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
	By companyProfileSidebarButton = By.xpath("//*[text()=\"Company Profile\"]");

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

	public void clickRequirementsManagementSidebarCollapseButton() {
		waitForElementVisibility(requirementsManagementCollapse);
		click(requirementsManagementCollapse);
	}

	public void clickRequirementsSidebarButton() {
		waitForElementVisibility(requirementsSidebarButton);
		click(requirementsSidebarButton);
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

	public void verifyReleaseNotes() {
		waitForElementVisibility(releaseNotesButton);
	}
	
	public void clickComanyProfileSidebarButton() {
		waitForElementVisibility(companyProfileSidebarButton);
		click(companyProfileSidebarButton);
	}

}
