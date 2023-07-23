package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ViewUserPage extends BasePage{
    @FindBy(xpath = "//*[@id=\"editgroups_link\"]")
    public WebElement manageButton;
    public void setManageButton(){
        manageButton.click();
    }

    @FindBy(xpath = "//*[@id=\"groupsToJoin-textarea\"]")
    public WebElement inputGroupName;
    public void setInputGroupName(){
        //should set it before
        inputGroupName.sendKeys("group-Yusheng"); // todo
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

    }
    @FindBy(xpath = "//*[@id=\"jira\"]/div[6]//div[normalize-space()=\"group-Yusheng\"]/../../..")
    public WebElement chooseGroup;
    public void setChooseGroup(){
        chooseGroup.click();
    }

    @FindBy(xpath = "//*[@id=\"user-edit-groups-join\"]")
    public WebElement joinSelectGroupButton;
    public void setJoinSelectGroupButton(){
        joinSelectGroupButton.click();
    }

}
