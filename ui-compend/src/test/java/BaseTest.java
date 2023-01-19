
import com.ui.configs.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {
    private WebDriver driver;

    @Parameters("browser")
    @BeforeClass(alwaysRun = true)
    public void beforeClass(@Optional("chrome") String browser) {
        System.setProperty("browser", browser);
        driver = new WebDriverFactory().getDriver();
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }

    @Test
    public void test() {

        driver.get("https://compendiumdev.co.uk/");
    }

    @Test
    public void test2() {

        driver.get("https://compendiumdev.co.uk/");
    }

    @Test
    public void tes3() {

        driver.get("https://compendiumdev.co.uk/");
    }

    @Test
    public void test4() {

        driver.get("https://compendiumdev.co.uk/");
    }
}
