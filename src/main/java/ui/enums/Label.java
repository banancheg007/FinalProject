package ui.enums;

public enum Label implements BaseEnum{
    LOGIN("Логін"),
    ORDER_DATE("Дата замовлення"),
    STATUS("Статус")
    ;


    Label(String text){
        this.text = text;
    }
    String text;

    @Override
    public String getLocatorString() {
        return text;
    }
}
