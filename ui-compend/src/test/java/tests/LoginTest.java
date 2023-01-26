package tests;

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
    public void loginIntoApp() {
        System.out.println(user.getPassword());
        System.out.println(user.getUsername());
        loginSteps.openPage()
                .enterUsername(user.getUsername())
                .enterPassword(user.getPassword())
                .clickSignInBtn();
    }
}
