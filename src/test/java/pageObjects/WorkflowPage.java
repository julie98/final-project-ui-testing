package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkflowPage extends BasePage{

    public WebDriver driver = getDriver();

    private WebDriverWait wait = new WebDriverWait(driver, 10);

    @FindBy(xpath = "//span[@class='aui-icon aui-icon-small aui-iconfont-configure']")
    private WebElement administration;

    @FindBy(id = "admin_issues_menu")
    private WebElement issues;

    @FindBy(id = "workflows")
    private WebElement workflows;

    @FindBy(id = "add-workflow")
    private WebElement addWorkflow;

    @FindBy(id = "add-workflow-newWorkflowName")
    private WebElement workflowName;

    @FindBy(id = "add-workflow-description")
    private WebElement workflowDescription;

    @FindBy(id = "add-workflow-submit")
    private WebElement addWorkflowSubmit;

    @FindBy(css = ".aui-button.add-status")
    private WebElement addStatus;

    @FindBy(css = "#status-name-field")
    private WebElement statusName;

    @FindBy(css = "input[value='Add']")
    private WebElement addStatusSubmit;

    @FindBy(css = ".aui-button.add-transition")
    private WebElement addTransition;

    @FindBy(xpath = "//div[@id='new-transition-pane']//div//input[@id='transition-source-step-id-field']")
    private WebElement transitionSourceStep;

    @FindBy(xpath = "//div[@id='new-transition-pane']//div//input[@id='transition-target-step-id-field']")
    private WebElement transitionTargetStep;

    @FindBy(id = "transition-name")
    private WebElement transitionName;

    @FindBy(css = "input[class='aui-button aui-button aui-button-primary']")
    private WebElement addTransitionSubmit;

    @FindBy(css = "label[for='create-global-transition-add']")
    private WebElement checkbox;

    @FindBy(xpath = "//label[normalize-space()='Allow all statuses to transition to this one']")
    private WebElement checkboxSidebar;

    @FindBy(id = "proj-config-return-link")
    private WebElement returnProjectButton;

    public void clickAdministration() {
        administration.click();
    }

    public void clickIssues() {
        issues.click();
    }

    public void clickWorkflows() {
        workflows.click();
    }

    public void clickAddWorkflow() {
        addWorkflow.click();
    }

    public void enterWorkflowName(String name) {
        workflowName.sendKeys(name);
    }

    public void enterWorkflowDescription(String description) {
        workflowDescription.sendKeys(description);
    }

    public void clickAddWorkflowSubmit() {
        addWorkflowSubmit.click();
    }

    public void clickAddStatus() {
        addStatus.click();
    }

    public void enterStatusName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(statusName));
        statusName.clear();
        statusName.sendKeys(name);
        statusName.sendKeys(Keys.ENTER);
    }

    public void clickCheckbox() {
        Actions actions = new Actions(driver);
        actions.moveToElement(checkbox).click().perform();
    }

    public void clickAddStatusSubmit() {
        addStatusSubmit.click();
    }

    public void clickCheckboxSidebar() {
        Actions actions = new Actions(driver);
        actions.moveToElement(checkboxSidebar).click().perform();
    }

    public void clickAddTransition() {
        wait.until(ExpectedConditions.elementToBeClickable(addTransition));
        addTransition.click();
    }

    public void enterTransitionSourceStep(String sourceStep) {
        wait.until(ExpectedConditions.elementToBeClickable(transitionSourceStep));
        transitionSourceStep.sendKeys(Keys.CONTROL + "a");
        transitionSourceStep.sendKeys("");
        transitionSourceStep.sendKeys(sourceStep);
        transitionSourceStep.sendKeys(Keys.ENTER);
    }

    public void enterTransitionTargetStep(String targetStep) {
        wait.until(ExpectedConditions.elementToBeClickable(transitionTargetStep));
        transitionTargetStep.sendKeys(Keys.CONTROL + "a");
        transitionTargetStep.sendKeys("");
        transitionTargetStep.sendKeys(targetStep);
        transitionTargetStep.sendKeys(Keys.ENTER);
    }

    public void enterTransitionName(String name) {
        transitionName.sendKeys(name);
    }

    public void clickAddTransitionSubmit() {
        addTransitionSubmit.click();
    }

    public void clickReturnProjectButton() {
        wait.until(ExpectedConditions.elementToBeClickable(returnProjectButton));
        returnProjectButton.click();
    }
}
