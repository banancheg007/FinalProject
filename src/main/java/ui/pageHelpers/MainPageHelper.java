package ui.pageHelpers;

import io.qameta.allure.Step;
import ui.AppManager;
import ui.PageManager;
import utils.Constants;

public class MainPageHelper extends BaseHelper {

    public MainPageHelper(AppManager appManager, PageManager pageManager){

        super(appManager, pageManager);
        System.out.println("MainPageHelper create");
    }


    @Step("Open main page")
    public MainPageHelper openMainPage(){
        openUrl(Constants.URL);
        return this;
    }

    @Step("Change city in header")
    public MainPageHelper changeCityInHeader(String header, String city){
        pageManager.onMainPage().changeCityInHeader(header, city);
        return this;
    }

    @Step("Click on button in header")
    public MainPageHelper clickOnButtonInHeader(String button){
        pageManager.onMainPage().clickOnButtonInHeader(button);
        return this;
    }

    @Step("Select menu item")
    public MainPageHelper selectDropdownItem(String header, String menuItem){
        pageManager.onMainPage().changeDropdownItemInNavigationBar(header,menuItem);
        return this;
    }

    @Step("Click on fab")
    public MainPageHelper clickOnFab(String fab){
        pageManager.onMainPage().clickOnFab(fab);
        switchTab();
        return this;
    }













}
