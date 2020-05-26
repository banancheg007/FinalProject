package utils.enums;

public enum ContainerEnum{
    CHECK_BALANCE("col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12"),
    AUTH("auth-error"),
    AUTH_CITY_DROPDOWN("show-input"),
    PERSONAL_PAGE_MENU("menu"),

    TO_PAGE_ABONENT("item client hvr-bounce-to-bottom","https://bill.mclaut.com/client/cherkassy/info"),
    TO_PAGE_INTERNET("item internet hvr-bounce-to-bottom","https://bill.mclaut.com/client/cherkassy/user/32932"),
    TO_PAGE_BALANCE("item hvr-bounce-to-bottom","https://bill.mclaut.com/client/cherkassy/balance"),
    TO_PAGE_SERVICES("item service hvr-bounce-to-bottom","https://bill.mclaut.com/client/cherkassy/service"),
    TO_PAGE_PAY("item pay hvr-bounce-to-bottom","https://bill.mclaut.com/client/cherkassy/pay"),
    TO_PAGE_NEWS("item news hvr-bounce-to-bottom","https://bill.mclaut.com/client/cherkassy/news"),
    TO_PAGE_REQUESTS("item ticket hvr-bounce-to-bottom","https://bill.mclaut.com/client/cherkassy/ticket"),
    TO_PAGE_ACTION("item action hvr-bounce-to-bottom","https://bill.mclaut.com/client/cherkassy/share"),

    PERSONAL_PAGE_INNER_DATA("sub-title"),
    PERSONAL_CABINET_MENU("menu"),
    PAYMENTS_HISTORY("data-item data-center"),
    CONNECT_REQUEST("card-body px-lg-5 pt-0");

    private String containerClass;

    private String url;

    ContainerEnum(String containerClass) {
        this.containerClass = containerClass;
    }

    ContainerEnum(String containerClass, String url) {
        this.containerClass = containerClass;
        this.url = url;
    }

    public String getContainerClass(){ return containerClass;}
    public String getUrl(){ return url;}
}
