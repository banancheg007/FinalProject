package core.logger;

import io.qameta.allure.Step;
import java.util.ArrayList;
import java.util.List;

public class Logger {

    private Logger() {
    }

    private static ThreadLocal<Logger> loggerThreadLocal = new ThreadLocal<>();

    public static Logger getInstance() {
        if (loggerThreadLocal.get() == null) {
            synchronized (Logger.class) {
                loggerThreadLocal.set(new Logger());
            }
        }
        return loggerThreadLocal.get();
    }

    public String loggerClickTxt = "";
    public String loggerNavigateTxt = "";
    public String loggerValueTxt = "";

    private List<String> listCollection = getFillDate();

    public List<String> getFillDate() {

        if (listCollection == null) {
            return new ArrayList<>();
        } else {
            return listCollection;
        }
    }

    @Step
    public void log(String log) {
        System.out.println("Logged to allure: " + log);
    }
}
