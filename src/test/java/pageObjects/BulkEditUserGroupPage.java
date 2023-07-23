package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BulkEditUserGroupPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"usersToAssignStr\"]")
    public WebElement memberInput;
    public void setMemberInput(){
        memberInput.sendKeys("george");//todo
    }

    @FindBy(xpath = "//*[@id=\"add-users-to-selected-groups\"]")
    public WebElement addUserButton;
    public void setAddUserButton(){
        addUserButton.click();
    }
}
