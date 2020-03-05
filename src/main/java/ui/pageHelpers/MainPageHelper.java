package ui.pageHelpers;

import ui.initialDriver.AppManager;
import ui.pages.MainPage;
import ui.utils.Utils;

public class MainPageHelper {
    AppManager appManager;

    public MainPageHelper(AppManager appManager){
        this.appManager = appManager;
    }

    void openUrl(String url){
        appManager.getDriver().get(url);
    }

    public String getCurrentUrl(){
        return appManager.getDriver().getCurrentUrl();
    }

     public void openStartUrl(){
        openUrl(Utils.URL);
    }
}
