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


}
