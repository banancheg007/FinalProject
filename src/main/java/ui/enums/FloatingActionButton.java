package ui.enums;

public enum FloatingActionButton implements BaseEnum{
    FACEBOOK_FAB("fa-facebook-f","https://www.facebook.com/McLaut.UA/?rc=p"),
    INSTAGRAM_FAB("fa-instagram","https://www.instagram.com/mclaut_ua/?hl=en"),
    TELEGRAM_FAB("fa-telegram-plane","https://t.me/McLaut_UA"),
    GOOGLE_PLAY_FAB("fa-app-store","https://apps.apple.com/ua/app/mclaut-%D0%B1%D0%B0%D0%BB%D0%B0%D0%BD%D1%81/id1493542770?l=ru"),
    APP_STORE_FAB("fa-google-play","https://play.google.com/store/apps/details?id=com.mclaut.ai"),
    ;
    private String url;
    private String classFAB;

    FloatingActionButton(String classFAB, String url){
        this.classFAB = classFAB;
        this.url = url;
    }

    @Override
    public String getLocatorString() {
        return classFAB;
    }

    public String getUrl(){
        return url;
    }
}
