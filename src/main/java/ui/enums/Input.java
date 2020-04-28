package ui.enums;

public enum Input implements BaseEnum {
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

    @Override
    public String getLocatorString(){ return id;}
}
