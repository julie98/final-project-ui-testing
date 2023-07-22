package stepDefinitions;

import drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;

import static org.testng.AssertJUnit.assertEquals;

public class DashBoardSteps {
    private WebDriver driver = DriverFactory.getDriver();
    private DashboardPage dashboardPage;
    private LoginPage loginPage;


    public DashBoardSteps() {
        dashboardPage = new DashboardPage();
        loginPage = new LoginPage();
    }

    @Given("I Login to the application")
    public void iLoginToTheApplication() throws InterruptedException {
        driver.navigate().to("http://localhost:8080/login.jsp");
        loginPage.enterUsername("admin");
        loginPage.enterPassword("12345");
        loginPage.clickLoginButton();
    }

    @When("Create a new project")
    public void createANewProject() throws InterruptedException {
        Thread.sleep(1000);
        dashboardPage.clickDropdownMenu();
        dashboardPage.clickCreateProject();
        dashboardPage.clickScrumProject();
        dashboardPage.clickSelectButton();
        dashboardPage.enterProjectName("My Project");
        Thread.sleep(2000);
        dashboardPage.clickSubmitButton();
    }

    @Then("Verify the project is created successfully")
    public void verifyTheProjectIsCreatedSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        assertEquals(dashboardPage.getBoardName(), "MP board");
    }


}
