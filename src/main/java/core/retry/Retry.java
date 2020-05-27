package core.retry;

import core.logger.Logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
    private int retryCount = 0;
    private static final int maxRetryCount = 2;


    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            Logger.getInstance().log("Перезапуск тесту в зв'язку з провалом, спроба №" + retryCount);
            return true;
        }
        Logger.getInstance().log("Тести завершено");
        return false;
    }

}