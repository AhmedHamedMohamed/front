package pages.Cms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.baseBage.PageBase;

import javax.xml.xpath.XPath;


public class SystemConfigurationPage extends PageBase {

    public SystemConfigurationPage(WebDriver driver) {
        super(driver);
        js = (JavascriptExecutor) driver;
    }

    @FindBy(xpath = "/html/body/app-root/app-side-nav-bar/mat-sidenav-container/mat-sidenav/div/mat-nav-list/div[2]/mat-list-item[4]/span/span/span")
    public WebElement systemConfigurationIcon;

    @FindBy(id = "inputState")
    public WebElement selectCountry;

    @FindBy(css = "button.btn.btn-primary.action-btn.bi-file-plus")
    public WebElement addCountryButton;

    @FindBy(id = "cdk-live-announcer-0")
    public WebElement assertOnAddCountryMessage;

    @FindBy(css = "button.btn.btn-outline-danger.delete-btn.bi-dash-circle-fill")
    public WebElement deleteCountry;


    @FindBy(id = "second-toggle")
    public WebElement secondToggle;


    @FindBy(xpath = "//*[@id=\"second-collapse\"]/div/div[1]/div[2]/div/input")
    public WebElement days;

    @FindBy(xpath = "//*[@id=\"second-collapse\"]/div/div[2]/div[2]/div/input")
    public WebElement message;

    @FindBy(css = "button.btn.btn-primary.ms-3.default-btn-size.bi-check-square")
    public WebElement saveChangesButton;

    @FindBy(xpath = "//*[@id=\"mat-tab-label-2-1\"]/span[2]/span")
    public WebElement aclManagement;

    @FindBy(css = "button.btn.btn-light.bi-file-plus.add-level-btn")
    public WebElement addAccessLevelButton;

    @FindBy(css = "button.btn.btn-outline-danger.delete-btn.bi-dash-circle-fill.ng-star-inserted")
    public WebElement deleteAccessLevel;

    @FindBy(id = "second-toggle")
    public WebElement secondToggle2;

    @FindBy(name = "reason-en")
    public WebElement reasonEn;

    @FindBy(css = "button.btn.btn-primary.action-btn.bi-file-plus")
    public WebElement addReasonButton;

    @FindBy(css = "button.btn.btn-outline-danger.delete-btn.bi-dash-circle-fill")
    public WebElement deleteReasonEn;

    @FindBy(xpath = "//*[@id=\"mat-tab-label-2-2\"]/span[2]/span")
    public WebElement customerManagement;

    @FindBy(xpath = "//*[@id=\"first-collapse\"]/div/div/div/div[1]/form/div/div[2]/input")
    public WebElement customerProfileRejectReason;

    @FindBy(xpath = "//*[@id=\"first-collapse\"]/div/div/div/div[2]/button")
    public WebElement addCustomerProfileRejectReason;

    @FindBy(css = "button.btn.btn-outline-danger.delete-btn.bi-dash-circle-fill")
    public WebElement deleteCustomerProfileRejectReason;

    @FindBy(xpath = "//*[@id=\"second-toggle\"]")
    public WebElement customerUserRejectReason;

    @FindBy(xpath = "//*[@id=\"second-collapse\"]/div/div/div/div[1]/form/div/div[2]/input")
    public WebElement addCustomerUserRejectReason;

    @FindBy(xpath = "//*[@id=\"second-collapse\"]/div/div/div/div[2]/button")
    public WebElement saveCustomerUserRejectReason;

    @FindBy(xpath = "//*[@id=\"second-collapse\"]/div/div/div[1]/div[2]/button")
    public WebElement deleteCustomerUserRejectReason;

    @FindBy(xpath = "/div/mat-snack-bar-container/div/div")
    public WebElement assertOnDeleteCustomerUserRejectReasonMessage;


    public void systemConfigurationIcon(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", systemConfigurationIcon);

    }

    public void selectCountry(){
        Select objSelect = new Select(selectCountry);
        objSelect.selectByValue("245");

    }

    public void addCountryButton(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", addCountryButton);
    }

    public void assertOnAddCountryMessage(){
        System.out.println(assertOnAddCountryMessage.getText());
        //Assert.assertTrue(assertOnAddCountryMessage.getText().contains("Country Added successfully"));
    }

    public void deleteCountry(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", deleteCountry);
    }

    public void secondToggle(){
        clickButton(secondToggle);
    }

    public void days(String Days){

        days.clear();
        setText(days , Days);
    }

    public void message(String Message){

        message.clear();
        setText(message , Message);
    }

    public void saveChangesButton(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", saveChangesButton);
    }

    public void aclManagement(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", aclManagement);
    }

    public void addAccessLevelButton(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", addAccessLevelButton);
    }

    public void deleteAccessLevel(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", deleteAccessLevel);
    }

    public void secondToggle2(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", secondToggle2);
    }

    public void reasonEn(String ReasonEn){
        setText(reasonEn , ReasonEn);
    }


    public void addReasonButton(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", addReasonButton);
    }

    public void deleteReasonEn(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", deleteReasonEn);
    }

    public void customerManagement(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", customerManagement);
    }

    public void customerProfileRejectReason(String CustomerProfileRejectReason){
        setText(customerProfileRejectReason ,CustomerProfileRejectReason );
    }

    public void addCustomerProfileRejectReason(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", addCustomerProfileRejectReason);
    }
    public void deleteCustomerProfileRejectReason(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", deleteCustomerProfileRejectReason);
    }

    public void customerUserRejectReason(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", customerUserRejectReason);
    }

    public void addCustomerUserRejectReason(String AddCustomerUserRejectReason){
        setText(addCustomerUserRejectReason ,AddCustomerUserRejectReason );
    }

    public void saveCustomerUserRejectReason(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", saveCustomerUserRejectReason);
    }

    public void deleteCustomerUserRejectReason(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", deleteCustomerUserRejectReason);
    }

    public void assertOnDeleteCustomerUserRejectReasonMessage(){
        //Assert.assertTrue(assertOnDeleteCustomerUserRejectReasonMessage.getText().contains("Reject Reason Deleted successfully"));
    }

}
