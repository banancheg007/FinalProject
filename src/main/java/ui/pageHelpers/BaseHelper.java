package ui.pageHelpers;

import io.qameta.atlas.webdriver.AtlasWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import ui.initialDriver.AppManager;
import ui.pages.PageManager;

import java.util.ArrayList;

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


    public WebDriver getDriver() {
        return appManager.getDriver();
    }
    public void switchToFrame(WebElement element){
        getDriver().switchTo().frame(element);
    }

    public void switchTab(){
        ArrayList<String> tabs2 = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs2.get(1));
        System.out.println(tabs2.size());
    }


    public void compareStringWithTextFromElement(String expectedString, AtlasWebElement actualElementWithText){
        Assert.assertEquals(actualElementWithText.getText(),expectedString);
    }

    public void waitForTextInElement(String expectedText,WebElement element){
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(),3);
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(element,expectedText));
    }


}
