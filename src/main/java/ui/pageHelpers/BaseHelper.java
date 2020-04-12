package ui.pageHelpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.initialDriver.AppManager;
import ui.pages.PageManager;
import ui.utils.Utils;

public class BaseHelper {

    public PageManager pageManager = new PageManager();

    void openUrl(String url){
        getDriver().get(url);
    }

    public void openStartUrl(){
        openUrl(Utils.URL);
    }
    public String getCurrentUrl(){
        return getDriver().getCurrentUrl();
    }

    public void scrollToElementWithJSExec(WebElement element){
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(false);", element);
    }
    public WebDriver getDriver() {
        return AppManager.getDriver();
    }
    public void SwitchToFrame(WebElement element){
        getDriver().switchTo().frame(element);
    }


}
