package pageObjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ProjectPage extends BasePage {
    public WebDriver driver = getDriver();

    @FindBy(id ="create-menu")
    private WebElement createIssue;

    @FindBy(id ="customfield_10104")
    private WebElement epicName;

    @FindBy(id = "summary")
    private WebElement issueSummary;

    @FindBy(id = "mce_0_ifr")
    private WebElement issueFrame;

    @FindBy(id = "tinymce")
    private WebElement issueDescription;

    @FindBy(id = "create-issue-submit")
    private WebElement createIssueButton;

   @FindBy(xpath = "//a[@class='aui-nav-item ' and @data-label='Issues']")
    private WebElement issues;

   @FindBy(id = "opsbar-transitions_more")
    private WebElement issueStatus;

   @FindBy(xpath = "//aui-item-link[@id='action_id_11']//div[@class='transition-label']//div[1]")
    private WebElement todo;

   @FindBy(xpath = "//aui-item-link[@id='action_id_21']//div[@class='transition-label']//div[1]")
    private WebElement inProgress;

   @FindBy(xpath = "//aui-item-link[@id='action_id_31']//div[@class='transition-label']//div[1]")
    private WebElement done;

    public void clickCreateIssue() {
        Actions actions = new Actions(driver);
        actions.moveToElement(createIssue).click().perform();
    }

    public void enterEpicName(String epicname) {
        epicName.sendKeys(epicname);
    }

    public void enterIssueSummary(String summary) {
        issueSummary.sendKeys(summary);
    }

    public void enterIssueDescription(String description) {
        driver.switchTo().frame(issueFrame);
        issueDescription.sendKeys(description);
        driver.switchTo().defaultContent();
    }

    public void clickCreateIssueButton() {
        createIssueButton.click();
    }

    public void clickIssues() {
        issues.click();
    }

    public void clickIssueStatus() {
        issueStatus.click();
    }

    public void clickTodo() {
        todo.click();
    }

    public void clickInProgress() {
        inProgress.click();
    }

    public void clickDone() {
        done.click();
    }




}
