package tests;

import configs.WebDriverFactory;
import entities.BillingAddress;
import entities.EntityProvider;
import entities.EntityType;
import entities.User;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.HomePage;
import utils.listeners.TestListener;

import static entities.EntityType.BILLING_ADDRESS;
import static entities.EntityType.USER;

@Log4j2
@Listeners({TestListener.class})
public  abstract class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    protected User user;
    protected BillingAddress billingAddress;

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
