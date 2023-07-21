package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class WorkflowPage extends BasePage{

    public WebDriver driver = getDriver();

    @FindBy(xpath = "//span[normalize-space()='Administration']")
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

    @FindBy(xpath = "//button[@class='aui-button add-status']")
    private WebElement addStatus;

    @FindBy(xpath = "//input[@id='status-name-field']")
    private WebElement statusName;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement addStatusSubmit;

    @FindBy(xpath = "//button[@class='aui-button add-transition']")
    private WebElement addTransition;

    @FindBy(xpath = "//div[@id='new-transition-pane']//div//input[@id='transition-source-step-id-field']")
    private WebElement transitionSourceStep;

    @FindBy(xpath = "//div[@id='new-transition-pane']//div//input[@id='transition-target-step-id-field']")
    private WebElement transitionTargetStep;

    @FindBy(id = "transition-name")
    private WebElement transitionName;

    @FindBy(xpath = "//input[@class='aui-button aui-button aui-button-primary']")
    private WebElement addTransitionSubmit;

    @FindBy(xpath = "//label[normalize-space()='Allow all statuses to transition to this one']")
    private WebElement checkbox;

    @FindBy(xpath = "//label[normalize-space()='Allow all statuses to transition to this one']")
    private WebElement checkboxSidebar;

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
        addTransition.click();
    }

    public void enterTransitionSourceStep(String sourceStep) {
        transitionSourceStep.sendKeys(Keys.CONTROL + "a");
        transitionSourceStep.sendKeys("");
        transitionSourceStep.sendKeys(sourceStep);
        transitionSourceStep.sendKeys(Keys.ENTER);
    }

    public void enterTransitionTargetStep(String targetStep) {
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

}
