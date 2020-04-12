package ui.pages;

import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import io.qameta.atlas.webdriver.WebPage;
import org.openqa.selenium.WebDriver;
import ui.initialDriver.AppManager;

public class PageManager {

    protected <T extends WebPage> T onPage(Class<T> page) {
        return new Atlas(new WebDriverConfiguration(getDriver())).create(getDriver(), page);
    }

    public WebDriver getDriver() {
        return AppManager.getDriver();
    }

    public MainPage onMainPage() {
        return onPage(MainPage.class);
    }


}