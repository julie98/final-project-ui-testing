package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SprintReportPage extends BasePage{
    @FindBy(xpath = "//*[@id=\"subnav-trigger-report\"]")
    public WebElement switchReportButton;

    @FindBy(xpath = "//*[@id=\"subnav-opts-report\"]/div[1]/ul/li[8]/a")
    public WebElement velocityReport;

    public void clickSwitchReportButton(){
        switchReportButton.click();
    }

    public void clickVelocityReportButton(){
        velocityReport.click();
    }
}
