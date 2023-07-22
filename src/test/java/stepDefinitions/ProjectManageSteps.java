package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DashboardPage;
import pageObjects.ProjectPage;

public class ProjectManageSteps {

    private ProjectPage projectPage;


    public ProjectManageSteps() {
        projectPage = new ProjectPage();
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


}
