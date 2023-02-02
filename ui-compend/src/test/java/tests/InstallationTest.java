package tests;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.InstallationSteps;

import static org.testng.Assert.assertEquals;

public class InstallationTest extends BaseTest {

    private InstallationSteps installationSteps;

    @BeforeMethod(alwaysRun = true)
    @Override
    public void beforeMethod(ITestContext context) {
        super.beforeMethod(context);
        installationSteps = new InstallationSteps(driver);
        installationSteps.openPage();
    }

    @Test
    public void verifyAppInstallationPrice() {
        String price = installationSteps.getPriceByTitle(installation.getAppInstallTitle());
        assertEquals(price, installation.getAppInstallPrice());
    }

    @Test
    public void verifyTroubleshootPrice() {
        String price = installationSteps.getPriceByTitle(installation.getTroubleshoot());
        assertEquals(price, installation.getTroubleshootPrice());
    }

    @Test
    public void verifyUpgradePrice(){
        String price = installationSteps.getPriceByTitle(installation.getUpgradeTitle());
        assertEquals(price, installation.getUpgradePrice());
    }
}
