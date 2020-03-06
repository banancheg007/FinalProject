package ui.pageHelpers;

import ui.initialDriver.AppManager;
import ui.pages.MainPage;
import ui.utils.Utils;

public class MainPageHelper extends BaseHelper {

    public MainPageHelper(AppManager appManager){
        super(appManager);
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
