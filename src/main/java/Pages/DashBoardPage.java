package Pages;

import Helpers.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends PageBase {


    public DashBoardPage(WebDriver webdriver) {
        super(webdriver);
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")
    WebElement  leaveButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[7]/a")
    WebElement  assignLeaveButton;
    public void viewAssignLeavePage (){
        clickOnElement(leaveButton);
        clickOnElement(assignLeaveButton);
    }

}
