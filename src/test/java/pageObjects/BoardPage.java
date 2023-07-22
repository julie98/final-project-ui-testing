package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoardPage extends BasePage{
    @FindBy(xpath = "//*[@id=\"ghx-modes-tools\"]/div[1]/span[2]")
    public WebElement completeSprintButton;

    @FindBy(xpath = "//*[@id=\"ghx-dialog-complete-sprint\"]/div/div[3]/button")
    public WebElement confirmButton;

    public void clickCompleteButton(){
        completeSprintButton.click();
    }

    public void clickConfirmButton(){
        confirmButton.click();
    }
}
