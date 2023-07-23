package stepDefinitions;

import constants.URL;
import drivers.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import pageObjects.AddUserPage;
import pageObjects.UserManagePage;
import pageObjects.ViewUserPage;

import static org.testng.Assert.assertNotEquals;

public class UserSteps {
    private UserManagePage userManagePage;
    private AddUserPage addUserPage;
    private ViewUserPage viewUserPage;

    @And("click user management")
    public void clickUserManagement(){
        DriverFactory.getDriver().navigate().to(URL.UserManage.toString());
        userManagePage=new UserManagePage();
    }
    @And("acquire admin authority with {string}")
    public void acquireAdminAuthority(String password) {
        try {
            userManagePage.sendPassword(password);
            userManagePage.clickButton();
        }catch (NoSuchElementException e){
            System.out.println("no need for authentication");
        }

    }

    @And("at user browser page")
    public void atUserBrowserPage() {
        userManagePage.clickCreateButton();
    }

    @And("Create user")
    public void createUser() {
        addUserPage=new AddUserPage();
        addUserPage.setUserEmailAddress();
        addUserPage.setFullName();
        addUserPage.setUserName();
        addUserPage.setPassword();
        addUserPage.clickCreateButton();
        //xpath: //span[normalize-space()="123Demo"]
    }


    @And("edit user to inactive")
    public void editUserToActive() {
        userManagePage.edit();
        userManagePage.changeActive();
        userManagePage.setUserEditSubmit();
    }

    @And("apply User inacitve filter")
    public void applyUserInacitveFilter() throws InterruptedException {
        userManagePage.changeStatus();
    }

    @Then("I can find the user with username {string}")
    public void iCanFindTheUserWithUsername(String username) {
        userManagePage.startFilter();
        Assert.assertTrue(userManagePage.checkUser(username));
    }

    @And("logout")
    public void logout() {
        userManagePage.setUserFile();
        userManagePage.logout();
    }

    @Then("login failed")
    public void loginFailed() {
        assertNotEquals(DriverFactory.getDriver().getCurrentUrl(),
                URL.Dashboard.toString());

    }

    @When("I choose user")
    public void iChooseUserWithUsername() {
    //assume name is sageDemo, I dont know how to find the xpath with a string value
        userManagePage.clickUser();
    }

    @And("click manage groups")
    public void clickManageGroups() {
        viewUserPage=new ViewUserPage();
        viewUserPage.setManageButton();
    }

    @And("type groups and add group")
    public void typeGroupsAndAddGroup() throws InterruptedException {
        viewUserPage.setInputGroupName();
        viewUserPage.setJoinSelectGroupButton();
    }
}
