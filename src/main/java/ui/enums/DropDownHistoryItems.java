package ui.enums;

public enum DropDownHistoryItems{
    YEAR_2020("payments_year","2020"),
    YEAR_2019("payments_year","2019"),
    YEAR_2018("payments_year","2018"),

    JANUARY("payments_month","Січень",0),
    FEBRUARY("payments_month","Лютий",1),
    MARCH("payments_month","Березень",2),
    APRIL("payments_month","Квітень",3),
    MAY("payments_month","Травень",4),
    JUNE("payments_month","Червень",5),
    JULY("payments_month","Липень",6),
    AUGUST("payments_month","Серпень",7),
    SEPTEMBER("payments_month","Вересень",8),
    OCTOBER("payments_month","Жовтень",9),
    NOVEMBER("payments_month","Листопад",10),
    DECEMBER("payments_month","Грудень",11),

    ALL_TYPES("payments_type","Всі"),
    INCOME("payments_type","Надходження"),
    WRITE_OFFS("payments_type","Списання");

    String headerId;
    String itemText;
    int numericalEquivalent;


    DropDownHistoryItems(String headerId, String itemText) {
        this.headerId = headerId;
        this.itemText = itemText;
    }

    DropDownHistoryItems(String headerId, String itemText, int numericalEquivalent) {
        this.headerId = headerId;
        this.itemText = itemText;
        this.numericalEquivalent = numericalEquivalent;
    }


    public String getItemText() {
        return itemText;
    }

    public String getHeaderId(){
        return headerId;
    }

    public int getNumericalEquivalent(){return  numericalEquivalent;}

}
