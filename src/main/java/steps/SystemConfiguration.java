package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Cms.LoginPage;
import pages.Cms.SystemConfigurationPage;
import utilities.Data;
import utilities.TestBase;

import java.util.concurrent.TimeUnit;

public class SystemConfiguration extends TestBase{
    SystemConfigurationPage systemConfigurationPage;
    LoginPage loginPage;


    @Given("Login To CMS Page Login")
    public void loginToCMSPageLogin() {
        TestBase.Browser("chrome");
        loginPage = new LoginPage(driver);
        loginPage.userName(Data.Username);
        loginPage.password(Data.Password);
        loginPage.loginButton();
        driver.manage().timeouts().implicitlyWait(15 , TimeUnit.SECONDS);
        loginPage.assertOnDashboardHomePage();
    }

    @When("Click On System Configuration Icon")
    public void clickOnSystemConfigurationIcon() {
        systemConfigurationPage = new SystemConfigurationPage(driver);
        driver.manage().timeouts().implicitlyWait(15 , TimeUnit.SECONDS);
        systemConfigurationPage.systemConfigurationIcon(driver);
    }

    @And("Click To Select Country")
    public void clickToSelectCountry() {
        systemConfigurationPage.selectCountry();
    }

    @And("Click On Add Country Button")
    public void clickOnAddCountryButton() {
        systemConfigurationPage.addCountryButton(driver);
    }

    @And("Click To Delete Country")
    public void clickToDeleteCountry() throws InterruptedException {
        systemConfigurationPage.deleteCountry(driver);
    }

    @And("Click On Notification Setting")
    public void clickOnNotificationSetting() {
        systemConfigurationPage.secondToggle();
    }

    @And("Insert Delete Notification Days")
    public void insertDeleteNotificationDays() {
        systemConfigurationPage.days(Data.Days);
    }

    @And("Insert Show up to Message")
    public void insertShowUpToMessage() {
        systemConfigurationPage.message(Data.Message);
    }

    @And("Click On Save Changes Button")
    public void clickOnSaveChangesButton() {
        systemConfigurationPage.saveChangesButton(driver);
    }

    @And("Click On ACL Management")
    public void clickOnACLManagement() {
        driver.manage().timeouts().implicitlyWait(15 , TimeUnit.SECONDS);
        systemConfigurationPage.aclManagement(driver);
    }

    @And("Click On Add Access Level Button")
    public void clickOnAddAccessLevelButton() throws InterruptedException {
        systemConfigurationPage.addAccessLevelButton(driver);
    }


    @And("Click On User Reject Reason")
    public void clickOnUserRejectReason() throws InterruptedException {
        Thread.sleep(1000);
        systemConfigurationPage.secondToggle2(driver);
    }

    @And("Insert User Reject Reason EN")
    public void insertUserRejectReasonEN() {
        systemConfigurationPage.reasonEn(Data.ReasonEn);
    }

    @And("Save User Reject Reason")
    public void saveUserRejectReason() {
        systemConfigurationPage.addReasonButton(driver);
    }

    @And("Delete User Reject Reason")
    public void deleteUserRejectReason() throws InterruptedException {
        Thread.sleep(1000);
        systemConfigurationPage.deleteReasonEn(driver);
    }

    @And("Click On Customer Management")
    public void clickOnCustomerManagement() {
        systemConfigurationPage.customerManagement(driver);
    }

    @And("Insert Customer Profile Reject Reason")
    public void insertCustomerProfileRejectReason() {
        systemConfigurationPage.customerProfileRejectReason(Data.CustomerProfileRejectReason);
    }

    @And("Save Customer Profile Reject Reason")
    public void saveCustomerProfileRejectReason() {
        systemConfigurationPage.addCustomerProfileRejectReason(driver);
    }

    @And("Delete Customer Profile Reject Reason")
    public void deleteCustomerProfileRejectReason() throws InterruptedException {
        Thread.sleep(1000);
        systemConfigurationPage.deleteCustomerProfileRejectReason(driver);
    }

    @And("Click On Customer User Reject Reason")
    public void clickOnCustomerUserRejectReason() throws InterruptedException {
        Thread.sleep(1000);
        systemConfigurationPage.customerUserRejectReason(driver);
    }

    @And("Insert Customer User Reject Reason")
    public void InsertCustomerUserRejectReason() {
        systemConfigurationPage.addCustomerUserRejectReason(Data.CustomerUserRejectReason);
    }

    @And("Save Customer User Reject Reason")
    public void saveCustomerUserRejectReason() throws InterruptedException {
        Thread.sleep(1000);
        systemConfigurationPage.saveCustomerUserRejectReason(driver);
    }

    @And("Delete Customer User Reject Reason")
    public void deleteCustomerUserRejectReason() throws InterruptedException {
        Thread.sleep(2000);
        systemConfigurationPage.deleteCustomerUserRejectReason(driver);
    }

}


