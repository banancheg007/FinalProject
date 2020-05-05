package ui.initialDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

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
        options.addArguments("disable-infobars");
        return options;
    }

    FirefoxOptions firefoxOptions() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-infobars");
        return options;
    }

    EdgeOptions edgeOptions() {
        EdgeOptions options = new EdgeOptions();
       // options.setCapability();
       /* options.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
       options.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, true);
       options.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
       options.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
       // options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
       // options.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, true);
        //EnableNativeEvents = false,
                //EnablePersistentHover = true,
               // RequireWindowFocus = true,
                //IgnoreZoomLevel = true,
               // IntroduceInstabilityByIgnoringProtectedModeSettings = true,
               // UnhandledPromptBehavior = UnhandledPromptBehavior.Accept,*/
        return options;
    }
}
