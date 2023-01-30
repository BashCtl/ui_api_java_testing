package tests.listeners;

import io.qameta.allure.Allure;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;
import java.time.LocalDateTime;

@Slf4j
public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult tr) {
        log.warn("Test failed: {}", tr.getName());
        String fileName = String.format("Screenshot-%s.jpg", LocalDateTime.now());
        WebDriver driver = (WebDriver) tr.getTestContext().getAttribute("WebDriver");
        Allure.addAttachment(fileName, new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));

    }
}
