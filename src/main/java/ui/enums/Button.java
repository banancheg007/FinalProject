package ui.enums;

public enum Button {
    SEND("Відправити");
    private String text;

    Button(String text) {
        this.text = text;
    }

    public String getText(){ return text;}
}
