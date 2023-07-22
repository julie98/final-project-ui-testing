package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BoardPage extends BasePage{
    public WebDriver driver = getDriver();
    private WebDriverWait wait = new WebDriverWait(driver, 10);
    @FindBy(id = "board-tools-section-button")
    public WebElement boardToolsButton;
    @FindBy(css = "aui-item-link[class='js-view-action-create'] a[role='menuitem']")
    public WebElement createBoardButton;

    @FindBy(xpath = "//button[normalize-space()='Next']")
    public WebElement boardNextButton;

    @FindBy(css = "label[for='ghx-wizard-method-existing-project']")
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
        wait.until(ExpectedConditions.elementToBeClickable(issue));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(issue, inProgressBox).build().perform();
    }

    public void moveIssueToDone(){
        wait.until(ExpectedConditions.elementToBeClickable(issue));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(issue, doneBox).build().perform();
    }

    public void clickBoardToolsButton(){
        wait.until(ExpectedConditions.elementToBeClickable(boardToolsButton));
        boardToolsButton.click();
    }

    public void clickCreateBoardButton(){
        wait.until(ExpectedConditions.elementToBeClickable(createBoardButton));
        createBoardButton.click();
    }

    public void clickScrumButton(){
        scrumButton.click();
    }

    public void clickBoardNextButton(){
        wait.until(ExpectedConditions.elementToBeClickable(boardNextButton));
        boardNextButton.click();
    }

    public void clickExistingProjectButton(){
        wait.until(ExpectedConditions.elementToBeClickable(existingProjectButton));
        Actions actions = new Actions(driver);
        actions.moveToElement(existingProjectButton).click().build().perform();
        existingProjectButton.click();
    }

    public void enterBoardName(String name){
        boardName.sendKeys(name);
    }

    public void clickCreateBoard(){
        wait.until(ExpectedConditions.elementToBeClickable(createBoard));
        createBoard.click();
    }


}
