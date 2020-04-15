package ui.enums;

public enum Input {
    PERSONAL_NUMBER("lc");
    private String inputClass;

    Input(String inputClass) {
        this.inputClass = inputClass;
    }

    public String getInputClass(){ return inputClass;}
}
