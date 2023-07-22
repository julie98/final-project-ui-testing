package stepDefinitions;

import io.cucumber.java.en.When;
import pageObjects.DashboardPage;
import pageObjects.ProjectPage;

public class ProjectManageSteps {

    private ProjectPage projectPage;
    private DashboardPage dashboardPage;

    public ProjectManageSteps() {
        projectPage = new ProjectPage();
    }
    //@When("I click current project button")
    public void iClickCurrentProjectButton() {
        dashboardPage.clickDropdownMenu();
        projectPage.clickCurrentProject();
    }


}
