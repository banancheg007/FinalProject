package ui.pageHelpers;

import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import io.qameta.atlas.webdriver.WebPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import ui.initialDriver.AppManager;
import ui.pages.BasePage;
import ui.utils.Utils;

public class BaseHelper {
    AppManager appManager;

    void openUrl(String url){
        appManager.getDriver().get(url);
    }

    public void openStartUrl(){
        openUrl(Utils.URL);
    }
    public String getCurrentUrl(){
        return appManager.getDriver().getCurrentUrl();
    }
    public BaseHelper(AppManager appManager){
      //  System.out.println("Helper create");
        this.appManager = appManager;
    }

    public void scrollToElementWithJSExec(WebElement element){
        ((JavascriptExecutor)appManager.getDriver()).executeScript("arguments[0].scrollIntoView(false);", element);
    }

    public void SwitchToFrame(WebElement element){
        appManager.getDriver().switchTo().frame(element);
    }

    public <T extends WebPage> T onPage(Class<T> page) {
        return new Atlas(new WebDriverConfiguration((appManager.getDriver()))).create(appManager.getDriver(), page);
    }


}
