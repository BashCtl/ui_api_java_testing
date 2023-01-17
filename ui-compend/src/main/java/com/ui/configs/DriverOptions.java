package com.ui.configs;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverOptions {

    public static ChromeOptions getChromeOptions() {
        final ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-popup-blocking");
        return options;
    }

    public static FirefoxOptions getFirefoxOptions() {
        final FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-popup-blocking");
        return options;
    }

    public static EdgeOptions getEdgeOptions() {
        final EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-popup-blocking");
        return options;
    }
}
