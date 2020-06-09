package ui.pageHelpers;

import io.qameta.allure.Step;
import ui.managers.AppManager;
import ui.managers.PageManager;

public class PersonalPagePageHelper extends BasePageHelper {

    public PersonalPagePageHelper(AppManager appManager, PageManager pageManager) {
        super(appManager, pageManager);
    }

    @Step("Порівняти очікуване ім'я з повним ім'ям авторизованого користувача")
    public PersonalPagePageHelper compareExpectedNameWithAuthorizedUser(String expectedFullName){
        compareString(expectedFullName,pageManager.onPersonalPage().getFullNameOfAuthorizedUser());
        return this;
    }

    @Step("Вихід з персонального кабінету")
    public PersonalPagePageHelper logout(){
        pageManager.onPersonalPage().logout();
        return this;
    }

    @Step("Перейти на сторінку")
    public PersonalPagePageHelper goToPage(String nextPageNavigateContainerClass){
        pageManager.onPersonalPage().goToPage(nextPageNavigateContainerClass);
        return this;
    }

}
