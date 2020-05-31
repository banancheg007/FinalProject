package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import utils.TestDataProviders;
import utils.enums.Button;

public class SmokeTests extends BaseTest{

    @Severity(value = SeverityLevel.NORMAL)
    @Feature("Connect requests")
    @Test(description = "Відправка запиту на підключення", dataProvider = "getUserData", dataProviderClass = TestDataProviders.class)
    public void CheckSendingConnectRequest(String surname, String name, String telephone, String address, String message, String expectedText){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.CONNECT.getText());
        appManager.getConnectPageHelper().fillConnectFormAndSendRequest(surname, name, telephone, address, message).compareTextAfterSendRequestForConnectWithWrongData(expectedText);
    }
}
