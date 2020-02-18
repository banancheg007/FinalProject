package ui.initialDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;

abstract class Options {

    ChromeOptions chromeOptionsForJenkins() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1800x900");
        options.addArguments("--headless");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-notifications");
        options.addArguments("--no-sandbox");
        options.addArguments("--no-zygote");
        options.addArguments("--disable-dev-shm-usage");
        return options;
    }

    ChromeOptions chromeOptionsLocal() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-infobars");
        return options;
    }

    FirefoxOptions firefoxOptions() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-infobars");
        return options;
    }

    InternetExplorerOptions internetExplorerOptions() {
        InternetExplorerOptions options = new InternetExplorerOptions();
        return options;
    }
}
