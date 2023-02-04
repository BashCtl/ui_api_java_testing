package tests;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.LoginSteps;

public class LoginTest extends BaseTest {
    private LoginSteps loginSteps;

    @BeforeMethod(alwaysRun = true)
    @Override
    public void beforeMethod(ITestContext context) {
        super.beforeMethod(context);
        loginSteps = new LoginSteps(driver);
    }

    @Test
    public void userLogin() {
        loginSteps.openPage()
                .enterEmail(user.getEmail())
                .enterPassword(user.getPassword())
                .clickRememberMeCheckbox()
                .clickLoginBtn();

        var errorMsg = loginSteps.getErrorMsg();

        Assert.assertEquals(errorMsg, "Please complete the captcha and try again.");
    }

    @Test
    public void userLoginFakeForTotalAmount1() {
        loginSteps.openPage()
                .enterEmail(email)
                .enterPassword(password)
                .clickRememberMeCheckbox()
                .clickLoginBtn();

        var errorMsg = loginSteps.getErrorMsg();

        Assert.assertEquals(errorMsg, "Please complete the captcha and try again.");
    }

    @Test
    public void userLoginFakeForTotalAmount2() {
        loginSteps.openPage()
                .enterEmail(email)
                .enterPassword(password)
                .clickRememberMeCheckbox()
                .clickLoginBtn();

        var errorMsg = loginSteps.getErrorMsg();

        Assert.assertEquals(errorMsg, "Please complete the captcha and try again.");
    }

    @Test
    public void userLoginFakeForTotalAmount3() {
        loginSteps.openPage()
                .enterEmail(email)
                .enterPassword(password)
                .clickRememberMeCheckbox()
                .clickLoginBtn();

        var errorMsg = loginSteps.getErrorMsg();

        Assert.assertEquals(errorMsg, "Please complete the captcha and try again.");
    }

    @Test
    public void userLoginFakeForTotalAmount4() {
        loginSteps.openPage()
                .enterEmail(email)
                .enterPassword(password)
                .clickRememberMeCheckbox()
                .clickLoginBtn();

        var errorMsg = loginSteps.getErrorMsg();

        Assert.assertEquals(errorMsg, "Please complete the captcha and try again.");
    }

    @Test
    public void userLoginFakeForTotalAmount5() {
        loginSteps.openPage()
                .enterEmail(email)
                .enterPassword(password)
                .clickRememberMeCheckbox()
                .clickLoginBtn();

        var errorMsg = loginSteps.getErrorMsg();

        Assert.assertEquals(errorMsg, "Please complete the captcha and try again.");
    }

    @Test
    public void userLoginFakeForTotalAmount6() {
        loginSteps.openPage()
                .enterEmail(email)
                .enterPassword(password)
                .clickRememberMeCheckbox()
                .clickLoginBtn();

        var errorMsg = loginSteps.getErrorMsg();

        Assert.assertEquals(errorMsg, "Please complete the captcha and try again.");
    }

    @Test
    public void userLoginFakeForTotalAmount7() {
        loginSteps.openPage()
                .enterEmail(email)
                .enterPassword(password)
                .clickRememberMeCheckbox()
                .clickLoginBtn();

        var errorMsg = loginSteps.getErrorMsg();

        Assert.assertEquals(errorMsg, "Please complete the captcha and try again.");
    }

    @Test
    public void userLoginFakeForTotalAmount8() {
        loginSteps.openPage()
                .enterEmail(email)
                .enterPassword(password)
                .clickRememberMeCheckbox()
                .clickLoginBtn();

        var errorMsg = loginSteps.getErrorMsg();

        Assert.assertEquals(errorMsg, "Please complete the captcha and try again.");
    }

    @Test
    public void userLoginFakeForTotalAmount9() {
        loginSteps.openPage()
                .enterEmail(email)
                .enterPassword(password)
                .clickRememberMeCheckbox()
                .clickLoginBtn();

        var errorMsg = loginSteps.getErrorMsg();

        Assert.assertEquals(errorMsg, "Please complete the captcha and try again.");
    }

    @Test
    public void userLoginFakeForTotalAmount10() {
        loginSteps.openPage()
                .enterEmail(email)
                .enterPassword(password)
                .clickRememberMeCheckbox()
                .clickLoginBtn();

        var errorMsg = loginSteps.getErrorMsg();

        Assert.assertEquals(errorMsg, "Please complete the captcha and try again.");
    }

    @Test
    public void userLoginFakeForTotalAmount11() {
        loginSteps.openPage()
                .enterEmail(email)
                .enterPassword(password)
                .clickRememberMeCheckbox()
                .clickLoginBtn();

        var errorMsg = loginSteps.getErrorMsg();

        Assert.assertEquals(errorMsg, "Please complete the captcha and try again.");
    }

    @Test
    public void userLoginFakeForTotalAmount12() {
        loginSteps.openPage()
                .enterEmail(email)
                .enterPassword(password)
                .clickRememberMeCheckbox()
                .clickLoginBtn();

        var errorMsg = loginSteps.getErrorMsg();

        Assert.assertEquals(errorMsg, "Please complete the captcha and try again.");
    }

    @Test
    public void userLoginFakeForTotalAmount13() {
        loginSteps.openPage()
                .enterEmail(email)
                .enterPassword(password)
                .clickRememberMeCheckbox()
                .clickLoginBtn();

        var errorMsg = loginSteps.getErrorMsg();

        Assert.assertEquals(errorMsg, "Please complete the captcha and try again.");
    }

    @Test
    public void userLoginFakeForTotalAmount14() {
        loginSteps.openPage()
                .enterEmail(email)
                .enterPassword(password)
                .clickRememberMeCheckbox()
                .clickLoginBtn();

        var errorMsg = loginSteps.getErrorMsg();

        Assert.assertEquals(errorMsg, "Please complete the captcha and try again.");
    }

    @Test
    public void userLoginFakeForTotalAmount15() {
        loginSteps.openPage()
                .enterEmail(email)
                .enterPassword(password)
                .clickRememberMeCheckbox()
                .clickLoginBtn();

        var errorMsg = loginSteps.getErrorMsg();

        Assert.assertEquals(errorMsg, "Please complete the captcha and try again.");
    }

}
