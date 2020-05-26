package core.initialDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import core.events.EventHandler;
import core.events.EventLogger;



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


    private static final ThreadLocal<InitialDriver> driverThread = new ThreadLocal<>();

    public WebDriver driver;

    public String browser;

    public WebDriver getDriver() {
        if (driver == null) {
            driver = initialDriver();
        }
        return driver;
    }


    private synchronized WebDriver initialDriver() {
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
                    driver.manage().window().maximize();
                    break;
                }
                case "edge": {
                    WebDriverManager.edgedriver().setup();
                    driver = new InternetExplorerDriver();
                    driver.manage().window().maximize();
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
