package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends BasePage{
    @FindBy(xpath = "//*[@id=\"user-create-email\"]")
    private WebElement userEmailAddress;

    public void setUserEmailAddress(){
        userEmailAddress.sendKeys("sage@demo.com");
    }

    @FindBy(xpath = "//*[@id=\"user-create-fullname\"]")
    private WebElement fullName;

    public void setFullName(){
        fullName.sendKeys("sageDemo");
    }

    @FindBy(xpath = "//*[@id=\"user-create-username\"]")
    private WebElement userName;

    public void setUserName(){
        userName.sendKeys("sageDemo");
    }

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement password;

    public void setPassword(){
        password.sendKeys("123456Demo");
    }

    @FindBy(xpath = "//*[@id=\"user-create-submit\"]")
    private WebElement createButton;

    public void clickCreateButton(){
        createButton.click();
    }
}
