package ui.elements;

import org.openqa.selenium.By;

public interface TopMainMenu {
    //випадаючий список "Для дому" з дочірніми елементами
    By ForHomeDropDownList = By.xpath("//a[contains(text(),'Для Дому') and @type='button']");
    By PrivateHouseMenu = By.xpath("//a[contains(text(),'Багатоквартирні будівлі')]");
    By ApartmentBuildingsMenu = By.xpath("//a[contains(text(),'Приватний будинок')]");
    By TvMenu = By.xpath("//a[contains(text(),'Телебачення')]");
    By TvPlusInternetMenu = By.xpath("//a[contains(text(),'ТВ + Інтернет')]");
    By ServicesForHomeMenu = By.xpath("//a[contains(text(),'Приватний будинок')]/following-sibling::a[contains(text(),'Послуги')]");

    //випадаючий список "Для бізнесу" з дочірніми елементами
    By ForBusinessDropDownList = By.xpath("//a[contains(text(),'Для Бізнесу') and @type='button']");
    By InternetForBusinessMenu = By.xpath("//a[contains(text(),'Інтернет для бізнесу')]");
    By ServicesForBusinessMenu = By.xpath("//a[contains(text(),'Інтернет для бізнесу')]/following-sibling::a[contains(text(),'Послуги')]");;
    By AdditionsServicesForBusinessMenu = By.xpath("//a[contains(text(),'Додаткові Послуги')]");

    //випадаючий список"Інші послуги" з дочірніми елементами
    By AnotherServicesDropDownList = By.xpath("//a[contains(text(),'Інші Послуги') and @type='button']");
    By HostingMenu = By.xpath("//a[contains(text(),'Хостинг')]");
    By DomainMenu = By.xpath("//a[contains(text(),'Домен')]");
    By AdditionsServicesInAllServicesMenu = By.xpath("//a[contains(text(),'Додаткові послуги')]");

    //меню "Акції"
    By PromotionsMenu = By.xpath("//div/a[contains(text(),'Акції')]");

    //випадаючий список "Продукція" з дочірніми елементами
    By ProductionDropDownList = By.xpath("//a[contains(text(),'Продукція') and @type='button']");
    By RoutersMenu = By.xpath("//a[contains(text(),'Роутери')]");
    By IntercomsMenu = By.xpath("//a[contains(text(),'Домофони')]");

    //випадаючий список "Питання" з дочірніми елементами
    By QuestionsDropDownList = By.xpath("//a[contains(text(),'Питання')]");
    By CommonQuestionsMenu = By.xpath("//a[contains(text(),'Поширені питання')]");
    By FeedbackMenu = By.xpath("//div/a[contains(text(),'Зворотній зв')]");

    //випадаючий список "Про компанію" з дочірніми елементами
    By AboutCompanyDropDownList = By.xpath("//a[contains(text(),'Про Компанію') and @type='button']");
    By AboutCompanyMenu = By.xpath("//a[contains(text(),'Про компанію')]");
    By ContactsMenu = By.xpath("//a[contains(text(),'Контакти')]");
    By CityCameras = By.xpath("//a[contains(text(),'Камери міста')]");
    By WifiHotSpot = By.xpath("//a[contains(text(),'WiFi HotSpot')]");


}
