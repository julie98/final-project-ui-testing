package stepDefinitions;

import constants.URL;
import drivers.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

import static org.testng.Assert.assertEquals;

public class LoginSteps {
    private LoginPage loginPage;

    @Given("I visit the login page")
    public void iVisitTheLoginPage() {
        DriverFactory.getDriver().navigate().to(URL.Login.toString());
        loginPage = new LoginPage();
    }
//
    @When("I enter the username {string}")
    public void iEnterTheUsername(String username) {
        loginPage.enterUsername(username);
    }

    @And("I enter the password {string}")
    public void iEnterThePassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should be able to see the dashboard page")
    public void iShouldBeAbleToSeeTheDashboardPage() {
        assertEquals(DriverFactory.getDriver().getCurrentUrl(),
                URL.Dashboard.toString());
    }
}
