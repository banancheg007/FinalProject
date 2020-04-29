package ui.pageHelpers;

import io.qameta.allure.Step;
import ui.initialDriver.AppManager;
import ui.pages.PageManager;

public class PersonalPageHelper extends BaseHelper{

    public PersonalPageHelper(AppManager appManager, PageManager pageManager) {
        super(appManager, pageManager);
    }

    @Step("Compare expected full name with the authorized user")
    public void compareExpectedNameWithAuthorizedUser(String expectedFullName){
        compareString(expectedFullName,pageManager.onPersonalPage().getFullNameOfAuthorizedUser());
    }
}
