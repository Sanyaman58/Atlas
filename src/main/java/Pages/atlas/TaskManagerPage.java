package Pages.atlas;

import Utils.SelenideTools;
import base.PageTools;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.actions;

public class TaskManagerPage extends PageTools {
	By tasksTableRecords = By.xpath("//table[@id='tasks-list-main']/tbody/tr");
	By activeTask = By.xpath("//div[@id='tasks']//div[@class='scroll']/div");
	By taskStatusSelect = By.xpath("//select[@id='TaskStandingKey']");
	By saveTaskButton = By.xpath("//button[@id='task-save']");

	String status;

	public void clickGoToTaskButton(int index){
		waitForElementVisibility(tasksTableRecords);
		getElements(tasksTableRecords).get(index).findElement(By.xpath("./td[15]")).click();
	}

	public void doubleClickOnActiveTask(int index){
		waitForElementVisibility(activeTask);
		getElements(activeTask).get(index).doubleClick();
	}

	public void selectStatus(String status){
		waitForElementVisibility(taskStatusSelect);
		selectOption(status, taskStatusSelect);
		this.status = status;
	}

	public void clickSaveTaskButton(){
		waitForElementVisibility(saveTaskButton);
		click(saveTaskButton);
	}

	public boolean isStatusDisplayed(int index, String status){
		waitForElementVisibility(activeTask);
		return status.contains(getElements(activeTask).get(index).findElement(By.xpath("./div/div[1]/div[3]/p[2]")).getText());
	}
}
