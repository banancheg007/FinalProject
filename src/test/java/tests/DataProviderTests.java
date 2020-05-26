package tests;


import core.listeners.Listener;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.Constants;
import utils.TestDataProviders;
import utils.enums.Button;
import utils.enums.ContainerEnum;


//@Epic("Main page")
@Feature("Smoke tests")
@Listeners({Listener.class})
public class DataProviderTests extends BaseTest{

    @Test(description = "Check references after change cities in header", dataProvider = "getCitiesFromHeader", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterChangeCitiesInHeader(String header,String city, String url){
        appManager.getMainPageHelper().openMainPage().changeCityInHeader(header,city).checkEqualsUrlWithCurrent(url);
    }

    @Test(description = "Check references after select dropdown menu items", dataProvider = "getMenuItems", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterSelectDropdownMenuItems(String header,String menuItem, String url){
        appManager.getMainPageHelper().openMainPage().selectDropdownItem(header, menuItem).checkEqualsUrlWithCurrent(url);
    }

    @Test(description = "Check references after click on fab", dataProvider = "getFabs", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterClickOnFab(String fab, String url){
        appManager.getMainPageHelper().openMainPage().clickOnFab(fab).checkEqualsUrlWithCurrent(url);
       }

    @Test(description = "Check references after click on button in header", dataProvider = "getHeaderButtons", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterClickOnButtonInHeader(String button, String url){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(button).checkEqualsUrlWithCurrent(url);
    }


    @Test(description = "Check references after navigate to pages from personal page", dataProvider = "getNavigateContainersToPage", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterNavigateToPagesFromPersonalPage(String container, String url){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY, Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(container).checkEqualsUrlWithCurrent(url);
    }

    @Test(description = "Check references after navigate to pages from menu on personal page", dataProvider = "getButtonsFromPesonalCabinetMenu", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterNavigateToPagesFromMenuOnPersonalPage(String personalPageMenuButtonText, String url){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(ContainerEnum.TO_PAGE_ABONENT.getContainerClass());
        appManager.getAbonentPageHelper().goToPage(personalPageMenuButtonText).checkEqualsUrlWithCurrent(url);

    }
}
