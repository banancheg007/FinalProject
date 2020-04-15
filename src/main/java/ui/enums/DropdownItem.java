package ui.enums;

public enum DropdownItem {
    VATUTINE_VILLAGE("Ватутіне");
    private String text;

    DropdownItem(String text) {
        this.text = text;
    }

    public String getText(){ return text;}
}
