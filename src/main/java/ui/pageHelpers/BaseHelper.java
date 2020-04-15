package ui.pageHelpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.initialDriver.AppManager;
import ui.pages.PageManager;

public class BaseHelper {

    protected AppManager appManager;

    protected PageManager pageManager;

    void openUrl(String url){
        getDriver().get(url);
    }

    BaseHelper(AppManager appManager, PageManager pageManager){
        this.appManager = appManager;
        this.pageManager = pageManager;
    }

    public String getCurrentUrl(){
        return getDriver().getCurrentUrl();
    }

    public void scrollToElementWithJSExec(WebElement element){
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(false);", element);
    }
    public WebDriver getDriver() {
        return appManager.getDriver();
    }
    public void switchToFrame(WebElement element){
        getDriver().switchTo().frame(element);
    }


}
