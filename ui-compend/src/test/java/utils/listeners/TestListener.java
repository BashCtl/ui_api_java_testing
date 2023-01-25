package utils.listeners;

import io.qameta.allure.Allure;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;
import java.time.LocalDateTime;

@Log4j2
public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        log.warn("Test failed: {}", iTestResult.getName());
        String fileName = String.format("Screenshot-%s.jpg", LocalDateTime.now());
        WebDriver driver = (WebDriver) iTestResult.getTestContext().getAttribute("WebDriver");
        Allure.addAttachment(fileName, new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));

    }

    @Override
    public void onFinish(ITestContext context) {
        final String logFile = System.getProperty("user.dir") + "/ui-compend/logs/tests.logs";
        Allure.addAttachment("Log File", "text/plain", logFile);
    }
//
//    public static void main(String[] args) {
//        System.out.println(System.getProperty("user.dir"));
//    }
}
