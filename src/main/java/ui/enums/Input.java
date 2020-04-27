package ui.enums;

public enum Input implements BaseEnum {
    PERSONAL_NUMBER("lc"),
    SURNAME("name"),
    NAME("surname"),
    TELEPHONE("telephone"),
    ADDRESS("address");

    private String id;

    Input(String id) {
        this.id = id;
    }

    @Override
    public String getLocatorString(){ return id;}
}
