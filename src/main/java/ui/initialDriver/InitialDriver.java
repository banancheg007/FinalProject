package ui.initialDriver;


import ui.events.EventHandler;
import ui.events.EventLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import static ui.initialDriver.Base.DRIVER_NAME;


public class InitialDriver extends Options {

    private InitialDriver() {
    }

    public static InitialDriver getInstance() {
        if (driverThread.get() == null) {
            synchronized (InitialDriver.class) {
                driverThread.set(new InitialDriver());
            }
        }
        return driverThread.get();
    }

    /*
     * There is pre-initialization of the driver and his way that is it prior to calling object
     */
    private static ThreadLocal<InitialDriver> driverThread = new ThreadLocal<>();

    public WebDriver driver;

    public WebDriver getDriver() {
        if (driver == null) {
            driver = initialDriver();
        }
        return driver;
    }

    /*
     * There is setting driver by name
     */
    private synchronized WebDriver initialDriver() {
        switch (DRIVER_NAME) {
            case "CHROME": {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(chromeOptionsLocal());
                break;
            }
            case "FIREFOX": {
                WebDriverManager.firefoxdriver().setup();
                //System.setProperty("webdriver.gecko.driver","C:\\workspace\\FinalProject\\src\\main\\resources\\geckodriver.exe");
                driver = new FirefoxDriver(firefoxOptions());
                break;
            }
            case "IE": {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver(internetExplorerOptions());
                break;
            }

            default: {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(chromeOptionsForJenkins());
                break;
            }
        }

        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
        EventHandler handler = new EventHandler() {
        };
        EventLogger log = new EventLogger() {
        };
        driver = eventDriver.register(log);
        driver = eventDriver.register(handler);
        return driver;
    }

    public void destroy() {
        if (driver != null) {
            getDriver().quit();
            driver = null;
        }
    }
}
