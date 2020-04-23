package ui.enums;

public enum DropdownCityItem implements BaseEnumDropDown {
    //Cities dropdown items
    BILOZIRYA("","Білозір", "https://mclaut.com/bilozirya/main"),
    VATUTINE("","Ватутіне", "https://mclaut.com/vatutino/main"),
    VOZNESENSKE ("","Вознесенське", "https://mclaut.com/voznesenske/main"),
    GERONIMOVKA("","Геронимівка", "https://mclaut.com/geronumivka/main"),
    DUBIYIVKA("","Дубіївка", "https://mclaut.com/dubiivka/main"),
    ZVENIGORODKA("","Звенигородка", "https://mclaut.com/zvenegorodka/main"),
    ZGAR("","Згар","https://mclaut.com/zgar/main"),
    ZOLOTONOSHA("","Золотоноша", "https://mclaut.com/zolotonosha/main"),
    KANIV("","Канів","https://mclaut.com/kanev/main"),
    LESKI("","Леськи","https://mclaut.com/leski/main"),
    MOSHNI("","Мошни","https://mclaut.com/moshnu/main"),
    NOVA_DMITRIVKA("","Нова Дмитрівка","https://mclaut.com/dmutrivka/main"),
    PEREIASLAV("","Переяслав","https://mclaut.com/pereyaslav/main"),
    RUSKA_POLYANA("","Руська Поляна","https://mclaut.com/rpolyana/main"),
    SAGUNIVKA("","Сагунівка","https://mclaut.com/sagynivka/main"),
    SVIDIVOK("","Свидівок","https://mclaut.com/svudivok/main"),
    SMILA("","Сміла","https://mclaut.com/smela/main"),
    STEBNE("","Стебне","https://mclaut.com/stebne/main"),
    STETSIVKA("","Стецівка","https://mclaut.com/stecivka/main"),
    HUDYAKI("","Худяки","https://mclaut.com/hydyaku/main"),
    HUTORY("","Хутори","https://mclaut.com/hutoru/main"),
    CHERVONA_SLOBODA("","Червона Слобода","https://mclaut.com/sloboda/main"),
    //CHERKASY("Черкаси"),
    CHORNOBAY("","Чорнобай","https://mclaut.com/chornobay/main"),
    SHPOLA("","Шпола","https://mclaut.com/shpola/main"),
    YURKIVKA("","Юрківка","https://mclaut.com/yurk%D1%96vka/main");

    private String text;
    private String url;
    private String header;

    DropdownCityItem(String header,String text, String url) {
        this.text = text;
        this.url = url;
        this.header = header;
    }


    @Override
    public String getLocatorString(){ return text;}

    @Override
    public String getUrl(){return url;}

    @Override
    public String getHeader() {
        return header;
    }


}
