package ui.initialDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

abstract class Options {

    ChromeOptions chromeOptionsLocal() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        return options;
    }

    FirefoxOptions firefoxOptions() {
        FirefoxOptions options = new FirefoxOptions();
        return options;
    }
}
