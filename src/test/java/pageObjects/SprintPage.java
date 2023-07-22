package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SprintPage extends BasePage{
    @FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/nav/div/div[2]/ul/li[1]")
    public WebElement backlogButton;

    @FindBy(xpath = "//button[normalize-space()='Create sprint']")
    public WebElement createSprintButton;

    @FindBy(xpath = "//*[@id=\"ghx-sprint-name\"]")
    public WebElement sprintName;

    @FindBy(xpath = "//*[@id=\"sprint-goal\"]")
    public WebElement sprintGoal;

    @FindBy(xpath = "//*[@id=\"ghx-sprint-dialog\"]/footer/div/button[1]")
    public WebElement createButton;

    @FindBy(xpath = "//*[@id=\"ghx-content-group\"]/div[1]/div/div[2]/div[1]/div[2]")
    public WebElement issueContainer;

    @FindBy(xpath = "(//div[@class='ghx-issue-content'])[1]")
    public WebElement issue;

    @FindBy(xpath = "//button[normalize-space()='Start sprint']")
    public WebElement startSprintButton;

    @FindBy(xpath = "//*[@id=\"ghx-sprint-dialog\"]/footer/div/button[1]")
    public WebElement startButton;


    public void clickBacklogButton(){
        backlogButton.click();
    }

    public void clickCreateSprintButton(){
        createSprintButton.click();
    }

    public void enterSprintName(String name){
        sprintName.sendKeys(name);
    }

    public void enterSprintGoal(String goal){
        sprintGoal.sendKeys(goal);
    }

    public void finishCreating(){
        createButton.click();
    }

    public void moveIssueToContainer(){
        Actions actions = new Actions(getDriver());
        actions.dragAndDrop(issue, issueContainer).build().perform();
    }

    public void clickStartSprintButton(){
        startSprintButton.click();
    }

    public void clickStartButton(){
        startButton.click();
    }
}
