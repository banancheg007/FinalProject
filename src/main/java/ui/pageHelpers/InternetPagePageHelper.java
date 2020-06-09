package ui.pageHelpers;

import io.qameta.allure.Step;
import utils.enums.Label;
import ui.managers.AppManager;
import ui.managers.PageManager;

public class InternetPagePageHelper extends PersonalCabinetPagePageHelper {

    public InternetPagePageHelper(AppManager appManager, PageManager pageManager) {
        super(appManager, pageManager);
    }


    @Step("Порівняти очікуване і поточне ім'я користувача(авторизованого)")
    public InternetPagePageHelper compareExpectedLoginWithAuthorizedUser(String expectedLogin){
        compareString(expectedLogin, pageManager.onInternetPage().dataLabel(Label.LOGIN.getText()).getText());
        return this;
    }

    @Step("Порівняти очікуваний і поточний статус користувача(авторизованого)")
    public InternetPagePageHelper compareExpectedStatusWithAuthorizedUser(String expectedLogin){
        compareString(expectedLogin, pageManager.onInternetPage().dataLabel(Label.STATUS.getText()).getText());
        return this;
    }

    @Step("Порівняти очікувану і дату замовлення послуг авторизованого користувача")
    public InternetPagePageHelper compareExpectedOrderDateWithAuthorizedUser(String expectedLogin){
        compareString(expectedLogin, pageManager.onInternetPage().dataLabel(Label.ORDER_DATE.getText()).getText());
        return this;
    }


}
