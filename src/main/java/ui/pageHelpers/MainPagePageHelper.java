package ui.pageHelpers;

import io.qameta.allure.Step;
import ui.managers.AppManager;
import ui.managers.PageManager;
import utils.Constants;

public class MainPagePageHelper extends BasePageHelper {

    public MainPagePageHelper(AppManager appManager, PageManager pageManager){
        super(appManager, pageManager);
    }


    @Step("Відкрити головноу сторінку")
    public MainPagePageHelper openMainPage(){
        openUrl(Constants.URL);
        return this;
    }
    @Step("Змінити місто в шапці")
    public MainPagePageHelper changeCityInHeader(String header, String city){
        pageManager.onMainPage().changeCityInHeader(header, city);
        return this;
    }

    @Step("Натиснути кнопку в шапці")
    public MainPagePageHelper clickOnButtonInHeader(String button){
        pageManager.onMainPage().clickOnButtonInHeader(button);
        return this;
    }

    @Step("Вибрати пункт меню")
    public MainPagePageHelper selectDropdownItem(String header, String menuItem){
        pageManager.onMainPage().changeDropdownItemInNavigationBar(header,menuItem);
        return this;
    }

    @Step("Натиснути плаваючу кнопку")
    public MainPagePageHelper clickOnFab(String fab){
        pageManager.onMainPage().clickOnFab(fab);
        switchTab();
        return this;
    }













}
