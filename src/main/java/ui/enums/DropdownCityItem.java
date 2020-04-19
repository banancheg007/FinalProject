package ui.enums;

public enum DropdownCityItem{
    //Cities dropdown items
    BILOZIRYA("Білозір'я"),
    VATUTINE("Ватутіне"),
    VOZNESENSKE ("Вознесенське"),
    GERONIMOVKA("Геронимівка"),
    DUBIYIVKA("Дубіївка"),
    ZVENIGORODKA("Звенигородка"),
    ZGAR("Згар"),
    ZOLOTONOSHA("Золотоноша"),
    KANIV("Канів"),
    LESKI("Леськи"),
    MOSHNI("Мошни"),
    NOVA_DMITRIVKA("Нова Дмитрівка"),
    PEREIASLAV("Переяслав"),
    RUSKA_POLYANA("Руська Поляна"),
    SAGUNIVKA("Сагунівка"),
    SVIDIVOK("Свидівок"),
    SMILA("Сміла"),
    STEBNE("Стебне"),
    STETSIVKA("Стецівка"),
    HUDYAKI("Худяки"),
    HUTORY("Хутори"),
    CHERVONA_SLOBODA("Червона Слобода"),
    CHERKASY("Черкаси"),
    CHORNOBAY("Чорнобай"),
    SHPOLA("Шпола"),
    YURKIVKA("Юрківка"),

    //"Для Дому" dropdown items
    APARTMENT_BUILDINGS("Багатоквартирні будівлі"),
    PRIVATE_HOUSE("Приватний будинок"),
    TV("Телебачення"),
    TV_PLUS_INTERNET("ТВ + Інтернет"),
    SERVICES_FOR_HOME("Послуги"),

    //"Для Бізнесу" dropdown items
    INTERNET_FOR_BUSINESS("Інтернет для бізнесу"),
    SERVICES_FOR_BUSINESS("Послуги"),
    ADDITIONAL_SERVICES_FOR_BUSINESS("Додаткові Послуги"),

    //"Інші Послуги" dropdown items
    HOSTING("Хостинг"),
    DOMAIN("Домен"),
    ADDITIONAL_SERVICES_FOR_OTHER_SERVICES("Додаткові послуги"),

    //"Продукція" dropdown items
    ROUTERS("Роутери"),
    INTERCOMS("Домофони"),

    //"Питання" dropdown items
    COMMON_QUESTIONS("Поширенні питання"),
    FEEDBACK("Зворотній зв'язок"),

    //"Про Компанію" dropdown items
    ABOUT_COMPANY("Про компанію"),
    CONTACTS("Контакти"),
    CITY_CAMERAS("Камери міста"),
    WIFI_HOTSPOT("WiFi HotSpot");

    private String text;

    DropdownCityItem(String text) {
        this.text = text;
    }

    public String getText(){ return text;}

//    public static void getAllDatas(){
//        String array[] = new String[DropdownCityItem.values().length];
//        DropdownCityItem[] dropdownCityItems = DropdownCityItem.values().length;
//        System.out.println(Arrays.toString(dropdownCityItems));
//    }

    public static <T extends Enum<T>> void printEnum2(Class<T> aEnum)
    {
        // retreive all constants of your enum (reflection!!)
        System.out.println(java.util.Arrays.asList(aEnum.getEnumConstants()));
    }
    // print function: type safe for Enum values
    public static <T extends Enum<T>> void printEnum(T[] aValues)
    {
        System.out.println(java.util.Arrays.asList(aValues));
    }
    public static <T extends Enum<T>> String[][] printEnum3(DropdownCityItem[] aValues)
    {
        DropdownCityItem[] strings = aValues;
        String[][] values = new String[aValues.length][aValues.length];
        int i = 0;
        for(DropdownCityItem o:strings){
                System.out.println(o.getText());
                values[i][0]= o.getText();
                i++;
        }

        for (Object k:values){
            System.out.println((k));
        }
        return values;
    }


}
