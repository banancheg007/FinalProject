package ui.enums;

public enum DropDownMenuItem implements BaseEnum{

    //"Для Дому" dropdown items
    APARTMENT_BUILDINGS("Багатоквартирні будівлі"),
    PRIVATE_HOUSE("Приватний будинок"),
    TV("Телебачення"),
    TV_PLUS_INTERNET("ТВ + Інтернет"),
    SERVICES_FOR_HOME("Послуги"),

    //"Для Бізнесу" dropdown items
    INTERNET_FOR_BUSINESS("Інтернет для бізнесу"),
    SERVICES_FOR_BUSINESS("Послуги"),
    ADDITIONAL_SERVICES_FOR_BUSINESS("Додаткові Послуги"),

    //"Інші Послуги" dropdown items
    HOSTING("Хостинг"),
    DOMAIN("Домен"),
    ADDITIONAL_SERVICES_FOR_OTHER_SERVICES("Додаткові послуги"),

    //"Продукція" dropdown items
    ROUTERS("Роутери"),
    INTERCOMS("Домофони"),

    //"Питання" dropdown items
    COMMON_QUESTIONS("Поширенні питання"),
    FEEDBACK("Зворотній зв'язок"),

    //"Про Компанію" dropdown items
    ABOUT_COMPANY("Про компанію"),
    CONTACTS("Контакти"),
    CITY_CAMERAS("Камери міста"),
    WIFI_HOTSPOT("WiFi HotSpot");

    private String text;

    DropDownMenuItem(String text) {
        this.text = text;
    }

    @Override
    public String getLocatorString(){ return text;}
}
