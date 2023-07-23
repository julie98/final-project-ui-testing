package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UserManagePage extends BasePage{
    @FindBy(xpath = "//*[@id=\"login-form-authenticatePassword\"]")
    public WebElement inputAdminPassword;
    @FindBy(xpath = "//*[@id=\"login-form-submit\"]")
    public WebElement button;

    public boolean checkNeedAdmin(){
        return inputAdminPassword != null && button != null;
    }
    public void sendPassword(String password){
        inputAdminPassword.sendKeys(password);
    }
    public void clickButton(){
        button.click();
    }

    @FindBy(xpath = "//*[@id=\"create_user\"]")
    public WebElement createUserButton;

    public void clickCreateButton(){
        createUserButton.click();
    }

    @FindBy(xpath = "//span[normalize-space()=\"sageDemo\"]/../../..//*[normalize-space()=\"Edit\"]")
    //another Xpath with ID://*[@id="edituser_link_123Demo"]
    public WebElement editButton;
    public void edit(){
        editButton.click();
    }

    @FindBy(xpath = "//*[@id=\"user-edit\"]/div[1]/fieldset/div/label")
    public WebElement checkBoxActive;
    public void changeActive(){
        checkBoxActive.click();
    }

    @FindBy(xpath = "//*[@id=\"user-edit-submit\"]")
    public WebElement userEditSubmit;
    public void setUserEditSubmit(){
        userEditSubmit.click();
    }
    @FindBy(xpath = "//*[@id=\"user-filter-user-filter-active\"]")
    public WebElement statusBox;
    public void changeStatus() throws InterruptedException {
        Thread.sleep(1000);
        Select select = new Select(statusBox);
        Thread.sleep(1000);
        select.selectByVisibleText("Inactive");
        Thread.sleep(1000);
    }

    @FindBy(xpath = "//*[@id=\"user-filter-submit\"]")
    public WebElement filterButton;

    public void startFilter(){
        filterButton.click();
    }

    public boolean checkUser(String username){
       return getDriver().getPageSource().contains(username);
    }

    @FindBy(xpath = "//*[@id=\"header-details-user-fullname\"]")
    public WebElement userFile;
    public void setUserFile(){
        userFile.click();
    }

    @FindBy(xpath = "//*[@id=\"log_out\"]")
    public WebElement logout;
    public void logout(){
        logout.click();
    }

    @FindBy(xpath = "//span[normalize-space()=\"George Zhu\"]/..")
    //some user need to be active//add it manually or set it to be active
    public WebElement user;
    public void clickUser(){
        user.click();
    }

    @FindBy(xpath = "//*[@id=\"user-filter-group-field\"]")
    public WebElement groupFilter;
    public void setGroupFilter() throws InterruptedException {
        WebElement pull = getDriver().findElement(By.xpath("//*[@id=\"user-filter-group-field\"]"));
        pull.click();
        Thread.sleep(1000);
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.ENTER).perform();
        //can only choose the first group or push the down key
    }
}
