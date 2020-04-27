package ui.pages;

import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import io.qameta.atlas.webdriver.WebPage;
import org.openqa.selenium.WebDriver;
import ui.initialDriver.AppManager;

public class PageManager {

    AppManager appManager;

    public PageManager(AppManager appManager){
        this.appManager = appManager;
        System.out.println("PageManager create");
    }

    protected <T extends WebPage> T onPage(Class<T> page) {
        return new Atlas(new WebDriverConfiguration(getDriver())).create(getDriver(), page);
    }

    public WebDriver getDriver() {
        return appManager.getDriver();
    }

    public MainPage onMainPage() {
        return onPage(MainPage.class);
    }

    public ConnectPage onConnectPage(){ return  onPage(ConnectPage.class);}


}