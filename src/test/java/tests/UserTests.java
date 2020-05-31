package tests;

public class UserTests extends BaseTest{

   /* @Test(description = "Авторизація з пустим логіном та паролем")
    public void signInEmptyData(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.EMPTY_LOGIN, Constants.EMPTY_PASSWORD).compareTextAfterLoginWithWrongData(Constants.WRONG_DATA);
    }

    @Test(description = "Авторизація з коректними даними")
    public void signIn(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().compareExpectedNameWithAuthorizedUser(Constants.FULL_NAME_ACTIVE_ABONENT);
    }

    @Test(description = "Авторизація та вихід з системи")
    public void Logout(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().logout().checkEqualsUrlWithCurrent(Button.EXIT.getUrl());
    }

    @Test(description = "Відображення інформації про користувача")
    public void InternetPage(){
        appManager.getMainPageHelper().openMainPage().clickOnButtonInHeader(Button.PERSONAL_CABINET.getText());
        appManager.getLoginPageHelper().signIn(Constants.CHERKASY,Constants.LOGIN, Constants.PASSWORD);
        appManager.getPersonalPageHelper().goToPage(ContainerEnum.TO_PAGE_INTERNET.getContainerClass());
        appManager.getInternetPageHelper().compareExpectedLoginWithAuthorizedUser(Constants.LOGIN).compareExpectedStatusWithAuthorizedUser(Constants.STATUS_ACTIVE).compareExpectedOrderDateWithAuthorizedUser(Constants.ORDER_DATE);
    }*/
}
