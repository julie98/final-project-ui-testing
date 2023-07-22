package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ProjectPage extends BasePage {
    public WebDriver driver = getDriver();
    private WebDriverWait wait = new WebDriverWait(driver, 10);

    @FindBy(id ="create-menu")
    private WebElement createIssue;

    @FindBy(id ="customfield_10104")
    private WebElement epicName;

    @FindBy(id = "summary")
    private WebElement issueSummary;

    @FindBy(css = "#summary")
    private WebElement issueSummaryForStory;

    @FindBy(id = "mce_0_ifr")
    private WebElement issueFrame;

    @FindBy(id = "tinymce")
    private WebElement issueDescription;

    @FindBy(id = "create-issue-submit")
    private WebElement createIssueButton;

   @FindBy(css = ".aui-icon.aui-icon-large.icon-sidebar-issues.aui-iconfont-issues")
    private WebElement issues;

   @FindBy(css = "a[id='opsbar-transitions_more'] span[class='dropdown-text']")
    private WebElement issueStatus;

   @FindBy(xpath = "//aui-item-link[@id='action_id_11']//div[@class='transition-label']//div[1]")
    private WebElement todo;

   @FindBy(xpath = "//aui-item-link[@id='action_id_21']//div[@class='transition-label']//div[1]")
    private WebElement inProgress;

   @FindBy(xpath = "//aui-item-link[@id='action_id_31']//div[@class='transition-label']//div[1]")
    private WebElement done;

   @FindBy(xpath = "//input[@id='issuetype-field']")
    private WebElement issueType;

   @FindBy(xpath = "//a[@id='admin_main_proj_link_lnk']")
    private WebElement currentProject;

   public void setIssueType(String type) {
       wait.until(ExpectedConditions.elementToBeClickable(issueType));
       issueType.sendKeys(Keys.CONTROL + "a");
       issueType.sendKeys("");
       issueType.sendKeys(type);
       issueType.sendKeys(Keys.ENTER);
   }
    public void clickCreateIssue() {
       wait.until(ExpectedConditions.elementToBeClickable(createIssue));
        Actions actions = new Actions(driver);
        actions.moveToElement(createIssue).click().perform();
    }

    public void enterEpicName(String epicname) {
         wait.until(ExpectedConditions.elementToBeClickable(epicName));
        epicName.sendKeys(epicname);
    }

    public void enterIssueSummary(String summary) {
       wait.until(ExpectedConditions.elementToBeClickable(issueSummary));
        issueSummary.sendKeys(summary);
    }

    public void enterIssueSummaryForStory(String summary) {
        wait.until(ExpectedConditions.elementToBeClickable(issueSummaryForStory));
         issueSummaryForStory.sendKeys(summary);
     }

    public void enterIssueDescription(String description) {
        driver.switchTo().frame(issueFrame);
        issueDescription.sendKeys(description);
        driver.switchTo().defaultContent();
    }

    public void clickCreateIssueButton() {
        createIssueButton.click();
    }

    public void clickIssuesIcon() {
       wait.until(ExpectedConditions.elementToBeClickable(issues));
        issues.click();
    }

    public void clickIssueStatus() {
       wait.until(ExpectedConditions.elementToBeClickable(issueStatus));
       issueStatus.click();
    }

    public void clickTodo() {
        todo.click();
    }

    public void clickInProgress() {
       wait.until(ExpectedConditions.elementToBeClickable(inProgress));
       inProgress.click();
    }

    public void clickDone() {
        done.click();
    }

    public void clickCurrentProject() {
        currentProject.click();
    }




}
