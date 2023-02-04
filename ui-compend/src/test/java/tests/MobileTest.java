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

    @Test
    public void verifyMobileAppPrice1(){
        String price = mobileSteps.getMobilePrice(mobile.getMobileApp());
        assertEquals(price, mobile.getMobileAppPrice());
    }

    @Test
    public void verifyHybridAppPrice1(){
        String price = mobileSteps.getMobilePrice(mobile.getHybridApp());
        assertEquals(price, mobile.getHybridAppPrice());
    }

    @Test
    public void verifyMobileAppPrice2(){
        String price = mobileSteps.getMobilePrice(mobile.getMobileApp());
        assertEquals(price, mobile.getMobileAppPrice());
    }

    @Test
    public void verifyHybridAppPrice2(){
        String price = mobileSteps.getMobilePrice(mobile.getHybridApp());
        assertEquals(price, mobile.getHybridAppPrice());
    }

    @Test
    public void verifyMobileAppPrice3(){
        String price = mobileSteps.getMobilePrice(mobile.getMobileApp());
        assertEquals(price, mobile.getMobileAppPrice());
    }

    @Test
    public void verifyHybridAppPrice3(){
        String price = mobileSteps.getMobilePrice(mobile.getHybridApp());
        assertEquals(price, mobile.getHybridAppPrice());
    }

    @Test
    public void verifyMobileAppPrice4(){
        String price = mobileSteps.getMobilePrice(mobile.getMobileApp());
        assertEquals(price, mobile.getMobileAppPrice());
    }

    @Test
    public void verifyHybridAppPrice4(){
        String price = mobileSteps.getMobilePrice(mobile.getHybridApp());
        assertEquals(price, mobile.getHybridAppPrice());
    }

    @Test
    public void verifyMobileAppPrice5(){
        String price = mobileSteps.getMobilePrice(mobile.getMobileApp());
        assertEquals(price, mobile.getMobileAppPrice());
    }

    @Test
    public void verifyHybridAppPrice5(){
        String price = mobileSteps.getMobilePrice(mobile.getHybridApp());
        assertEquals(price, mobile.getHybridAppPrice());
    }

    @Test
    public void verifyMobileAppPrice6(){
        String price = mobileSteps.getMobilePrice(mobile.getMobileApp());
        assertEquals(price, mobile.getMobileAppPrice());
    }

    @Test
    public void verifyHybridAppPrice6(){
        String price = mobileSteps.getMobilePrice(mobile.getHybridApp());
        assertEquals(price, mobile.getHybridAppPrice());
    }

    @Test
    public void verifyMobileAppPrice7(){
        String price = mobileSteps.getMobilePrice(mobile.getMobileApp());
        assertEquals(price, mobile.getMobileAppPrice());
    }

    @Test
    public void verifyHybridAppPrice7(){
        String price = mobileSteps.getMobilePrice(mobile.getHybridApp());
        assertEquals(price, mobile.getHybridAppPrice());
    }

    @Test
    public void verifyMobileAppPrice8(){
        String price = mobileSteps.getMobilePrice(mobile.getMobileApp());
        assertEquals(price, mobile.getMobileAppPrice());
    }

    @Test
    public void verifyHybridAppPrice8(){
        String price = mobileSteps.getMobilePrice(mobile.getHybridApp());
        assertEquals(price, mobile.getHybridAppPrice());
    }

    @Test
    public void verifyMobileAppPrice9(){
        String price = mobileSteps.getMobilePrice(mobile.getMobileApp());
        assertEquals(price, mobile.getMobileAppPrice());
    }

    @Test
    public void verifyHybridAppPrice9(){
        String price = mobileSteps.getMobilePrice(mobile.getHybridApp());
        assertEquals(price, mobile.getHybridAppPrice());
    }

    @Test
    public void verifyMobileAppPrice10(){
        String price = mobileSteps.getMobilePrice(mobile.getMobileApp());
        assertEquals(price, mobile.getMobileAppPrice());
    }

    @Test
    public void verifyHybridAppPrice10(){
        String price = mobileSteps.getMobilePrice(mobile.getHybridApp());
        assertEquals(price, mobile.getHybridAppPrice());
    }
}
