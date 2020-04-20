package ui.enums;

public enum DropdownCityItem implements BaseEnum{
    //Cities dropdown items
    BILOZIRYA("Білозір"),
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
    //CHERKASY("Черкаси"),
    CHORNOBAY("Чорнобай"),
    SHPOLA("Шпола"),
    YURKIVKA("Юрківка");

    private String text;

    DropdownCityItem(String text) {
        this.text = text;
    }

    @Override
    public String getLocatorString(){ return text;}


}
