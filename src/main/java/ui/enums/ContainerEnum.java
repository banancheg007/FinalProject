package ui.enums;

public enum ContainerEnum implements BaseEnum{
    CHECK_BALANCE("col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12"),
    AUTH("auth-error"),
    AUTH_CITY_DROPDOWN("show-input"),
    PERSONAL_PAGE_MENU("menu"),
    PERSONAL_PAGE_ABONENT("item client hvr-bounce-to-bottom"),
    PERSONAL_PAGE_INTERNET("item internet hvr-bounce-to-bottom"),
    PERSONAL_PAGE_BALANCE("item hvr-bounce-to-bottom"),
    PERSONAL_PAGE_SERVICES("item service hvr-bounce-to-bottom"),
    PERSONAL_PAGE_PAY("item pay hvr-bounce-to-bottom"),
    PERSONAL_PAGE_NEWS("item news hvr-bounce-to-bottom"),
    PERSONAL_PAGE_REQUESTS("item ticket hvr-bounce-to-bottom"),
    PERSONAL_PAGE_ACTION("item action hvr-bounce-to-bottom"),
    PERSONAL_PAGE_INNER_DATA("sub-title"),
    PERSONAL_CABINET_MENU("menu"),
    PAYMENTS_HISTORY("data-item data-center"),
    CONNECT_REQUEST("card-body px-lg-5 pt-0");

    private String containerClass;

    ContainerEnum(String containerClass) {
        this.containerClass = containerClass;
    }

    @Override
    public String getLocatorString(){ return containerClass;}
}
