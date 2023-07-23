package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectSettingPage extends BasePage{

    public WebDriver driver = getDriver();

    public WebDriverWait wait = new WebDriverWait(driver, 10);


    @FindBy(css = ".aui-button.aui-button-subtle.aui-sidebar-settings-button")
    private WebElement projectSetting;

    @FindBy(id = "view_project_roles")
    private WebElement projectRole;

    @FindBy(xpath = "//span[contains(text(),'Add users to a role')]")
    private WebElement addUserToRole;

    @FindBy(css = "div[class='multi-select css-2b097c-container'] div[class=' css-ypi1dq-placeholder']")
    private WebElement searchUser;

    @FindBy(css = "div[class=' css-2b097c-container'] div[class=' css-ypi1dq-placeholder']")
    private WebElement chooseRole;

    @FindBy(css = "button[type='submit'] span[class='css-t5emrf']")
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
        wait.until(ExpectedConditions.elementToBeClickable(searchUser));
       Actions actions = new Actions(driver);
        actions.moveToElement(searchUser).click().sendKeys(username ,Keys.ARROW_DOWN, Keys.ENTER).perform();
    }

    public void clickChooseRole(String roleName) {
        wait.until(ExpectedConditions.elementToBeClickable(chooseRole));
        Actions actions = new Actions(driver);
        actions.moveToElement(chooseRole).click().sendKeys(roleName ,Keys.ARROW_DOWN, Keys.ENTER).perform();
//        actions.moveToElement(chooseRole).click().perform();
//        searchUser.sendKeys(roleName);
//        searchUser.sendKeys(Keys.ENTER);
    }

    public void clickAddButton() {
        addButton.click();
    }
}
