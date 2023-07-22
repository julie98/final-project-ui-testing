package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkflowSchemePage extends BasePage{

    private WebDriver driver = getDriver();

    @FindBy(xpath = "//a[@id='workflow_schemes']")
    private WebElement workflowSchemes;

    @FindBy(xpath = "//button[@id='add-workflow-dropdown-trigger']")
    private WebElement addWorkflowScheme;

    @FindBy(xpath = "//a[@id='add-workflow']")
    private WebElement assignWorkflowScheme;

    @FindBy(xpath = "//button[@id='add-workflow-next']")
    private WebElement nextButton;

    @FindBy(xpath = "//input[@id='project-config-select-all-issue-types']")
    private WebElement selectAllIssueTypes;

    @FindBy(xpath = "//button[@id='assign-issue-types-submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//a[@id='publish-draft']")
    private WebElement publishDraft;

    @FindBy(xpath = "//input[@id='workflow-mapping-submit']")
    private WebElement submitWorkflowAssociate;


    public void clickWorkflowSchemes() {
        workflowSchemes.click();
    }

    public void clickEditWorkflowScheme(String projectName) {
        this.driver.findElement(By.xpath("//td[contains(.,'" + projectName + "')]/following-sibling::td[contains(@class, 'workflow-scheme-operations')]/ul/li[1]/a"))
                .click();
    }

    public void clickAddWorkflowScheme() {
        addWorkflowScheme.click();
    }

    public void clickAssignWorkflowScheme() {
        assignWorkflowScheme.click();
    }

    public void pickWorkflowScheme(String workflowName) {
        this.driver.findElement(By.xpath("//li[@data-workflowname='" + workflowName + "']"))
                .click();
    }

    public void clickNextButton() {
        nextButton.click();
    }

    public void clickSelectAllIssueTypes() {
        selectAllIssueTypes.click();
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void clickPublishDraft() {
        publishDraft.click();
    }

    public void clickSubmitWorkflowAssociate() {
        submitWorkflowAssociate.click();
    }





}
