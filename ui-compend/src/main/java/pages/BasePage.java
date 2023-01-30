package pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utils.PropsLoader.loadProperties;

@Slf4j
public class BasePage {
    protected final String ENV_URL = loadProperties()
            .getProperty(System.getProperty("env", "QA"));
    public WebDriver driver;
    protected WebDriverWait wait;
    private final int WAIT_SECONDS = 15;



    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_SECONDS));
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, WAIT_SECONDS), this);
    }

    protected String getPageTitle(){
        return driver.getTitle();
    }

    public WebElement waitUntilElementVisible(WebElement element){
        log.info("Waiting until element is visible.");
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

}
