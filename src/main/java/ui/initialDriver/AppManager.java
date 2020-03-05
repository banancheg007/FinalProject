package ui.initialDriver;

import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.openqa.selenium.WebDriver;
import ui.pageHelpers.MainPageHelper;
import ui.pages.BasePage;
import ui.pages.MainPage;

public class AppManager {
    private WebDriver driver = InitialDriver.getInstance().getDriver();
    Atlas atlas = new Atlas(new WebDriverConfiguration((driver)));
    private MainPageHelper mainPageHelper = new MainPageHelper(this);

    public WebDriver getDriver(){
        return  driver;
    }

    public MainPageHelper getMainPageHelper(){
        return mainPageHelper;
    }

    public <T extends BasePage> T onPage(Class<T> page) {
        return atlas.create(driver, page);
    }
}
