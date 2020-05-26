package utils.enums;

public enum Input{
    PERSONAL_NUMBER("lc"),
    SURNAME("name"),
    NAME("surname"),
    TELEPHONE("telephone"),
    ADDRESS("address"),
    BTN_CITY_SELECT("btn_city_select"),
    BTN_LOGIN("btn_login"),
    LOGIN("login"),
    PASSWORD("password");


    private String id;

    Input(String id) {
        this.id = id;
    }

    public String getId(){ return id;}
}
