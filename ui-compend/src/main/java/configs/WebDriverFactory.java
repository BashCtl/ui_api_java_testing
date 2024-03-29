package configs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static configs.DriverOptions.*;

public class WebDriverFactory {
    private String GRID_URL = "http://localhost:4444/wd/hub";
    private final String GRID_KEY = "grid";
    private final String BROWSER_KEY = "browser";

    public WebDriver getDriver() {
        final String browser = System.getProperty(BROWSER_KEY);
        return Boolean.parseBoolean(System.getProperty(GRID_KEY, "false")) ? setRemoteWebDriver(browser)
                : getLocalDriver(browser);
    }

    private RemoteWebDriver setRemoteWebDriver(String browser) {
        switch (browser) {
            case "chrome":
                try {
                    ChromeOptions options = getChromeOptions();
                    options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                    return new RemoteWebDriver(new URL(GRID_URL), options);
                } catch (MalformedURLException e) {
                    throw new RuntimeException("Can not create remote web driver.");
                }
            case "edge":
                try {
                    FirefoxOptions options = getFirefoxOptions();
                    options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                    return new RemoteWebDriver(new URL(GRID_URL), options);
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
