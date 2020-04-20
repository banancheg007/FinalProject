package ui.enums;

public enum Checkbox implements BaseEnum{
    CAPTCHA("recaptcha-checkbox-border");
    private String checkboxClass;

    Checkbox(String checkboxClass) {
        this.checkboxClass = checkboxClass;
    }

    @Override
    public String getLocatorString(){ return checkboxClass;}
}
