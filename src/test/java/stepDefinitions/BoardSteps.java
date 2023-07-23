package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BoardPage;
import pageObjects.DashboardPage;
import pageObjects.ProjectPage;
import pageObjects.SprintPage;

public class BoardSteps {
    private ProjectPage projectPage;
    private DashboardPage dashboardPage;
    private BoardPage boardPage;

    private SprintPage sprintPage;

    public BoardSteps() {
        projectPage = new ProjectPage();
        dashboardPage = new DashboardPage();
        boardPage = new BoardPage();
        sprintPage = new SprintPage();
    }
    @When("I click current project button")
    public void iClickCurrentProjectButton() {
        dashboardPage.clickDropdownMenu();
        projectPage.clickCurrentProject();
    }

    @Then("I should able to create new board")
    public void iShouldAbleToCreateNewBoard() {
       boardPage.clickBoardToolsButton();
       boardPage.clickCreateBoardButton();
       boardPage.clickScrumButton();
       boardPage.clickExistingProjectButton();
       boardPage.clickBoardNextButton();
       boardPage.enterBoardName("My Board");
       boardPage.clickCreateBoard();
    }

    @And("I should able to create new sprint")
    public void iShouldAbleToCreateNewSprint() throws InterruptedException {
        Thread.sleep(2000);
        sprintPage.clickBacklogButton();
        sprintPage.clickCreateSprintButton();
        sprintPage.enterSprintName("Test Sprint");
        sprintPage.enterSprintGoal("Test Sprint Goal");
        sprintPage.finishCreating();
        sprintPage.moveIssueToContainer();
        sprintPage.clickStartSprintButton();
        sprintPage.clickStartButton();
        Thread.sleep(10000);
    }

    @And("I can see the active sprint I can switch issue in the column")
    public void activeSprintBoard() throws InterruptedException {
        Thread.sleep(2000);
        boardPage.moveIssueToInProgress();
        Thread.sleep(5000);
        boardPage.moveIssueToDone();
    }


}
