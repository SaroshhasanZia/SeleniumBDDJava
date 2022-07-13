package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class webdriverFactory {
    public static WebDriver driver;

    public static WebDriver webDriver() {



        if(driver != null){
            driver = driver;
        }
        else {
            WebDriver _driver = browser();
            driver = _driver;
        }

        return driver;
    }





    public static WebDriver browser(){

                File file = new File("driver/chromedriver");
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                System.out.println(file.getAbsolutePath());
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("--headless"); //!!!should be enabled for Jenkins
//                options.addArguments("--no-sandbox");
//                options.addArguments("--remote-debugging-port=9222");
//                options.addArguments("--disable-dev-shm-usage");
//                driver = new ChromeDriver(options);
                driver = new ChromeDriver();




        return driver;
    }

    public static void quitDriver()
    {
        if (driver != null)
        {
            driver.quit();
//            driver = null;
        }
    }



}


