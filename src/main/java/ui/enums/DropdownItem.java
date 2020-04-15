package ui.enums;

public enum DropdownItem {
    URKIVKA_VILLAGE("Юрківка");
    private String text;

    DropdownItem(String text) {
        this.text = text;
    }

    public String getText(){ return text;}
}
