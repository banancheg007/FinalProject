package ui.pageHelpers;

import io.qameta.allure.Step;
import ui.managers.AppManager;
import ui.managers.PageManager;

public class PersonalCabinetPagePageHelper extends BasePageHelper {

    public PersonalCabinetPagePageHelper(AppManager appManager, PageManager pageManager) {
        super(appManager, pageManager);
    }

    @Step("Перейти на сторінку із персонального меню")
    public PersonalCabinetPagePageHelper goToPage(String personalCabinetMenuButton){
        pageManager.onPersonalCabinetPage().goToPage(personalCabinetMenuButton);
        return this;
    }
}
