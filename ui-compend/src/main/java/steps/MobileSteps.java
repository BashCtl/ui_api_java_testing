package steps;

import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import pages.MobilePage;

@Slf4j
public class MobileSteps extends BaseSteps{

    private MobilePage mobilePage;

    public MobileSteps(WebDriver driver) {
        super(driver);
        mobilePage = new MobilePage(driver);
    }

    @Step("User opens 'Mobile' page.")
    public MobileSteps openPage(){
        log.info("Open mobile page.");
        mobilePage.openPage();
        return this;
    }

    @Step("Get mogile price by type: {mobileType}")
    public String getMobilePrice(String mobileType){
        log.info("Getting mobile price for: {}", mobileType);
        return mobilePage.getPriceByTitle(mobileType);
    }
}
