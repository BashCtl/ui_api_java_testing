package tests;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import com.google.common.collect.ImmutableMap;
import configs.WebDriverFactory;
import entities.*;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.util.Locale;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;
import static entities.EntityProvider.getEntity;
import static entities.EntityTypeImpl.*;
import static utils.PropsLoader.loadProperties;

@Slf4j
public abstract class BaseTest {
    protected WebDriver driver;
    protected User user;
    protected BillingAddress billingAddress;
    protected Installation installation;
    protected License license;

    protected Mobile mobile;

    // Test variables
    protected String email;
    protected String firstName;
    protected String lastName;
    protected String phoneNumber;
    protected String companyName;
    protected String firstAddress;
    protected String secondAddress;
    protected String city;
    protected String postCode;
    protected String mobilePhone;
    protected String password;

    protected FakeValuesService fakeValuesService = new FakeValuesService(
            new Locale("en-US"),
            new RandomService());

    protected Faker faker = new Faker();

    @Parameters("browser")
    @BeforeSuite(alwaysRun = true)
    public void beforeSuite(@Optional("chrome") String browser) {
        log.info("Set system browser property");
        System.setProperty("browser", browser);
        final String ENV_URL = loadProperties()
                .getProperty(System.getProperty("env", "QA"));
        allureEnvironmentWriter(ImmutableMap.<String, String>builder()
                .put("Browser", System.getProperty("browser"))
                .put("Env", System.getProperty("env"))
                .put("URL", ENV_URL)
                .build());

    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(ITestContext context) {
        log.info("Get WebDriver.");
        driver = new WebDriverFactory().getDriver();
        user = getEntity(USER);
        billingAddress = getEntity(BILLING_ADDRESS);
        installation = getEntity(INSTALLATION);
        license = getEntity(LICENSE);
        mobile = getEntity(MOBILE);
        log.info("Set Context WebDriver Attribute");
        context.setAttribute("WebDriver", driver);

//        Test vars
        email = fakeValuesService.bothify("????###@mail.test");
        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        phoneNumber = faker.phoneNumber().subscriberNumber();
        companyName = faker.company().name();
        firstAddress = faker.address().streetAddress();
        secondAddress = faker.address().secondaryAddress();
        city = faker.address().city();
        postCode = faker.address().zipCode();
        mobilePhone = faker.phoneNumber().cellPhone();
        password = faker.internet().password();
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
