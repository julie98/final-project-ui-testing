package stepDefinitions;

import constants.URL;
import drivers.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.BulkEditUserGroupPage;
import pageObjects.GroupBrowserPage;
import pageObjects.UserManagePage;

public class GroupSteps {
    private GroupBrowserPage groupBrowserPage;
    private BulkEditUserGroupPage bulkEditUserGroupPage;
    private UserManagePage userManagePage;
    WebDriver driver= DriverFactory.getDriver();
    @Test
    @When("login as admin for group")
    public void loginAdminForGroup() {
        driver.navigate().to(URL.GroupBrowser.toString());
        groupBrowserPage = new GroupBrowserPage();

    }

    @And("create group")
    public void createGroup() throws InterruptedException {
        groupBrowserPage.setInput();
        groupBrowserPage.setAddGroup();
    }

    @And("add user {string} to group")
    public void addUserToGroup(String arg0) {
        groupBrowserPage.setEdit();
        bulkEditUserGroupPage=new BulkEditUserGroupPage();
        bulkEditUserGroupPage.setMemberInput();
        bulkEditUserGroupPage.setAddUserButton();
    }

    @Then("get user with group filter")
    public void getUserWithGroupFilter() throws InterruptedException {
        DriverFactory.getDriver().navigate().to(URL.UserManage.toString());
        userManagePage=new UserManagePage();
        userManagePage=new UserManagePage();
        userManagePage.setGroupFilter();
        userManagePage.startFilter();
    }


}
