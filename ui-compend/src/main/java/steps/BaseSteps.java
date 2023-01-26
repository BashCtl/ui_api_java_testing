package steps;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public abstract class BaseSteps {
    protected BasePage basePage;

    public BaseSteps(WebDriver driver) {
        basePage = new BasePage(driver);
    }
}
