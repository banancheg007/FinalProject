package ui.enums;

public enum Label{
    LOGIN("Логін"),
    ORDER_DATE("Дата замовлення"),
    STATUS("Статус")
    ;


    Label(String text){
        this.text = text;
    }
    String text;

    public String getText() {
        return text;
    }
}
