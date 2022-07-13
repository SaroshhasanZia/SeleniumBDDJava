package general;


import com.relevantcodes.extentreports.ExtentReports;

import java.io.File;


public class Reporting {

    public static ExtentReports extent;

    public static ExtentReports startReport() {
        extent = new ExtentReports(System.getProperty("user.dir") + "/reports/ExtentReport.html", true);
        extent.addSystemInfo("Environment", "QA");
        extent.loadConfig(new File(System.getProperty("user.dir") + "/extent-config.xml"));
        return extent;
    }

    public static ExtentReports getExtentReport() {
        if (extent != null) {
            return extent;
        } else {
            throw new IllegalStateException("Extent Report object not initialized");
        }
    }
}
