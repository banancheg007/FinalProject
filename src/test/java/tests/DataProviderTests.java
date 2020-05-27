package tests;


import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import utils.Constants;
import utils.TestDataProviders;
import utils.enums.Button;
import utils.enums.ContainerEnum;


//@Epic("Main page")
@Feature("Smoke tests")

public class DataProviderTests extends BaseTest{

    @Test(description = "Перевірка URL після зміни міста в шапці", dataProvider = "getCitiesFromHeader", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterChangeCitiesInHeader(String header,String city, String url){
        appManager.getMainPageHelper().openMainPage().changeCityInHeader(header,city).checkEqualsUrlWithCurrent(url);
    }

    @Test(description = "Перевірка URL після вибору пункту меню", dataProvider = "getMenuItems", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterSelectDropdownMenuItems(String header,String menuItem, String url){
        appManager.getMainPageHelper().openMainPage().selectDropdownItem(header, menuItem).checkEqualsUrlWithCurrent(url);
    }

    @Test(description = "Перевірка URL після натискання плаваючої кнопки", dataProvider = "getFabs", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterClickOnFab(String fab, String url){
        appManager.getMainPageHelper().openMainPage().clickOnFab(fab).checkEqualsUrlWithCurrent(url);
       }

    @Test(description = "Перевірка URL після натискання кнопки в шапці", dataProvider = "getHeaderButtons", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterClickOnButtonInHeader(String button, String url){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(button).checkEqualsUrlWithCurrent(url);
    }


    @Test(description = "Перевірка URL після переходу на наступну сторінку з персональної сторінки", dataProvider = "getNavigateContainersToPage", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterNavigateToPagesFromPersonalPage(String container, String url){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY, Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(container).checkEqualsUrlWithCurrent(url);
    }

    @Test(description = "Перевірка URL після переходу на наступну сторінку з персонального меню", dataProvider = "getButtonsFromPesonalCabinetMenu", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterNavigateToPagesFromMenuOnPersonalPage(String personalPageMenuButtonText, String url){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(ContainerEnum.TO_PAGE_ABONENT.getContainerClass());
        appManager.getAbonentPageHelper().goToPage(personalPageMenuButtonText).checkEqualsUrlWithCurrent(url);

    }
}
