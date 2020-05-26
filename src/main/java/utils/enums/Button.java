package utils.enums;

public enum Button{
    SEND("Відправити",""),
    CONNECT("Підключитись","https://mclaut.com/cherkassy/connect"),
    PAYMENT("Оплата","https://mclaut.com/cherkassy/payment"),
    PERSONAL_CABINET("Особистий кабінет","https://bill.mclaut.com/"),
    VIEW_PAYMENT_HISTORY("Переглянути","https://bill.mclaut.com/client/cherkassy/balance/payments"),

    EXIT("Вийти","https://bill.mclaut.com/client/cherkassy"),


    TO_ABONENT_PAGE_BUTTON("Абонент","https://bill.mclaut.com/client/cherkassy/info"),
    TO_INTERNET_PAGE_BUTTON_("Інтернет","https://bill.mclaut.com/client/cherkassy/user/32932"),
    TO_BALANCE_PAGE_BUTTON("Баланс","https://bill.mclaut.com/client/cherkassy/balance"),
    TO_SERVICES_PAGE_BUTTON("Послуги","https://bill.mclaut.com/client/cherkassy/service"),
    TO_PAYMENT_PAGE_BUTTON("Оплата","https://bill.mclaut.com/client/cherkassy/pay"),
    TO_NEWS_PAGE_BUTTON("Новини","https://bill.mclaut.com/client/cherkassy/news"),
    TO_REQUESTS_PAGE_BUTTON("Заявки","https://bill.mclaut.com/client/cherkassy/ticket"),
    TO_ACTION_PAGE_BUTTON("Акції","https://bill.mclaut.com/client/cherkassy/share"),

    SHOW("Показати", "https://bill.mclaut.com/client/cherkassy/balance/payments");

    private String text;
    private String url;

    Button(String text, String url) {
        this.text = text;
        this.url = url;
    }

    public String getText(){ return text;}

    public String getUrl(){
        return url;
    }


}
