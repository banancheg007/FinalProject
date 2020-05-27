package ui.pageHelpers;

import io.qameta.allure.Step;
import utils.enums.Label;
import ui.AppManager;
import ui.PageManager;

public class InternetPageHelper extends PersonalCabinetPageHelper {

    public InternetPageHelper(AppManager appManager, PageManager pageManager) {
        super(appManager, pageManager);
    }


    @Step("Порівняти очікуване і поточне ім'я користувача(авторизованого)")
    public InternetPageHelper compareExpectedLoginWithAuthorizedUser(String expectedLogin){
        compareString(expectedLogin, pageManager.onInternetPage().dataLabel(Label.LOGIN.getText()).getText());
        return this;
    }

    @Step("Порівняти очікуваний і поточний статус користувача(авторизованого)")
    public InternetPageHelper compareExpectedStatusWithAuthorizedUser(String expectedLogin){
        compareString(expectedLogin, pageManager.onInternetPage().dataLabel(Label.STATUS.getText()).getText());
        return this;
    }

    @Step("Порівняти очікувану і дату замовлення послуг авторизованого користувача")
    public InternetPageHelper compareExpectedOrderDateWithAuthorizedUser(String expectedLogin){
        compareString(expectedLogin, pageManager.onInternetPage().dataLabel(Label.ORDER_DATE.getText()).getText());
        return this;
    }


}
