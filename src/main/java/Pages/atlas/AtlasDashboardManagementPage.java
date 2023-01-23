package Pages.atlas;

import Constants.Constants;
import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class AtlasDashboardManagementPage extends PageTools {
	By dashboardGrid = By.xpath("//a[text()[contains(.,'Dashboard')]] | //a[@href='https://stagingatlas.pharma.solutions/Dashboard'] | //img[@src='https://stagingatlas.pharma.solutions/theme/build/images/Group 907_p.svg']");
	By surveillanceIntelligenceSidebarCollapse = By.xpath("//ul[@id='menu']/li[5]");
	By configurationSidebarButton = By.xpath("//ul[@id='menu']/li[5]/ul/li/a");
	By resultsSidebarButton = By.xpath("//ul[@id='menu']/li[5]/ul/li[2]/a");
	By intelligenceAdminSidebarCollapse = By.xpath("//ul[@id='menu']/li[10]");
	By researchSidebarButton = By.xpath("//ul[@id='menu']/li[10]/ul/li/a");
	By auditLogSidebarButton = By.xpath("//ul[@id='menu']/li[10]/ul/li[2]/a");
	By requirementsViewSidebarButton = By.xpath("//ul[@id='menu']/li[10]/ul/li[3]/a");
	By versionRequirementsSidebarButton = By.xpath("//ul[@id='menu']/li[10]/ul/li[4]/a");
	By activeRequirementsSidebarButton = By.xpath("//ul[@id='menu']/li[10]/ul/li[5]/a");
	By notificationsSidebarButton = By.xpath("//ul[@id='menu']/li[10]/ul/li[6]/a");
	By euiVersionsSidebarButton = By.xpath("//ul[@id='menu']/li[10]/ul/li[7]/a");
	By questionnaireVersionsButton = By.xpath("//ul[@id='menu']/li[10]/ul/li[8]/a");
	By permissionsSidebarButton = By.xpath("//ul[@id='menu']/li[10]/ul/li[9]/a");




	public void openLighthouse(){
		SelenideTools.openUrl(Constants.URL);
	}

	public void openAtlas(){
		SelenideTools.openUrl(Constants.ATLAS_URL);
	}

	public String getTabName() {
		return Selenide.title();
	}

	public boolean isDashboardPageOpened(){
		SelenideTools.sleep(2);
		return isElementVisible(dashboardGrid);
	}

	public void clickSurveillanceIntelligenceSidebarCollapseButton() {
		waitForElementVisibility(surveillanceIntelligenceSidebarCollapse);
		click(surveillanceIntelligenceSidebarCollapse);
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

	public void clickResearchAdminSidebarButton(){
		waitForElementVisibility(researchSidebarButton);
		click(researchSidebarButton);
	}

	public void clickRequirementsViewSidebarButton(){
		waitForElementVisibility(requirementsViewSidebarButton);
		click(requirementsViewSidebarButton);
	}

}
