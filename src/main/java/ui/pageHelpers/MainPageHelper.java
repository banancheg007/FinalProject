package ui.pageHelpers;

import io.qameta.allure.Step;
import ui.initialDriver.AppManager;
import ui.pages.PageManager;
import ui.utils.Utils;

public class MainPageHelper extends BaseHelper {

    public MainPageHelper(AppManager appManager, PageManager pageManager){

        super(appManager, pageManager);
        System.out.println("MainPageHelper create");
    }

//
//    public MainPageHelper inputPersonalNumberForCheckBalance(){
//        pageManager.onMainPage().container("col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12").input("lc").sendKeys("19767");
//        return this;
//    }
//
//    public MainPageHelper changeCityForCheckBalance(){
//        pageManager.onMainPage().container("col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12");
//        return  this;
//    }

    @Step("Set personal number")
    public MainPageHelper setPersonalNumber(String number) throws InterruptedException {
        pageManager.onMainPage().setInputPersonalNumber(number);
        return this;
    }

    @Step("Scroll to send button")
    public MainPageHelper scrollToSendButton(){
        //scrollToElementWithJSExec(pageManager.onMainPage().getSendButton());
        return this;
    }



    @Step("Select captcha")
    public MainPageHelper selectCaptcha(){
        //switchToFrame(pageManager.onMainPage().frame());
        //pageManager.onMainPage().selectCaptcha();
        return this;
    }



    @Step("Open main page")
    public MainPageHelper openMainPage(){
        openUrl(Utils.URL);
        return this;
    }

    @Step("Change city in header")
    public MainPageHelper changeCityInHeader(String header, String city){
        pageManager.onMainPage().changeCityInHeader(header, city);
        return this;
    }

    @Step("Change city for check balance")
    public MainPageHelper changeCityForCheckBalance(String header, String city){
        pageManager.onMainPage().changeCityForCheckBalance(header, city);
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
