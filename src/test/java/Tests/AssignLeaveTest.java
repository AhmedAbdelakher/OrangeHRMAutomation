package Tests;

import Pages.AssignLeavePage;
import Pages.DashBoardPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class AssignLeaveTest extends TestBasis{

    @Test
    public void adminLogin () throws InterruptedException {
        String adminUserName = "Admin";
        String adminPassword = "admin123";
        String employeeName = "John";
        String leaveType = "CAN - Matternity";
        String fromDate = "2023-09-18";
        String toDate = "2023-09-28";
        String partialDays = "Start Day Only";
        String startDay = "Specify Time";
        String fromTime = "10:00 AM";
        String toTime = "11:00 AM";
        String comments = "Test comments";
        LoginPage adminLogin= new LoginPage(driver);
        adminLogin.login(adminUserName , adminPassword);
        DashBoardPage viewAssignLeave = new DashBoardPage(driver);
        viewAssignLeave.viewAssignLeavePage();
        AssignLeavePage assignLeave = new AssignLeavePage(driver);
        assignLeave.assignLeave(employeeName  , fromDate , toDate ,  fromTime , toTime , comments );
        AssignLeavePage askForConfirm = new AssignLeavePage(driver);
        askForConfirm.pressOkConfirmButton();
    }
}
