package ui.enums;

public enum Button implements BaseEnum {
    SEND("Відправити",""),
    CONNECT("Підключитись","https://mclaut.com/cherkassy/connect"),
    PAYMANT("Оплата","https://mclaut.com/cherkassy/payment"),
    EXIT("Вийти","https://bill.mclaut.com/client/cherkassy"),
    PERSONAL_CABINET("Особистий кабінет","https://bill.mclaut.com/");

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
