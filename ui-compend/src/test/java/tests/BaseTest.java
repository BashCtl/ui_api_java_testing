package tests;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import configs.WebDriverFactory;
import entities.BillingAddress;
import entities.Installation;
import entities.User;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.util.Locale;

import static entities.EntityProvider.getEntity;
import static entities.EntityType.*;

@Slf4j
public abstract class BaseTest {
    protected WebDriver driver;
    protected User user;
    protected BillingAddress billingAddress;

    protected Installation installation;

    protected FakeValuesService fakeValuesService = new FakeValuesService(
            new Locale("en-US"),
            new RandomService());

    @Parameters("browser")
    @BeforeClass(alwaysRun = true)
    public void beforeClass(@Optional("chrome") String browser) {
        log.info("Set system browser property");
        System.setProperty("browser", browser);

    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(ITestContext context) {
        log.info("Get WebDriver.");
        driver = new WebDriverFactory().getDriver();
        user = getEntity(USER);
        billingAddress = getEntity(BILLING_ADDRESS);
        installation = getEntity(INSTALLATION);
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
