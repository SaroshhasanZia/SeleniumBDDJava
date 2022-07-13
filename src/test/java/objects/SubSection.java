package objects;

import org.openqa.selenium.By;

import static general.commonAssertions.textAssertion;
import static general.commonFunctions.*;

public class SubSection {
    public static By startUps = By.xpath("descendant::a[contains(text(),'STARTUPS')][1]");
    public static By selectedPage = By.xpath("/descendant::a[@aria-current=\"page\"][1]");
    public static By enterprise = By.xpath("descendant::a[contains(text(),'ENTERPRISE')][1]");
    public static By vCFirms = By.xpath("descendant::a[contains(text(),'VC FIRMS')][1]");


    public static void homePage(){
        homePage();
    }

    public static void clickOnStartUps(){
        visibilityOf(startUps);
        click(startUps);
    }

    public static void getSection(String expected){
        textAssertion(selectedPage,expected);
    }


    public static void clickOnEnterprise(){
        visibilityOf(enterprise);
        click(enterprise);
    }

    public static void clickOnVCFirms(){
        visibilityOf(vCFirms);
        click(vCFirms);
    }


}
