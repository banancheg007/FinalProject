package ui.pageHelpers;

import io.qameta.atlas.webdriver.WebPage;
import ui.initialDriver.AppManager;
import ui.pages.BasePage;
import ui.pages.MainPage;
import ui.utils.Utils;

public class MainPageHelper extends BaseHelper {

    public MainPageHelper(AppManager appManager){
        super(appManager);
    }

    public  MainPage onMainPage(){
         return onPage(MainPage.class );
    }


    public BaseHelper scrollToButton(){
        openStartUrl();
        scrollToElementWithJSExec(onMainPage().container("col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12").button("Відправити"));
        return this;
    }





}
