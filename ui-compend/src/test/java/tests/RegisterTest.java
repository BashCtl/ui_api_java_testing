package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.RegisterSteps;

public class RegisterTest extends BaseTest{
    private RegisterSteps registerSteps;
    private String email;

    @BeforeMethod(alwaysRun = true)
    @Override
    public void beforeMethod(ITestContext context) {
        super.beforeMethod(context);
        registerSteps = new RegisterSteps(driver);
        email = fakeValuesService.bothify("????###@mail.test");
    }

    @Description("User Registration Without Checking Captcha Checkbox.")
    @Test
    public void registerUserWithoutRecaptcha(){
        registerSteps.openPage()
                .enterFirstName(user.getFirstName())
                .enterLastName(user.getLastName())
                .enterEmail(email)
                .selectDialCode(user.getDialCode())
                .enterPhoneNumber(user.getPhoneNumber())
                .selectCountry(billingAddress.getCountry())
                .selectState(billingAddress.getState())
                .enterCompanyName(billingAddress.getCompanyName())
                .enterFirstAddress(billingAddress.getFirstAddress())
                .enterSecondAddress(billingAddress.getSecondAddress())
                .enterCity(billingAddress.getCity())
                .enterPostalCode(billingAddress.getPostCode())
                .enterMobilePhone(user.getMobilePhone())
                .enterPassword(user.getPassword())
                .confirmPassword(user.getPassword())
                .clickRegisterBtn();
        String error = registerSteps.getErrorText();
        Assert.assertEquals(error, "Please complete the captcha and try again.");

    }
}
