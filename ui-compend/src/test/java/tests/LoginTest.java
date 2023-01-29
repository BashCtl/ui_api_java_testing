package tests;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.HomeSteps;
import steps.LoginSteps;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {
    private LoginSteps loginSteps;
    private HomeSteps homeSteps;

    @BeforeMethod(alwaysRun = true)
    @Override
    public void beforeMethod(ITestContext context) {
        super.beforeMethod(context);
        loginSteps = new LoginSteps(driver);
        homeSteps = new HomeSteps(driver);
    }


}
