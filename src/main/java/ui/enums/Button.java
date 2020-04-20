package ui.enums;

public enum Button implements BaseEnum {
    SEND("Відправити");
    private String text;

    Button(String text) {
        this.text = text;
    }

    @Override
    public String getLocatorString(){ return text;}
}
