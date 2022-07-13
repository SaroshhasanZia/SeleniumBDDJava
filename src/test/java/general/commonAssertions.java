package general;

import org.openqa.selenium.By;
import org.testng.Assert;

import static general.commonFunctions.elementBy;
import static general.commonFunctions.explicitWait;

public class commonAssertions {

    public static void textAssertion(By locator, String actual) {

        try {
            explicitWait(locator);
            {
                String text = elementBy(locator).getText();
                Assert.assertEquals(text,actual);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
