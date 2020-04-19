package uiTest;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.initialDriver.AppManager;
import ui.listeners.Listener;
import ui.utils.TestDataProviders;


@Epic("Main page")
@Feature("Authorization")
@Listeners({Listener.class})
public class UiTest {


    private AppManager appManager;


    @BeforeMethod
    public void setUp() {
       // System.setProperty("console.encoding","utf-8");
        appManager = new AppManager();

        //System.setProperty("ATLAS_WEBSITE_URL", "https://mclaut.com/");
    }

    @Test(description = "Open main page", dataProvider = "getCity", dataProviderClass = TestDataProviders.class)
    public void OpenMainPage(String city) throws InterruptedException {
       // DropdownCityItem.printEnum3(DropdownCityItem.values());
       appManager.getMainPageHelper().openMainPage().changeCity(city);
        //Thread.sleep(5000);
    }
//    @Test(description = "Open main page2")
//    public void OpenMainPage2() throws InterruptedException {
//        appManager.getMainPageHelper().openMainPage().changeCityForCheckBalance(DropdownCityItem.SVIDIVOK.getText());
//    }
//    @Test(description = "Open main page3")
//    public void OpenMainPage3() throws InterruptedException {
//        appManager.getMainPageHelper().openMainPage().selectDropdownItem(DropDownHeader.FOR_HOME.getText(), DropdownCityItem.PRIVATE_HOUSE.getText());
//        Thread.sleep(5000);
//    }

}
