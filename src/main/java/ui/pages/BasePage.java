package ui.pages;

import org.openqa.selenium.WebDriver;
import ui.initialDriver.InitialDriver;

public class BasePage {
    protected WebDriver driver = InitialDriver.getInstance().getDriver();

    public void openUrl(String url){
        driver.get(url);
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
