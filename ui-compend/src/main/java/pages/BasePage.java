package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utils.PropsLoader.loadProperties;

public class BasePage {
    protected final String ENV_URL = loadProperties()
            .getProperty(System.getProperty("env", "QA"));
    public WebDriver driver;
    protected WebDriverWait wait;
    private final int WAIT_SECONDS = 10;



    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_SECONDS));
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, WAIT_SECONDS), this);
    }

    protected String getPageTitle(){
        return driver.getTitle();
    }


}
