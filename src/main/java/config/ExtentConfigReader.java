package config;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExtentConfigReader {
    public String getReportConfigPath() throws IOException {
        Properties p = new Properties();

//        FileInputStream file = new FileInputStream("src/main/resources/Project.properties");
//        p.load(file);
        String reportConfigPath = p.getProperty("src/main/resources/extent-config.xml");
        if(reportConfigPath!= null) return reportConfigPath;
        else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }
}
