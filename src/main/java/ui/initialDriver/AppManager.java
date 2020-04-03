package ui.initialDriver;

import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.openqa.selenium.WebDriver;
import ui.pageHelpers.MainPageHelper;
import ui.pages.BasePage;
import ui.pages.MainPage;

public class AppManager {

    private WebDriver driver = InitialDriver.getInstance().getDriver();

    private MainPageHelper mainPageHelper = new MainPageHelper(this);

    public AppManager(){
        System.out.println("AppManager create");
    }
    public WebDriver getDriver(){
        return  driver;
    }

    public MainPageHelper getMainPageHelper(){
        return mainPageHelper;
    }


}
