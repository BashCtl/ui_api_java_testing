package steps;

import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

@Slf4j
public class LoginSteps extends BaseSteps {

    private final LoginPage loginPage;

    public LoginSteps(WebDriver driver) {
        super(driver);
        loginPage = new LoginPage(driver);
    }

    @Step("User opens Login page.")
    public LoginSteps openPage() {
        log.info("Open Login page.");
        loginPage.openPage();
        return this;
    }

    @Step("User enters email: {email}")
    public LoginSteps enterEmail(String email) {
        log.info("Clear email input.");
        loginPage.getEmailInput().clear();
        log.info("Enter email: {}", email);
        loginPage.getEmailInput().sendKeys(email);
        return this;
    }

    @Step("User enters password: {password}")
    public LoginSteps enterPassword(String password) {
        log.info("Clear password input.");
        loginPage.getPasswordInput().clear();
        log.info("Enter password: {}", password);
        loginPage.getPasswordInput().sendKeys(password);
        return this;
    }

    @Step("User clicks 'Remember Me' checkbox.")
    public LoginSteps clickRememberMeCheckbox() {
        log.info("Click 'Remember Me checkbox.");
        loginPage.getRememberCheckbox().click();
        return this;
    }

    @Step("User clicks 'Login' button")
    public LoginSteps clickLoginBtn() {
        log.info("Click 'Login' button.");
        loginPage.getLoginBtn().click();
        return this;
    }

    @Step("Get error message.")
    public String getErrorMsg(){
        log.info("Getting error message.");
        return loginPage.getErrorMsg().getText();
    }


}
