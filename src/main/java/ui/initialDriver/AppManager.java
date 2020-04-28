package ui.initialDriver;

import org.openqa.selenium.WebDriver;
import ui.pageHelpers.ConnectPageHelper;
import ui.pageHelpers.LoginPageHelper;
import ui.pageHelpers.MainPageHelper;
import ui.pages.PageManager;

public class AppManager {

    private  WebDriver driver = InitialDriver.getInstance().getDriver();

    private PageManager pageManager = new PageManager(this);

    private MainPageHelper mainPageHelper = new MainPageHelper(this,pageManager);
    private ConnectPageHelper connectPageHelper = new ConnectPageHelper(this, pageManager);
    private LoginPageHelper loginPageHelper = new LoginPageHelper(this,pageManager);


    public AppManager(){
        System.out.println("AppManager create");
    }

    public WebDriver getDriver(){
        return  driver;
    }

    public MainPageHelper getMainPageHelper(){
        return mainPageHelper;
    }

    public ConnectPageHelper getConnectPageHelper(){
        return connectPageHelper;
    }
    public LoginPageHelper getLoginPageHelper(){ return loginPageHelper; }


}
