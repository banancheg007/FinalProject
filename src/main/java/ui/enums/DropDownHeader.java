package ui.enums;

public enum DropDownHeader implements BaseEnum {
    FOR_HOME("Для Дому"),
    FOR_BUSINESS("Для Бізнесу"),
    ANOTHER_SERVICES("Інші Послуги"),
    PRODUCTS("Продукція"),
    QUESTIONS("Питання"),
    ABOUT_COMPANY("Про Компанію"),
    CITY("");
    private String text;

    DropDownHeader(String text) {
        this.text = text;
    }

    @Override
    public String getLocatorString(){ return text;}
}
