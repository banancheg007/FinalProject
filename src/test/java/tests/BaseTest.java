package tests;

import core.initialDriver.InitialDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import ui.AppManager;

public class BaseTest {
    protected AppManager appManager;

    @Parameters("browser")
    @BeforeMethod
    public void setUp(String browser) {
        InitialDriver.getInstance().setBrowser(browser);
        appManager = new AppManager();
    }
}
