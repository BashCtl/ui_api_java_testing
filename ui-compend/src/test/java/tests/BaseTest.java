package tests;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import configs.WebDriverFactory;
import entities.BillingAddress;
import entities.EntityProvider;
import entities.User;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.HomePage;
import tests.listeners.TestListener;

import java.util.Locale;

import static entities.EntityType.BILLING_ADDRESS;
import static entities.EntityType.USER;

@Slf4j
public abstract class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    protected User user;
    protected BillingAddress billingAddress;

    protected FakeValuesService fakeValuesService = new FakeValuesService(
            new Locale("en-US"),
            new RandomService());

    @Parameters("browser")
    @BeforeClass(alwaysRun = true)
    public void beforeClass(@Optional("chrome") String browser) {
        System.setProperty("browser", browser);
        log.info("Before Class.");

    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(ITestContext context) {
        log.info("Get WebDriver.");
        driver = new WebDriverFactory().getDriver();
        user = EntityProvider.getEntity(USER);
        billingAddress = EntityProvider.getEntity(BILLING_ADDRESS);
        log.info("Set Context WebDriver Attribute");
        context.setAttribute("WebDriver", driver);
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        log.info("Quit WebDriver");
        driver.quit();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {

    }


}
