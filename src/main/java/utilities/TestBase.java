package utilities;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.logging.Logger;

public class TestBase {

    static Logger log = Logger.getLogger(Helper.class.getName());
    public static WebDriver driver;
    static String browserName = "chrome";

    public static WebDriver Browser(String browserName) {

        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(Data.BetaEnvironment);
        return driver;
    }
/*
    @AfterMethod
    public void takeScreenShot (ITestResult Result) {

        if (Result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Test Case Is Failed");
            Helper.captureWebScreenshot(driver , Result.getTestName());
        }
    }

 */




}



