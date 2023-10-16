package pages.baseBage;

import org.openqa.selenium.WebDriver;
import pages.Cms.LoginPage;
import pages.Cms.SystemConfigurationPage;

public class PageObject {

    private WebDriver driver;
    private LoginPage loginPage;
    private SystemConfigurationPage systemConfigurationPage;

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public SystemConfigurationPage getSystemConfigurationPage() {
        if (systemConfigurationPage == null) {
            systemConfigurationPage = new SystemConfigurationPage(driver);
        }
        return systemConfigurationPage;
    }


}
