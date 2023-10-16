package pages.Cms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.baseBage.PageBase;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
        js = (JavascriptExecutor) driver;
    }

    @FindBy(id = "yourUsername")
    public WebElement userName;

    @FindBy(id = "yourPassword")
    public WebElement password;

    @FindBy(css = "button.btn.btn-primary.w-60")
    public WebElement loginButton;

    @FindBy(css = "app-dashboard.ng-star-inserted")
    public WebElement assertOnDashboardHomePage;


    public void userName(String UserName){
        setText(userName ,UserName );
    }

    public void password(String Password){
        setText(password ,Password );
    }

    public void loginButton(){
        clickButton(loginButton);
    }

    public void assertOnDashboardHomePage(){
        //Assert.assertTrue(assertOnDashboardHomePage.getText().contains("Dashboard"));
    }
}
