package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    public WebDriver driver = getDriver();
    @FindBy(id = "browse_link")
    private WebElement dropdownMenu;

    @FindBy(id = "project_template_create_link_lnk")
    private WebElement createProject;

    @FindBy(xpath = "//div[@title='Scrum software development']")
    private WebElement scrumProject;

    @FindBy(xpath = "//button[normalize-space()='Select']")
    private WebElement selectButton;

    @FindBy(id = "name")
    private WebElement projectName;

    @FindBy(id = "key")
    private WebElement projectKey;

    @FindBy(id = "lead-field")
    private WebElement projectLead;

    @FindBy(xpath = "//button[normalize-space()='Submit']")
    private WebElement submitButton;

    public void clickDropdownMenu() {
        dropdownMenu.click();
    }

    public void clickCreateProject() {
        createProject.click();
    }

    public void clickScrumProject() {
        Actions actions = new Actions(driver);
        actions.moveToElement(scrumProject).doubleClick().perform();
    }

    public void clickSelectButton() {
        selectButton.click();
    }

    public void enterProjectName(String name) {
        projectName.sendKeys(name);
    }

    public void enterProjectKey(String key) {
        projectKey.sendKeys(key);
    }

    public void enterProjectLead(String lead) {
        projectLead.sendKeys(lead);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }
}
