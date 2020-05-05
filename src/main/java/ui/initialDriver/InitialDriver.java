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
        System.out.println(DRIVER_NAME);
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
            case "EDGE": {
                WebDriverManager.edgedriver().setup();
               /* InternetExplorerDriverService service = new InternetExplorerDriverService.Builder()
                        .withLogLevel(InternetExplorerDriverLogLevel.TRACE)
                        .withLogFile(new File("C:\\iedriverserver.log"))
                        .build();*/

                //System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
                driver = new EdgeDriver(edgeOptions());//service);
                driver.manage().window().maximize();
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
