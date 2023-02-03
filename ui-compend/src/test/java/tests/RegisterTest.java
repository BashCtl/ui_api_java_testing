package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.RegisterSteps;

public class RegisterTest extends BaseTest {
    private RegisterSteps registerSteps;
    private String email;
    private String firstName;
    private String lastName;
    private int phoneCode;

    private String phoneNumber;

    private String companyName;
    private String firstAddress;
    private String secondAddress;
    private String city;
    private String state;
    private String postCode;
    private String country;
    private String mobilePhone;
    private String password;

    @BeforeMethod(alwaysRun = true)
    @Override
    public void beforeMethod(ITestContext context) {
        super.beforeMethod(context);
        registerSteps = new RegisterSteps(driver);
        email = fakeValuesService.bothify("????###@mail.test");
        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        phoneCode = user.getDialCode();
        phoneNumber = faker.phoneNumber().subscriberNumber();
        companyName = faker.company().name();
        firstAddress = faker.address().streetAddress();
        secondAddress = faker.address().secondaryAddress();
        city = faker.address().city();
        postCode = faker.address().zipCode();
        mobilePhone = faker.phoneNumber().cellPhone();
        password = faker.internet().password();

    }

    @Description("User Registration Without Checking Captcha Checkbox.")
    @Test
    public void registerUserWithoutRecaptcha() {
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
//                .checkRecaptcha()
                .clickRegisterBtn();
//        String error = registerSteps.getErrorText();
//        Assert.assertEquals(error, "Please complete the captcha and try again.");

    }

    @Test
    public void registerUserWithoutRecaptchaFakeForAmount1() {
        registerSteps.openPage()
                .enterFirstName(firstName)
                .enterLastName(lastName)
                .enterEmail(email)
                .selectDialCode(user.getDialCode())
                .enterPhoneNumber(phoneNumber)
                .selectCountry(billingAddress.getCountry())
                .selectState(billingAddress.getState())
                .enterCompanyName(companyName)
                .enterFirstAddress(firstAddress)
                .enterSecondAddress(secondAddress)
                .enterCity(city)
                .enterPostalCode(postCode)
                .enterMobilePhone(mobilePhone)
                .enterPassword(password)
                .confirmPassword(password)
//                .checkRecaptcha()
                .clickRegisterBtn();
//        String error = registerSteps.getErrorText();
//        Assert.assertEquals(error, "Please complete the captcha and try again.");

    }
    @Test
    public void registerUserWithoutRecaptchaFakeForAmount2() {
        registerSteps.openPage()
                .enterFirstName(firstName)
                .enterLastName(lastName)
                .enterEmail(email)
                .selectDialCode(user.getDialCode())
                .enterPhoneNumber(phoneNumber)
                .selectCountry(billingAddress.getCountry())
                .selectState(billingAddress.getState())
                .enterCompanyName(companyName)
                .enterFirstAddress(firstAddress)
                .enterSecondAddress(secondAddress)
                .enterCity(city)
                .enterPostalCode(postCode)
                .enterMobilePhone(mobilePhone)
                .enterPassword(password)
                .confirmPassword(password)
//                .checkRecaptcha()
                .clickRegisterBtn();
//        String error = registerSteps.getErrorText();
//        Assert.assertEquals(error, "Please complete the captcha and try again.");

    }

    @Test
    public void registerUserWithoutRecaptchaFakeForAmount3() {
        registerSteps.openPage()
                .enterFirstName(firstName)
                .enterLastName(lastName)
                .enterEmail(email)
                .selectDialCode(user.getDialCode())
                .enterPhoneNumber(phoneNumber)
                .selectCountry(billingAddress.getCountry())
                .selectState(billingAddress.getState())
                .enterCompanyName(companyName)
                .enterFirstAddress(firstAddress)
                .enterSecondAddress(secondAddress)
                .enterCity(city)
                .enterPostalCode(postCode)
                .enterMobilePhone(mobilePhone)
                .enterPassword(password)
                .confirmPassword(password)
//                .checkRecaptcha()
                .clickRegisterBtn();
//        String error = registerSteps.getErrorText();
//        Assert.assertEquals(error, "Please complete the captcha and try again.");

    }

    @Test
    public void registerUserWithoutRecaptchaFakeForAmount4() {
        registerSteps.openPage()
                .enterFirstName(firstName)
                .enterLastName(lastName)
                .enterEmail(email)
                .selectDialCode(user.getDialCode())
                .enterPhoneNumber(phoneNumber)
                .selectCountry(billingAddress.getCountry())
                .selectState(billingAddress.getState())
                .enterCompanyName(companyName)
                .enterFirstAddress(firstAddress)
                .enterSecondAddress(secondAddress)
                .enterCity(city)
                .enterPostalCode(postCode)
                .enterMobilePhone(mobilePhone)
                .enterPassword(password)
                .confirmPassword(password)
//                .checkRecaptcha()
                .clickRegisterBtn();
//        String error = registerSteps.getErrorText();
//        Assert.assertEquals(error, "Please complete the captcha and try again.");

    }

