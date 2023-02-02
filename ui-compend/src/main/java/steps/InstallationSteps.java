package steps;

import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import pages.InstallationPage;

@Slf4j
public class InstallationSteps extends BaseSteps{

    private InstallationPage installationPage;
    public InstallationSteps(WebDriver driver) {
        super(driver);
        installationPage = new InstallationPage(driver);
    }

    @Step("Open 'Installation' page.")
    public InstallationSteps openPage(){
        installationPage.openPage();
        return this;
    }

    @Step("Get price for installation type: {installTitle}")
    public String getPriceByTitle(String installTitle){
        log.info("Getting installation price by title: {}", installTitle);
        return installationPage.getPriceByTitle(installTitle);
    }
}
