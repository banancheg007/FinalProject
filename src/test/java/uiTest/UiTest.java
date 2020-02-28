package uiTest;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.listeners.Listener;
import ui.pages.MainPage;


@Epic("Main page")
@Feature("Authorization")
@Listeners({Listener.class})
public class UiTest {

    private MainPage mainPage;


    @BeforeMethod
    public void setUp() {
        mainPage = new MainPage();
    }

    @Test(description = "Open main page")
    public void OpenMainPage() {
        mainPage.openStartUrl();
        Assert.assertEquals(mainPage.getCurrentUrl(), "www.gfgfdg");
    }


}
