package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static general.commonAssertions.textAssertion;
import static general.commonFunctions.*;

public class homePage {

    public static By homepageText = By.cssSelector("h1[class=\"elementor-heading-title elementor-size-default\"]");

    public static By contactUsButton = By.xpath("//button[contains(text(),'CONTACT')]");
    public static By scheduleConsultatonButton = By.xpath("//button[contains(text(),' Schedule a Consultation')]");
    public static By moreAboutUs = By.xpath("//button[contains(text(),' MORE ABOUT US')]");
    public static By submitButton = By.xpath("/descendant::button[@id='forms-submit-button'][1]");
    public static By homepage = By.xpath("descendant::a[contains(@href,'https://cloudprimero.com')][1]");
    public static By formView = By.xpath("/descendant::label[contains(text(),'Area of Interest*')][1]");
    public static By nameField = By.xpath("descendant::input[@id='form-field-name'][1]");
    public static By companyNameField = By.xpath("descendant::input[@id='form-field-field_46e0628'][1]");
    public static By emailField = By.xpath("descendant::input[@id='form-field-email'][1]");
    public static By phoneField = By.xpath("descendant::input[@id='form-field-field_2ca2aee'][1]");
    public static By messageLabel = By.xpath("descendant::textarea[@id='form-field-message'][1]");
    public static By successMsg = By.xpath("//div[@class='elementor-message elementor-message-success']");
    public static By cookieAccept = By.cssSelector("a#wt-cli-accept-all-btn");
    public static By caseStudyButton = By.xpath("/descendant::a[@class=\"rs-layer rev-btn rs-selectable\"][1]");
    public static By selectedPage = By.xpath("/descendant::a[@aria-current=\"page\"][1]");

    public static By caseStudypage= By.xpath("//p[contains(text(),'Case Study')]");

    public static By languageDropdown = By.xpath("descendant::a[@class='elementor-item has-submenu'][1]");

    public static By languageSelect = By.xpath("//ul[@class='sub-menu elementor-nav-menu--dropdown sm-nowrap']//li//a[contains(@title,'NL')]");
    public static By privacyPolicy = By.xpath("/descendant::button[contains(text(),'Privacy Policy')][1]");

    public static By privacyPolicyText = By.cssSelector("span#Privacy_Policy");
    public static void browse() throws InterruptedException {
        browseUrl("https://cloudprimero.com/");
        maximizeBrowser();
        click(cookieAccept);
//        Thread.sleep(3000);
    }
    public static void assertHomepage(){
        textAssertion(homepageText,"Re-imagining\n" +
                "businesses for hyper performance");
    }

    public static void homePage() throws InterruptedException {
    gotoHomePage();
    }

    public static void clickOnContactUs(){
        scrolltoElement(contactUsButton);
        try {
            waitTillClickable(contactUsButton);
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(contactUsButton));
        }

    }

    public static void scrollToForm(){
        scrolltoElement(formView);
    }

    public static void formFill()  {

            sendKeys(nameField,"Tester");

            sendKeys(companyNameField,"TestingCorp");

            sendKeys(emailField,"QAtester@xyz.com");

            sendKeys(messageLabel,"TEST");

            sendKeys(phoneField,"090078601");



        }





    public static void clickButton() throws InterruptedException {
        scrolltoElement(submitButton);
//        Thread.sleep(2000);

        try {
            waitTillClickable(submitButton);
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(submitButton));
        }


    }

    public static void formSubmitted(){
        textAssertion(successMsg,"The form was sent successfully.");
    }

    public static void clickOnScheduleConsultation(){

        click(scheduleConsultatonButton);
    }


    public static void clickMoreAboutUs(){

        scrolltoElement(moreAboutUs);
        try {
            waitTillClickable(moreAboutUs);
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(moreAboutUs));
        }

    }

    public static void clickCaseStudy(){

        scrolltoElement(caseStudyButton);
        try {
            waitTillClickable(caseStudyButton);
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(caseStudyButton));
        }

    }


    public static void getPage(String expected){
        textAssertion(selectedPage,expected);
    }

    public static void assertCaseStudyPage(){
        textAssertion(caseStudypage,"CASE STUDY");
    }

    public static void changeLanguage() throws InterruptedException {
        hoverAndClick(languageDropdown,languageSelect);
    }

    public static void clickOnLangBtn(){
        scrolltoElement(languageDropdown);
    }

    public static void langChangeAssertion(){
        textAssertion(homepageText,"Digitaliseer\n" +
                "bedrijfsprocessen voor top performance");
    }

    public static void navigatesToBottom(){
        scrollToBottom();
    }

    public static void clickOnPrivacyPolicy(){
        scrolltoElement(privacyPolicy);
        click(privacyPolicy);
    }

    public static void privacyAssertion(){
        textAssertion(privacyPolicyText,"Privacy Policy");
    }


}
