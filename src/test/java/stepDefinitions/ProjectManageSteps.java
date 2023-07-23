package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DashboardPage;
import pageObjects.ProjectPage;
import pageObjects.ProjectSettingPage;

public class ProjectManageSteps {

    private ProjectPage projectPage;

    private ProjectSettingPage projectSettingPage;
    public ProjectManageSteps() {
        projectPage = new ProjectPage();
        projectSettingPage = new ProjectSettingPage();
    }

    @When("I click issue icon")
    public void iClickIssueIcon() {
        projectPage.clickIssuesIcon();
    }

    @Then("I should able to change issue status")
    public void iShouldAbleToChangeIssueStatus() throws InterruptedException {
        Thread.sleep(2000);
        projectPage.clickIssueStatus();
        projectPage.clickInProgress();
    }

    @When("I click project setting button")
    public void iClickProjectSettingButton() {
        projectSettingPage.clickProjectSetting();
    }

    @Then("I should able to assign role to the project")
    public void iShouldAbleToAssignRoleToTheProject() throws InterruptedException {
        projectSettingPage.clickProjectRole();
        projectSettingPage.clickAddUserToRole();
        projectSettingPage.clickSearchUser("charlie");
        projectSettingPage.clickChooseRole("Fullstack");
        projectSettingPage.clickAddButton();
        Thread.sleep(2000);
    }


}
