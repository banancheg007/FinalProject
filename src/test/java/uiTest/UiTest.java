package uiTest;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.enums.DropdownItem;
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
        //
        //System.setProperty("ATLAS_WEBSITE_URL", "https://mclaut.com/");
    }


    @Test(description = "Open main page2")
    public void OpenMainPage2() throws InterruptedException {
        appManager.getMainPageHelper().openMainPage().changeCityForCheckBalance(DropdownItem.SVIDIVOK.getText());
    }


}
