package Pages;

import Helpers.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver webdriver) {
        super(webdriver);
    }

    @FindBy(xpath = "//input[@name=\"username\"]")
    WebElement adminUserName;
    @FindBy(xpath = "//input[@name=\"password\"]")
    WebElement adminPassword;
    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    WebElement loginButton;
    public void fillUserName (String value){
        fillTextField(adminUserName , value);
    }
    public void fillPassword(String value){
        fillTextField(adminPassword , value);
    }
    public void login (String userName , String password){
        fillUserName(userName);
        fillPassword(password);
        clickOnElement(loginButton);
    }

}
