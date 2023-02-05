package tests.listeners;

import io.qameta.allure.Allure;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.time.LocalDateTime;

@Slf4j
public class TestListener implements ITestListener {

    @SneakyThrows
    @Override
    public void onTestFailure(ITestResult tr) {
        log.warn("Test failed: {}", tr.getName());
        String fileName = String.format("Screenshot-%s.jpg", LocalDateTime.now());
        WebDriver driver = (WebDriver) tr.getTestContext().getAttribute("WebDriver");
        File srcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("screenshots/" + fileName));
        Allure.addAttachment(fileName, new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));

    }
}
