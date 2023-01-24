
import com.ui.configs.WebDriverFactory;
import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import utils.listeners.TestListener;

@Log4j2
@Listeners({TestListener.class})
public class BaseTest {
    private WebDriver driver;

    @Parameters("browser")
    @BeforeClass(alwaysRun = true)
    public void beforeClass(@Optional("chrome") String browser) {
        System.setProperty("browser", browser);
        log.info("Before Class.");

    }

    @BeforeMethod
    public void beforeMethod(ITestContext context) {
        log.info("Get WebDriver.");
        driver = new WebDriverFactory().getDriver();
        log.info("Set Context WebDriver Attribute");
        context.setAttribute("WebDriver", driver);
    }

    @AfterMethod
    public void afterMethod(){
        log.info("Quit WebDriver");
        driver.quit();
    }

    @AfterClass
    public void afterClass() {

    }

    @Description("Test example 1")
    @Test
    public void test() {
        log.info("Open page.");
        driver.get("https:/sd/cddsompendiumdev.co.uk/");

    }

    @Description("Test example 2")
    @Test
    public void test2() {

        driver.get("https://compendiumdev.co.uk/");
    }

    @Description("Test example 3")
    @Test
    public void tes3() {

        driver.get("https://compendiumdev.co.uk/");
    }

    @Description("Test example 4")
    @Test
    public void test4() {

        driver.get("https://compendiumdev.co.uk/");
    }
}
