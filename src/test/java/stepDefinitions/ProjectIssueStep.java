package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ProjectPage;

public class ProjectIssueStep {

    private ProjectPage projectPage;

    public ProjectIssueStep() {
        projectPage = new ProjectPage();
    }
    @When("I click create issue button")
    public void iClickCreateIssueButton() {
        projectPage.clickCreateIssue();
    }

    @Then("I should able to create Epic issue with the workflow")
    public void iShouldAbleToCreateIssue() {
        projectPage.setIssueType("Epic");
        projectPage.enterEpicName("My Epic");
        projectPage.enterIssueSummary("First Epic");
        //projectPage.enterIssueDescription("First Epic description");
        projectPage.clickCreateIssueButton();
    }

    @Then("I should able to create Story issue with the workflow")
    public void iShouldAbleToCreateStoryIssue() throws InterruptedException {
        Thread.sleep(2000);
        projectPage.clickCreateIssue();
        projectPage.setIssueType("Story");
        Thread.sleep(5000);
        projectPage.enterIssueSummaryForStory("First Story");
        projectPage.clickCreateIssueButton();
    }



}
