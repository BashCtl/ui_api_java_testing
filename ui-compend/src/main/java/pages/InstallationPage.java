package pages;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Slf4j
@Getter
public class InstallationPage extends BasePage {

    private final String INSTALLATION_URL = ENV_URL + "/store/installation";

    public InstallationPage(WebDriver driver) {
        super(driver);
    }

    //    XPATH Locators
    private String installationPriceByTitle = "//*[text()='%s']/ancestor::header/following-sibling::footer//span[@class='price']";

    public void openPage() {
        log.info("Open 'Installation' page.");
        driver.get(INSTALLATION_URL);
    }

    public String getPriceByTitle(String title) {
        return driver.findElement(By
                        .xpath(String.format(installationPriceByTitle, title)))
                .getText();
    }
}
