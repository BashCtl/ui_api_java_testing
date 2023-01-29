package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public abstract class BaseSteps {
    protected BasePage basePage;

    public BaseSteps(WebDriver driver) {
        basePage = new BasePage(driver);
    }

    protected BaseSteps selectElementByXpath(String xpath){
        basePage.driver.findElement(By.xpath(xpath)).click();
        return this;
    }
}
