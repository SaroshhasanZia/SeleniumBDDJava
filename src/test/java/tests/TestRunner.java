package tests;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileReader;
import java.sql.SQLException;


import static general.Reporting.*;
import static general.commonFunctions.browseUrl;
import static general.commonFunctions.maximizeBrowser;
import static general.webdriverFactory.quitDriver;
import static general.webdriverFactory.webDriver;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
        glue = {"stepDefs"},
//        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        plugin = { "pretty", "html:target/cucumber" },
        tags= "@OurExpertise,@HomePage,@SubSections"
)

public class TestRunner {

    public static WebDriver driver;

    @BeforeClass
    public static void beforeSuite(){

        System.out.println("start");
//        driver = webDriver();
        browseUrl("https://cloudprimero.com/");
        maximizeBrowser();
        startReport();

    }

    @AfterClass
    public static void afterClass() {
        getExtentReport().flush();
//        getExtentReport().close();


        quitDriver();
    }
}
