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

	public void clickTheQuestionnaireVersionsSidebarButton(){
		waitForElementVisibility(questionnaireVersionsSidebarButton);
		click(questionnaireVersionsSidebarButton);
	}


}
