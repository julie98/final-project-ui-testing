package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProjectSettingPage extends BasePage{

    public WebDriver driver = getDriver();

    public Actions actions = new Actions(driver);

    @FindBy(xpath = "//a[@class='aui-button aui-button-subtle aui-sidebar-settings-button']")
    private WebElement projectSetting;

    @FindBy(id = "view_project_roles")
    private WebElement projectRole;

    @FindBy(xpath = "//span[contains(text(),'Add users to a role')]")
    private WebElement addUserToRole;

    @FindBy(xpath = "//div[contains(text(),'Search by name or email')]")
    private WebElement searchUser;

    @FindBy(xpath = "//div[contains(text(),'Choose a role')]")
    private WebElement chooseRole;

    @FindBy(xpath = "//span[@class='css-t5emrf'][normalize-space()='Add']")
    private WebElement addButton;

    public void clickProjectSetting() {
        projectSetting.click();
    }

    public void clickProjectRole() {
        projectRole.click();
    }

    public void clickAddUserToRole() {
        addUserToRole.click();
    }

    public void clickSearchUser(String username) {
        actions.moveToElement(searchUser).click().sendKeys(username).perform();
    }

    public void clickChooseRole(String roleName) {
        actions.moveToElement(chooseRole).click().sendKeys(roleName).perform();
    }

    public void clickAddButton() {
        addButton.click();
    }
}
