package ui.pageHelpers;

import io.qameta.allure.Step;
import ui.managers.AppManager;
import ui.managers.PageManager;

public class PersonalPageHelper extends BasePageHelper {

    public PersonalPageHelper(AppManager appManager, PageManager pageManager) {
        super(appManager, pageManager);
    }

    @Step("Порівняти очікуване ім'я з повним ім'ям авторизованого користувача")
    public PersonalPageHelper compareExpectedNameWithAuthorizedUser(String expectedFullName){
        compareString(expectedFullName,pageManager.onPersonalPage().getFullNameOfAuthorizedUser());
        return this;
    }

    @Step("Вихід з персонального кабінету")
    public PersonalPageHelper logout(){
        pageManager.onPersonalPage().logout();
        return this;
    }

    @Step("Перейти на сторінку")
    public PersonalPageHelper goToPage(String nextPageNavigateContainerClass){
        pageManager.onPersonalPage().goToPage(nextPageNavigateContainerClass);
        return this;
    }

}
