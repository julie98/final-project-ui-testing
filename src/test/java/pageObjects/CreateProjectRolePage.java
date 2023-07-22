package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateProjectRolePage extends BasePage {
    public WebDriver driver = getDriver();




    @FindBy(xpath = "//span[normalize-space()='Administration']")
    private WebElement administrationButton;

    @FindBy(id = "admin_system_menu")
    private WebElement systemButton;

    @FindBy(id = "login-form-authenticatePassword")
    private WebElement passwordField;

    @FindBy(id = "login-form-submit")
    private WebElement loginButton;

    @FindBy(id = "project_role_browser")
    private WebElement projectRoleBrowser;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement roleName;

    @FindBy(xpath = "//input[@name='description']")
    private WebElement roleDescription;

    @FindBy(id = "proj-config-return-link")
    private WebElement returnProjectButton;

    @FindBy(id = "role_submit")
    private WebElement roleSubmitButton;


    public void clickAdministrationButton() {
        administrationButton.click();
    }

    public void clickSystemButton() {
        systemButton.click();
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickProjectRoleBrowser() {
        projectRoleBrowser.click();
    }

    public void enterRoleName(String name) {
        roleName.sendKeys(name);
    }

    public void enterRoleDescription(String description) {
        roleDescription.sendKeys(description);
    }

    public void clickRoleSubmitButton() {
        roleSubmitButton.click();
    }

    public void clickReturnProjectButton() {
        returnProjectButton.click();
    }

    
}
