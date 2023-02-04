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

    @Test
    public void verifyAdditionalLicensePrice1() {
        String price = licenseSteps.getLicensePrice(license.getAddLicense());
        assertEquals(price, license.getAddLicensePrice());
    }

    @Test
    public void verifyMultipleDomainLicensePrice1() {
        String price = licenseSteps.getLicensePrice(license.getMultiLicense());
        assertEquals(price, license.getMultiLicensePrice());
    }

    @Test
    public void verifyAdditionalLicensePrice2() {
        String price = licenseSteps.getLicensePrice(license.getAddLicense());
        assertEquals(price, license.getAddLicensePrice());
    }

    @Test
    public void verifyMultipleDomainLicensePrice2() {
        String price = licenseSteps.getLicensePrice(license.getMultiLicense());
        assertEquals(price, license.getMultiLicensePrice());
    }

    @Test
    public void verifyAdditionalLicensePrice3() {
        String price = licenseSteps.getLicensePrice(license.getAddLicense());
        assertEquals(price, license.getAddLicensePrice());
    }

    @Test
    public void verifyMultipleDomainLicensePrice3() {
        String price = licenseSteps.getLicensePrice(license.getMultiLicense());
        assertEquals(price, license.getMultiLicensePrice());
    }

    @Test
    public void verifyAdditionalLicensePrice4() {
        String price = licenseSteps.getLicensePrice(license.getAddLicense());
        assertEquals(price, license.getAddLicensePrice());
    }

    @Test
    public void verifyMultipleDomainLicensePrice4() {
        String price = licenseSteps.getLicensePrice(license.getMultiLicense());
        assertEquals(price, license.getMultiLicensePrice());
    }

    @Test
    public void verifyAdditionalLicensePrice5() {
        String price = licenseSteps.getLicensePrice(license.getAddLicense());
        assertEquals(price, license.getAddLicensePrice());
    }

    @Test
    public void verifyMultipleDomainLicensePrice5() {
        String price = licenseSteps.getLicensePrice(license.getMultiLicense());
        assertEquals(price, license.getMultiLicensePrice());
    }
}
