package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import utils.Constants;
import utils.enums.Button;
import utils.enums.ContainerEnum;

public class UserTests extends BaseTest{

    @Severity(value = SeverityLevel.NORMAL)
    @Feature("User")
    @Test(description = "Авторизація з пустим логіном та паролем")
    public void LoginEmptyData(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.EMPTY_LOGIN, Constants.EMPTY_PASSWORD).compareTextAfterLoginWithWrongData(Constants.WRONG_DATA);
    }

    @Severity(value = SeverityLevel.NORMAL)
    @Feature("User")
    @Test(description = "Авторизація з коректними даними")
    public void Login(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().compareExpectedNameWithAuthorizedUser(Constants.FULL_NAME_ACTIVE_ABONENT);
    }

    @Severity(value = SeverityLevel.NORMAL)
    @Feature("User")
    @Test(description = "Авторизація та вихід з системи")
    public void Logout(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().logout().checkEqualsUrlWithCurrent(Button.EXIT.getUrl());
    }

    @Severity(value = SeverityLevel.NORMAL)
    @Feature("User")
    @Test(description = "Відображення інформації про користувача")
    public void DisplayingUserData(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(ContainerEnum.TO_PAGE_INTERNET.getContainerClass());
        appManager.getInternetPageHelper().compareExpectedLoginWithAuthorizedUser(Constants.LOGIN).compareExpectedStatusWithAuthorizedUser(Constants.STATUS_ACTIVE).compareExpectedOrderDateWithAuthorizedUser(Constants.ORDER_DATE);
    }
}
