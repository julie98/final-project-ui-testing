package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GroupBrowserPage extends BasePage{
    @FindBy(xpath = "//*[@id=\"add-group\"]/div[1]/div/div/div/input")
    public WebElement input;
    public void setInput(){
        input.sendKeys("group1");
    }
    @FindBy(xpath = "//*[@id=\"add-group\"]/div[2]/div/input")
    public WebElement addGroup;
    public void setAddGroup(){
        addGroup.click();
    }

    @FindBy(xpath = "//*[normalize-space()=\"group1\"]/..//*[normalize-space()=\"Edit members\"]")
    public WebElement edit;
    public void setEdit(){
        edit.click();
    }


}
