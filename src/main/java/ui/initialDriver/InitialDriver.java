package ui.initialDriver;


import ui.events.EventHandler;
import ui.events.EventLoger;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import static ui.initialDriver.Base.DRIVER_NAME;
import static ui.initialDriver.Base.DRIVER_PATH;
import static ui.initialDriver.Base.DRIVER_VERSION;

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
            return driver;
        } else {
            return driver;
        }
    }

    /*
     * There is setting driver by name
     */
    private synchronized WebDriver initialDriver() {
        switch (DRIVER_NAME) {
            case "CHROME": {
                if (!DRIVER_VERSION.equals("0")) {
                    WebDriverManager.chromedriver().version(DRIVER_VERSION).setup();
                } else {
                    System.setProperty("webdriver.chrome.driver", DRIVER_PATH);

                }
                if (System.getProperty("os.name").contains("Windows")) {

                    driver = new ChromeDriver(chromeOptionsLocal());

                } else {
                    driver = new ChromeDriver(chromeOptionsForJenkins());
                }
                break;
            }
            case "FIREFOX": {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(firefoxOptions());
                break;
            }
            case "IE": {
                driver = new InternetExplorerDriver(internetExplorerOptions());
                break;
            }

            default: {
                driver = new ChromeDriver(chromeOptionsForJenkins());
            }
        }

        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
        EventHandler handler = new EventHandler() {
        };
        EventLoger log = new EventLoger() {
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
