package ui.enums;

public enum Button implements BaseEnum {
    SEND("Відправити",""),
    CONNECT("Підключитись","https://mclaut.com/cherkassy/connect"),
    PAYMENT("Оплата","https://mclaut.com/cherkassy/payment"),
    EXIT("Вийти","https://bill.mclaut.com/client/cherkassy"),
    PERSONAL_CABINET("Особистий кабінет","https://bill.mclaut.com/"),
    VIEW_PAYMENT_HISTORY("Переглянути","https://bill.mclaut.com/client/cherkassy/balance/payments"),


    ABONENT_BUTTON_PERSONAL_CABINET("Абонент","https://bill.mclaut.com/client/cherkassy/info"),
    INTERNET_BUTTON_PERSONAL_CABINET("Інтернет","https://bill.mclaut.com/client/cherkassy/user/32932"),
    BALANCE_BUTTON_PERSONAL_CABINET("Баланс","https://bill.mclaut.com/client/cherkassy/balance"),
    SERVICES_BUTTON_PERSONAL_CABINET("Послуги","https://bill.mclaut.com/client/cherkassy/service"),
    PAYMENT_BUTTON_PERSONAL_CABINET("Оплата","https://bill.mclaut.com/client/cherkassy/pay"),
    NEWS_BUTTON_PERSONAL_CABINET("Новини","https://bill.mclaut.com/client/cherkassy/news"),
    REQUESTS_BUTTON_PERSONAL_CABINET("Заявки","https://bill.mclaut.com/client/cherkassy/ticket"),
    ACTION_BUTTON_PERSONAL_CABINET("Акції","https://bill.mclaut.com/client/cherkassy/share"),

    SHOW("Показати", "https://bill.mclaut.com/client/cherkassy/balance/payments");

    private String text;
    private String url;

    Button(String text, String url) {
        this.text = text;
        this.url = url;
    }

    @Override
    public String getLocatorString(){ return text;}

    public String getUrl(){
        return url;
    }


}
