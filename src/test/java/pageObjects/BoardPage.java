package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BoardPage extends BasePage{
    public WebDriver driver = getDriver();

    @FindBy(xpath = "//button[@id='board-tools-section-button']")
    public WebElement boardToolsButton;
    @FindBy(xpath = "//a[@role='menuitem'][normalize-space()='Create board']")
    public WebElement createBoardButton;

    @FindBy(xpath = "//button[normalize-space()='Next']")
    public WebElement boardNextButton;

    @FindBy(xpath = "//label[normalize-space()='Board from an existing project']")
    public WebElement existingProjectButton;

    @FindBy(xpath = "//input[@id='ghx-wizard-project-board-name']")
    public WebElement boardName;

    @FindBy(xpath = "//button[@id='ghx-wizard-methodology-scrum']")
    public WebElement scrumButton;

    @FindBy(xpath = "//button[normalize-space()='Create board']")
    public WebElement createBoard;

    @FindBy(xpath = "(//div[@class='ghx-issue-content'])[1]")
    public WebElement issue;

    @FindBy(xpath = "//div[@id='ghx-pool']//li[2]")
    public WebElement inProgressBox;

    @FindBy(xpath = "//div[@id='ghx-pool']//li[3]")
    public WebElement doneBox;


    @FindBy(xpath = "//span[@class='aui-icon aui-icon-large agile-icon-work aui-iconfont-board']")
    public WebElement boardButton;

    public void clickBoardButton(){
        boardButton.click();
    }

    public void moveIssueToInProgress(){
        Actions actions = new Actions(driver);
        actions.dragAndDrop(issue, inProgressBox).build().perform();
    }

    public void moveIssueToDone(){
        Actions actions = new Actions(driver);
        actions.dragAndDrop(issue, doneBox).build().perform();
    }

    public void clickBoardToolsButton(){
        boardToolsButton.click();
    }

    public void clickCreateBoardButton(){
        createBoardButton.click();
    }

    public void clickScrumButton(){
        scrumButton.click();
    }

    public void clickBoardNextButton(){
        boardNextButton.click();
    }

    public void clickExistingProjectButton(){
        existingProjectButton.click();
    }

    public void enterBoardName(String name){
        boardName.sendKeys(name);
    }

    public void clickCreateBoard(){
        createBoard.click();
    }


}
