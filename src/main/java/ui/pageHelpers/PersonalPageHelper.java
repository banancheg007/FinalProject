package ui.pageHelpers;

import io.qameta.allure.Step;
import ui.initialDriver.AppManager;
import ui.pages.PageManager;

public class PersonalPageHelper extends BaseHelper{

    public PersonalPageHelper(AppManager appManager, PageManager pageManager) {
        super(appManager, pageManager);
    }

    @Step("Compare expected full name with the authorized user")
    public PersonalPageHelper compareExpectedNameWithAuthorizedUser(String expectedFullName){
        compareString(expectedFullName,pageManager.onPersonalPage().getFullNameOfAuthorizedUser());
        return this;
    }

    @Step("Logout")
    public PersonalPageHelper logout(){
        pageManager.onPersonalPage().logout();
        return this;
    }

    @Step("Go to internet page")
    public PersonalPageHelper goToInternetPage(){
        pageManager.onPersonalPage().goToInternetPage();
        return this;
    }

    @Step("Go to balance page")
    public PersonalPageHelper goToBalancePage(){
        pageManager.onPersonalPage().goToBalancePage();
        return this;
    }
}
