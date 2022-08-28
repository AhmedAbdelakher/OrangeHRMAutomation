package Pages;

import Helpers.PageBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssignLeavePage extends PageBase {

    public AssignLeavePage(WebDriver webdriver) {
        super(webdriver);
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div/input")
    WebElement employeeName;
    @FindBy(xpath = "//*[text ()= 'John  Smith']")
    WebElement johnSmith ;
    @FindBy(className = "oxd-select-text-input")
    WebElement leaveType;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div/input")
    WebElement fromDate;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/div/div/input")
    WebElement toDate ;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[1]/div/div[2]/div/div/div[1]")
    WebElement partialDays;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/div/div[2]/div/div/div[1]")
    WebElement startDays;
    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[3]/div/div[2]/div/div/input")
    WebElement from;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[4]/div/div[2]/div/div/input")
    WebElement to;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[5]/div/div[2]/p")
    public WebElement duration;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div/div/div[2]/textarea")
    WebElement comments;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[6]/button")
    WebElement assignButton;
    @FindBy(xpath = "//*[text ()= 'Confirm Leave Assignment']")
    public WebElement askConfirmAssign;
    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")
    WebElement confirmButton;

    public void fillEmployeeName(String value){
        fillTextField(employeeName , value );
        clickOnElement(johnSmith);
    }
    public void chooseLeaveType(){
        leaveType.click();
        leaveType.sendKeys(Keys.DOWN);
        leaveType.sendKeys(Keys.DOWN);
        leaveType.sendKeys(Keys.DOWN);
        leaveType.sendKeys(Keys.ENTER);
    }
    public void fillFromDate(String value){
        fillTextField(fromDate , value);
    }
    public void fillToDate(String value) throws InterruptedException {
        toDate.click();
        toDate.sendKeys(Keys.CONTROL + "a");
        toDate.sendKeys(Keys.DELETE);
        Thread.sleep(500);
        fillTextField(toDate , value);
    }
    public void choosePartialDays(){
        partialDays.click();
        partialDays.sendKeys(Keys.DOWN);
        partialDays.sendKeys(Keys.DOWN);
        partialDays.sendKeys(Keys.ENTER);
        //selectElementFromList(partialDays, value);
    }
    public void chooseStartDays(){
        startDays.click();
        startDays.sendKeys(Keys.DOWN);
        startDays.sendKeys(Keys.DOWN);
        startDays.sendKeys(Keys.DOWN);
        startDays.sendKeys(Keys.ENTER);
        //selectElementFromList(startDays , value);
    }
    public void fillFromTime(String value) throws InterruptedException {
        from.click();
        from.sendKeys(Keys.CONTROL + "a");
        from.sendKeys(Keys.DELETE);
        Thread.sleep(500);
        fillTextField(from , value);
    }
    public void fillToTime(String value) throws InterruptedException {
        to.click();
        to.sendKeys(Keys.CONTROL + "a");
        to.sendKeys(Keys.DELETE);
        Thread.sleep(2000);
        fillTextField(to , value);
    }
    public void fillComments(String value){
        fillTextField(comments , value);
    }
    public void clickAssign(){
        clickOnElement(assignButton);
    }
    public void pressOkConfirmButton(){
        clickOnElement(confirmButton);
    }
    public void assignLeave (String employeeName  , String fromDate , String toDate , String from , String to , String comments) throws InterruptedException {
        fillEmployeeName(employeeName);
        chooseLeaveType();
        fillFromDate(fromDate);
        fillToDate(toDate);
        choosePartialDays();
        chooseStartDays();
        fillFromTime(from);
        fillToTime(to);
        fillComments(comments);
        clickAssign();
    }

}
