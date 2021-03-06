package core.listeners;



import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import core.initialDriver.InitialDriver;

public class TestListener implements ITestListener{



    @Override
    public void onStart(ITestContext arg0) {

    }

    @Override
    public void onFinish(ITestContext arg0) {

    }

    @Override
    public void onTestSuccess(ITestResult arg0) {
        InitialDriver.getInstance().destroy();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        attachScreenshot();
        InitialDriver.getInstance().destroy();
    }

    @Override
    public void onTestStart(ITestResult arg0) {
    }

    @Override
    public void onTestSkipped(ITestResult arg0) {
        InitialDriver.getInstance().destroy();
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
    }



    @Attachment(value = "Page screenshot", type = "image/png")
    private void attachScreenshot() {
        WebDriver driver = InitialDriver.getInstance().driver;
        if (driver == null) {
            System.out.println("Driver not found");
        } else {
            Allure.getLifecycle().addAttachment("Failure screenshot", "image/png", "", ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
        }
    }
}
