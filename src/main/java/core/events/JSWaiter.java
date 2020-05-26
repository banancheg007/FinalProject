package core.events;


import core.initialDriver.InitialDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

class JSWaiter {

    protected WebDriver driver = InitialDriver.getInstance().getDriver();
    private final WebDriverWait jsWait = new WebDriverWait(driver, 2);
    private final JavascriptExecutor jsExec = (JavascriptExecutor) driver;

    public void waitForJQueryLoad() {
        try {
            ExpectedCondition<Boolean> jQueryLoad = driver -> {
                assert driver != null;
                return ((Long) ((JavascriptExecutor) driver)
                        .executeScript("return jQuery.active") == 0);
            };
            JavascriptExecutor js = (JavascriptExecutor) driver;
            boolean jqueryReady = (Boolean) js.executeScript("return !window.jQuery");
            if (jqueryReady) {
                jsWait.until(jQueryLoad);
            }
        } catch (Exception ex) {
            System.out.println("Jquery not working" + ex.getMessage());
        }
    }

    //Wait for Angular Load
    public void waitForAngularLoad() {
        String angularReadyScript = "return angular.element(document).injector().get('$http').pendingRequests.length === 0";
        //Wait for ANGULAR to load
        ExpectedCondition<Boolean> angularLoad = driver -> {
            assert driver != null;
            return Boolean.valueOf(((JavascriptExecutor) driver)
                    .executeScript(angularReadyScript).toString());
        };
        //Get Angular is Ready
        boolean angularReady = Boolean.parseBoolean(jsExec.executeScript(angularReadyScript).toString());
        //Wait ANGULAR until it is Ready!
        if (!angularReady) {
            jsWait.until(angularLoad);
        }
    }

    //Wait Until JS Ready
    public void waitUntilJSReady() {
        //Wait for Javascript to load
        ExpectedCondition<Boolean> jsLoad = driver -> {
            assert driver != null;
            return ((JavascriptExecutor) driver)
                    .executeScript("return document.readyState").toString().equals("complete");
        };
        //Get JS is Ready
        boolean jsReady = jsExec.executeScript("return document.readyState").toString().equals("complete");
        //Wait Javascript until it is Ready!
        if (!jsReady) {
            System.out.println("JS in NOT Ready!");
            //Wait for Javascript to load
            jsWait.until(jsLoad);
        }
    }

    //Wait Until JQuery and JS Ready
    public void waitUntilJQueryReady() {
        //First check that JQuery is defined on the page. If it is, then wait AJAX
        Boolean jQueryDefined = (Boolean) jsExec.executeScript("return typeof jQuery != 'undefined'");
        if (jQueryDefined) {
            //Pre Wait for stability (Optional)
            sleep(20);
            //Wait JQuery Load
            waitForJQueryLoad();
            //Wait JS Load
            waitUntilJSReady();
            //Post Wait for stability (Optional)
            sleep(20);
        }
    }

    //Wait Until Angular and JS Ready
    public void waitUntilAngularReady() {
        //First check that ANGULAR is defined on the page. If it is, then wait ANGULAR
        Boolean angularUnDefined = (Boolean) jsExec.executeScript("return window.angular === undefined");
        if (!angularUnDefined) {
            Boolean angularInjectorUnDefined = (Boolean) jsExec.executeScript("return angular.element(document).injector() === undefined");
            if (!angularInjectorUnDefined) {
                //Pre Wait for stability (Optional)
                sleep(50);
                //Wait Angular Load
                waitForAngularLoad();
                //Wait JS Load
                waitUntilJSReady();
                //Post Wait for stability (Optional)
                sleep(50);
            }
        }
    }

    //Wait Until JQuery Angular and JS is ready
    public void waitJQueryAngular() {
        try {
            waitUntilJQueryReady();
            waitUntilAngularReady();
        } catch (Exception ex) {
            System.out.println("JS exception: " + ex.getMessage());
        }
    }

    public static void sleep(Integer seconds) {
        long secondsLong = (long) seconds;
        try {
            Thread.sleep(secondsLong);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
