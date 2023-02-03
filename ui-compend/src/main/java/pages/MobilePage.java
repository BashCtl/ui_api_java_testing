package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Getter
public class MobilePage extends BasePage{

    private final String MOBILE_URL = ENV_URL + "/store/mobile";
    public MobilePage(WebDriver driver) {
        super(driver);
    }

//    Xpath locators strings
    private String mobilePriceByTypeXpath = "//*[text()='%s']/ancestor::header/following-sibling::footer//span[@class='price']";

    public MobilePage openPage(){
        driver.get(MOBILE_URL);
        return this;
    }

    public String getPriceByTitle(String title) {
        return driver.findElement(By
                        .xpath(String.format(mobilePriceByTypeXpath, title)))
                .getText();
    }
}
