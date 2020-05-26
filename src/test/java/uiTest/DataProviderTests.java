package uiTest;


import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.enums.Button;
import ui.enums.ContainerEnum;
import ui.initialDriver.AppManager;
import ui.listeners.Listener;
import ui.utils.TestDataProviders;
import ui.utils.Utils;


//@Epic("Main page")
@Feature("Smoke tests")
@Listeners({Listener.class})
public class DataProviderTests extends BaseTest{

    protected AppManager appManager;

    @BeforeMethod
    public void setUp() {
        appManager = new AppManager();
        //System.setProperty("ATLAS_WEBSITE_URL", "https://mclaut.com/");
    }


    @Test(description = "Check references after change cities in header", dataProvider = "getCitiesFromHeader", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterChangeCitiesInHeader(String header,String city, String url){
        appManager = new AppManager();
        appManager.getMainPageHelper().openMainPage().changeCityInHeader(header,city).checkEqualsUrlWithCurrent(url);
    }
    @Test(description = "Check references after select dropdown menu items", dataProvider = "getMenuItems", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterSelectDropdownMenuItems(String header,String menuItem, String url){
        appManager = new AppManager();
        appManager.getMainPageHelper().openMainPage().selectDropdownItem(header, menuItem).checkEqualsUrlWithCurrent(url);
    }

    @Test(description = "Check references after click on fab", dataProvider = "getFabs", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterClickOnFab(String fab, String url) throws InterruptedException {
        appManager = new AppManager();
        appManager.getMainPageHelper().openMainPage().clickOnFab(fab).checkEqualsUrlWithCurrent(url);
    }

    @Test(description = "Check references after click on button in header", dataProvider = "getHeaderButtons", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterClickOnButtonInHeader(String button, String url){
        appManager = new AppManager();
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(button).checkEqualsUrlWithCurrent(url);
    }


    @Test(description = "Check references after navigate to pages from personal page", dataProvider = "getNavigateContainersToPage", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterNavigateToPagesFromPersonalPage(String container, String url){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Utils.CHERKASY,Utils.LOGIN, Utils.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(container).checkEqualsUrlWithCurrent(url);
    }

    @Test(description = "Check references after navigate to pages from menu on personal page", dataProvider = "getButtonsFromPesonalCabinetMenu", dataProviderClass = TestDataProviders.class)
    public void CheckReferencesAfterNavigateToPagesFromMenuOnPersonalPage(String personalPageMenuButtonText, String url){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Utils.CHERKASY,Utils.LOGIN, Utils.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(ContainerEnum.TO_PAGE_ABONENT.getContainerClass());
        appManager.getAbonentPageHelper().goToPage(personalPageMenuButtonText).checkEqualsUrlWithCurrent(url);

    }

    /* @Test(description = "Change cities in check balance tab", dataProvider = "getCitiesWithoutUrls", dataProviderClass = TestDataProviders.class)
    public void ChangeCitiesInCheckBalanceTab(String header,String city){
        appManager = new AppManager();
        appManager.getMainPageHelper().openMainPage().changeCityForCheckBalance(header,city);
    }*/
}
