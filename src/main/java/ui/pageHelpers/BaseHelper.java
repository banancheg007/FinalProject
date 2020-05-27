package ui.pageHelpers;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import ui.AppManager;
import ui.PageManager;

import java.util.ArrayList;

public class BaseHelper {

    protected AppManager appManager;

    protected PageManager pageManager;

    void openUrl(String url){
        getDriver().navigate().to(url);
    }

    BaseHelper(AppManager appManager, PageManager pageManager){
        this.appManager = appManager;
        this.pageManager = pageManager;
    }

    public String getCurrentUrl(){
        return getDriver().getCurrentUrl();
    }


    public WebDriver getDriver() {
        return appManager.getDriver();
    }
    public void switchToFrame(WebElement element){
        getDriver().switchTo().frame(element);
    }

    public void switchTab(){
        ArrayList<String> tabs2 = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs2.get(1));
    }

    @Step("Зрівняти поточний і очікуваний URL")
    public BaseHelper checkEqualsUrlWithCurrent(String expectedUrl){
        waitForLoadUrl(expectedUrl);
        Assert.assertEquals(getCurrentUrl(),expectedUrl);
        return this;
    }


    public void compareString(String expectedString, String actualText){
        Assert.assertEquals(actualText,expectedString);
    }

    /*public void waitForCustomConditions(Function expectedConditions, long timeOutInSeconds ){
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(),timeOutInSeconds);
        webDriverWait.until(expectedConditions);
    }*/

    public void waitForLoadUrl(String url ){
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(),3);
        webDriverWait.until(ExpectedConditions.urlToBe(url));
    }


}
