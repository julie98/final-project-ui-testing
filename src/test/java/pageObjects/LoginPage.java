package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//input[@id='login-form-username']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@id='login-form-password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@id='login-form-submit']")
    public WebElement buttonLogin;

    public void enterUsername(String username) {
        inputUsername.sendKeys(username);
    }

    public void enterPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void clickLoginButton() {
        buttonLogin.click();
    }
}
