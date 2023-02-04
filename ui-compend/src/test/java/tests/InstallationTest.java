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

    @Test
    public void verifyAppInstallationPrice1() {
        String price = installationSteps.getPriceByTitle(installation.getAppInstallTitle());
        assertEquals(price, installation.getAppInstallPrice());
    }

    @Test
    public void verifyTroubleshootPrice1() {
        String price = installationSteps.getPriceByTitle(installation.getTroubleshoot());
        assertEquals(price, installation.getTroubleshootPrice());
    }

    @Test
    public void verifyUpgradePrice1(){
        String price = installationSteps.getPriceByTitle(installation.getUpgradeTitle());
        assertEquals(price, installation.getUpgradePrice());
    }

    @Test
    public void verifyAppInstallationPrice2() {
        String price = installationSteps.getPriceByTitle(installation.getAppInstallTitle());
        assertEquals(price, installation.getAppInstallPrice());
    }

    @Test
    public void verifyTroubleshootPrice2() {
        String price = installationSteps.getPriceByTitle(installation.getTroubleshoot());
        assertEquals(price, installation.getTroubleshootPrice());
    }

    @Test
    public void verifyUpgradePrice2(){
        String price = installationSteps.getPriceByTitle(installation.getUpgradeTitle());
        assertEquals(price, installation.getUpgradePrice());
    }

    @Test
    public void verifyAppInstallationPrice3() {
        String price = installationSteps.getPriceByTitle(installation.getAppInstallTitle());
        assertEquals(price, installation.getAppInstallPrice());
    }

    @Test
    public void verifyTroubleshootPrice3() {
        String price = installationSteps.getPriceByTitle(installation.getTroubleshoot());
        assertEquals(price, installation.getTroubleshootPrice());
    }

    @Test
    public void verifyUpgradePrice3(){
        String price = installationSteps.getPriceByTitle(installation.getUpgradeTitle());
        assertEquals(price, installation.getUpgradePrice());
    }

    @Test
    public void verifyAppInstallationPrice4() {
        String price = installationSteps.getPriceByTitle(installation.getAppInstallTitle());
        assertEquals(price, installation.getAppInstallPrice());
    }

    @Test
    public void verifyTroubleshootPrice4() {
        String price = installationSteps.getPriceByTitle(installation.getTroubleshoot());
        assertEquals(price, installation.getTroubleshootPrice());
    }

    @Test
    public void verifyUpgradePrice4(){
        String price = installationSteps.getPriceByTitle(installation.getUpgradeTitle());
        assertEquals(price, installation.getUpgradePrice());
    }

    @Test
    public void verifyAppInstallationPrice5() {
        String price = installationSteps.getPriceByTitle(installation.getAppInstallTitle());
        assertEquals(price, installation.getAppInstallPrice());
    }

    @Test
    public void verifyTroubleshootPrice5() {
        String price = installationSteps.getPriceByTitle(installation.getTroubleshoot());
        assertEquals(price, installation.getTroubleshootPrice());
    }

    @Test
    public void verifyUpgradePrice5(){
        String price = installationSteps.getPriceByTitle(installation.getUpgradeTitle());
        assertEquals(price, installation.getUpgradePrice());
    }

    @Test
    public void verifyAppInstallationPrice6() {
        String price = installationSteps.getPriceByTitle(installation.getAppInstallTitle());
        assertEquals(price, installation.getAppInstallPrice());
    }

    @Test
    public void verifyTroubleshootPrice6() {
        String price = installationSteps.getPriceByTitle(installation.getTroubleshoot());
        assertEquals(price, installation.getTroubleshootPrice());
    }

    @Test
    public void verifyUpgradePrice6(){
        String price = installationSteps.getPriceByTitle(installation.getUpgradeTitle());
        assertEquals(price, installation.getUpgradePrice());
    }

    @Test
    public void verifyAppInstallationPrice7() {
        String price = installationSteps.getPriceByTitle(installation.getAppInstallTitle());
        assertEquals(price, installation.getAppInstallPrice());
    }

    @Test
    public void verifyTroubleshootPrice7() {
        String price = installationSteps.getPriceByTitle(installation.getTroubleshoot());
        assertEquals(price, installation.getTroubleshootPrice());
    }

    @Test
    public void verifyUpgradePrice7(){
        String price = installationSteps.getPriceByTitle(installation.getUpgradeTitle());
        assertEquals(price, installation.getUpgradePrice());
    }

    @Test
    public void verifyAppInstallationPrice8() {
        String price = installationSteps.getPriceByTitle(installation.getAppInstallTitle());
        assertEquals(price, installation.getAppInstallPrice());
    }

    @Test
    public void verifyTroubleshootPrice8() {
        String price = installationSteps.getPriceByTitle(installation.getTroubleshoot());
        assertEquals(price, installation.getTroubleshootPrice());
    }

    @Test
    public void verifyUpgradePrice8(){
        String price = installationSteps.getPriceByTitle(installation.getUpgradeTitle());
        assertEquals(price, installation.getUpgradePrice());
    }

    @Test
    public void verifyAppInstallationPrice9() {
        String price = installationSteps.getPriceByTitle(installation.getAppInstallTitle());
        assertEquals(price, installation.getAppInstallPrice());
    }

    @Test
    public void verifyTroubleshootPrice9() {
        String price = installationSteps.getPriceByTitle(installation.getTroubleshoot());
        assertEquals(price, installation.getTroubleshootPrice());
    }

    @Test
    public void verifyUpgradePrice9(){
        String price = installationSteps.getPriceByTitle(installation.getUpgradeTitle());
        assertEquals(price, installation.getUpgradePrice());
    }

    @Test
    public void verifyAppInstallationPrice10() {
        String price = installationSteps.getPriceByTitle(installation.getAppInstallTitle());
        assertEquals(price, installation.getAppInstallPrice());
    }

    @Test
    public void verifyTroubleshootPrice10() {
        String price = installationSteps.getPriceByTitle(installation.getTroubleshoot());
        assertEquals(price, installation.getTroubleshootPrice());
    }

    @Test
    public void verifyUpgradePrice10(){
        String price = installationSteps.getPriceByTitle(installation.getUpgradeTitle());
        assertEquals(price, installation.getUpgradePrice());
    }
}
