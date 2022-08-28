package Helpers;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
    private WebDriver driver;
    public PageBase(WebDriver webdriver){
        this.driver=webdriver;
        PageFactory.initElements(driver,this);
    }
    public static int Duration = 30 ;

    public void waitForElementVisibility(WebElement element){
        WebDriverWait Wait = new WebDriverWait(driver , Duration);
        Wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void clickOnElement(WebElement element){
        waitForElementVisibility(element);
        element.click();
    }
    public void fillTextField(WebElement element , String value){
        waitForElementVisibility(element);
        element.sendKeys(value);
    }
    public void selectElementFromList(WebElement element , String value ){
        waitForElementVisibility(element);
        element.click();
        for(int i=1;i<=10;i++){
            element.sendKeys(Keys.DOWN);
            String listValue = element.getText();
            if (value == listValue) {
                element.sendKeys(Keys.ENTER);
                break;
            }
        }
        }
        //Select dropdownMenu = new Select(element);
        //dropdownMenu.selectByVisibleText(Value);

}
