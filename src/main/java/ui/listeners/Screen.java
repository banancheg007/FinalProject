package ui.listeners;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ui.initialDriver.InitialDriver;

public class Screen {

    public void getScreen() {
        if (InitialDriver.getInstance().driver == null) return;
        //Get driver from BaseTest and assign to local webDriver variable.
        String base64Screenshot = "data:image/png;base64," + ((TakesScreenshot) InitialDriver.getInstance().driver).getScreenshotAs(OutputType.BASE64);
    }
}
