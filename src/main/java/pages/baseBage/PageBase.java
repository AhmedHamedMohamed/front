package pages.baseBage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;

public class PageBase {



    public WebDriver driver;
    public static JavascriptExecutor js;

    public PageBase(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public static void clickButton(WebElement Button){
        Button.click();
    }

    public static void setText(WebElement ElementTxt , String Value){
        ElementTxt.sendKeys(Value);
    }

    public static void scrollDown(){
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }



    public void scrollToBottom()

    {
        js.executeScript("scrollBy(0,2500)");
    }

    public void clearText(WebElement element)
    {
        element.clear();
    }


    public static void typeTextIfElementPresent(WebElement element, String data) {
        if (element.isDisplayed()) {
            element.sendKeys(data);
        }
    }

    public  void clearTxtBox(WebElement element) {
        element.clear();
    }

    public  void typeRandomNumber(WebElement element, int data) {
        Random random = new Random();
        int rn = random.nextInt(100);
        String randomNumber = Integer.toString(rn);
        element.sendKeys(randomNumber);
    }

    public  String getTextBoxValue(WebElement element) {
        return element.getAttribute("value");
    }

    public  boolean VerifyTextEquals(WebElement element,String expected){
        boolean flag=false;
        if(element.getText().equals(expected))
            return flag=true;
        return flag;
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public boolean isSelected(WebElement element) {
        return element.isSelected();
    }

    public void selectCheckBox(WebElement element) {
        if (!isSelected(element))
            element.click();
    }

    public void deSelectCheckbox(WebElement element) {
        if (isSelected(element))
            element.click();
    }

    public void selectRadioButton(WebElement element) {
        if (!isSelected(element))
            element.click();
    }

    public void deSelectRadioButton(WebElement element) {
        if (isSelected(element))
            element.click();
    }

    public boolean isEnabled(WebElement element){
        return element.isEnabled();
    }

    public  boolean isDisplayed(WebElement element){
        return element.isDisplayed();
    }

    public  void selectByText(WebElement element,String text){
        Select select=new Select(element);
        select.selectByVisibleText(text);
    }

    public  void selectByIndex(WebElement element,int index){
        Select select=new Select(element);
        select.selectByIndex(index);
    }

    public  void selectByValue(WebElement element,String value){
        Select select=new Select(element);
        select.selectByValue(value);
    }

    public  String getFirstSelectedOption(WebElement element){
        Select select=new Select(element);
        return select.getFirstSelectedOption().getText();
    }

    public List<WebElement> getAllSelectedOptions(WebElement element){
        Select select=new Select(element);
        return select.getAllSelectedOptions();
    }

    public  List<WebElement> getAllOptions(WebElement element){
        Select select=new Select(element);
        return select.getOptions();
    }

    public  void deSelectByText(WebElement element,String text){
        Select select=new Select(element);
        select.deselectByVisibleText(text);
    }

    public  void deSelectByIndex(WebElement element,int index){
        Select select=new Select(element);
        select.deselectByIndex(index);
    }

    public  void deSelectByValue(WebElement element,String value){
        Select select=new Select(element);
        select.deselectByValue(value);
    }

    public  void clickOnlyIfElementPresent(WebElement element){
        if(isDisplayed(element))
            element.click();
    }

    public Alert getAlert() {
        return driver.switchTo().alert();
    }

    public void AcceptAlert() {
        getAlert().accept();
    }

    public void DismissAlert() {
        getAlert().dismiss();
    }

    public String getAlertText() {
        String text = getAlert().getText();
        return text;
    }

    public  boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public  void AcceptAlertIfPresent() {
        if (!isAlertPresent())
            return;
        AcceptAlert();
    }

    public  void DismissAlertIfPresent() {

        if (!isAlertPresent())
            return;
        DismissAlert();
    }

    public  void AcceptPrompt(String text) {

        if (!isAlertPresent())
            return;

        Alert alert = getAlert();
        alert.sendKeys(text);
        alert.accept();
    }

    public  void scrollToElemet(WebElement element) {
        tryJavascript("window.scrollTo(arguments[0],arguments[1])", element.getLocation().x, element.getLocation().y);
    }

    public  void scrollToElemetAndClick(WebElement element) {
        scrollToElemet(element);
        element.click();
    }

    public  void scrollIntoView(WebElement element) {
        tryJavascript("arguments[0].scrollIntoView()", element);
        WebDriver driver;



    }


    public void scrollDownVertically() {
        tryJavascript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public  void scrollUpVertically() {
        tryJavascript("window.scrollTo(0, -document.body.scrollHeight)");
    }

    public  void scrollDownByPixel() {
        tryJavascript("window.scrollBy(0,1500)");
    }

    public  void scrollUpByPixel() {
        tryJavascript("window.scrollBy(0,-1500)");
    }

    public  void ZoomInBypercentage() {
        tryJavascript("document.body.style.zoom='40%'");
    }

    public  void ZoomBy100percentage() {
        tryJavascript("document.body.style.zoom='100%'");
    }





    public  void setImplicitWait(int time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }





    public  synchronized Object execJavascript(String script, Object... args) {
        JavascriptExecutor scriptExe = ((JavascriptExecutor)driver);
        return scriptExe.executeScript(script, args);
    }

    public  synchronized Object tryJavascript(String script, Object... args) {
        try {
            return execJavascript(script, args);
        } catch (Exception ignore) {
            return "";
        }
    }

    public  boolean isPageLoaded() {
        String state = (String) tryJavascript("return document.readyState;");
        return state.matches("complete|loaded|interactive");
    }

    public  boolean isJQueryDone() {
        Object jsResponse = tryJavascript("return jQuery.active;");
        if (jsResponse instanceof Long) {
            return ((Long) jsResponse) == 0;
        } else if (jsResponse instanceof String) {
            String response = (String) jsResponse;
            return (response.startsWith("{\"hCode\"") || response.isEmpty());
        } else {
            return true;
        }
    }

    public  boolean isAngularDone() {
        Object jsResponse = tryJavascript("return window.getAllAngularTestabilities().filter(x=>!x.isStable()).length;");
        if (jsResponse instanceof Long) {
            return ((Long) jsResponse) == 0;
        } else if (jsResponse instanceof String) {
            String response = (String) jsResponse;
            return response.isEmpty();
        } else {
            return true;
        }
    }


}

