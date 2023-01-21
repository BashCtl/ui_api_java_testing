package com.ui.configs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static com.ui.configs.DriverOptions.*;

public class WebDriverFactory {
    private String GRID_URL = "http://127.0.0.1:4444";
    private final String GRID_KEY = "grid";
    private final String BROWSER_KEY = "browser";

    public WebDriver getDriver() {
        final String browser = System.getProperty(BROWSER_KEY);
        return Boolean.parseBoolean(System.getProperty(GRID_KEY, "true")) ? setRemoteWebDriver(browser)
                : getLocalDriver(browser);
    }

    private RemoteWebDriver setRemoteWebDriver(String browser) {
        switch (browser) {
            case "chrome":
                try {
                    return new RemoteWebDriver(new URL(GRID_URL), getChromeOptions());
                } catch (MalformedURLException e) {
                    throw new RuntimeException("Can not create remote web driver.");
                }
            case "edge":
                try {
                    return new RemoteWebDriver(new URL(GRID_URL), getEdgeOptions());
                } catch (MalformedURLException e) {
                    throw new RuntimeException("Can not create remote web driver.");
                }
            case "firefox":
                try {
                    return new RemoteWebDriver(new URL(GRID_URL), getFirefoxOptions());
                } catch (MalformedURLException e) {
                    throw new RuntimeException("Can not create remote web driver");
                }
            default:
                throw new RuntimeException(String.format("Unknown wed driver type: %s", browser));
        }
    }

    private WebDriver getLocalDriver(String browser) {
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver(getChromeOptions());
            case "edge":
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver(getEdgeOptions());
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver(getFirefoxOptions());
            default:
                throw new RuntimeException(String.format("Unknown wed driver type: %s", browser));
        }
    }
}
