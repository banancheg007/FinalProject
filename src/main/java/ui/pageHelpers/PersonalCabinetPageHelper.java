package ui.pageHelpers;

import io.qameta.allure.Step;
import ui.initialDriver.AppManager;
import ui.pages.PageManager;

public class PersonalCabinetPageHelper extends BaseHelper{

    public PersonalCabinetPageHelper(AppManager appManager, PageManager pageManager) {
        super(appManager, pageManager);
    }

    @Step("Go to page from personal page menu")
    public PersonalCabinetPageHelper goToPage(String personalCabinetMenuButton){
        pageManager.onPersonalCabinetPage().goToPage(personalCabinetMenuButton);
        return this;
    }
}
