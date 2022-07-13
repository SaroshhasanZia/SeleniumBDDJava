package general;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.TestRunner;

import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import static general.webdriverFactory.webDriver;

public class commonFunctions {


    public static WebDriver driver = webDriver();
    public static WebDriverWait wait;


    public static void browseUrl(String url) {
        driver.get(url);
    }

    public static void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    public static <T> WebElement elementBy(By value) {
        WebElement element = driver.findElement(value);
        return element;
    }


    public static void click(By element) {

        try {
            explicitWait(element);
            {
                elementBy(element).click();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void sendKeys(By element, String text) {
        try {
            explicitWait(element);
            {
                elementBy(element).sendKeys(text);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static <T> void selectElement(By locator, String value) {

        Select items = new Select(elementBy(locator));
        items.selectByValue(value);
    }

    public static void explicitWait(By locator) {
        Duration d = Duration.ofSeconds(10);
        wait = new WebDriverWait(driver, d);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public static void visibilityOf(By element) {
        Duration d = Duration.ofSeconds(10);
        wait = new WebDriverWait(driver, d);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));


    }

    public static void scrolltoElement(By locator) {
        try {
            explicitWait(locator);
            {
                ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].scrollIntoView();", elementBy(locator));
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void waitTillClickable(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();


    }

    public static void refreshPage(){
        driver.navigate().refresh();
    }

    public static void scrollToBottom(){
        ((JavascriptExecutor)driver).executeScript(
                "document.documentElement.scrollTop = -1 >>> 1");

    }

    public static void gotoHomePage(){
        driver.get("https://cloudprimero.com/");
    }

    public static void hoverAndClick(By locatorOne, By locatortwo) throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement menu = driver.findElement(locatorOne);

        actions.moveToElement(menu).click().build().perform();
        Thread.sleep(3000);

        WebElement subMenu = driver.findElement(locatortwo);

        actions.moveToElement(subMenu);
        actions.click().build().perform();
    }

    public static Date getTime() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime();
    }

    public static void hover(By locatore){
        Actions actions = new Actions(driver);
        WebElement item = driver.findElement(locatore);

        actions.moveToElement(item).perform();
    }


}
