package pages;

import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.PropsLoader.loadProperties;

@Getter
public class LoginPage extends BasePage {

    private final String ENV_URL = loadProperties()
            .getProperty(System.getProperty("env", "QA"));

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "log-in")
    private WebElement singInBtn;

    @FindBy(className = "form-check-input")
    private WebElement rememberCheckbox;


    @FindBy(xpath = "//a[contains(src,'twitter')]")
    private WebElement twitterLink;

    @FindBy(xpath = "//a[contains(src, 'facebook')]")
    private WebElement facebookLink;

    @FindBy(xpath = "//a[contains(src,'linkedin')]")
    private WebElement linkedinLink;

    public LoginPage openPage() {
        driver.get(ENV_URL);
        return this;
    }
}
