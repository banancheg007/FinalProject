package ui.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.qameta.atlas.core.Atlas;

public interface TopMainMenu extends AtlasWebElement {

    //Бренд лого
    @FindBy("a.navbar-brand")
    WebElement getMainPageLogoButton();


    //випадаючий список "Для дому" з дочірніми елементами
    @FindBy("//a[contains(text(),'Для Дому') and @type='button']")
    WebElement getForHomeDropDownList();
    @FindBy("//a[contains(text(),'Приватний будинок')]")
    WebElement getPrivateHouseMenuItem();
    @FindBy("//a[contains(text(),'{{value}}')]")
    WebElement getApartmentBuildingsMenuItem(@Param("value") String value);
    @FindBy("//a[contains(text(),'Телебачення')]")
    WebElement getTvMenuItem();
    @FindBy("//a[contains(text(),'ТВ + Інтернет')]")
    WebElement getTvPlusInternetMenuItem();
    @FindBy("//a[contains(text(),'Приватний будинок')]/following-sibling::a[contains(text(),'Послуги')]")
    WebElement getServicesForHomeMenuItem();


    //випадаючий список "Для бізнесу" з дочірніми елементами
    @FindBy("//a[contains(text(),'Для Бізнесу') and @type='button']")
    WebElement getForBusinessDropDownList();
    @FindBy("//a[contains(text(),'Інтернет для бізнесу')]")
    WebElement getInternetForBusinessMenuItem();
    @FindBy("//a[contains(text(),'Інтернет для бізнесу')]/following-sibling::a[contains(text(),'Послуги')]")
    WebElement getServicesForBusinessMenuItem();
    @FindBy("//a[contains(text(),'Додаткові Послуги')]")
    WebElement getAdditionsServicesForBusinessMenuItem();

    //випадаючий список"Інші послуги" з дочірніми елементами
    @FindBy("//a[contains(text(),'Інші Послуги') and @type='button']")
    WebElement getAnotherServicesDropDownList();
    @FindBy("//a[contains(text(),'Хостинг')]")
    WebElement getHostingMenuItem();
    @FindBy("//a[contains(text(),'Домен')]")
    WebElement getDomainMenuItem();
    @FindBy("//a[contains(text(),'Додаткові послуги')]")
    WebElement getAdditionsServicesInAllServicesMenuItem();

    //меню "Акції"
    @FindBy("//div/a[contains(text(),'Акції')]")
    WebElement getPromotionsMenuItem();

    //випадаючий список "Продукція" з дочірніми елементами
    @FindBy("//a[contains(text(),'Продукція') and @type='button']")
    WebElement getProductionDropDownList();
    @FindBy("//a[contains(text(),'Роутери')]")
    WebElement getRoutersMenuItem();
    @FindBy("//a[contains(text(),'Домофони')]")
    WebElement getIntercomsMenuItem();

    //випадаючий список "Питання" з дочірніми елементами
    @FindBy("//a[contains(text(),'Питання')]")
    WebElement getQuestionsDropDownList();
    @FindBy("//a[contains(text(),'Поширені питання')]")
    WebElement getCommonQuestionsMenu();
    @FindBy("//div/a[contains(text(),'Зворотній зв')]")
    WebElement getFeedbackMenu();

    //випадаючий список "Про компанію" з дочірніми елементами
    @FindBy("//a[contains(text(),'Про Компанію') and @type='button']")
    WebElement getAboutCompanyDropDownList();
    @FindBy("//a[contains(text(),'Про компанію')]")
    WebElement getAboutCompanyMenuItem();
    @FindBy("//a[contains(text(),'Контакти')]")
    WebElement getContactsMenuItem();
    @FindBy("//a[contains(text(),'Камери міста')]")
    WebElement getCityCamerasMenuItem();
    @FindBy("//a[contains(text(),'WiFi HotSpot')]")
    WebElement getWifiHotSpotMenuItem();

    default void getApartmentBuildingsMenuItemClick(String value){
        getApartmentBuildingsMenuItem(value).click();
    }

    default String getApartmentBuildingsMenuItemColor(String value){
        return getApartmentBuildingsMenuItem(value).getText();
    }


}