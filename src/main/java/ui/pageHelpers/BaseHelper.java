package ui.pageHelpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import ui.initialDriver.AppManager;

public class BaseHelper {
    AppManager appManager;


    public BaseHelper(AppManager appManager){
        System.out.println("Helper create");
        this.appManager = appManager;
    }

    public void scrollToElementWithJSExec(WebElement element){
        ((JavascriptExecutor)appManager.getDriver()).executeScript("arguments[0].scrollIntoView();", element);
    }
}
