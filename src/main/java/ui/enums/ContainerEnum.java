package ui.enums;

public enum ContainerEnum implements BaseEnum{
    CHECK_BALANCE("col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12"),
    AUTH("auth-error"),
    AUTH_CITY_DROPDOWN("show-input"),
    CONNECT_REQUEST("card-body px-lg-5 pt-0");
    private String containerClass;

    ContainerEnum(String containerClass) {
        this.containerClass = containerClass;
    }

    @Override
    public String getLocatorString(){ return containerClass;}
}
