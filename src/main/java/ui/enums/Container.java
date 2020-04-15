package ui.enums;

public enum Container {
    CHECK_BALANCE("col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12");
    private String containerClass;

    Container(String containerClass) {
        this.containerClass = containerClass;
    }

    public String getContainerClass(){ return containerClass;}
}
