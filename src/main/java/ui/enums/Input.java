package ui.enums;

public enum Input implements BaseEnum {
    PERSONAL_NUMBER("lc");
    private String inputClass;

    Input(String inputClass) {
        this.inputClass = inputClass;
    }

    @Override
    public String getLocatorString(){ return inputClass;}
}
