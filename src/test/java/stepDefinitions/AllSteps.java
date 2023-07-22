package stepDefinitions;

import constants.URL;
import drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.*;

public class AllSteps {
    private WebDriver driver = DriverFactory.getDriver();
    private DashboardPage dashboardPage;
    private LoginPage loginPage;
    private ProjectPage projectPage;
    private ProjectSettingPage projectSettingPage;
    private CreateProjectRolePage createProjectRolePage;
    private WorkflowPage workflowPage;
    private WorkflowSchemePage workflowSchemePage;

    private BoardPage boardPage;

    private SprintPage sprintPage;
    private String projectName = "Test";

    public AllSteps() {
        dashboardPage = new DashboardPage();
        loginPage = new LoginPage();
        projectPage = new ProjectPage();
        createProjectRolePage = new CreateProjectRolePage();
        projectSettingPage = new ProjectSettingPage();
        workflowPage = new WorkflowPage();
        workflowSchemePage = new WorkflowSchemePage();
        sprintPage = new SprintPage();
        boardPage = new BoardPage();
    }
    @Test
    public void iVisitTheLoginPage() throws InterruptedException {
        DriverFactory.getDriver().navigate().to(URL.Login.toString());;
        loginPage.enterUsername("admin");
        loginPage.enterPassword("12345");
        loginPage.clickLoginButton();

        dashboardPage.clickDropdownMenu();
        dashboardPage.clickCreateProject();
        dashboardPage.clickScrumProject();
        dashboardPage.clickSelectButton();
        dashboardPage.enterProjectName(projectName);
        //dashboardPage.enterProjectKey("SP1");
        dashboardPage.clickSubmitButton();

        //        createProjectRolePage.clickAdministrationButton();
//        createProjectRolePage.clickSystemButton();
//        createProjectRolePage.enterPassword("12345");
//        createProjectRolePage.clickLoginButton();
//        createProjectRolePage.clickProjectRoleBrowser();
//        createProjectRolePage.enterRoleName("Test Role in selenium");
//        createProjectRolePage.enterRoleDescription("Test Role Description in selenium");
//        createProjectRolePage.clickRoleSubmitButton();
//        createProjectRolePage.clickReturnProjectButton();

//        projectSettingPage.clickProjectSetting();
//        projectSettingPage.clickProjectRole();
//        projectSettingPage.clickAddUserToRole();
//        projectSettingPage.clickSearchUser("charlie");
//        Thread.sleep(5000);
//        projectSettingPage.clickChooseRole("Fullstack");
//        projectSettingPage.clickAddButton();
//
//        Thread.sleep(2000);
//        projectPage.clickCreateIssue();
//        projectPage.setIssueType("Epic");
//        projectPage.enterEpicName("Test Epic123");
//        projectPage.enterIssueSummary("Test Issuesummary 123");
//        projectPage.enterIssueDescription("Test Issue Description 123");
//        projectPage.clickCreateIssueButton();
//        projectPage.clickIssues();
//
//

        workflowPage.clickAdministration();
        workflowPage.clickIssues();
        createProjectRolePage.enterPassword("12345");
        createProjectRolePage.clickLoginButton();
        workflowPage.clickWorkflows();
        workflowPage.clickAddWorkflow();
        workflowPage.enterWorkflowName("Testwfwithselenium");
        workflowPage.enterWorkflowDescription("Testwfwithselenium");
        workflowPage.clickAddWorkflowSubmit();
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

//        workflowPage.clickAdministration();
//        workflowPage.clickIssues();
//        createProjectRolePage.enterPassword("12345");
//        createProjectRolePage.clickLoginButton();
//        workflowSchemePage.clickWorkflowSchemes();
//        workflowSchemePage.clickEditWorkflowScheme(projectName);
//        workflowSchemePage.clickAddWorkflowScheme();
//        workflowSchemePage.clickAssignWorkflowScheme();
//        workflowSchemePage.pickWorkflowScheme("Testwfwithselenium");
//        workflowSchemePage.clickNextButton();
//        workflowSchemePage.clickSelectAllIssueTypes();
//        workflowSchemePage.clickSubmitButton();
//        workflowSchemePage.clickPublishDraft();
//        workflowSchemePage.clickSubmitWorkflowAssociate();

//        Thread.sleep(2000);
//        projectPage.clickCreateIssue();
//        projectPage.setIssueType("Story");
//        projectPage.enterIssueSummary("Test Issuesummary 123");
//        projectPage.clickCreateIssueButton();
//
//        Thread.sleep(2000);
//        sprintPage.clickBacklogButton();
//        sprintPage.clickCreateSprintButton();
//        sprintPage.enterSprintName("Test Sprint");
//        sprintPage.enterSprintGoal("Test Sprint Goal");
//        sprintPage.finishCreating();
//        sprintPage.moveIssueToContainer();
//        sprintPage.clickStartSprintButton();
//        sprintPage.clickStartButton();
//
//        Thread.sleep(2000);
//        boardPage.moveIssueToInProgress();
//        boardPage.moveIssueToDone();

        //        Thread.sleep(2000);










    }
}
