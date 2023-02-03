package tests;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.MobileSteps;

import static org.testng.Assert.assertEquals;

public class MobileTest extends BaseTest{

    private MobileSteps mobileSteps;

    @BeforeMethod(alwaysRun = true)
    @Override
    public void beforeMethod(ITestContext context) {
        super.beforeMethod(context);
        mobileSteps = new MobileSteps(driver);
        mobileSteps.openPage();
    }

    @Test
    public void verifyMobileAppPrice(){
        String price = mobileSteps.getMobilePrice(mobile.getMobileApp());
        assertEquals(price, mobile.getMobileAppPrice());
    }

    @Test
    public void verifyHybridAppPrice(){
        String price = mobileSteps.getMobilePrice(mobile.getHybridApp());
        assertEquals(price, mobile.getHybridAppPrice());
    }
}
