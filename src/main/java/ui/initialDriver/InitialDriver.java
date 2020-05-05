package ui.initialDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import ui.events.EventHandler;
import ui.events.EventLogger;

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

    public void setBrowser(String browser){
        this.browser = browser;
    }

    /*
     * There is pre-initialization of the driver and his way that is it prior to calling object
     */
    private static ThreadLocal<InitialDriver> driverThread = new ThreadLocal<>();

    public WebDriver driver;

    public String browser;

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
        System.out.println(DRIVER_NAME);
        if(!(browser ==null) ) {
            switch (browser) {
                case "chrome": {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(chromeOptionsLocal());
                    break;
                }
                case "firefox": {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(firefoxOptions());
                    break;
                }
                case "edge": {
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver(edgeOptions());
                    driver.manage().window().maximize();
                    break;
                }

                default: {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(chromeOptionsForJenkins());
                    break;
                }
            }
        }else{
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptionsLocal());
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
