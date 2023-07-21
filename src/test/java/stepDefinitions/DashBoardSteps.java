package stepDefinitions;

import constants.URL;
import drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.*;

public class DashBoardSteps {
    private WebDriver driver = DriverFactory.getDriver();
    private DashboardPage dashboardPage;
    private LoginPage loginPage;
    private ProjectPage projectPage;

    private ProjectSettingPage projectSettingPage;

    private CreateProjectRolePage createProjectRolePage;
    private String projectName = "Test Project123";

    public DashBoardSteps() {
        dashboardPage = new DashboardPage();
        loginPage = new LoginPage();
        projectPage = new ProjectPage();
        createProjectRolePage = new CreateProjectRolePage();
        projectSettingPage = new ProjectSettingPage();
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
        dashboardPage.enterProjectName("Test Project123");
        dashboardPage.enterProjectKey("TP");
        dashboardPage.clickSubmitButton();

        Thread.sleep(2000);
        projectPage.clickCreateIssue();
        projectPage.enterEpicName("Test Epic123");
        projectPage.enterIssueSummary("Test Issuesummary 123");
        projectPage.enterIssueDescription("Test Issue Description 123");
        projectPage.clickCreateIssueButton();

        Thread.sleep(2000);
        createProjectRolePage.clickAdministrationButton();
        createProjectRolePage.clickSystemButton();
        createProjectRolePage.enterPassword("12345");
        createProjectRolePage.clickLoginButton();
        createProjectRolePage.clickProjectRoleBrowser();
        createProjectRolePage.enterRoleName("Test Role in selenium");
        createProjectRolePage.enterRoleDescription("Test Role Description in selenium");
        createProjectRolePage.clickRoleSubmitButton();
        createProjectRolePage.clickReturnProjectButton();

        Thread.sleep(2000);
        projectSettingPage.clickProjectRole();
        projectSettingPage.clickAddUserToRole();
        projectSettingPage.clickSearchUser("charlie");
        projectSettingPage.clickChooseRole("Fullstack");
        projectSettingPage.clickAddButton();




    }
}