    @Test
    public void registerUserWithoutRecaptchaFakeForAmount5() {
        registerSteps.openPage()
                .enterFirstName(firstName)
                .enterLastName(lastName)
                .enterEmail(email)
                .selectDialCode(user.getDialCode())
                .enterPhoneNumber(phoneNumber)
                .selectCountry(billingAddress.getCountry())
                .selectState(billingAddress.getState())
                .enterCompanyName(companyName)
                .enterFirstAddress(firstAddress)
                .enterSecondAddress(secondAddress)
                .enterCity(city)
                .enterPostalCode(postCode)
                .enterMobilePhone(mobilePhone)
                .enterPassword(password)
                .confirmPassword(password)
//                .checkRecaptcha()
                .clickRegisterBtn();
//        String error = registerSteps.getErrorText();
//        Assert.assertEquals(error, "Please complete the captcha and try again.");

    }

    @Test
    public void registerUserWithoutRecaptchaFakeForAmount6() {
        registerSteps.openPage()
                .enterFirstName(firstName)
                .enterLastName(lastName)
                .enterEmail(email)
                .selectDialCode(user.getDialCode())
                .enterPhoneNumber(phoneNumber)
                .selectCountry(billingAddress.getCountry())
                .selectState(billingAddress.getState())
                .enterCompanyName(companyName)
                .enterFirstAddress(firstAddress)
                .enterSecondAddress(secondAddress)
                .enterCity(city)
                .enterPostalCode(postCode)
                .enterMobilePhone(mobilePhone)
                .enterPassword(password)
                .confirmPassword(password)
//                .checkRecaptcha()
                .clickRegisterBtn();
//        String error = registerSteps.getErrorText();
//        Assert.assertEquals(error, "Please complete the captcha and try again.");

    }

    @Test
    public void registerUserWithoutRecaptchaFakeForAmount7() {
        registerSteps.openPage()
                .enterFirstName(firstName)
                .enterLastName(lastName)
                .enterEmail(email)
                .selectDialCode(user.getDialCode())
                .enterPhoneNumber(phoneNumber)
                .selectCountry(billingAddress.getCountry())
                .selectState(billingAddress.getState())
                .enterCompanyName(companyName)
                .enterFirstAddress(firstAddress)
                .enterSecondAddress(secondAddress)
                .enterCity(city)
                .enterPostalCode(postCode)
                .enterMobilePhone(mobilePhone)
                .enterPassword(password)
                .confirmPassword(password)
//                .checkRecaptcha()
                .clickRegisterBtn();
//        String error = registerSteps.getErrorText();
//        Assert.assertEquals(error, "Please complete the captcha and try again.");

    }

    @Test
    public void registerUserWithoutRecaptchaFakeForAmount8() {
        registerSteps.openPage()
                .enterFirstName(firstName)
                .enterLastName(lastName)
                .enterEmail(email)
                .selectDialCode(user.getDialCode())
                .enterPhoneNumber(phoneNumber)
                .selectCountry(billingAddress.getCountry())
                .selectState(billingAddress.getState())
                .enterCompanyName(companyName)
                .enterFirstAddress(firstAddress)
                .enterSecondAddress(secondAddress)
                .enterCity(city)
                .enterPostalCode(postCode)
                .enterMobilePhone(mobilePhone)
                .enterPassword(password)
                .confirmPassword(password)
//                .checkRecaptcha()
                .clickRegisterBtn();
//        String error = registerSteps.getErrorText();
//        Assert.assertEquals(error, "Please complete the captcha and try again.");

    }

    @Test
    public void registerUserWithoutRecaptchaFakeForAmount9() {
        registerSteps.openPage()
                .enterFirstName(firstName)
                .enterLastName(lastName)
                .enterEmail(email)
                .selectDialCode(user.getDialCode())
                .enterPhoneNumber(phoneNumber)
                .selectCountry(billingAddress.getCountry())
                .selectState(billingAddress.getState())
                .enterCompanyName(companyName)
                .enterFirstAddress(firstAddress)
                .enterSecondAddress(secondAddress)
                .enterCity(city)
                .enterPostalCode(postCode)
                .enterMobilePhone(mobilePhone)
                .enterPassword(password)
                .confirmPassword(password)
//                .checkRecaptcha()
                .clickRegisterBtn();
//        String error = registerSteps.getErrorText();
//        Assert.assertEquals(error, "Please complete the captcha and try again.");

    }

    @Test
    public void registerUserWithoutRecaptchaFakeForAmount10() {
        registerSteps.openPage()
                .enterFirstName(firstName)
                .enterLastName(lastName)
                .enterEmail(email)
                .selectDialCode(user.getDialCode())
                .enterPhoneNumber(phoneNumber)
                .selectCountry(billingAddress.getCountry())
                .selectState(billingAddress.getState())
                .enterCompanyName(companyName)
                .enterFirstAddress(firstAddress)
                .enterSecondAddress(secondAddress)
                .enterCity(city)
                .enterPostalCode(postCode)
                .enterMobilePhone(mobilePhone)
                .enterPassword(password)
                .confirmPassword(password)
//                .checkRecaptcha()
                .clickRegisterBtn();
//        String error = registerSteps.getErrorText();
//        Assert.assertEquals(error, "Please complete the captcha and try again.");

    }
}
