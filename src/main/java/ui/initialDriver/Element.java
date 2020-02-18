package ui.initialDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class Element extends Base {

    protected WebDriver driver = InitialDriver.getInstance().getDriver();

    /**
     * Status of element
     * Get status of element
     *
     * @param webElementExpectedCondition WebElement element,By locator
     * @return getWebElement(ExpectedConditions.elementToBeClickable ( element));
     */
    public WebElement getWebElement(ExpectedCondition<WebElement> webElementExpectedCondition) {
        WebDriverWait wait = new WebDriverWait(driver, TIME_OUT);
        wait.pollingEvery(Duration.ofMillis(DELAY));
        wait.ignoring(NoSuchElementException.class);
        wait.ignoring(StaleElementReferenceException.class);
        wait.ignoring(InterruptedException.class);
        wait.ignoring(UnknownError.class);
        return wait.until(webElementExpectedCondition);
    }

    public WebElement waitUntilClickable(By locator) {
        return getWebElement(ExpectedConditions.elementToBeClickable(locator));
    }

    public WebElement waitUntilClickable(WebElement element) {
        return getWebElement(ExpectedConditions.elementToBeClickable(element));
    }

    public WebElement waitUntilVisible(WebElement element) {
        return getWebElement(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitUntilVisible(By locator) {
        return getWebElement(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitUntilExist(By locator) {
        return getWebElement(ExpectedConditions.presenceOfElementLocated(locator));
    }

    /**
     * Status of element
     * Get status of element
     *
     * @param stateElementExpectedCondition WebElement element,By locator
     * @return getWebStateOfElement(ExpectedConditions.elementToBeSelected ( element));
     */
    public boolean getWebStateOfElement(ExpectedCondition<Boolean> stateElementExpectedCondition) {
        WebDriverWait wait = new WebDriverWait(driver, TIME_OUT);
        wait.pollingEvery(Duration.ofMillis(DELAY));
        wait.ignoring(NoSuchElementException.class);
        wait.ignoring(StaleElementReferenceException.class);
        wait.ignoring(InterruptedException.class);
        return (boolean) wait.until(stateElementExpectedCondition);
    }

    public boolean isSelected(WebElement element) {
        return getWebStateOfElement(ExpectedConditions.elementToBeSelected(element));
    }

    public boolean isSelected(By locator) {
        return getWebStateOfElement(ExpectedConditions.elementToBeSelected(locator));
    }

    public boolean waitUntilInvisible(By locator) {
        return getWebStateOfElement(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public boolean waitUntilInvisible(WebElement element) {
        return getWebStateOfElement(ExpectedConditions.invisibilityOf(element));
    }

    public boolean waitUntilTextPresent(By locator, String text) {
        return getWebStateOfElement(ExpectedConditions.textToBe(locator, text));
    }

    public boolean waitUntilTextPresent(WebElement element, String text) {
        return getWebStateOfElement(ExpectedConditions.textToBePresentInElement(element, text));
    }


    public List<WebElement> selectFromList(By locator) {
        waitUntilClickable(locator);
        return driver.findElements(locator);
    }
}