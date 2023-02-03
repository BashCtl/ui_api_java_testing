package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Getter
public class LicensePage extends BasePage{

    private final String LICENSE_URL = ENV_URL + "/store/license";
    public LicensePage(WebDriver driver) {
        super(driver);
    }

//    Xpath string locators
    private String licensePriceXpath = "//*[text()='%s']/ancestor::header/following-sibling::footer//span[@class='price']";
    public LicensePage openPage(){
        driver.get(LICENSE_URL);
        return this;
    }

    public String getPriceByTitle(String title) {
        return driver.findElement(By
                        .xpath(String.format(licensePriceXpath, title)))
                .getText();
    }
}
