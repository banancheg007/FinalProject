package utils.enums;

public enum DropDownMenuHeaderItem{


    //"Для Дому" dropdown items
    APARTMENT_BUILDINGS("Для Дому","Багатоквартирні будівлі","https://mclaut.com/cherkassy/home#flat"),
    PRIVATE_HOUSE("Для Дому","Приватний будинок", "https://mclaut.com/cherkassy/home#house"),
    TV("Для Дому","Телебачення","https://mclaut.com/cherkassy/home#tv"),
    TV_PLUS_INTERNET("Для Дому","ТВ + Інтернет","https://mclaut.com/cherkassy/home#tv_ethernet"),
    SERVICES_FOR_HOME("Для Дому","Послуги","https://mclaut.com/cherkassy/home#service"),

    //"Для Бізнесу" dropdown items
    INTERNET_FOR_BUSINESS("Для Бізнесу","Інтернет для бізнесу","https://mclaut.com/cherkassy/business#business"),
    SERVICES_FOR_BUSINESS("Для Бізнесу","Послуги","https://mclaut.com/cherkassy/business#service_business"),
    ADDITIONAL_SERVICES_FOR_BUSINESS("Для Бізнесу","Додаткові Послуги","https://mclaut.com/cherkassy/business#service"),

    //"Інші Послуги" dropdown items
    HOSTING("Інші Послуги","Хостинг","https://mclaut.com/cherkassy/another#hosting"),
    DOMAIN("Інші Послуги","Домен","https://mclaut.com/cherkassy/another#domain"),
    ADDITIONAL_SERVICES_FOR_OTHER_SERVICES("Інші Послуги","Додаткові послуги","https://mclaut.com/cherkassy/another#additional"),

    //"Продукція" dropdown items
    ROUTERS("Продукція","Роутери","https://mclaut.com/cherkassy/product#routers"),
    INTERCOMS("Продукція","Домофони","https://mclaut.com/cherkassy/product#intercoms"),

    //"Питання" dropdown items
    COMMON_QUESTIONS("Питання","Поширенні питання","https://mclaut.com/cherkassy/faq"),
    FEEDBACK("Питання","Зворотній зв","https://mclaut.com/cherkassy/request"),

    //"Про Компанію" dropdown items
    ABOUT_COMPANY("Про Компанію","Про компанію","https://mclaut.com/cherkassy/about#company"),
    CONTACTS("Про Компанію","Контакти","https://mclaut.com/cherkassy/about#contacts"),
    CITY_CAMERAS("Про Компанію","Камери міста","https://mclaut.com/cherkassy/about#cams"),
    WIFI_HOTSPOT("Про Компанію","WiFi HotSpot","https://mclaut.com/cherkassy/about#hotspot");


    private String text;
    private String url;
    private String header;

    DropDownMenuHeaderItem(String header, String text, String url) {
        this.header = header;
        this.text = text;
        this.url = url;
    }

    public String getText(){ return text;}

    public String getUrl() {
        return url;
    }

    public String getHeader() {
        return header;
    }
}
