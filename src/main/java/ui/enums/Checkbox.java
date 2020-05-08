package ui.enums;

public enum Checkbox{
    CAPTCHA("recaptcha-checkbox-border");
    private String checkboxClass;

    Checkbox(String checkboxClass) {
        this.checkboxClass = checkboxClass;
    }

    public String getCheckboxClass(){ return checkboxClass;}
}
