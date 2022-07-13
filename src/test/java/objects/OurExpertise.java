package objects;

import org.openqa.selenium.By;

import static general.commonAssertions.textAssertion;
import static general.commonFunctions.*;
import static java.lang.Thread.sleep;

public class OurExpertise
{

    public static By expertiseButton = By.xpath("//ul[@id='menu-1-0ff118e']/child::li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-37']");
    public static By bigDataAndBI = By.xpath("/descendant::li/a/child::span[contains(text(),'Big Data and BI')]");
    public static By getExpertise = By.xpath("//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor current-menu-parent menu-item-has-children menu-item-37']/ul[contains(@class,'sub-menu elementor-nav-menu--dropdown')]/li/a[@class='elementor-sub-item elementor-item-active']/span");
    public static By machineLearning = By.xpath("/descendant::li/a/child::span[contains(text(),'AI and Machine Learning')]");
    public static By webAndMobile = By.xpath("/descendant::li/a/child::span[contains(text(),'Web and Mobile Apps')]");
    public static By enterpriseApp = By.xpath("/descendant::li/a/child::span[contains(text(),'Enterprise Applications')]");
    public static By salesForce = By.xpath("/descendant::li/a/child::span[contains(text(),'Salesforce')]");
    public static By cloudServices = By.xpath("/descendant::li/a/child::span[contains(text(),'Cloud Services')]");


    public static void navigateToExpertiseDropdown(){
        scrolltoElement(expertiseButton);
    }

    public static void selectBigData() throws InterruptedException {
        hover(expertiseButton);
        hoverAndClick(expertiseButton,bigDataAndBI);
    }

    public static void userLandsOnBigDataPage(){
        hover(expertiseButton);
        textAssertion(getExpertise,"Big Data and BI");
    }
    public static void selecMachineLearning() throws InterruptedException {
        hover(expertiseButton);
        hoverAndClick(expertiseButton,machineLearning);
    }

    public static void userLandsOnMachineLearningPage(){
        hover(expertiseButton);
        textAssertion(getExpertise,"AI and Machine Learning");
    }

    public static void selectWebAndMobileApp() throws InterruptedException {
        hover(expertiseButton);
        hoverAndClick(expertiseButton,webAndMobile);
    }

    public static void userLandsOnWebAndMobileAppPage(){
        hover(expertiseButton);
        textAssertion(getExpertise,"Web and Mobile Apps");
    }

    public static void selectEnterpriseApp() throws InterruptedException {
        hover(expertiseButton);
        hoverAndClick(expertiseButton,enterpriseApp);
    }

    public static void userLandsOnEnterpriseAppPage(){
        hover(expertiseButton);
        textAssertion(getExpertise,"Enterprise Applications");
    }
    public static void selectSalesforce() throws InterruptedException {
        hover(expertiseButton);
        hoverAndClick(expertiseButton,salesForce);
    }

    public static void userLandsOnSalesforcePage(){
        hover(expertiseButton);
        textAssertion(getExpertise,"Salesforce");
    }
    public static void selectCloudServices() throws InterruptedException {
        hover(expertiseButton);
        hoverAndClick(expertiseButton,cloudServices);
    }

    public static void userLandsOnCloudServicesPage(){
        hover(expertiseButton);
        textAssertion(getExpertise,"Cloud Services");
    }
}
