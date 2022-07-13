package stepDefs;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.Result;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.runtime.ScenarioImpl;
import org.apache.commons.lang.reflect.FieldUtils;
import tests.TestRunner;
import java.util.*;


import java.lang.reflect.Field;
import java.util.ArrayList;

import static general.Reporting.getExtentReport;
import static general.commonFunctions.getTime;

public class Hooks extends TestRunner {
    static ExtentTest logger;
    @Before
    public static void testStart(Scenario scenario) throws Throwable {

            logger = getExtentReport().startTest(scenario.getName(),"");
            logger.setStartedTime(getTime());
    }
    @After
    public static void testEnd(Scenario scenario) throws Throwable
    {

        if ( scenario.getStatus() == Result.Type.FAILED ) {

            Field field = FieldUtils.getField(((ScenarioImpl) scenario).getClass(), "stepResults", true);
            field.setAccessible(true);
            ArrayList<Result> results = (ArrayList<Result>) field.get(scenario);
                for (Result result : results) {
                    if (result.getError() != null)
                        logger.log(LogStatus.FAIL, "Test Case Failed reason is: " + result.getError());
                }
            }




        else if (scenario.getStatus() == Result.Type.SKIPPED ) {
                logger.log(LogStatus.SKIP, "Test Case Skipped is: ");

        }
        else {

                logger.log(LogStatus.PASS, scenario.getName() + " is Passed");
            }

        logger.setEndedTime(getTime());
        getExtentReport().endTest(logger);

        }





}
