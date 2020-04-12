package ui.initialDriver;

import org.openqa.selenium.WebDriver;
import ui.pageHelpers.MainPageHelper;

public class AppManager {

    private static WebDriver driver = InitialDriver.getInstance().getDriver();

    private MainPageHelper mainPageHelper = new MainPageHelper();

    public AppManager(){
        System.out.println("AppManager create");
    }

    public static WebDriver getDriver(){
        return  driver;
    }

    public MainPageHelper getMainPageHelper(){
        return mainPageHelper;
    }


}
