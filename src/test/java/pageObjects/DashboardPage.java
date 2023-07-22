package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{
    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[1]/ul/li[2]")
    public WebElement projectButton;

    @FindBy(xpath = "//*[@id=\"admin_main_proj_link\"]")
    public WebElement listItem;



    public void clickProjectButton(){
        projectButton.click();
    }

    public void clickListItem(){
        listItem.click();
    }


}
