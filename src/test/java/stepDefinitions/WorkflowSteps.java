package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CreateProjectRolePage;
import pageObjects.ProjectPage;
import pageObjects.WorkflowPage;
import pageObjects.WorkflowSchemePage;

public class WorkflowSteps {

    private WorkflowPage workflowPage;
    private ProjectPage projectPage;

    private CreateProjectRolePage createProjectRolePage;

    private WorkflowSchemePage workflowSchemePage;

    public WorkflowSteps() {
        workflowPage = new WorkflowPage();
        projectPage = new ProjectPage();
        createProjectRolePage = new CreateProjectRolePage();
        workflowSchemePage = new WorkflowSchemePage();
    }

    @When("I click the admin button")
    public void iClickTheAdminButton() {
        workflowPage.clickAdministration();
    }

    @And("I click the issue button")
    public void iClickTheIssueButton() {
        workflowPage.clickIssues();
    }

    @And("I click the workflows")
    public void iClickTheWorkflows() {
        createProjectRolePage.enterPassword("12345");
        createProjectRolePage.clickLoginButton();
        workflowPage.clickWorkflows();
    }

    @And("I click the add workflow button")
    public void iClickTheAddWorkflowButton() {
        workflowPage.clickAddWorkflow();
    }

    @And("I enter the workflow name and description")
    public void iEnterTheWorkflowNameAndDescription() {
        workflowPage.enterWorkflowName("My Workflow");
        workflowPage.enterWorkflowDescription("My Workflow Description");
        workflowPage.clickAddWorkflowSubmit();
    }

    @Then("I should able to add all the status")
    public void iShouldAbleToCreateWorkflow() throws InterruptedException {
        workflowPage.clickAddStatus();
        workflowPage.enterStatusName("In Progress");
        Thread.sleep(2000);
        workflowPage.clickCheckbox();
        Thread.sleep(2000);
        workflowPage.clickAddStatusSubmit();
        Thread.sleep(1000);
        workflowPage.clickAddStatus();
        workflowPage.enterStatusName("Resolved");
        Thread.sleep(2000);
        workflowPage.clickAddStatusSubmit();
        Thread.sleep(1000);
        workflowPage.clickCheckboxSidebar();
        Thread.sleep(1000);
        workflowPage.clickAddStatus();
        workflowPage.enterStatusName("Closed");
        Thread.sleep(2000);
        workflowPage.clickAddStatusSubmit();
    }

    @And("I should able to add all the transitions")
    public void iShouldAbleToAddAllTheTransitions() throws InterruptedException {
        Thread.sleep(1000);
        workflowPage.clickAddTransition();
        workflowPage.enterTransitionSourceStep("Open");
        Thread.sleep(2000);
        workflowPage.enterTransitionTargetStep("In Progress");
        Thread.sleep(2000);
        workflowPage.enterTransitionName("Start Progress");
        workflowPage.clickAddTransitionSubmit();
        workflowPage.clickAddTransition();
        workflowPage.enterTransitionSourceStep("In Progress");
        Thread.sleep(2000);
        workflowPage.enterTransitionTargetStep("Resolved");
        Thread.sleep(2000);
        workflowPage.enterTransitionName("Resolve Issue");
        workflowPage.clickAddTransitionSubmit();
        workflowPage.clickAddTransition();
        workflowPage.enterTransitionSourceStep("Resolved");
        Thread.sleep(2000);
        workflowPage.enterTransitionTargetStep("Closed");
        Thread.sleep(2000);
        workflowPage.enterTransitionName("Close Issue");
        workflowPage.clickAddTransitionSubmit();
    }

    @When("I click the workflow scheme button")
    public void iClickTheWorkflowSchemeButton() {
        workflowSchemePage.clickWorkflowSchemes();
    }

    @Then("I should able to assign created workflow to the project")
    public void assignWorkflowScheme(){
        workflowSchemePage.clickEditWorkflowScheme("My Project");
        workflowSchemePage.clickAddWorkflowScheme();
        workflowSchemePage.clickAssignWorkflowScheme();
        workflowSchemePage.pickWorkflowScheme("My Workflow");
        workflowSchemePage.clickNextButton();
        workflowSchemePage.clickSelectAllIssueTypes();
        workflowSchemePage.clickSubmitButton();
        workflowSchemePage.clickPublishDraft();
        workflowSchemePage.clickSubmitWorkflowAssociate();
    }


}
