package ui.pageHelpers;

import io.qameta.allure.Step;
import ui.AppManager;
import ui.PageManager;
import utils.Constants;

public class MainPageHelper extends BaseHelper {

    public MainPageHelper(AppManager appManager, PageManager pageManager){
        super(appManager, pageManager);
    }


    @Step("Відкрити головноу сторінку")
    public MainPageHelper openMainPage(){
        openUrl(Constants.URL);
        return this;
    }
    @Step("Змінити місто в шапці")
    public MainPageHelper changeCityInHeader(String header, String city){
        pageManager.onMainPage().changeCityInHeader(header, city);
        return this;
    }

    @Step("Натиснути кнопку в шапці")
    public MainPageHelper clickOnButtonInHeader(String button){
        pageManager.onMainPage().clickOnButtonInHeader(button);
        return this;
    }

    @Step("Вибрати пункт меню")
    public MainPageHelper selectDropdownItem(String header, String menuItem){
        pageManager.onMainPage().changeDropdownItemInNavigationBar(header,menuItem);
        return this;
    }

    @Step("Натиснути плаваючу кнопку")
    public MainPageHelper clickOnFab(String fab){
        pageManager.onMainPage().clickOnFab(fab);
        switchTab();
        return this;
    }













}
