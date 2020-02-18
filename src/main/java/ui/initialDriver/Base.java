package ui.initialDriver;

import ui.json.JSONReader;

public class Base {
    private static String config = getOs();

    private static String getOs() {
        String OS = System.getProperty("os.name");
        if (OS.equals("Linux")) {
            config = "/config";
        }
        if (OS.contains("Windows")) {
            config = "\\config";
        }
        return config;
    }

    public static final String DRIVER_NAME = (String) new JSONReader().readJson(config).get("browser.driver");
    protected static long TIME_OUT = (Long) new JSONReader().readJson(config).get("element.wait");
    protected static final long DELAY = (Long) new JSONReader().readJson(config).get("element.poling");
    public static final long EXIST = (Long) new JSONReader().readJson(config).get("element.exist");
    public static final String DRIVER_VERSION = new JSONReader().readJson(config).get("driver.version").toString();
    public static final String DRIVER_PATH = (String) new JSONReader().readJson(config).get("driver.path");
}
