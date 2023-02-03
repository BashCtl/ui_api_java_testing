package tests;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.LicenseSteps;

import static org.testng.Assert.assertEquals;

public class LicenseTest extends BaseTest {

    private LicenseSteps licenseSteps;

    @BeforeMethod(alwaysRun = true)
    @Override
    public void beforeMethod(ITestContext context) {
        super.beforeMethod(context);
        licenseSteps = new LicenseSteps(driver);
        licenseSteps.openPage();
    }

    @Test
    public void verifyAdditionalLicensePrice() {
        String price = licenseSteps.getLicensePrice(license.getAddLicense());
        assertEquals(price, license.getAddLicensePrice());
    }

    @Test
    public void verifyMultipleDomainLicensePrice() {
        String price = licenseSteps.getLicensePrice(license.getMultiLicense());
        assertEquals(price, license.getMultiLicensePrice());
    }
}
