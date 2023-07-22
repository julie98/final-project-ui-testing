package stepDefinitions;

import constants.URL;
import drivers.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BoardPage;
import pageObjects.DashboardPage;
import pageObjects.SprintPage;
import pageObjects.SprintReportPage;

public class SprintSteps {
    private DashboardPage dashboardPage;
    private SprintPage sprintPage;
    private BoardPage boardPage;
    private SprintReportPage sprintReportPage;
    @Given("I visit the dashboard page")
    public void iVisitTheDashboardPage() {
        DriverFactory.getDriver().navigate().to(URL.Dashboard.toString());
        dashboardPage = new DashboardPage();
    }
    @When("I click the project button")
    public void iClickTheProjectButton() {
        dashboardPage.clickProjectButton();
    }

    @And("I click the project")
    public void iClickTheProject() {
        dashboardPage.clickListItem();
    }

    @Then("I am at the project page")
    public void iAmAtTheProjectPage() {
        sprintPage = new SprintPage();
    }


    @When("I click the backlog button")
    public void iClickTheBacklogButton() {
        sprintPage.clickBacklogButton();

    }

    @And("I click create sprint")
    public void iClickCreateSprint() {
        sprintPage.clickCreateSprintButton();
    }

    @And("I enter the sprint name {string}")
    public void iEnterTheSprintName(String name) {
        sprintPage.enterSprintName(name);
    }

    @And("I enter the goal of this sprint {string}")
    public void iEnterTheGoalOfThisSprint(String goal) {
        sprintPage.enterSprintGoal(goal);
    }

    @Then("I finish creating the sprint")
    public void iFinishCreatingTheSprint() {
        sprintPage.finishCreating();

    }

    @When("I drag the issue to the sprint")
    public void iDragTheIssueToTheSprint() {
        sprintPage.moveIssueToContainer();
    }

    @And("I start the sprint")
    public void iStartTheSprint() {
        sprintPage.clickStartSprintButton();
    }

    @Then("the sprint should be started")
    public void theSprintShouldBeStarted() {
        sprintPage.clickStartButton();
    }

    @Given("the scrum board page")
    public void theScrumBoardPage() {
        boardPage = new BoardPage();
    }

    @When("I click Complete sprint button")
    public void iClickCompleteSprintButton() {
        boardPage.clickCompleteButton();
    }

    @And("click Complete to confirm")
    public void clickCompleteToConfirm() {
        boardPage.clickConfirmButton();
    }

    @Then("the current sprint is closed and I can see the sprint report")
    public void theCurrentSprintIsClosedAndICanSeeTheSprintReport() {
        sprintReportPage = new SprintReportPage();
    }

    @When("I click switch report button")
    public void iClickSwitchReportButton() {
        sprintReportPage.clickSwitchReportButton();
    }

    @And("I click Velocity Report")
    public void iClickVelocityReport() {
        sprintReportPage.clickVelocityReportButton();
    }

    @Then("I can download velocity report")
    public void iCanDownloadVelocityReport() {
    }
}
