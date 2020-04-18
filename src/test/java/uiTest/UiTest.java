package uiTest;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.initialDriver.AppManager;
import ui.listeners.Listener;


@Epic("Main page")
@Feature("Authorization")
@Listeners({Listener.class})
public class UiTest {


    private AppManager appManager;


    @BeforeMethod
    public void setUp() {
        appManager = new AppManager();
        //System.setProperty("ATLAS_WEBSITE_URL", "https://mclaut.com/");
    }

//    @Test(description = "Open main page")
//    public void OpenMainPage() throws InterruptedException {
//       appManager.getMainPageHelper().openMainPage().changeCity(DropdownItem.YURKIVKA.getText());
//        Thread.sleep(5000);
//    }
    @Test(description = "Open main page2")
    public void OpenMainPage2() throws InterruptedException {
        appManager.getMainPageHelper().openMainPage(); //.changeCityForCheckBalance(DropdownItem.SVIDIVOK.getText());
    }
//    @Test(description = "Open main page3")
//    public void OpenMainPage3() throws InterruptedException {
//        appManager.getMainPageHelper().openMainPage().selectDropdownItem(DropDownHeader.FOR_HOME.getText(),DropdownItem.PRIVATE_HOUSE.getText());
//        Thread.sleep(5000);
//    }

}
