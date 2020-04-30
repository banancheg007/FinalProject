package ui.pageHelpers;

import io.qameta.allure.Step;
import ui.enums.Label;
import ui.initialDriver.AppManager;
import ui.pages.PageManager;

public class InternetPageHelper extends BaseHelper {

    public InternetPageHelper(AppManager appManager, PageManager pageManager) {
        super(appManager, pageManager);
    }


    @Step("Compare expected login with the authorized user")
    public InternetPageHelper compareExpectedLoginWithAuthorizedUser(String expectedLogin){
        compareString(expectedLogin, pageManager.onInternetPage().dataLabel(Label.LOGIN.getLocatorString()).getText());
        return this;
    }

    @Step("Compare expected user status with the authorized user status")
    public InternetPageHelper compareExpectedStatusWithAuthorizedUser(String expectedLogin){
        compareString(expectedLogin, pageManager.onInternetPage().dataLabel(Label.STATUS.getLocatorString()).getText());
        return this;
    }

    @Step("Compare expected order date with the authorized user order date")
    public InternetPageHelper compareExpectedOrderDateWithAuthorizedUser(String expectedLogin){
        compareString(expectedLogin, pageManager.onInternetPage().dataLabel(Label.ORDER_DATE.getLocatorString()).getText());
        return this;
    }


}