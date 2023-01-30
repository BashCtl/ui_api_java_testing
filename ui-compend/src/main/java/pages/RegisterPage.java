package pages;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Slf4j
public class RegisterPage extends BasePage{

    private final String  REGISTER_URL = ENV_URL+"/register.php";
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "inputFirstName")
    private WebElement firstNameInput;

    @FindBy(id = "inputLastName")
    private WebElement lastNameInput;

    @FindBy(id = "inputEmail")
    private WebElement emailInput;

    @FindBy(id = "inputPhone")
    private WebElement phoneInput;

    @FindBy(className = "selected-dial-code")
    private WebElement dialCodeDropdown;

    @FindBy(id="inputCompanyName")
    private WebElement companyNameInput;

    @FindBy(id = "inputAddress1")
    private WebElement firstAddressInput;

    @FindBy(id = "inputAddress2")
    private WebElement secondAddressInput;


    @FindBy(id = "inputCity")
    private WebElement cityInput;

    @FindBy(id = "stateinput")
    private WebElement stateInput;

    @FindBy(id = "stateselect")
    private WebElement stateDropdown;

    @FindBy(id = "inputPostcode")
    private WebElement postcodeInput;

    @FindBy(xpath = "//select[@id='inputCountry']")
    private WebElement countryDropdown;

    @FindBy(xpath = "//input[@id='customfield2']")
    private WebElement mobilePhoneInput;

    @FindBy(id = "inputNewPassword1")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@placeholder='Confirm Password']")
    private WebElement confirmPassInput;

    @FindBy(xpath = "//button[contains(@class, 'generate-password')]")
    private WebElement generatePassBtn;

    @FindBy(xpath = "//input[@value='Register']")
    private WebElement registerBtn;

    @FindBy(xpath = "//div[@class='recaptcha-checkbox-checkmark']")
    private WebElement recaptchaCheckbox;

    @FindBy(xpath = "//iframe[@title='reCAPTCHA']")
    private WebElement recaptchaIframe;

    @FindBy(xpath = "//*[contains(@class,'alert-danger')]//li")
    private WebElement errorLabel;

    private String dataDailCodeXpath = "//li[@class='country' and @data-dial-code='%s']";



    public RegisterPage openPage(){
        log.info("Open register page ULR.");
        driver.get(REGISTER_URL);
        return this;
    }
}
