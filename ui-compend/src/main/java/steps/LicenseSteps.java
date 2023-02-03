package steps;

import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import pages.LicensePage;

@Slf4j
public class LicenseSteps extends BaseSteps {

    private LicensePage licensePage;

    public LicenseSteps(WebDriver driver) {
        super(driver);
        licensePage = new LicensePage(driver);
    }

    @Step("User opens license page.")
    public LicenseSteps openPage() {
        log.info("Open license page.");
        licensePage.openPage();
        return this;
    }

    @Step("Get license price for type: {license}")
    public String getLicensePrice(String license) {
        log.info("Get license price.");
        return licensePage.getPriceByTitle(license);
    }
}
