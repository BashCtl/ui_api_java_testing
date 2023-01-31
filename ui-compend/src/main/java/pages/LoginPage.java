package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginPage extends BasePage {

    private final String LOGIN_ULR = ENV_URL + "/login";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "inputEmail")
    private WebElement emailInput;

    @FindBy(id = "inputPassword")
    private WebElement passwordInput;

    @FindBy(id = "login")
    private WebElement loginBtn;

    @FindBy(className = "form-check-input")
    private WebElement rememberCheckbox;

    @FindBy(xpath = "//*[@class='alert alert-danger']")
    private WebElement errorMsg;


    public LoginPage openPage() {
        driver.get(LOGIN_ULR);
        return this;
    }
}
