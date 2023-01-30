package steps;

import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.RegisterPage;

@Slf4j
public class RegisterSteps extends BaseSteps {

    private RegisterPage registerPage;

    public RegisterSteps(WebDriver driver) {
        super(driver);
        registerPage = new RegisterPage(driver);
    }

    @Step("User opens register page.")
    public RegisterSteps openPage() {
        log.info("Open register page.");
        registerPage.openPage();
        return this;
    }

    @Step("User enters first name: {firstName}.")
    public RegisterSteps enterFirstName(String firstName) {
        log.info("Clear first name input.");
        registerPage.getFirstNameInput().clear();
        log.info("Enter first name {}.", firstName);
        registerPage.getFirstNameInput().sendKeys(firstName);
        return this;
    }

    @Step("User enters last name: {lastName}.")
    public RegisterSteps enterLastName(String lastName) {
        log.info("Clear last name input.");
        registerPage.getLastNameInput().clear();
        log.info("Enter last name: {}.", lastName);
        registerPage.getLastNameInput().sendKeys(lastName);
        return this;
    }

    @Step("User enters email address: {email}")
    public RegisterSteps enterEmail(String email) {
        log.info("Clear email input");
        registerPage.getEmailInput().clear();
        log.info("Enter fill email field: {}.", email);
        registerPage.getEmailInput().sendKeys(email);
        return this;
    }

    @Step("User selects phone code: {code}.")
    public RegisterSteps selectDialCode(int code) {
        log.info("Click on dial code element.");
        registerPage.getDialCodeDropdown().click();
        log.info("Select dial code from the list");
        selectElementByXpath(String.format(registerPage.getDataDailCodeXpath(), code));
        return this;
    }

    @Step("User enters phone number: {phoneNumber}.")
    public RegisterSteps enterPhoneNumber(String phoneNumber) {
        log.info("Clear phone number input.");
        registerPage.getPhoneInput().clear();
        log.info("Enter phone number: {}", phoneNumber);
        registerPage.getPhoneInput().sendKeys(phoneNumber);
        return this;
    }

    @Step("User enters company name: {companyName}.")
    public RegisterSteps enterCompanyName(String companyName) {
        log.info("Clear company name filed");
        registerPage.getCompanyNameInput().clear();
        log.info("Enter company name: {}", companyName);
        registerPage.getCompanyNameInput().sendKeys(companyName);
        return this;
    }

    @Step("User enters first address: {address}.")
    public RegisterSteps enterFirstAddress(String address) {
        log.info("Clear first address field");
        registerPage.getFirstAddressInput().clear();
        log.info("Enter first address: {}", address);
        registerPage.getFirstAddressInput().sendKeys(address);
        return this;
    }

    @Step("User enter second line address: {address}.")
    public RegisterSteps enterSecondAddress(String address) {
        log.info("Clear second address filed.");
        registerPage.getSecondAddressInput().clear();
        log.info("Enter second address: {}", address);
        registerPage.getSecondAddressInput().sendKeys(address);
        return this;
    }

    @Step("User enters city: {city}")
    public RegisterSteps enterCity(String city) {
        log.info("Clear city address filed.");
        registerPage.getCityInput().clear();
        log.info("Enter city field: {}", city);
        registerPage.getCityInput().sendKeys(city);
        return this;
    }

    @Step("User enters post code: {postCode}.")
    public RegisterSteps enterPostalCode(String postalCode) {
        log.info("Clear postal code field.");
        registerPage.getPostcodeInput().clear();
        log.info("Fill postal code field: {}", postalCode);
        registerPage.getPostcodeInput().sendKeys(postalCode);
        return this;
    }

    @Step("User selects country '{country}' from the drop-down")
    public RegisterSteps selectCountry(String country) {
        Select drpCountry = new Select(registerPage.getCountryDropdown());
        log.info("Select country from dropdown: {}", country);
        drpCountry.selectByVisibleText(country);
        return this;
    }

    @Step("User select state '{state}' from the drop-down")
    public RegisterSteps selectState(String state) {
        Select drpState = new Select(registerPage.getStateDropdown());
        log.info("Select state form dropdown: {}", state);
        drpState.selectByVisibleText(state);
        return this;
    }

    @Step("User enters state: {state}")
    public RegisterSteps enterState(String state) {
        log.info("Clear state filed.");
        registerPage.getStateInput().clear();
        log.info("Enter state into the filed: {}", state);
        registerPage.getStateInput().sendKeys(state);
        return this;
    }

    @Step("User enters mobile phone: {phone}")
    public RegisterSteps enterMobilePhone(String phone) {
        log.info("Clear mobile phone field.");
        registerPage.getMobilePhoneInput().clear();
        log.info("Fill mobile phone filed: {}", phone);
        registerPage.getMobilePhoneInput().sendKeys(phone);
        return this;
    }

    @Step("User enters password: {password}")
    public RegisterSteps enterPassword(String password) {
        log.info("Clear password field.");
        registerPage.getPasswordInput().clear();
        log.info("Fill password field: {}", password);
        registerPage.getPasswordInput().sendKeys(password);
        return this;
    }

    @Step("User confirms password: {passConfirm}.")
    public RegisterSteps confirmPassword(String passConfirm) {
        log.info("Clear confirm password field.");
        registerPage.getConfirmPassInput().clear();
        log.info("Fill password confirmation field: {}.", passConfirm);
        registerPage.getConfirmPassInput().sendKeys(passConfirm);
        return this;
    }

    @Step("User checks recaptcha checkbox.")
    public RegisterSteps checkRecaptcha(){
        log.info("Click recaptcha checkbox.");
        registerPage.getRecaptchaCheckbox().click();
        return this;
    }

    @Step("User pushes 'Register' button.")
    public RegisterSteps clickRegisterBtn(){
        log.info("Click 'Register' button.");
        registerPage.getRegisterBtn().click();
        return this;
    }

    @Step("Get error label text.")
    public String getErrorText(){
        log.info("Getting error text.");
        return registerPage.getErrorLabel().getText();
    }

}
